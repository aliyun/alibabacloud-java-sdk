// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the instance to query.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance to query. Valid values:</p>
     * <br>
     * <p>*   **1**: an Anti-DDoS Pro instance</p>
     * <p>*   **2**: an Anti-DDoS Premium instance</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductType")
    public Integer productType;

    public static DescribeInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusRequest self = new DescribeInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceStatusRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

}
