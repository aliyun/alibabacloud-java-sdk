// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryUserDocumentResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryUserDocumentResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserDocumentResponseBody self = new QueryUserDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserDocumentResponseBody setData(QueryUserDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryUserDocumentResponseBodyData getData() {
        return this.data;
    }

    public QueryUserDocumentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryUserDocumentResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryUserDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserDocumentResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DataStatus")
        public Long dataStatus;

        public static QueryUserDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserDocumentResponseBodyData self = new QueryUserDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUserDocumentResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryUserDocumentResponseBodyData setDataStatus(Long dataStatus) {
            this.dataStatus = dataStatus;
            return this;
        }
        public Long getDataStatus() {
            return this.dataStatus;
        }

    }

}
