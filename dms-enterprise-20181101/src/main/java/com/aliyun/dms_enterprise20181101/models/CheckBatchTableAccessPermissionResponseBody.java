// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CheckBatchTableAccessPermissionResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<CheckBatchTableAccessPermissionResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B43AD641-49C2-5299-9E06-1B37EC1B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckBatchTableAccessPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckBatchTableAccessPermissionResponseBody self = new CheckBatchTableAccessPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckBatchTableAccessPermissionResponseBody setData(java.util.List<CheckBatchTableAccessPermissionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CheckBatchTableAccessPermissionResponseBodyData> getData() {
        return this.data;
    }

    public CheckBatchTableAccessPermissionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckBatchTableAccessPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckBatchTableAccessPermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckBatchTableAccessPermissionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>The productKey is empty.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public String success;

        /**
         * <strong>example:</strong>
         * <p>tab_add_teacher_record</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static CheckBatchTableAccessPermissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckBatchTableAccessPermissionResponseBodyData self = new CheckBatchTableAccessPermissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckBatchTableAccessPermissionResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CheckBatchTableAccessPermissionResponseBodyData setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public CheckBatchTableAccessPermissionResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
