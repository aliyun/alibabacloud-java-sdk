// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForNetworkZoneRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the network zone associated with the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>network_11111</p>
     */
    @NameInMap("NetworkZoneId")
    public String networkZoneId;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The pagination token for the previous page.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    public static ListApplicationsForNetworkZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForNetworkZoneRequest self = new ListApplicationsForNetworkZoneRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForNetworkZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationsForNetworkZoneRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsForNetworkZoneRequest setNetworkZoneId(String networkZoneId) {
        this.networkZoneId = networkZoneId;
        return this;
    }
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

    public ListApplicationsForNetworkZoneRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsForNetworkZoneRequest setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

}
