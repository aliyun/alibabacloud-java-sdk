// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public SetDataSourceShareResponseData data;

    public static SetDataSourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataSourceShareResponse self = new SetDataSourceShareResponse();
        return TeaModel.build(map, self);
    }

    public SetDataSourceShareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDataSourceShareResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetDataSourceShareResponse setData(SetDataSourceShareResponseData data) {
        this.data = data;
        return this;
    }
    public SetDataSourceShareResponseData getData() {
        return this.data;
    }

    public static class SetDataSourceShareResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static SetDataSourceShareResponseData build(java.util.Map<String, ?> map) throws Exception {
            SetDataSourceShareResponseData self = new SetDataSourceShareResponseData();
            return TeaModel.build(map, self);
        }

        public SetDataSourceShareResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SetDataSourceShareResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
