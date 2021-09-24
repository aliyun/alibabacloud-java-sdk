// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetConnectionShareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public SetConnectionShareResponseData data;

    public static SetConnectionShareResponse build(java.util.Map<String, ?> map) throws Exception {
        SetConnectionShareResponse self = new SetConnectionShareResponse();
        return TeaModel.build(map, self);
    }

    public SetConnectionShareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetConnectionShareResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetConnectionShareResponse setData(SetConnectionShareResponseData data) {
        this.data = data;
        return this;
    }
    public SetConnectionShareResponseData getData() {
        return this.data;
    }

    public static class SetConnectionShareResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static SetConnectionShareResponseData build(java.util.Map<String, ?> map) throws Exception {
            SetConnectionShareResponseData self = new SetConnectionShareResponseData();
            return TeaModel.build(map, self);
        }

        public SetConnectionShareResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
