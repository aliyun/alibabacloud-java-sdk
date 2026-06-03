// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateFileByBizRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaveOssFileName")
    public String saveOssFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserViewFileName")
    public String userViewFileName;

    public static CreateFileByBizRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileByBizRequest self = new CreateFileByBizRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileByBizRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateFileByBizRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateFileByBizRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateFileByBizRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFileByBizRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateFileByBizRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFileByBizRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateFileByBizRequest setSaveOssFileName(String saveOssFileName) {
        this.saveOssFileName = saveOssFileName;
        return this;
    }
    public String getSaveOssFileName() {
        return this.saveOssFileName;
    }

    public CreateFileByBizRequest setUserViewFileName(String userViewFileName) {
        this.userViewFileName = userViewFileName;
        return this;
    }
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

}
