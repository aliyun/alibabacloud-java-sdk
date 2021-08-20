// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetConnectionShareResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SetConnectionShareResponseBodyData data;

    public static SetConnectionShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetConnectionShareResponseBody self = new SetConnectionShareResponseBody();
        return TeaModel.build(map, self);
    }

    public SetConnectionShareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetConnectionShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetConnectionShareResponseBody setData(SetConnectionShareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetConnectionShareResponseBodyData getData() {
        return this.data;
    }

    public static class SetConnectionShareResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static SetConnectionShareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetConnectionShareResponseBodyData self = new SetConnectionShareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetConnectionShareResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
