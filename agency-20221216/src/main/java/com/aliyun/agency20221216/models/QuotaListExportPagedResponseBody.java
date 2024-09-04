// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QuotaListExportPagedResponseBody extends TeaModel {
    /**
     * <p>Status code of returning result, 200 means success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Listed data of returning result</p>
     */
    @NameInMap("Data")
    public java.util.List<QuotaListExportPagedResponseBodyData> data;

    /**
     * <p>Description of returning result</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Record number on each page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of the Request</p>
     * 
     * <strong>example:</strong>
     * <p>210e876f16704666020714468dab35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total volume</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QuotaListExportPagedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuotaListExportPagedResponseBody self = new QuotaListExportPagedResponseBody();
        return TeaModel.build(map, self);
    }

    public QuotaListExportPagedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuotaListExportPagedResponseBody setData(java.util.List<QuotaListExportPagedResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuotaListExportPagedResponseBodyData> getData() {
        return this.data;
    }

    public QuotaListExportPagedResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QuotaListExportPagedResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuotaListExportPagedResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuotaListExportPagedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuotaListExportPagedResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QuotaListExportPagedResponseBodyData extends TeaModel {
        /**
         * <p>Create Time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-21 21:31:57 UTC+8</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>File Name</p>
         * 
         * <strong>example:</strong>
         * <p>5113766248601929_quota_2023-06-22_2023-12-21_all_2023122121310057</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Notification Message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Display of Task Status</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Task Status Enum</br>
         * 2: Exporting</br>
         * 3: Export Success</br>
         * -1: Export Fail</br></p>
         * 
         * <strong>example:</strong>
         * <p>Export Success</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The link to download exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>//aliyun-eco-market-servic-singapore.oss-ap-southeast-1.aliyuncs.com/5113766248601929_quota_2023-06-22_2023-12-21_all_2023122121310057</p>
         */
        @NameInMap("Url")
        public String url;

        public static QuotaListExportPagedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuotaListExportPagedResponseBodyData self = new QuotaListExportPagedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuotaListExportPagedResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuotaListExportPagedResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QuotaListExportPagedResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QuotaListExportPagedResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuotaListExportPagedResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public QuotaListExportPagedResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
