// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareResponseBody extends TeaModel {
    @NameInMap("Data")
    public SetDataSourceShareResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetDataSourceShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDataSourceShareResponseBody self = new SetDataSourceShareResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDataSourceShareResponseBody setData(SetDataSourceShareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetDataSourceShareResponseBodyData getData() {
        return this.data;
    }

    public SetDataSourceShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDataSourceShareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetDataSourceShareResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        public static SetDataSourceShareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetDataSourceShareResponseBodyData self = new SetDataSourceShareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetDataSourceShareResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SetDataSourceShareResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
