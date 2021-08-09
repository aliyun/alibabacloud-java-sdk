// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDataSourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ImportDataSourcesResponseData data;

    public static ImportDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourcesResponse self = new ImportDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ImportDataSourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDataSourcesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportDataSourcesResponse setData(ImportDataSourcesResponseData data) {
        this.data = data;
        return this;
    }
    public ImportDataSourcesResponseData getData() {
        return this.data;
    }

    public static class ImportDataSourcesResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static ImportDataSourcesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ImportDataSourcesResponseData self = new ImportDataSourcesResponseData();
            return TeaModel.build(map, self);
        }

        public ImportDataSourcesResponseData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ImportDataSourcesResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
