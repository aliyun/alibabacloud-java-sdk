// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UploadCardResWithDyncParamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("DynamicParam")
    public String dynamicParam;

    /**
     * <strong>example:</strong>
     * <p>48</p>
     */
    @NameInMap("ExpiredTimes")
    public Long expiredTimes;

    /**
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Memo")
    public String memo;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static UploadCardResWithDyncParamRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCardResWithDyncParamRequest self = new UploadCardResWithDyncParamRequest();
        return TeaModel.build(map, self);
    }

    public UploadCardResWithDyncParamRequest setDynamicParam(String dynamicParam) {
        this.dynamicParam = dynamicParam;
        return this;
    }
    public String getDynamicParam() {
        return this.dynamicParam;
    }

    public UploadCardResWithDyncParamRequest setExpiredTimes(Long expiredTimes) {
        this.expiredTimes = expiredTimes;
        return this;
    }
    public Long getExpiredTimes() {
        return this.expiredTimes;
    }

    public UploadCardResWithDyncParamRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public UploadCardResWithDyncParamRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadCardResWithDyncParamRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UploadCardResWithDyncParamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadCardResWithDyncParamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UploadCardResWithDyncParamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UploadCardResWithDyncParamRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UploadCardResWithDyncParamRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
