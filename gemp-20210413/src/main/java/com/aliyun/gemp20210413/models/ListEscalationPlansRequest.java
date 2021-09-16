// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansRequest extends TeaModel {
    // 升级计划名
    @NameInMap("escalationPlanName")
    public String escalationPlanName;

    // 服务名称
    @NameInMap("serviceName")
    public String serviceName;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListEscalationPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlansRequest self = new ListEscalationPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlansRequest setEscalationPlanName(String escalationPlanName) {
        this.escalationPlanName = escalationPlanName;
        return this;
    }
    public String getEscalationPlanName() {
        return this.escalationPlanName;
    }

    public ListEscalationPlansRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListEscalationPlansRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListEscalationPlansRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEscalationPlansRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
