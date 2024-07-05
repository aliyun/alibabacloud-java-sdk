// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDRMLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AESzB8SQgpACioSEJ3yqiFwruAOUgIvlCx*****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://1111111111.mns.cn-hangzhou.aliyuncs.com">http://1111111111.mns.cn-hangzhou.aliyuncs.com</a></p>
     */
    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    /**
     * <strong>example:</strong>
     * <p>topic1</p>
     */
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    /**
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>widevine</p>
     */
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
