// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RefundInstanceRequest extends TeaModel {
    /**
     * <p>Required for idempotent scenarios. A UUID-generated string. This field is used for idempotence. If the same value is passed in multiple calls, the result of the first call is returned. If a result is returned after the call, you can parse the refund order ID, which indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>793F021C-B589-1225-82A9-99232AEBE494</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Required for unsubscription scenarios. Valid values: 1: immediately releases the instance. 0: stops the instance first based on the shutdown policy. Only some products support this value. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ImmediatelyRelease")
    public String immediatelyRelease;

    /**
     * <p>Required for unsubscription scenarios. The instance ID, not the custom name.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1etb69sqxgl4*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Required for unsubscription scenarios. The product code. If the error code returned after the call indicates that the product is not supported, submit a ticket to request that the cloud service enable this feature.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Required for unsubscription scenarios. The product type. Unless otherwise specified, pass an empty string. In the debugging tool, you do not need to manually enter a value. Hover over the input box, and a button labeled &quot;Enter empty string&quot; appears. Click this button. When initiating an unsubscription through code, pass an empty string &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>Empty string</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static RefundInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceRequest self = new RefundInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RefundInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RefundInstanceRequest setImmediatelyRelease(String immediatelyRelease) {
        this.immediatelyRelease = immediatelyRelease;
        return this;
    }
    public String getImmediatelyRelease() {
        return this.immediatelyRelease;
    }

    public RefundInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RefundInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RefundInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
