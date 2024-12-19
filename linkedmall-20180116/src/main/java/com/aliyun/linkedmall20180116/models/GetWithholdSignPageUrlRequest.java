// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetWithholdSignPageUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>223******2637</p>
     */
    @NameInMap("ExternalAgreementNo")
    public String externalAgreementNo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("IdentityParameters")
    public String identityParameters;

    /**
     * <strong>example:</strong>
     * <p>64******721</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    @NameInMap("MerchantServiceDescription")
    public String merchantServiceDescription;

    @NameInMap("MerchantServiceName")
    public String merchantServiceName;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <strong>example:</strong>
     * <p>0AF7F437-C869-477D-A21A-CF402493FFFE</p>
     */
    @NameInMap("OutRequestNo")
    public String outRequestNo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ReturnUrl")
    public String returnUrl;

    public static GetWithholdSignPageUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWithholdSignPageUrlRequest self = new GetWithholdSignPageUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetWithholdSignPageUrlRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public GetWithholdSignPageUrlRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public GetWithholdSignPageUrlRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public GetWithholdSignPageUrlRequest setIdentityParameters(String identityParameters) {
        this.identityParameters = identityParameters;
        return this;
    }
    public String getIdentityParameters() {
        return this.identityParameters;
    }

    public GetWithholdSignPageUrlRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public GetWithholdSignPageUrlRequest setMerchantServiceDescription(String merchantServiceDescription) {
        this.merchantServiceDescription = merchantServiceDescription;
        return this;
    }
    public String getMerchantServiceDescription() {
        return this.merchantServiceDescription;
    }

    public GetWithholdSignPageUrlRequest setMerchantServiceName(String merchantServiceName) {
        this.merchantServiceName = merchantServiceName;
        return this;
    }
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

    public GetWithholdSignPageUrlRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public GetWithholdSignPageUrlRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public GetWithholdSignPageUrlRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
