// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateDRMLicenseRequest extends TeaModel {
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

    public static GenerateDRMLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDRMLicenseRequest self = new GenerateDRMLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDRMLicenseRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDRMLicenseRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GenerateDRMLicenseRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GenerateDRMLicenseRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateDRMLicenseRequest setProtectionSystem(String protectionSystem) {
        this.protectionSystem = protectionSystem;
        return this;
    }
    public String getProtectionSystem() {
        return this.protectionSystem;
    }

}
