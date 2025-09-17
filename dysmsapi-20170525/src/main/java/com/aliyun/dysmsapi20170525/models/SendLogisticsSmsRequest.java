// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendLogisticsSmsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ExpressCompanyCode")
    public String expressCompanyCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("MailNo")
    public String mailNo;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("PlatformCompanyCode")
    public String platformCompanyCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TemplateParam")
    public String templateParam;

    public static SendLogisticsSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLogisticsSmsRequest self = new SendLogisticsSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendLogisticsSmsRequest setExpressCompanyCode(String expressCompanyCode) {
        this.expressCompanyCode = expressCompanyCode;
        return this;
    }
    public String getExpressCompanyCode() {
        return this.expressCompanyCode;
    }

    public SendLogisticsSmsRequest setMailNo(String mailNo) {
        this.mailNo = mailNo;
        return this;
    }
    public String getMailNo() {
        return this.mailNo;
    }

    public SendLogisticsSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendLogisticsSmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendLogisticsSmsRequest setPlatformCompanyCode(String platformCompanyCode) {
        this.platformCompanyCode = platformCompanyCode;
        return this;
    }
    public String getPlatformCompanyCode() {
        return this.platformCompanyCode;
    }

    public SendLogisticsSmsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendLogisticsSmsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendLogisticsSmsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendLogisticsSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendLogisticsSmsRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

}
