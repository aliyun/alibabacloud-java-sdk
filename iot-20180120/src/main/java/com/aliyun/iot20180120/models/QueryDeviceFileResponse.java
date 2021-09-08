// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceFileResponseData data;

    public static QueryDeviceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileResponse self = new QueryDeviceFileResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceFileResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceFileResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceFileResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceFileResponse setData(QueryDeviceFileResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceFileResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceFileResponseData extends TeaModel {
        @NameInMap("FileId")
        @Validation(required = true)
        public String fileId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        @NameInMap("UtcCreatedOn")
        @Validation(required = true)
        public String utcCreatedOn;

        @NameInMap("DownloadUrl")
        @Validation(required = true)
        public String downloadUrl;

        public static QueryDeviceFileResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileResponseData self = new QueryDeviceFileResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileResponseData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryDeviceFileResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceFileResponseData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryDeviceFileResponseData setUtcCreatedOn(String utcCreatedOn) {
            this.utcCreatedOn = utcCreatedOn;
            return this;
        }
        public String getUtcCreatedOn() {
            return this.utcCreatedOn;
        }

        public QueryDeviceFileResponseData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

    }

}
