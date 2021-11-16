// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportConnectionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImportConnectionsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImportConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportConnectionsResponseBody self = new ImportConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportConnectionsResponseBody setData(ImportConnectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportConnectionsResponseBodyData getData() {
        return this.data;
    }

    public ImportConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportConnectionsResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public Boolean status;

        public static ImportConnectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportConnectionsResponseBodyData self = new ImportConnectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportConnectionsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ImportConnectionsResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
