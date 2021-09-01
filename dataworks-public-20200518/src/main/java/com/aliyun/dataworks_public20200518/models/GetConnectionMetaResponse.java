// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetConnectionMetaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetConnectionMetaResponseData data;

    public static GetConnectionMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionMetaResponse self = new GetConnectionMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectionMetaResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionMetaResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetConnectionMetaResponse setData(GetConnectionMetaResponseData data) {
        this.data = data;
        return this;
    }
    public GetConnectionMetaResponseData getData() {
        return this.data;
    }

    public static class GetConnectionMetaResponseData extends TeaModel {
        @NameInMap("Meta")
        @Validation(required = true)
        public String meta;

        public static GetConnectionMetaResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionMetaResponseData self = new GetConnectionMetaResponseData();
            return TeaModel.build(map, self);
        }

        public GetConnectionMetaResponseData setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

    }

}
