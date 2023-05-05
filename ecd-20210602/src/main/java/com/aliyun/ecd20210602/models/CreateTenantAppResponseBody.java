// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateTenantAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTenantAppResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTenantAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantAppResponseBody self = new CreateTenantAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTenantAppResponseBody setData(CreateTenantAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTenantAppResponseBodyData getData() {
        return this.data;
    }

    public CreateTenantAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTenantAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTenantAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTenantAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Integer appId;

        public static CreateTenantAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantAppResponseBodyData self = new CreateTenantAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTenantAppResponseBodyData setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

    }

}
