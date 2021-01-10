// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAppResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setData(GetAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppResponseBodyData getData() {
        return this.data;
    }

    public GetAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetAppResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Integer createdAt;

        @NameInMap("Disabled")
        public String disabled;

        @NameInMap("Name")
        public String name;

        public static GetAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyData self = new GetAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyData setCreatedAt(Integer createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Integer getCreatedAt() {
            return this.createdAt;
        }

        public GetAppResponseBodyData setDisabled(String disabled) {
            this.disabled = disabled;
            return this;
        }
        public String getDisabled() {
            return this.disabled;
        }

        public GetAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
