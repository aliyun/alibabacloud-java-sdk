// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaListResponseBody extends TeaModel {
    /**
     * <p>The information about the task that is used to export metadata.</p>
     */
    @NameInMap("Data")
    public DumpMetaListResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The error code returned.</p>
         * <br>
         * <p>*   A value of 0 indicates that the operation is successful.</p>
         * <p>*   Values other than 0 indicate errors.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The address where you can download the metadata. The address is valid for 2 hours.</p>
         */
        @NameInMap("MetaUrl")
        public String metaUrl;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The status of the export task.</p>
         * <br>
         * <p>*   PROCESSING: in progress</p>
         * <p>*   FAIL: failed</p>
         * <p>*   SUCCESS: successful</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the task was created. Unit: milliseconds.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the task was updated. Unit: milliseconds.</p>
         */
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
        /**
         * <p>A list of tasks that are used to export metadata.</p>
         */
        @NameInMap("DumpMetaList")
        public java.util.List<DumpMetaListResponseBodyDataDumpMetaList> dumpMetaList;

        /**
         * <p>The number of the page to return.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries to return on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks.</p>
         */
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
