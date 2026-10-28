// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListExportTasksResponseBody extends TeaModel {
    /**
     * <p>The status code of the returned result. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListExportTasksResponseBodyData> data;

    /**
     * <p>The description of the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>asda1231as</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListExportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExportTasksResponseBody self = new ListExportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExportTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListExportTasksResponseBody setData(java.util.List<ListExportTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListExportTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListExportTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExportTasksResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListExportTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExportTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListExportTasksResponseBodyData extends TeaModel {
        /**
         * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-01 10:22:11</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>511376624869_quota_2023-06-22_2023-12-21_all_2023122121310057</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The unique ID of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>12355</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The display status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Export Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status code of the task. Valid values:</p>
         * <ul>
         * <li>2: Exporting.</li>
         * <li>3: Export successful.</li>
         * <li>-1: Export failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The download URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>//aliyun-eco-market-servic-singapore.oss-ap-southeast-1.aliyuncs.com/511376624869_quota_2023-06-22_2023-12-21_all_2023122121310057</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListExportTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExportTasksResponseBodyData self = new ListExportTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExportTasksResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExportTasksResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListExportTasksResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListExportTasksResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListExportTasksResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExportTasksResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListExportTasksResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
