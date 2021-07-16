// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentsRequest extends TeaModel {
    // 事件级别 P1 P2 P3 P4
    @NameInMap("incidentLevel")
    public String incidentLevel;

    // 页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 行
    @NameInMap("pageSize")
    public Integer pageSize;

    // 影响等级 高：HIGH 低 LOW
    @NameInMap("effect")
    public String effect;

    // 关联服务ID
    @NameInMap("relationServiceId")
    public Long relationServiceId;

    // 事件状态 ASSIGNED已分派 RESPONDED已响应  FINISHED已完结
    @NameInMap("incidentStatus")
    public String incidentStatus;

    // 是否自己 1是 0不是
    @NameInMap("me")
    public Integer me;

    // 幂等校验id
    @NameInMap("clientToken")
    public String clientToken;

    public static ListIncidentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsRequest self = new ListIncidentsRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentsRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
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

    public ListIncidentsRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public ListIncidentsRequest setRelationServiceId(Long relationServiceId) {
        this.relationServiceId = relationServiceId;
        return this;
    }
    public Long getRelationServiceId() {
        return this.relationServiceId;
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

    public ListIncidentsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
