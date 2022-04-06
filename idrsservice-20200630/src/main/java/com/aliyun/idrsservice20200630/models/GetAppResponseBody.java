// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppResponseBody setData(GetAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppResponseBodyData getData() {
        return this.data;
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

    public static class GetAppResponseBodyData extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Disabled")
        public String disabled;

        @NameInMap("FeeId")
        public String feeId;

        @NameInMap("Name")
        public String name;

        public static GetAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyData self = new GetAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetAppResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetAppResponseBodyData setDisabled(String disabled) {
            this.disabled = disabled;
            return this;
        }
        public String getDisabled() {
            return this.disabled;
        }

        public GetAppResponseBodyData setFeeId(String feeId) {
            this.feeId = feeId;
            return this;
        }
        public String getFeeId() {
            return this.feeId;
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
