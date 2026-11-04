// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventRecordResponseBody extends TeaModel {
    /**
     * <p>The response code:</p>
     * <ul>
     * <li><strong>200</strong>: The call was successful.</li>
     * <li>Other: An error code. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryDeviceEventRecordResponseBodyData> data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant auth error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06DC77A0-4622-42DB-9EE0-25FIOHS82JK1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful:</p>
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

    public static QueryDeviceEventRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventRecordResponseBody self = new QueryDeviceEventRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventRecordResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDeviceEventRecordResponseBody setData(java.util.List<QueryDeviceEventRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceEventRecordResponseBodyData> getData() {
        return this.data;
    }

    public QueryDeviceEventRecordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceEventRecordResponseBodyData extends TeaModel {
        /**
         * <p>The start time of the recording.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08 15:55:35</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The end time of the recording.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08 15:56:32</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>file1</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The URL of the recording file.</p>
         * <blockquote>
         * <p>The URL contains authentication information and is valid only for a single use. It cannot be reused.</p>
         * </blockquote>
         */
        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryDeviceEventRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventRecordResponseBodyData self = new QueryDeviceEventRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventRecordResponseBodyData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryDeviceEventRecordResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryDeviceEventRecordResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryDeviceEventRecordResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
