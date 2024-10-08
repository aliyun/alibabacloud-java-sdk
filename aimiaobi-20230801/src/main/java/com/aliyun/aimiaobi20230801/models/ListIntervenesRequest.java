// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListIntervenesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33a2658aaabf4c24b45d50e575125311_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("InterveneType")
    public Integer interveneType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>mqtt_outRule_1679019634514</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static ListIntervenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntervenesRequest self = new ListIntervenesRequest();
        return TeaModel.build(map, self);
    }

    public ListIntervenesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListIntervenesRequest setInterveneType(Integer interveneType) {
        this.interveneType = interveneType;
        return this;
    }
    public Integer getInterveneType() {
        return this.interveneType;
    }

    public ListIntervenesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListIntervenesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIntervenesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListIntervenesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
