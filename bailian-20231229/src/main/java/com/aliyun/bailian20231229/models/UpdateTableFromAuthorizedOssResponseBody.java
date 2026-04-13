// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateTableFromAuthorizedOssResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataCenter.FileTooLarge</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateTableFromAuthorizedOssResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7BA8ADD9-53D6-53F0-918F-A1E776AD230E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateTableFromAuthorizedOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableFromAuthorizedOssResponseBody self = new UpdateTableFromAuthorizedOssResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableFromAuthorizedOssResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTableFromAuthorizedOssResponseBody setData(UpdateTableFromAuthorizedOssResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateTableFromAuthorizedOssResponseBodyData getData() {
        return this.data;
    }

    public UpdateTableFromAuthorizedOssResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTableFromAuthorizedOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTableFromAuthorizedOssResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateTableFromAuthorizedOssResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateTableFromAuthorizedOssResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TO_IMPORT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>table_df96ebd5da8640e5a0991b3d15f39d4d_12792097</p>
         */
        @NameInMap("TableId")
        public String tableId;

        public static UpdateTableFromAuthorizedOssResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableFromAuthorizedOssResponseBodyData self = new UpdateTableFromAuthorizedOssResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTableFromAuthorizedOssResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTableFromAuthorizedOssResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

}
