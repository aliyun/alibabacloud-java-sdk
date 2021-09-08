// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateStudioAppDomainOpenRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Host")
    @Validation(required = true)
    public String host;

    @NameInMap("Protocol")
    @Validation(required = true)
    public String protocol;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

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

    public CreateStudioAppDomainOpenRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateStudioAppDomainOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateStudioAppDomainOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
