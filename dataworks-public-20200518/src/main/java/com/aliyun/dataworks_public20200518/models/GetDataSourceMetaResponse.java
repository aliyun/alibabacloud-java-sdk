// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataSourceMetaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDataSourceMetaResponseData data;

    public static GetDataSourceMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceMetaResponse self = new GetDataSourceMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceMetaResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceMetaResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataSourceMetaResponse setData(GetDataSourceMetaResponseData data) {
        this.data = data;
        return this;
    }
    public GetDataSourceMetaResponseData getData() {
        return this.data;
    }

    public static class GetDataSourceMetaResponseData extends TeaModel {
        @NameInMap("Meta")
        @Validation(required = true)
        public String meta;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static GetDataSourceMetaResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceMetaResponseData self = new GetDataSourceMetaResponseData();
            return TeaModel.build(map, self);
        }

        public GetDataSourceMetaResponseData setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public GetDataSourceMetaResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataSourceMetaResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
