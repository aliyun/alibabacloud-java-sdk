// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDiversifyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<ListDiversifyResponseBodyResult> result;

    public static ListDiversifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiversifyResponseBody self = new ListDiversifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiversifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDiversifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiversifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDiversifyResponseBody setResult(java.util.List<ListDiversifyResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDiversifyResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDiversifyResponseBodyResultParameter extends TeaModel {
        @NameInMap("Window")
        public Integer window;

        @NameInMap("CategoryIndex")
        public Integer categoryIndex;

        public static ListDiversifyResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            ListDiversifyResponseBodyResultParameter self = new ListDiversifyResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public ListDiversifyResponseBodyResultParameter setWindow(Integer window) {
            this.window = window;
            return this;
        }
        public Integer getWindow() {
            return this.window;
        }

        public ListDiversifyResponseBodyResultParameter setCategoryIndex(Integer categoryIndex) {
            this.categoryIndex = categoryIndex;
            return this;
        }
        public Integer getCategoryIndex() {
            return this.categoryIndex;
        }

    }

    public static class ListDiversifyResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public ListDiversifyResponseBodyResultParameter parameter;

        public static ListDiversifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDiversifyResponseBodyResult self = new ListDiversifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDiversifyResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDiversifyResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDiversifyResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDiversifyResponseBodyResult setParameter(ListDiversifyResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ListDiversifyResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
