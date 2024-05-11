// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDRMLicenseRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProtectionSystem")
    public String protectionSystem;

    public static GetDRMLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDRMLicenseRequest self = new GetDRMLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetDRMLicenseRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetDRMLicenseRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GetDRMLicenseRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetDRMLicenseRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetDRMLicenseRequest setProtectionSystem(String protectionSystem) {
        this.protectionSystem = protectionSystem;
        return this;
    }
    public String getProtectionSystem() {
        return this.protectionSystem;
    }

}
