// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaCatalogsRequest extends TeaModel {
    /**
     * <p>The name of the Agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>每页返回的最大数据条数。取值范围 1~100，不传时默认 100。每条记录都需回源查询一次元数据，因此该值同时限制单次调用的回源次数</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>分页查询的起始Token。首次查询不传或传 &quot;0&quot;；后续翻页使用上一次响应中返回的 NextToken 值</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListLumaCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLumaCatalogsRequest self = new ListLumaCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public ListLumaCatalogsRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ListLumaCatalogsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListLumaCatalogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
