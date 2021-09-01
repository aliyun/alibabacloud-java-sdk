// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ImportConnectionsResponseData data;

    public static ImportConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportConnectionsResponse self = new ImportConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ImportConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportConnectionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportConnectionsResponse setData(ImportConnectionsResponseData data) {
        this.data = data;
        return this;
    }
    public ImportConnectionsResponseData getData() {
        return this.data;
    }

    public static class ImportConnectionsResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static ImportConnectionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ImportConnectionsResponseData self = new ImportConnectionsResponseData();
            return TeaModel.build(map, self);
        }

        public ImportConnectionsResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ImportConnectionsResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
