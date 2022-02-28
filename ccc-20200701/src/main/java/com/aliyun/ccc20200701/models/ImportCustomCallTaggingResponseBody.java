// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportCustomCallTaggingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ImportCustomCallTaggingResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ImportCustomCallTaggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomCallTaggingResponseBody self = new ImportCustomCallTaggingResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportCustomCallTaggingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportCustomCallTaggingResponseBody setData(java.util.List<ImportCustomCallTaggingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ImportCustomCallTaggingResponseBodyData> getData() {
        return this.data;
    }

    public ImportCustomCallTaggingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportCustomCallTaggingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportCustomCallTaggingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImportCustomCallTaggingResponseBodyData extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("Reason")
        public String reason;

        public static ImportCustomCallTaggingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportCustomCallTaggingResponseBodyData self = new ImportCustomCallTaggingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportCustomCallTaggingResponseBodyData setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ImportCustomCallTaggingResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
