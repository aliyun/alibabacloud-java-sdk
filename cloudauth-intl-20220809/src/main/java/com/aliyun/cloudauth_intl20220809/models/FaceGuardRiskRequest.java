// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceGuardRiskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>Tk9SSUQuMS*****************ZDNmNWY5NzQxOW1o</p>
     */
    @NameInMap("DeviceToken")
    public String deviceToken;

    /**
     * <strong>example:</strong>
     * <p>0c83ce0101d34eff886b1f7d1cdef67f</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>FACE_GUARD</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static FaceGuardRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceGuardRiskRequest self = new FaceGuardRiskRequest();
        return TeaModel.build(map, self);
    }

    public FaceGuardRiskRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FaceGuardRiskRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public FaceGuardRiskRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceGuardRiskRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
