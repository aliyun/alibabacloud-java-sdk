// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaListResponseBody extends TeaModel {
    /**
     * <p>The metadata export information.</p>
     */
    @NameInMap("Data")
    public DumpMetaListResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B3137727-7D6E-488C-BA21-0E034C38A879</p>
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
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>0: Succeeded.</li>
         * <li>Non-zero: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The URL for downloading the result. The URL is valid for two hours.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx">https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx</a></p>
         */
        @NameInMap("MetaUrl")
        public String metaUrl;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>PROCESSING: The task is being processed.</li>
         * <li>FAIL: The task failed.</li>
         * <li>SUCCESS: The task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the task was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1629095713000</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the task was last updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1629095760000</p>
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
         * <p>The collection of metadata export tasks.</p>
         */
        @NameInMap("DumpMetaList")
        public java.util.List<DumpMetaListResponseBodyDataDumpMetaList> dumpMetaList;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
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
