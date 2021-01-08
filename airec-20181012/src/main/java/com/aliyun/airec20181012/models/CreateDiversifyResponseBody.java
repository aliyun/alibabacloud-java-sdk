// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class CreateDiversifyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public CreateDiversifyResponseBodyResult result;

    public static CreateDiversifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiversifyResponseBody self = new CreateDiversifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiversifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDiversifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDiversifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDiversifyResponseBody setResult(CreateDiversifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateDiversifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateDiversifyResponseBodyResultParameter extends TeaModel {
        @NameInMap("Window")
        public Integer window;

        @NameInMap("CategoryIndex")
        public Integer categoryIndex;

        public static CreateDiversifyResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateDiversifyResponseBodyResultParameter self = new CreateDiversifyResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public CreateDiversifyResponseBodyResultParameter setWindow(Integer window) {
            this.window = window;
            return this;
        }
        public Integer getWindow() {
            return this.window;
        }

        public CreateDiversifyResponseBodyResultParameter setCategoryIndex(Integer categoryIndex) {
            this.categoryIndex = categoryIndex;
            return this;
        }
        public Integer getCategoryIndex() {
            return this.categoryIndex;
        }

    }

    public static class CreateDiversifyResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public CreateDiversifyResponseBodyResultParameter parameter;

        public static CreateDiversifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDiversifyResponseBodyResult self = new CreateDiversifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDiversifyResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDiversifyResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDiversifyResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateDiversifyResponseBodyResult setParameter(CreateDiversifyResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public CreateDiversifyResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
