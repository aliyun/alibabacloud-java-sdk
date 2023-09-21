// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSchemeConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateSchemeConfigResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSchemeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeConfigResponseBody self = new CreateSchemeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchemeConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSchemeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSchemeConfigResponseBody setModel(CreateSchemeConfigResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateSchemeConfigResponseBodyModel getModel() {
        return this.model;
    }

    public CreateSchemeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSchemeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSchemeConfigResponseBodyModel extends TeaModel {
        @NameInMap("SchemeCode")
        public String schemeCode;

        public static CreateSchemeConfigResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateSchemeConfigResponseBodyModel self = new CreateSchemeConfigResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateSchemeConfigResponseBodyModel setSchemeCode(String schemeCode) {
            this.schemeCode = schemeCode;
            return this;
        }
        public String getSchemeCode() {
            return this.schemeCode;
        }

    }

}
