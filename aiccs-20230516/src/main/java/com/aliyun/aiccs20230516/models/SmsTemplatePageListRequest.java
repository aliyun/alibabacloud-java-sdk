// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class SmsTemplatePageListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>页码</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>每页条数</p>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>短信签名</p>
     * 
     * <strong>example:</strong>
     * <p>114ah23m</p>
     */
    @NameInMap("Sign")
    public String sign;

    /**
     * <p>短信类型</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("SmsType")
    public Long smsType;

    /**
     * <p>模板状态</p>
     * 
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>模板ID</p>
     * 
     * <strong>example:</strong>
     * <p>83</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>模板类型</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TemplateType")
    public Long templateType;

    public static SmsTemplatePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsTemplatePageListRequest self = new SmsTemplatePageListRequest();
        return TeaModel.build(map, self);
    }

    public SmsTemplatePageListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SmsTemplatePageListRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public SmsTemplatePageListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SmsTemplatePageListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SmsTemplatePageListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SmsTemplatePageListRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public SmsTemplatePageListRequest setSmsType(Long smsType) {
        this.smsType = smsType;
        return this;
    }
    public Long getSmsType() {
        return this.smsType;
    }

    public SmsTemplatePageListRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SmsTemplatePageListRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public SmsTemplatePageListRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

}
