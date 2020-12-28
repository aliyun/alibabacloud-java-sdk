// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ImportExperimentFromMkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ImportExperimentFromMkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportExperimentFromMkResponseBody self = new ImportExperimentFromMkResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportExperimentFromMkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportExperimentFromMkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportExperimentFromMkResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public ImportExperimentFromMkResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportExperimentFromMkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportExperimentFromMkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
