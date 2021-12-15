// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DumpMetaListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DumpMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaListResponseBody self = new DumpMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DumpMetaListResponseBody setData(DumpMetaListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DumpMetaListResponseBodyData getData() {
        return this.data;
    }

    public DumpMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DumpMetaListResponseBodyDataDumpMetaList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MetaUrl")
        public String metaUrl;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public Long utcModified;

        public static DumpMetaListResponseBodyDataDumpMetaList build(java.util.Map<String, ?> map) throws Exception {
            DumpMetaListResponseBodyDataDumpMetaList self = new DumpMetaListResponseBodyDataDumpMetaList();
            return TeaModel.build(map, self);
        }

        public DumpMetaListResponseBodyDataDumpMetaList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DumpMetaListResponseBodyDataDumpMetaList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DumpMetaListResponseBodyDataDumpMetaList setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public DumpMetaListResponseBodyDataDumpMetaList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DumpMetaListResponseBodyDataDumpMetaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DumpMetaListResponseBodyDataDumpMetaList setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public DumpMetaListResponseBodyDataDumpMetaList setUtcModified(Long utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public Long getUtcModified() {
            return this.utcModified;
        }

    }

    public static class DumpMetaListResponseBodyData extends TeaModel {
        @NameInMap("DumpMetaList")
        public java.util.List<DumpMetaListResponseBodyDataDumpMetaList> dumpMetaList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DumpMetaListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DumpMetaListResponseBodyData self = new DumpMetaListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DumpMetaListResponseBodyData setDumpMetaList(java.util.List<DumpMetaListResponseBodyDataDumpMetaList> dumpMetaList) {
            this.dumpMetaList = dumpMetaList;
            return this;
        }
        public java.util.List<DumpMetaListResponseBodyDataDumpMetaList> getDumpMetaList() {
            return this.dumpMetaList;
        }

        public DumpMetaListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DumpMetaListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DumpMetaListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
