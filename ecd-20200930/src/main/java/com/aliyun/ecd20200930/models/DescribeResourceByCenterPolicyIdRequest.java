// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourceByCenterPolicyIdRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Maximum value: 100.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l69tQX7yFxx6/4dbooBAOc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-53iyi2aar0nd6****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The service type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>app: cloud applications.</li>
     * <li>resourceGroup: resource groups.</li>
     * <li>desktop: cloud computers.</li>
     * <li>desktopGroup: cloud computer shares.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-ia2zw38bi6cm7****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static DescribeResourceByCenterPolicyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByCenterPolicyIdRequest self = new DescribeResourceByCenterPolicyIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByCenterPolicyIdRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeResourceByCenterPolicyIdRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeResourceByCenterPolicyIdRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeResourceByCenterPolicyIdRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeResourceByCenterPolicyIdRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
