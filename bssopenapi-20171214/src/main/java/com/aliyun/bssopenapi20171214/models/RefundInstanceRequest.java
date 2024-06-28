// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RefundInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required for scenarios that need idempotence. The UUID that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>793F021C-B589-1225-82A9-99232AEBE494</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required for unsubscription scenarios. Valid values: 1 and 0. A value of 1 specifies that the instance is immediately released. A value of 0 specifies that the instance is shut down based on the shutdown policy. This parameter is supported only for specified services. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ImmediatelyRelease")
    public String immediatelyRelease;

    /**
     * <p>The ID of the instance. This parameter is required for unsubscription scenarios. Do not specify a custom name for this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1etb69sqxgl4*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The code of the service. This parameter is required for unsubscription scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service. This parameter is required for unsubscription scenarios. Unless otherwise specified, set this parameter to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>”“</p>
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
