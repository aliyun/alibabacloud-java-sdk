// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDataSourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImportDataSourcesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImportDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourcesResponseBody self = new ImportDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDataSourcesResponseBody setData(ImportDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public ImportDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDataSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportDataSourcesResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public Boolean status;

        public static ImportDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportDataSourcesResponseBodyData self = new ImportDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportDataSourcesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ImportDataSourcesResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
