// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class CreateMixResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public CreateMixResponseBodyResult result;

    public static CreateMixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMixResponseBody self = new CreateMixResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMixResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMixResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMixResponseBody setResult(CreateMixResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMixResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateMixResponseBodyResultParameterSettings extends TeaModel {
        @NameInMap("Value")
        public Integer value;

        @NameInMap("Name")
        public String name;

        public static CreateMixResponseBodyResultParameterSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateMixResponseBodyResultParameterSettings self = new CreateMixResponseBodyResultParameterSettings();
            return TeaModel.build(map, self);
        }

        public CreateMixResponseBodyResultParameterSettings setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

        public CreateMixResponseBodyResultParameterSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateMixResponseBodyResultParameter extends TeaModel {
        @NameInMap("Settings")
        public java.util.List<CreateMixResponseBodyResultParameterSettings> settings;

        public static CreateMixResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateMixResponseBodyResultParameter self = new CreateMixResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public CreateMixResponseBodyResultParameter setSettings(java.util.List<CreateMixResponseBodyResultParameterSettings> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.List<CreateMixResponseBodyResultParameterSettings> getSettings() {
            return this.settings;
        }

    }

    public static class CreateMixResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public CreateMixResponseBodyResultParameter parameter;

        public static CreateMixResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMixResponseBodyResult self = new CreateMixResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMixResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateMixResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMixResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateMixResponseBodyResult setParameter(CreateMixResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public CreateMixResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
