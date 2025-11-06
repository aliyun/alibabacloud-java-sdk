// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ImportDefinitionAsynchronousResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImportDefinitionAsynchronousResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImportDefinitionAsynchronousResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDefinitionAsynchronousResponseBody self = new ImportDefinitionAsynchronousResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDefinitionAsynchronousResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImportDefinitionAsynchronousResponseBody setData(ImportDefinitionAsynchronousResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportDefinitionAsynchronousResponseBodyData getData() {
        return this.data;
    }

    public ImportDefinitionAsynchronousResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportDefinitionAsynchronousResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDefinitionAsynchronousResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportDefinitionAsynchronousResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static ImportDefinitionAsynchronousResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportDefinitionAsynchronousResponseBodyData self = new ImportDefinitionAsynchronousResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportDefinitionAsynchronousResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
