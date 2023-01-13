// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of the operation log.</p>
     */
    @NameInMap("OpLogDetails")
    public GetOpLogResponseBodyOpLogDetails opLogDetails;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>- **true**: The request is successful.</p>
     * <p>- **false**: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of operation logs that are returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetOpLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpLogResponseBody self = new GetOpLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOpLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOpLogResponseBody setOpLogDetails(GetOpLogResponseBodyOpLogDetails opLogDetails) {
        this.opLogDetails = opLogDetails;
        return this;
    }
    public GetOpLogResponseBodyOpLogDetails getOpLogDetails() {
        return this.opLogDetails;
    }

    public GetOpLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOpLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetOpLogResponseBodyOpLogDetailsOpLogDetail extends TeaModel {
        /**
         * <p>The endpoint of the database instance.</p>
         * <br>
         * <p>> * This parameter is valid only for database instances of the LocalInstance type.</p>
         * <p>> * This parameter is valid only for operations on the functional modules related to tasks.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The functional module for which the operation log is queried.</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The details of the operation.</p>
         */
        @NameInMap("OpContent")
        public String opContent;

        /**
         * <p>The time when the operation was performed.</p>
         */
        @NameInMap("OpTime")
        public String opTime;

        /**
         * <p>The ID of the user who performed the operation.</p>
         */
        @NameInMap("OpUserId")
        public Long opUserId;

        /**
         * <p>The ID of the ticket or task.</p>
         * <br>
         * <p>>  This parameter is valid only for operations on the functional modules related to tasks and the task management module in system management.</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The display name of the user.</p>
         */
        @NameInMap("UserNick")
        public String userNick;

        public static GetOpLogResponseBodyOpLogDetailsOpLogDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOpLogResponseBodyOpLogDetailsOpLogDetail self = new GetOpLogResponseBodyOpLogDetailsOpLogDetail();
            return TeaModel.build(map, self);
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setOpContent(String opContent) {
            this.opContent = opContent;
            return this;
        }
        public String getOpContent() {
            return this.opContent;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setOpTime(String opTime) {
            this.opTime = opTime;
            return this;
        }
        public String getOpTime() {
            return this.opTime;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setOpUserId(Long opUserId) {
            this.opUserId = opUserId;
            return this;
        }
        public Long getOpUserId() {
            return this.opUserId;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetOpLogResponseBodyOpLogDetailsOpLogDetail setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
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
