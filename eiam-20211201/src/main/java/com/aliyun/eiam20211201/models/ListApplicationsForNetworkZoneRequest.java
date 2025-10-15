// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForNetworkZoneRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>分页查询时每页行数。默认值为20，最大值为100。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>应用关联的网络范围ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>network_11111</p>
     */
    @NameInMap("NetworkZoneId")
    public String networkZoneId;

    /**
     * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>查询上一页凭证（Token），取值为上一次API调用返回的previousToken参数值。</p>
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
