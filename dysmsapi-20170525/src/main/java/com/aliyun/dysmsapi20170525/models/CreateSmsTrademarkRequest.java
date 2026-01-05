// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTrademarkRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>申请人名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TrademarkApplicantName")
    public String trademarkApplicantName;

    /**
     * <p>专用权生失效日期</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2010-12-14~2030-12-13</p>
     */
    @NameInMap("TrademarkEffExpDate")
    public String trademarkEffExpDate;

    /**
     * <p>商标名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TrademarkName")
    public String trademarkName;

    /**
     * <p>商标详情截图osskey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196031.jpg</p>
     */
    @NameInMap("TrademarkPic")
    public String trademarkPic;

    /**
     * <p>商标注册号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>766905</p>
     */
    @NameInMap("TrademarkRegistrationNumber")
    public String trademarkRegistrationNumber;

    public static CreateSmsTrademarkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTrademarkRequest self = new CreateSmsTrademarkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsTrademarkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsTrademarkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsTrademarkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsTrademarkRequest setTrademarkApplicantName(String trademarkApplicantName) {
        this.trademarkApplicantName = trademarkApplicantName;
        return this;
    }
    public String getTrademarkApplicantName() {
        return this.trademarkApplicantName;
    }

    public CreateSmsTrademarkRequest setTrademarkEffExpDate(String trademarkEffExpDate) {
        this.trademarkEffExpDate = trademarkEffExpDate;
        return this;
    }
    public String getTrademarkEffExpDate() {
        return this.trademarkEffExpDate;
    }

    public CreateSmsTrademarkRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public CreateSmsTrademarkRequest setTrademarkPic(String trademarkPic) {
        this.trademarkPic = trademarkPic;
        return this;
    }
    public String getTrademarkPic() {
        return this.trademarkPic;
    }

    public CreateSmsTrademarkRequest setTrademarkRegistrationNumber(String trademarkRegistrationNumber) {
        this.trademarkRegistrationNumber = trademarkRegistrationNumber;
        return this;
    }
    public String getTrademarkRegistrationNumber() {
        return this.trademarkRegistrationNumber;
    }

}
