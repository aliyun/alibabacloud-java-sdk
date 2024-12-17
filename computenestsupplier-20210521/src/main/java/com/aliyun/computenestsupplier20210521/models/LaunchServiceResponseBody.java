// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class LaunchServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The mode of the service online. Valid Type</p>
     * <ul>
     * <li>PublishNewVersion: Launch new version</li>
     * <li>PublishOfflineVersion:  The offline version is online again.</li>
     * <li>UpdateLatestVersion: Update the latest version online</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PublishNewVersion</p>
     */
    @NameInMap("ServiceLaunchResultType")
    public String serviceLaunchResultType;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Version")
    public String version;

    public static LaunchServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LaunchServiceResponseBody self = new LaunchServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public LaunchServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LaunchServiceResponseBody setServiceLaunchResultType(String serviceLaunchResultType) {
        this.serviceLaunchResultType = serviceLaunchResultType;
        return this;
    }
    public String getServiceLaunchResultType() {
        return this.serviceLaunchResultType;
    }

    public LaunchServiceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
