// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1567584765</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selection</p>
     */
    @NameInMap("ruleType")
    public String ruleType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>1567584765</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>EFFECTIVE</p>
     */
    @NameInMap("status")
    public String status;

    public static ListRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRulesRequest self = new ListRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRulesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListRulesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListRulesRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ListRulesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListRulesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListRulesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
