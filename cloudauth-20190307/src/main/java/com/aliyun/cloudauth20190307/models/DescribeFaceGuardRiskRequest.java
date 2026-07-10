// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceGuardRiskRequest extends TeaModel {
    /**
     * <p>The authentication ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aba9830f471a4335af4612c8adaa91b0</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The device token for risk identification.</p>
     * 
     * <strong>example:</strong>
     * <p>McozS1ZWRcRZStlERcZZo_QOytx5jcgZoZJEoRLOxxxxxxx</p>
     */
    @NameInMap("DeviceToken")
    public String deviceToken;

    /**
     * <p>The identifier used for subsequent troubleshooting. Ensure that this value is unique within your business.</p>
     * <p>The value can contain letters (both uppercase and lowercase) and digits, with a maximum length of 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35xxxx</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>The product code. Set this to FACE_GUARD.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_GUARD</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeFaceGuardRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceGuardRiskRequest self = new DescribeFaceGuardRiskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaceGuardRiskRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeFaceGuardRiskRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public DescribeFaceGuardRiskRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public DescribeFaceGuardRiskRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
