// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailTimelinesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("idSort")
    public String idSort;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("incidentId")
    public Long incidentId;

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

    public static ListIncidentDetailTimelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailTimelinesRequest self = new ListIncidentDetailTimelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailTimelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIncidentDetailTimelinesRequest setIdSort(String idSort) {
        this.idSort = idSort;
        return this;
    }
    public String getIdSort() {
        return this.idSort;
    }

    public ListIncidentDetailTimelinesRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
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
