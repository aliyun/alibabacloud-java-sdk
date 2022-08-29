// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ShareBatchPrivateDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ShareBatchPrivateDataResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ShareBatchPrivateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShareBatchPrivateDataResponseBody self = new ShareBatchPrivateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ShareBatchPrivateDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ShareBatchPrivateDataResponseBody setData(java.util.List<ShareBatchPrivateDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ShareBatchPrivateDataResponseBodyData> getData() {
        return this.data;
    }

    public ShareBatchPrivateDataResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ShareBatchPrivateDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ShareBatchPrivateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ShareBatchPrivateDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ShareBatchPrivateDataResponseBodyData extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("TargetTableId")
        public Long targetTableId;

        @NameInMap("TargetTableName")
        public String targetTableName;

        public static ShareBatchPrivateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ShareBatchPrivateDataResponseBodyData self = new ShareBatchPrivateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ShareBatchPrivateDataResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public ShareBatchPrivateDataResponseBodyData setTargetTableId(Long targetTableId) {
            this.targetTableId = targetTableId;
            return this;
        }
        public Long getTargetTableId() {
            return this.targetTableId;
        }

        public ShareBatchPrivateDataResponseBodyData setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

}
