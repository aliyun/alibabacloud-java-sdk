// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListMixResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<ListMixResponseBodyResult> result;

    public static ListMixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMixResponseBody self = new ListMixResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMixResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMixResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMixResponseBody setResult(java.util.List<ListMixResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMixResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListMixResponseBodyResultParameterSettings extends TeaModel {
        @NameInMap("Value")
        public Integer value;

        @NameInMap("Name")
        public String name;

        public static ListMixResponseBodyResultParameterSettings build(java.util.Map<String, ?> map) throws Exception {
            ListMixResponseBodyResultParameterSettings self = new ListMixResponseBodyResultParameterSettings();
            return TeaModel.build(map, self);
        }

        public ListMixResponseBodyResultParameterSettings setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

        public ListMixResponseBodyResultParameterSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMixResponseBodyResultParameter extends TeaModel {
        @NameInMap("Settings")
        public java.util.List<ListMixResponseBodyResultParameterSettings> settings;

        public static ListMixResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            ListMixResponseBodyResultParameter self = new ListMixResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public ListMixResponseBodyResultParameter setSettings(java.util.List<ListMixResponseBodyResultParameterSettings> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.List<ListMixResponseBodyResultParameterSettings> getSettings() {
            return this.settings;
        }

    }

    public static class ListMixResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public ListMixResponseBodyResultParameter parameter;

        public static ListMixResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMixResponseBodyResult self = new ListMixResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMixResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMixResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMixResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMixResponseBodyResult setParameter(ListMixResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ListMixResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
