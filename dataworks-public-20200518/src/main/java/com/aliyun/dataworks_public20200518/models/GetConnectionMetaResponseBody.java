// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetConnectionMetaResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetConnectionMetaResponseBodyData data;

    public static GetConnectionMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionMetaResponseBody self = new GetConnectionMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetConnectionMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionMetaResponseBody setData(GetConnectionMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConnectionMetaResponseBodyData getData() {
        return this.data;
    }

    public static class GetConnectionMetaResponseBodyData extends TeaModel {
        @NameInMap("Meta")
        public String meta;

        public static GetConnectionMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionMetaResponseBodyData self = new GetConnectionMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConnectionMetaResponseBodyData setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

    }

}
