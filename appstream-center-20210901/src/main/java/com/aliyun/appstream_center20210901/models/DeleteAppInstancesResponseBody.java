// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAppInstancesResponseBody extends TeaModel {
    @NameInMap("DeleteAppInstanceModels")
    public java.util.List<DeleteAppInstancesResponseBodyDeleteAppInstanceModels> deleteAppInstanceModels;

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
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

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
