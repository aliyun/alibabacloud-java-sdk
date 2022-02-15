// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentsRequest extends TeaModel {
    // 幂等校验id
    @NameInMap("clientToken")
    public String clientToken;

    // 创建结束时间
    @NameInMap("createEndTime")
    public String createEndTime;

    // 创建开始时间
    @NameInMap("createStartTime")
    public String createStartTime;

    // 影响等级 高：HIGH 低 LOW
    @NameInMap("effect")
    public String effect;

    // 事件级别 P1 P2 P3 P4
    @NameInMap("incidentLevel")
    public String incidentLevel;

    // 事件状态 ASSIGNED已分派 RESPONDED已响应  FINISHED已完结
    @NameInMap("incidentStatus")
    public String incidentStatus;

    // 是否自己 1是 0不是
    @NameInMap("me")
    public Integer me;

    // 页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 行
    @NameInMap("pageSize")
    public Integer pageSize;

    // 关联服务ID
    @NameInMap("relationServiceId")
    public Long relationServiceId;

    // 流转规则名字
    @NameInMap("ruleName")
    public String ruleName;

    public static ListIncidentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsRequest self = new ListIncidentsRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIncidentsRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public ListIncidentsRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public ListIncidentsRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public ListIncidentsRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    public ListIncidentsRequest setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
        return this;
    }
    public String getIncidentStatus() {
        return this.incidentStatus;
    }

    public ListIncidentsRequest setMe(Integer me) {
        this.me = me;
        return this;
    }
    public Integer getMe() {
        return this.me;
    }

    public ListIncidentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIncidentsRequest setRelationServiceId(Long relationServiceId) {
        this.relationServiceId = relationServiceId;
        return this;
    }
    public Long getRelationServiceId() {
        return this.relationServiceId;
    }

    public ListIncidentsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
