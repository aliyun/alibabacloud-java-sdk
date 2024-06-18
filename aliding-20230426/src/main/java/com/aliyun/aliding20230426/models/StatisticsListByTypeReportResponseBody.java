// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsListByTypeReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <strong>example:</strong>
     * <p>12312131231</p>
     */
    @NameInMap("nextCursor")
    public Long nextCursor;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("useridList")
    public java.util.List<String> useridList;

    public static StatisticsListByTypeReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StatisticsListByTypeReportResponseBody self = new StatisticsListByTypeReportResponseBody();
        return TeaModel.build(map, self);
    }

    public StatisticsListByTypeReportResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public StatisticsListByTypeReportResponseBody setNextCursor(Long nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public Long getNextCursor() {
        return this.nextCursor;
    }

    public StatisticsListByTypeReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StatisticsListByTypeReportResponseBody setUseridList(java.util.List<String> useridList) {
        this.useridList = useridList;
        return this;
    }
    public java.util.List<String> getUseridList() {
        return this.useridList;
    }

}
