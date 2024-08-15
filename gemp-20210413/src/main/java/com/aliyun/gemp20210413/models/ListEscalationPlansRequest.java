// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A5A1FEAE-9C47-011C-9C73-A376BC2REQUEST</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("escalationPlanName")
    public String escalationPlanName;

    @NameInMap("isGlobal")
    public Boolean isGlobal;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>ssxx</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("status")
    public String status;

    public static ListEscalationPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlansRequest self = new ListEscalationPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlansRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListEscalationPlansRequest setEscalationPlanName(String escalationPlanName) {
        this.escalationPlanName = escalationPlanName;
        return this;
    }
    public String getEscalationPlanName() {
        return this.escalationPlanName;
    }

    public ListEscalationPlansRequest setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }
    public Boolean getIsGlobal() {
        return this.isGlobal;
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

    public ListEscalationPlansRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListEscalationPlansRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
