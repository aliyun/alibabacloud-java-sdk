// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDataSourcesResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ImportDataSourcesResponseBodyData data;

    public static ImportDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourcesResponseBody self = new ImportDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDataSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDataSourcesResponseBody setData(ImportDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public static class ImportDataSourcesResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Message")
        public String message;

        public static ImportDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportDataSourcesResponseBodyData self = new ImportDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportDataSourcesResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ImportDataSourcesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
