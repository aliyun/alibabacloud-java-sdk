// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class InquiryPriceRefundInstanceRequest extends TeaModel {
    // clientToken
    @NameInMap("ClientToken")
    public String clientToken;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // productCode
    @NameInMap("ProductCode")
    public String productCode;

    // productType
    @NameInMap("ProductType")
    public String productType;

    public static InquiryPriceRefundInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InquiryPriceRefundInstanceRequest self = new InquiryPriceRefundInstanceRequest();
        return TeaModel.build(map, self);
    }

    public InquiryPriceRefundInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InquiryPriceRefundInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InquiryPriceRefundInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InquiryPriceRefundInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
