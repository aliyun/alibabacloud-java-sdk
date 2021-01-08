// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeDiversifyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DescribeDiversifyResponseBodyResult result;

    public static DescribeDiversifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiversifyResponseBody self = new DescribeDiversifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiversifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDiversifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiversifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDiversifyResponseBody setResult(DescribeDiversifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDiversifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDiversifyResponseBodyResultParameter extends TeaModel {
        @NameInMap("Window")
        public Integer window;

        @NameInMap("CategoryIndex")
        public Integer categoryIndex;

        public static DescribeDiversifyResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiversifyResponseBodyResultParameter self = new DescribeDiversifyResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDiversifyResponseBodyResultParameter setWindow(Integer window) {
            this.window = window;
            return this;
        }
        public Integer getWindow() {
            return this.window;
        }

        public DescribeDiversifyResponseBodyResultParameter setCategoryIndex(Integer categoryIndex) {
            this.categoryIndex = categoryIndex;
            return this;
        }
        public Integer getCategoryIndex() {
            return this.categoryIndex;
        }

    }

    public static class DescribeDiversifyResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public DescribeDiversifyResponseBodyResultParameter parameter;

        public static DescribeDiversifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiversifyResponseBodyResult self = new DescribeDiversifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDiversifyResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDiversifyResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDiversifyResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDiversifyResponseBodyResult setParameter(DescribeDiversifyResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public DescribeDiversifyResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
