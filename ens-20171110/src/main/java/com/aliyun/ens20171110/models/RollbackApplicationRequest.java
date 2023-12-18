// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The current version number.</p>
     */
    @NameInMap("FromAppVersion")
    public String fromAppVersion;

    /**
     * <p>The timeout period of the asynchronous rollback operation. Unit: seconds. Default value: 300.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The target version number. By default, the system automatically rolls back the container version to the previous version.</p>
     */
    @NameInMap("ToAppVersion")
    public String toAppVersion;

    public static RollbackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationRequest self = new RollbackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackApplicationRequest setFromAppVersion(String fromAppVersion) {
        this.fromAppVersion = fromAppVersion;
        return this;
    }
    public String getFromAppVersion() {
        return this.fromAppVersion;
    }

    public RollbackApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RollbackApplicationRequest setToAppVersion(String toAppVersion) {
        this.toAppVersion = toAppVersion;
        return this;
    }
    public String getToAppVersion() {
        return this.toAppVersion;
    }

}
