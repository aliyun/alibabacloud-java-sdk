// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteTenantAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteTenantAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTenantAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantAppResponseBody self = new DeleteTenantAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTenantAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteTenantAppResponseBody setData(DeleteTenantAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteTenantAppResponseBodyData getData() {
        return this.data;
    }

    public DeleteTenantAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteTenantAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteTenantAppResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static DeleteTenantAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteTenantAppResponseBodyData self = new DeleteTenantAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteTenantAppResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
