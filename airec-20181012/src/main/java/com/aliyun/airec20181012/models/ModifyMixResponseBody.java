// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyMixResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ModifyMixResponseBodyResult result;

    public static ModifyMixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMixResponseBody self = new ModifyMixResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMixResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyMixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyMixResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyMixResponseBody setResult(ModifyMixResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyMixResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyMixResponseBodyResultParameterSettings extends TeaModel {
        @NameInMap("Value")
        public Integer value;

        @NameInMap("Name")
        public String name;

        public static ModifyMixResponseBodyResultParameterSettings build(java.util.Map<String, ?> map) throws Exception {
            ModifyMixResponseBodyResultParameterSettings self = new ModifyMixResponseBodyResultParameterSettings();
            return TeaModel.build(map, self);
        }

        public ModifyMixResponseBodyResultParameterSettings setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

        public ModifyMixResponseBodyResultParameterSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModifyMixResponseBodyResultParameter extends TeaModel {
        @NameInMap("Settings")
        public java.util.List<ModifyMixResponseBodyResultParameterSettings> settings;

        public static ModifyMixResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            ModifyMixResponseBodyResultParameter self = new ModifyMixResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public ModifyMixResponseBodyResultParameter setSettings(java.util.List<ModifyMixResponseBodyResultParameterSettings> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.List<ModifyMixResponseBodyResultParameterSettings> getSettings() {
            return this.settings;
        }

    }

    public static class ModifyMixResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public ModifyMixResponseBodyResultParameter parameter;

        public static ModifyMixResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyMixResponseBodyResult self = new ModifyMixResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyMixResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyMixResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyMixResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyMixResponseBodyResult setParameter(ModifyMixResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ModifyMixResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
