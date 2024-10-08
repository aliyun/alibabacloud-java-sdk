// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceClusterListRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-cluster-hz-xxxxxxxxxxxx</p>
     */
    @NameInMap("InstanceClusterId")
    public String instanceClusterId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-cluster</p>
     */
    @NameInMap("InstanceClusterName")
    public String instanceClusterName;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeInstanceClusterListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceClusterListRequest self = new DescribeInstanceClusterListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceClusterListRequest setInstanceClusterId(String instanceClusterId) {
        this.instanceClusterId = instanceClusterId;
        return this;
    }
    public String getInstanceClusterId() {
        return this.instanceClusterId;
    }

    public DescribeInstanceClusterListRequest setInstanceClusterName(String instanceClusterName) {
        this.instanceClusterName = instanceClusterName;
        return this;
    }
    public String getInstanceClusterName() {
        return this.instanceClusterName;
    }

    public DescribeInstanceClusterListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceClusterListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceClusterListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
