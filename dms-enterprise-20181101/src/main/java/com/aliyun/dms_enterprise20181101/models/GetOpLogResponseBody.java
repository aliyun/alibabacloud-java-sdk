// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("OpLogDetails")
    public GetOpLogResponseBodyOpLogDetails opLogDetails;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetOpLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpLogResponseBody self = new GetOpLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetOpLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOpLogResponseBody setOpLogDetails(GetOpLogResponseBodyOpLogDetails opLogDetails) {
        this.opLogDetails = opLogDetails;
        return this;
    }
    public GetOpLogResponseBodyOpLogDetails getOpLogDetails() {
        return this.opLogDetails;
    }

    public GetOpLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOpLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpLogResponseBodyOpLogDetailsOpLogDetail extends TeaModel {
        @NameInMap("Module")
        public String module;

        @NameInMap("Database")
        public String database;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("OpContent")
        public String opContent;

        @NameInMap("UserNick")
        public String userNick;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OpTime")
        public String opTime;

        public static GetOpLogResponseBodyOpLogDetailsOpLogDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOpLogResponseBodyOpLogDetailsOpLogDetail self = new GetOpLogResponseBodyOpLogDetailsOpLogDetail();
            return TeaModel.build(map, self);
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setOpContent(String opContent) {
            this.opContent = opContent;
            return this;
        }
        public String getOpContent() {
            return this.opContent;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setOpTime(String opTime) {
            this.opTime = opTime;
            return this;
        }
        public String getOpTime() {
            return this.opTime;
        }

    }

    public static class GetOpLogResponseBodyOpLogDetails extends TeaModel {
        @NameInMap("OpLogDetail")
        public java.util.List<GetOpLogResponseBodyOpLogDetailsOpLogDetail> opLogDetail;

        public static GetOpLogResponseBodyOpLogDetails build(java.util.Map<String, ?> map) throws Exception {
            GetOpLogResponseBodyOpLogDetails self = new GetOpLogResponseBodyOpLogDetails();
            return TeaModel.build(map, self);
        }

        public GetOpLogResponseBodyOpLogDetails setOpLogDetail(java.util.List<GetOpLogResponseBodyOpLogDetailsOpLogDetail> opLogDetail) {
            this.opLogDetail = opLogDetail;
            return this;
        }
        public java.util.List<GetOpLogResponseBodyOpLogDetailsOpLogDetail> getOpLogDetail() {
            return this.opLogDetail;
        }

    }

}
