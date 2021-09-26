// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportConnectionsResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ImportConnectionsResponseBodyData data;

    public static ImportConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportConnectionsResponseBody self = new ImportConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportConnectionsResponseBody setData(ImportConnectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportConnectionsResponseBodyData getData() {
        return this.data;
    }

    public static class ImportConnectionsResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Message")
        public String message;

        public static ImportConnectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportConnectionsResponseBodyData self = new ImportConnectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportConnectionsResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ImportConnectionsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
