// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Proxy instance to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all Anti-DDoS Proxy (Chinese Mainland) or Anti-DDoS Proxy (Outside Chinese Mainland) instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-6ja1y6p5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the Anti-DDoS Proxy instance to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: an Anti-DDoS Proxy (Chinese Mainland) instance</li>
     * <li><strong>2</strong>: an Anti-DDoS Proxy (Outside Chinese Mainland) instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
