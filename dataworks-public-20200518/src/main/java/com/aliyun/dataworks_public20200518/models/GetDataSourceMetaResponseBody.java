// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataSourceMetaResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDataSourceMetaResponseBodyData data;

    public static GetDataSourceMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceMetaResponseBody self = new GetDataSourceMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataSourceMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceMetaResponseBody setData(GetDataSourceMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataSourceMetaResponseBodyData getData() {
        return this.data;
    }

    public static class GetDataSourceMetaResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        @NameInMap("Meta")
        public String meta;

        public static GetDataSourceMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceMetaResponseBodyData self = new GetDataSourceMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataSourceMetaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataSourceMetaResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDataSourceMetaResponseBodyData setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

    }

}
