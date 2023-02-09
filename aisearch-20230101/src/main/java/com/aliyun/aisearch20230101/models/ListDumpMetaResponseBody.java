// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListDumpMetaResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDumpMetaResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDumpMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDumpMetaResponseBody self = new ListDumpMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDumpMetaResponseBody setData(ListDumpMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDumpMetaResponseBodyData getData() {
        return this.data;
    }

    public ListDumpMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDumpMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDumpMetaResponseBodyDataDumpMetaList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("MetaUrl")
        public String metaUrl;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreateTime")
        public String utcCreateTime;

        @NameInMap("UtcUpdateTime")
        public String utcUpdateTime;

        public static ListDumpMetaResponseBodyDataDumpMetaList build(java.util.Map<String, ?> map) throws Exception {
            ListDumpMetaResponseBodyDataDumpMetaList self = new ListDumpMetaResponseBodyDataDumpMetaList();
            return TeaModel.build(map, self);
        }

        public ListDumpMetaResponseBodyDataDumpMetaList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDumpMetaResponseBodyDataDumpMetaList setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public ListDumpMetaResponseBodyDataDumpMetaList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListDumpMetaResponseBodyDataDumpMetaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDumpMetaResponseBodyDataDumpMetaList setUtcCreateTime(String utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public String getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public ListDumpMetaResponseBodyDataDumpMetaList setUtcUpdateTime(String utcUpdateTime) {
            this.utcUpdateTime = utcUpdateTime;
            return this;
        }
        public String getUtcUpdateTime() {
            return this.utcUpdateTime;
        }

    }

    public static class ListDumpMetaResponseBodyData extends TeaModel {
        @NameInMap("DumpMetaList")
        public java.util.List<ListDumpMetaResponseBodyDataDumpMetaList> dumpMetaList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListDumpMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDumpMetaResponseBodyData self = new ListDumpMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDumpMetaResponseBodyData setDumpMetaList(java.util.List<ListDumpMetaResponseBodyDataDumpMetaList> dumpMetaList) {
            this.dumpMetaList = dumpMetaList;
            return this;
        }
        public java.util.List<ListDumpMetaResponseBodyDataDumpMetaList> getDumpMetaList() {
            return this.dumpMetaList;
        }

        public ListDumpMetaResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDumpMetaResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDumpMetaResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
