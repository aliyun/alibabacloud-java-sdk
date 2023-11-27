// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ImportMessageResponseBodyResult result;

    public static ImportMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportMessageResponseBody self = new ImportMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportMessageResponseBody setResult(ImportMessageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ImportMessageResponseBodyResult getResult() {
        return this.result;
    }

    public static class ImportMessageResponseBodyResult extends TeaModel {
        @NameInMap("ImportMessageResult")
        public java.util.Map<String, ResultImportMessageResultValue> importMessageResult;

        public static ImportMessageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ImportMessageResponseBodyResult self = new ImportMessageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ImportMessageResponseBodyResult setImportMessageResult(java.util.Map<String, ResultImportMessageResultValue> importMessageResult) {
            this.importMessageResult = importMessageResult;
            return this;
        }
        public java.util.Map<String, ResultImportMessageResultValue> getImportMessageResult() {
            return this.importMessageResult;
        }

    }

}
