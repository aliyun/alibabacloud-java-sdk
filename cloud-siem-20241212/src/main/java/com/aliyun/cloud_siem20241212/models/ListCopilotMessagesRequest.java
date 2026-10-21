// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListCopilotMessagesRequest extends TeaModel {
    /**
     * <p>Used together with the SortingField parameter. A value of <strong>true</strong> specifies ascending order, and a value of <strong>false</strong> specifies descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Ascending")
    public Boolean ascending;

    /**
     * <p>The conversation ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The language of the returned messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query. Leave this parameter empty to query from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the Cloud Threat Detection and Response (CTDR) data management center resides. Specify the management center based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland or Hong Kong (China).</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trace ID, which is used to query specific call information.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a71644665544****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListCopilotMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCopilotMessagesRequest self = new ListCopilotMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCopilotMessagesRequest setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }
    public Boolean getAscending() {
        return this.ascending;
    }

    public ListCopilotMessagesRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ListCopilotMessagesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCopilotMessagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCopilotMessagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCopilotMessagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCopilotMessagesRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
