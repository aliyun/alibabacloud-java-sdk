// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9509beptiz****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the elastic plan.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/601334.html">DescribeElasticPlans</a> operation to query the name of the elastic plan for the cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    public static DescribeElasticPlanAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanAttributeRequest self = new DescribeElasticPlanAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeElasticPlanAttributeRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

}
