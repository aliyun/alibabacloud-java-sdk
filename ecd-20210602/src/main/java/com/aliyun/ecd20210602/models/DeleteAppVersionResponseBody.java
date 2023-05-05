// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteAppVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteAppVersionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionResponseBody self = new DeleteAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAppVersionResponseBody setData(DeleteAppVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAppVersionResponseBodyData getData() {
        return this.data;
    }

    public DeleteAppVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAppVersionResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static DeleteAppVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppVersionResponseBodyData self = new DeleteAppVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAppVersionResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
