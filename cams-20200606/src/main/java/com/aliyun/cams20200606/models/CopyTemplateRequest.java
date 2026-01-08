// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CopyTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12456</p>
     */
    @NameInMap("SceneTemplateCode")
    public String sceneTemplateCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("SceneTemplateName")
    public String sceneTemplateName;

    public static CopyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyTemplateRequest self = new CopyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CopyTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CopyTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CopyTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopyTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CopyTemplateRequest setSceneTemplateCode(String sceneTemplateCode) {
        this.sceneTemplateCode = sceneTemplateCode;
        return this;
    }
    public String getSceneTemplateCode() {
        return this.sceneTemplateCode;
    }

    public CopyTemplateRequest setSceneTemplateName(String sceneTemplateName) {
        this.sceneTemplateName = sceneTemplateName;
        return this;
    }
    public String getSceneTemplateName() {
        return this.sceneTemplateName;
    }

}
