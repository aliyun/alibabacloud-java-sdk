// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailTimelinesRequest extends TeaModel {
    // 事件ID
    @NameInMap("incidentId")
    public Long incidentId;

    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    // 页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 行
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListIncidentDetailTimelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailTimelinesRequest self = new ListIncidentDetailTimelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailTimelinesRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

    public ListIncidentDetailTimelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIncidentDetailTimelinesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentDetailTimelinesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
