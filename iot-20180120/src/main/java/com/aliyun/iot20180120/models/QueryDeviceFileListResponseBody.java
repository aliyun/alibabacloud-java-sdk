// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The file list information returned if the call succeeds.</p>
     */
    @NameInMap("Data")
    public QueryDeviceFileListResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of files.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryDeviceFileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileListResponseBody self = new QueryDeviceFileListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceFileListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceFileListResponseBody setData(QueryDeviceFileListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceFileListResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceFileListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceFileListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceFileListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceFileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceFileListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceFileListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceFileListResponseBodyDataFileSummary extends TeaModel {
        /**
         * <p>The ID of each file. The ID is the unique identifier for the file.</p>
         * 
         * <strong>example:</strong>
         * <p>xL0G67MBLBDtkR7GCfT******</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>testFile2.txt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the file. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The time when the file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-21T08:45:42.000Z</p>
         */
        @NameInMap("UtcCreatedOn")
        public String utcCreatedOn;

        public static QueryDeviceFileListResponseBodyDataFileSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileListResponseBodyDataFileSummary self = new QueryDeviceFileListResponseBodyDataFileSummary();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryDeviceFileListResponseBodyDataFileSummary setUtcCreatedOn(String utcCreatedOn) {
            this.utcCreatedOn = utcCreatedOn;
            return this;
        }
        public String getUtcCreatedOn() {
            return this.utcCreatedOn;
        }

    }

    public static class QueryDeviceFileListResponseBodyData extends TeaModel {
        @NameInMap("FileSummary")
        public java.util.List<QueryDeviceFileListResponseBodyDataFileSummary> fileSummary;

        public static QueryDeviceFileListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileListResponseBodyData self = new QueryDeviceFileListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileListResponseBodyData setFileSummary(java.util.List<QueryDeviceFileListResponseBodyDataFileSummary> fileSummary) {
            this.fileSummary = fileSummary;
            return this;
        }
        public java.util.List<QueryDeviceFileListResponseBodyDataFileSummary> getFileSummary() {
            return this.fileSummary;
        }

    }

}
