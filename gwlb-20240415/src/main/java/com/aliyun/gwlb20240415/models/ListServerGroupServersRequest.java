// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class ListServerGroupServersRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 1000.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The server group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtoptyui****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The server IDs.</p>
     * <p>You can specify at most 200 servers in each call.</p>
     */
    @NameInMap("ServerIds")
    public java.util.List<String> serverIds;

    /**
     * <p>The server IP addresses.</p>
     * <p>You can specify at most 200 servers in each call.</p>
     */
    @NameInMap("ServerIps")
    public java.util.List<String> serverIps;

    /**
     * <p>The number of entries to be skipped in the call.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    public static ListServerGroupServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersRequest self = new ListServerGroupServersRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupServersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupServersRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public ListServerGroupServersRequest setServerIds(java.util.List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    public ListServerGroupServersRequest setServerIps(java.util.List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }
    public java.util.List<String> getServerIps() {
        return this.serverIps;
    }

    public ListServerGroupServersRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

}
