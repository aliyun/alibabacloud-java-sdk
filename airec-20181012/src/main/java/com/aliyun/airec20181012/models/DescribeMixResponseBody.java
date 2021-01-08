// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeMixResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DescribeMixResponseBodyResult result;

    public static DescribeMixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMixResponseBody self = new DescribeMixResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMixResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMixResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMixResponseBody setResult(DescribeMixResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeMixResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeMixResponseBodyResultParameterSettings extends TeaModel {
        @NameInMap("Value")
        public Integer value;

        @NameInMap("Name")
        public String name;

        public static DescribeMixResponseBodyResultParameterSettings build(java.util.Map<String, ?> map) throws Exception {
            DescribeMixResponseBodyResultParameterSettings self = new DescribeMixResponseBodyResultParameterSettings();
            return TeaModel.build(map, self);
        }

        public DescribeMixResponseBodyResultParameterSettings setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

        public DescribeMixResponseBodyResultParameterSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeMixResponseBodyResultParameter extends TeaModel {
        @NameInMap("Settings")
        public java.util.List<DescribeMixResponseBodyResultParameterSettings> settings;

        public static DescribeMixResponseBodyResultParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeMixResponseBodyResultParameter self = new DescribeMixResponseBodyResultParameter();
            return TeaModel.build(map, self);
        }

        public DescribeMixResponseBodyResultParameter setSettings(java.util.List<DescribeMixResponseBodyResultParameterSettings> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.List<DescribeMixResponseBodyResultParameterSettings> getSettings() {
            return this.settings;
        }

    }

    public static class DescribeMixResponseBodyResult extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Parameter")
        public DescribeMixResponseBodyResultParameter parameter;

        public static DescribeMixResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeMixResponseBodyResult self = new DescribeMixResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeMixResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeMixResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMixResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeMixResponseBodyResult setParameter(DescribeMixResponseBodyResultParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public DescribeMixResponseBodyResultParameter getParameter() {
            return this.parameter;
        }

    }

}
