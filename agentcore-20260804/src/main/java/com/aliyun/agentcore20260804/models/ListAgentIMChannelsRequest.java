// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentIMChannelsRequest extends TeaModel {
    /**
     * <p>The IM channel type. Valid values: DINGTALK (DingTalk), FEISHU (Lark), and WECOM (WeCom).</p>
     * 
     * <strong>example:</strong>
     * <p>DINGTALK</p>
     */
    @NameInMap("channelType")
    public String channelType;

    /**
     * <p>The maximum number of entries to return per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This parameter is not required for the first call. For subsequent calls, use the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The IM channel status. Valid values: CREATING (Creating), READY (Ready), UPDATING (Updating), FAILED (Failed), DELETING (Deleting), and DELETE_FAILED (Delete failed).</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    public static ListAgentIMChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentIMChannelsRequest self = new ListAgentIMChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentIMChannelsRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ListAgentIMChannelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentIMChannelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentIMChannelsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
