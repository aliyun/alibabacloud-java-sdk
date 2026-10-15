// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class InquiryPriceRefundInstanceRequest extends TeaModel {
    /**
     * <p>Required for idempotent scenarios. A UUID-generated string. This field is used for idempotence. If the same value is passed in multiple calls, the result of the first call is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>793F021C-B589-1225-82A9-99232AEBE494</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Required for unsubscription scenarios. The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1etb69sqxgl4*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Required for unsubscription scenarios. The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Required for unsubscription scenarios. The product type. Pass an empty string (&quot;&quot;) unless otherwise specified.</p>
     * 
     * <strong>example:</strong>
     * <p>”“</p>
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
