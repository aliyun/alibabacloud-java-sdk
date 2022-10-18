// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListRequestEventResponse extends TeaModel {
    @NameInMap("Count")
    @Validation(required = true)
    public Integer count;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListRequestEventResponseDataList> dataList;

    public static ListRequestEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRequestEventResponse self = new ListRequestEventResponse();
        return TeaModel.build(map, self);
    }

    public ListRequestEventResponse setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListRequestEventResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRequestEventResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRequestEventResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRequestEventResponse setDataList(java.util.List<ListRequestEventResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListRequestEventResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListRequestEventResponseDataList extends TeaModel {
        @NameInMap("RequestId")
        @Validation(required = true)
        public String requestId;

        public static ListRequestEventResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRequestEventResponseDataList self = new ListRequestEventResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListRequestEventResponseDataList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
