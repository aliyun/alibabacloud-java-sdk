// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DeleteMixResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DeleteMixResponseBodyResult result;

    public static DeleteMixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMixResponseBody self = new DeleteMixResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMixResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMixResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMixResponseBody setResult(DeleteMixResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteMixResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteMixResponseBodyResultParameterSettings extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static DeleteMixResponseBodyResultParameterSettings build(java.util.Map<String, ?> map) throws Exception {
            DeleteMixResponseBodyResultParameterSettings self = new DeleteMixResponseBodyResultParameterSettings();
            return TeaModel.build(map, self);
        }

        public DeleteMixResponseBodyResultParameterSettings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DeleteMixResponseBodyResultParameterSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DeleteMixResponseBodyResultParameter extends TeaModel {
        @NameInMap("Settings")
        public java.util.List<DeleteMixResponseBodyResultParameterSettings> settings;

        public static DeleteMixResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            DeleteMixResponseBodyResultParameter self = new DeleteMixResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public DeleteMixResponseBodyResultParameter setSettings(java.util.List<DeleteMixResponseBodyResultParameterSettings> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.List<DeleteMixResponseBodyResultParameterSettings> getSettings() {
            return this.settings;
        }

    }

    public static class DeleteMixResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public DeleteMixResponseBodyResultParameter parameter;

        public static DeleteMixResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMixResponseBodyResult self = new DeleteMixResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteMixResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteMixResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteMixResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteMixResponseBodyResult setParameter(DeleteMixResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public DeleteMixResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
