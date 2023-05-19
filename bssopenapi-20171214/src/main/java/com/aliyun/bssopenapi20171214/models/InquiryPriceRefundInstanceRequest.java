// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class InquiryPriceRefundInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required for scenarios that need idempotence. The UUID that is used to ensure the idempotence of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance. This parameter is required for unsubscription scenarios.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The code of the service. This parameter is required for unsubscription scenarios.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service. This parameter is required for unsubscription scenarios. Unless otherwise specified, set this parameter to an empty string.</p>
     */
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
