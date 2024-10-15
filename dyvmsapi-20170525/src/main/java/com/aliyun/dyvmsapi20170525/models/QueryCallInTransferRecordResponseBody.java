// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInTransferRecordResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public QueryCallInTransferRecordResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryCallInTransferRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallInTransferRecordResponseBody self = new QueryCallInTransferRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallInTransferRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCallInTransferRecordResponseBody setData(QueryCallInTransferRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCallInTransferRecordResponseBodyData getData() {
        return this.data;
    }

    public QueryCallInTransferRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCallInTransferRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCallInTransferRecordResponseBodyDataValues extends TeaModel {
        /**
         * <p>The called number of the inbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>150****0000</p>
         */
        @NameInMap("CallInCalled")
        public String callInCalled;

        /**
         * <p>The calling number of the inbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>150****0000</p>
         */
        @NameInMap("CallInCaller")
        public String callInCaller;

        /**
         * <p>The time when the call was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-03 10:21:21</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The recording URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://alicom-fc-media.cn-hangzhou.oss.aliyun-inc.com/dayuBizVoiceMrg/4238c230-9e74-41be-90b8-2fbe7684****.wav?Expires=1627538265&OSSAccessKeyId=bypFNbGJVk73****&Signature=****mUqkPqIQ%3D">http://alicom-fc-media.cn-hangzhou.oss.aliyun-inc.com/dayuBizVoiceMrg/4238c230-9e74-41be-90b8-2fbe7684****.wav?Expires=1627538265&amp;OSSAccessKeyId=bypFNbGJVk73****&amp;Signature=****mUqkPqIQ%3D</a></p>
         */
        @NameInMap("RecordUrl")
        public String recordUrl;

        /**
         * <p>The phone number to which the call was transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>151****0000</p>
         */
        @NameInMap("TransferCalled")
        public String transferCalled;

        /**
         * <p>The calling number that transferred the call.</p>
         * 
         * <strong>example:</strong>
         * <p>151****0000</p>
         */
        @NameInMap("TransferCaller")
        public String transferCaller;

        public static QueryCallInTransferRecordResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            QueryCallInTransferRecordResponseBodyDataValues self = new QueryCallInTransferRecordResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public QueryCallInTransferRecordResponseBodyDataValues setCallInCalled(String callInCalled) {
            this.callInCalled = callInCalled;
            return this;
        }
        public String getCallInCalled() {
            return this.callInCalled;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setCallInCaller(String callInCaller) {
            this.callInCaller = callInCaller;
            return this;
        }
        public String getCallInCaller() {
            return this.callInCaller;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setTransferCalled(String transferCalled) {
            this.transferCalled = transferCalled;
            return this;
        }
        public String getTransferCalled() {
            return this.transferCalled;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setTransferCaller(String transferCaller) {
            this.transferCaller = transferCaller;
            return this;
        }
        public String getTransferCaller() {
            return this.transferCaller;
        }

    }

    public static class QueryCallInTransferRecordResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The call transfer records.</p>
         */
        @NameInMap("Values")
        public java.util.List<QueryCallInTransferRecordResponseBodyDataValues> values;

        public static QueryCallInTransferRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCallInTransferRecordResponseBodyData self = new QueryCallInTransferRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCallInTransferRecordResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryCallInTransferRecordResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryCallInTransferRecordResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryCallInTransferRecordResponseBodyData setValues(java.util.List<QueryCallInTransferRecordResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryCallInTransferRecordResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
