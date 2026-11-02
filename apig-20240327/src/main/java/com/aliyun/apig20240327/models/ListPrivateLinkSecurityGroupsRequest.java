// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPrivateLinkSecurityGroupsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the VPC owned by the authorized user. The candidate security groups must belong to this VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static ListPrivateLinkSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateLinkSecurityGroupsRequest self = new ListPrivateLinkSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateLinkSecurityGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrivateLinkSecurityGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrivateLinkSecurityGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
