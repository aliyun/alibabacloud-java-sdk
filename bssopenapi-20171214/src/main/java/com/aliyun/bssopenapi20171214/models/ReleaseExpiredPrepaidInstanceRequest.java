// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ReleaseExpiredPrepaidInstanceRequest extends TeaModel {
    /**
     * <p>The instance IDs. Separate multiple IDs with commas. You can specify up to 20 IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-1,rm-2</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The product code. You can call the <strong>QueryProductList</strong> operation to query the product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ReleaseExpiredPrepaidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseExpiredPrepaidInstanceRequest self = new ReleaseExpiredPrepaidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseExpiredPrepaidInstanceRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ReleaseExpiredPrepaidInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ReleaseExpiredPrepaidInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
