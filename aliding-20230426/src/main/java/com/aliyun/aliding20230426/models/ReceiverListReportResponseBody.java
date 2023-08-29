// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ReceiverListReportResponseBody extends TeaModel {
    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("nextCursor")
    public Long nextCursor;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("useridList")
    public java.util.List<String> useridList;

    public static ReceiverListReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReceiverListReportResponseBody self = new ReceiverListReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ReceiverListReportResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ReceiverListReportResponseBody setNextCursor(Long nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public Long getNextCursor() {
        return this.nextCursor;
    }

    public ReceiverListReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReceiverListReportResponseBody setUseridList(java.util.List<String> useridList) {
        this.useridList = useridList;
        return this;
    }
    public java.util.List<String> getUseridList() {
        return this.useridList;
    }

}
