// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DeleteDiversifyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DeleteDiversifyResponseBodyResult result;

    public static DeleteDiversifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiversifyResponseBody self = new DeleteDiversifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiversifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDiversifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDiversifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDiversifyResponseBody setResult(DeleteDiversifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteDiversifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteDiversifyResponseBodyResultParameter extends TeaModel {
        @NameInMap("Window")
        public Integer window;

        @NameInMap("CategoryIndex")
        public Integer categoryIndex;

        public static DeleteDiversifyResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            DeleteDiversifyResponseBodyResultParameter self = new DeleteDiversifyResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public DeleteDiversifyResponseBodyResultParameter setWindow(Integer window) {
            this.window = window;
            return this;
        }
        public Integer getWindow() {
            return this.window;
        }

        public DeleteDiversifyResponseBodyResultParameter setCategoryIndex(Integer categoryIndex) {
            this.categoryIndex = categoryIndex;
            return this;
        }
        public Integer getCategoryIndex() {
            return this.categoryIndex;
        }

    }

    public static class DeleteDiversifyResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public DeleteDiversifyResponseBodyResultParameter parameter;

        public static DeleteDiversifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteDiversifyResponseBodyResult self = new DeleteDiversifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteDiversifyResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteDiversifyResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteDiversifyResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteDiversifyResponseBodyResult setParameter(DeleteDiversifyResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public DeleteDiversifyResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
