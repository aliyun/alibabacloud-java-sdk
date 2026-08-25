// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeEcsSpecsRequest extends TeaModel {
    /**
     * <p>The accelerator type. Valid values:</p>
     * <ul>
     * <li>CPU: uses only CPU.</li>
     * <li>GPU: uses GPU acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The maximum number of records to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The DataWorks resource group identifier. You can specify the numeric ID of the resource group or the full identifier in the Serverless_res_group_{tenantId}_{resgId} format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_123456789012345_9876543210****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListServerIdeEcsSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeEcsSpecsRequest self = new ListServerIdeEcsSpecsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerIdeEcsSpecsRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListServerIdeEcsSpecsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerIdeEcsSpecsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerIdeEcsSpecsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
