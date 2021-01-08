// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyDiversifyResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ModifyDiversifyResponseBodyResult result;

    public static ModifyDiversifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiversifyResponseBody self = new ModifyDiversifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiversifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyDiversifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDiversifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyDiversifyResponseBody setResult(ModifyDiversifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyDiversifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyDiversifyResponseBodyResultParameter extends TeaModel {
        @NameInMap("Window")
        public Integer window;

        @NameInMap("CategoryIndex")
        public Integer categoryIndex;

        public static ModifyDiversifyResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            ModifyDiversifyResponseBodyResultParameter self = new ModifyDiversifyResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public ModifyDiversifyResponseBodyResultParameter setWindow(Integer window) {
            this.window = window;
            return this;
        }
        public Integer getWindow() {
            return this.window;
        }

        public ModifyDiversifyResponseBodyResultParameter setCategoryIndex(Integer categoryIndex) {
            this.categoryIndex = categoryIndex;
            return this;
        }
        public Integer getCategoryIndex() {
            return this.categoryIndex;
        }

    }

    public static class ModifyDiversifyResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public ModifyDiversifyResponseBodyResultParameter parameter;

        public static ModifyDiversifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyDiversifyResponseBodyResult self = new ModifyDiversifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyDiversifyResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyDiversifyResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyDiversifyResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyDiversifyResponseBodyResult setParameter(ModifyDiversifyResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ModifyDiversifyResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
