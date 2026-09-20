// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeRequest extends TeaModel {
    /**
     * <p>The instance specification name. For more information, see <a href="https://help.aliyun.com/document_detail/194870.html">Instance node specifications</a>.</p>
     * <blockquote>
     * <p>If InstanceType is left empty, all instance specifications are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hbase.n2.4xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeRequest self = new DescribeInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
