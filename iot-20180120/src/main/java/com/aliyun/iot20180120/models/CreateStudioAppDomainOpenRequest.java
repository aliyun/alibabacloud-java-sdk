// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateStudioAppDomainOpenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Host")
    public String host;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Protocol")
    public String protocol;

    public static CreateStudioAppDomainOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStudioAppDomainOpenRequest self = new CreateStudioAppDomainOpenRequest();
        return TeaModel.build(map, self);
    }

    public CreateStudioAppDomainOpenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateStudioAppDomainOpenRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateStudioAppDomainOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateStudioAppDomainOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateStudioAppDomainOpenRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
