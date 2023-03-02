// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDownloadDataJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDownloadDataJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDownloadDataJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadDataJobResponseBody self = new CreateDownloadDataJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDownloadDataJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDownloadDataJobResponseBody setData(CreateDownloadDataJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDownloadDataJobResponseBodyData getData() {
        return this.data;
    }

    public CreateDownloadDataJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDownloadDataJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDownloadDataJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDownloadDataJobResponseBodyData extends TeaModel {
        @NameInMap("AsyncExecute")
        public Boolean asyncExecute;

        @NameInMap("CsvFileName")
        public String csvFileName;

        @NameInMap("CsvUrl")
        public String csvUrl;

        @NameInMap("LongJobId")
        public String longJobId;

        @NameInMap("Status")
        public Integer status;

        public static CreateDownloadDataJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadDataJobResponseBodyData self = new CreateDownloadDataJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDownloadDataJobResponseBodyData setAsyncExecute(Boolean asyncExecute) {
            this.asyncExecute = asyncExecute;
            return this;
        }
        public Boolean getAsyncExecute() {
            return this.asyncExecute;
        }

        public CreateDownloadDataJobResponseBodyData setCsvFileName(String csvFileName) {
            this.csvFileName = csvFileName;
            return this;
        }
        public String getCsvFileName() {
            return this.csvFileName;
        }

        public CreateDownloadDataJobResponseBodyData setCsvUrl(String csvUrl) {
            this.csvUrl = csvUrl;
            return this;
        }
        public String getCsvUrl() {
            return this.csvUrl;
        }

        public CreateDownloadDataJobResponseBodyData setLongJobId(String longJobId) {
            this.longJobId = longJobId;
            return this;
        }
        public String getLongJobId() {
            return this.longJobId;
        }

        public CreateDownloadDataJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
