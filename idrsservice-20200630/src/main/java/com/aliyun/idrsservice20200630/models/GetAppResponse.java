// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetAppResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAppResponseData data;

    public static GetAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponse self = new GetAppResponse();
        return TeaModel.build(map, self);
    }

    public GetAppResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponse setData(GetAppResponseData data) {
        this.data = data;
        return this;
    }
    public GetAppResponseData getData() {
        return this.data;
    }

    public static class GetAppResponseData extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public Integer createdAt;

        @NameInMap("Disabled")
        @Validation(required = true)
        public String disabled;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetAppResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseData self = new GetAppResponseData();
            return TeaModel.build(map, self);
        }

        public GetAppResponseData setCreatedAt(Integer createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Integer getCreatedAt() {
            return this.createdAt;
        }

        public GetAppResponseData setDisabled(String disabled) {
            this.disabled = disabled;
            return this;
        }
        public String getDisabled() {
            return this.disabled;
        }

        public GetAppResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
