// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRobotUnsubscriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("unsubscribedStaffIds")
    public java.util.List<String> unsubscribedStaffIds;

    public static QueryRobotUnsubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotUnsubscriptionResponseBody self = new QueryRobotUnsubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotUnsubscriptionResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryRobotUnsubscriptionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRobotUnsubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRobotUnsubscriptionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryRobotUnsubscriptionResponseBody setUnsubscribedStaffIds(java.util.List<String> unsubscribedStaffIds) {
        this.unsubscribedStaffIds = unsubscribedStaffIds;
        return this;
    }
    public java.util.List<String> getUnsubscribedStaffIds() {
        return this.unsubscribedStaffIds;
    }

}
