// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAppInstancesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("DeleteAppInstanceModels")
    public java.util.List<DeleteAppInstancesResponseBodyDeleteAppInstanceModels> deleteAppInstanceModels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstancesResponseBody self = new DeleteAppInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstancesResponseBody setDeleteAppInstanceModels(java.util.List<DeleteAppInstancesResponseBodyDeleteAppInstanceModels> deleteAppInstanceModels) {
        this.deleteAppInstanceModels = deleteAppInstanceModels;
        return this;
    }
    public java.util.List<DeleteAppInstancesResponseBodyDeleteAppInstanceModels> getDeleteAppInstanceModels() {
        return this.deleteAppInstanceModels;
    }

    public DeleteAppInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAppInstancesResponseBodyDeleteAppInstanceModels extends TeaModel {
        /**
         * <p>The ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-gbuea*****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ProductType</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter ProductType is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Specifies whether the application instance is deleted.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAppInstancesResponseBodyDeleteAppInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppInstancesResponseBodyDeleteAppInstanceModels self = new DeleteAppInstancesResponseBodyDeleteAppInstanceModels();
            return TeaModel.build(map, self);
        }

        public DeleteAppInstancesResponseBodyDeleteAppInstanceModels setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public DeleteAppInstancesResponseBodyDeleteAppInstanceModels setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteAppInstancesResponseBodyDeleteAppInstanceModels setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteAppInstancesResponseBodyDeleteAppInstanceModels setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
