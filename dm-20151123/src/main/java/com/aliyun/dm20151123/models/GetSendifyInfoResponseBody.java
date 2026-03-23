// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSendifyInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("BuyResourcePackageUrl")
    public String buyResourcePackageUrl;

    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("BuyUrl")
    public String buyUrl;

    /**
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("Discount")
    public String discount;

    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("DowngradeUrl")
    public String downgradeUrl;

    /**
     * <strong>example:</strong>
     * <p>到期</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>了解更多</p>
     */
    @NameInMap("LearnMoreUrl")
    public String learnMoreUrl;

    @NameInMap("Opened")
    public Boolean opened;

    /**
     * <strong>example:</strong>
     * <p>TRIAL</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>https</p>
     */
    @NameInMap("RenewUrl")
    public String renewUrl;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("SpecUpgradeUrl")
    public String specUpgradeUrl;

    /**
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("SupportTrial")
    public Boolean supportTrial;

    /**
     * <strong>example:</strong>
     * <p>升配链接</p>
     */
    @NameInMap("UpgradeUrl")
    public String upgradeUrl;

    public static GetSendifyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSendifyInfoResponseBody self = new GetSendifyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSendifyInfoResponseBody setBuyResourcePackageUrl(String buyResourcePackageUrl) {
        this.buyResourcePackageUrl = buyResourcePackageUrl;
        return this;
    }
    public String getBuyResourcePackageUrl() {
        return this.buyResourcePackageUrl;
    }

    public GetSendifyInfoResponseBody setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
        return this;
    }
    public String getBuyUrl() {
        return this.buyUrl;
    }

    public GetSendifyInfoResponseBody setDiscount(String discount) {
        this.discount = discount;
        return this;
    }
    public String getDiscount() {
        return this.discount;
    }

    public GetSendifyInfoResponseBody setDowngradeUrl(String downgradeUrl) {
        this.downgradeUrl = downgradeUrl;
        return this;
    }
    public String getDowngradeUrl() {
        return this.downgradeUrl;
    }

    public GetSendifyInfoResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetSendifyInfoResponseBody setLearnMoreUrl(String learnMoreUrl) {
        this.learnMoreUrl = learnMoreUrl;
        return this;
    }
    public String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public GetSendifyInfoResponseBody setOpened(Boolean opened) {
        this.opened = opened;
        return this;
    }
    public Boolean getOpened() {
        return this.opened;
    }

    public GetSendifyInfoResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetSendifyInfoResponseBody setRenewUrl(String renewUrl) {
        this.renewUrl = renewUrl;
        return this;
    }
    public String getRenewUrl() {
        return this.renewUrl;
    }

    public GetSendifyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSendifyInfoResponseBody setSpecUpgradeUrl(String specUpgradeUrl) {
        this.specUpgradeUrl = specUpgradeUrl;
        return this;
    }
    public String getSpecUpgradeUrl() {
        return this.specUpgradeUrl;
    }

    public GetSendifyInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSendifyInfoResponseBody setSupportTrial(Boolean supportTrial) {
        this.supportTrial = supportTrial;
        return this;
    }
    public Boolean getSupportTrial() {
        return this.supportTrial;
    }

    public GetSendifyInfoResponseBody setUpgradeUrl(String upgradeUrl) {
        this.upgradeUrl = upgradeUrl;
        return this;
    }
    public String getUpgradeUrl() {
        return this.upgradeUrl;
    }

}
