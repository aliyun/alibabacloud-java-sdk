// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobConfigResponseBody extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<DescribeDtsJobConfigResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDtsJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobConfigResponseBody self = new DescribeDtsJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobConfigResponseBody setParameters(java.util.List<DescribeDtsJobConfigResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeDtsJobConfigResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public DescribeDtsJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDtsJobConfigResponseBodyParameters extends TeaModel {
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        // 请使用
        @NameInMap("ForceRestart")
        public String forceRestart;

        @NameInMap("Modifiable")
        public String modifiable;

        @NameInMap("Module")
        public String module;

        @NameInMap("Name")
        public String name;

        @NameInMap("RunningValue")
        public String runningValue;

        @NameInMap("ValueType")
        public Integer valueType;

        public static DescribeDtsJobConfigResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobConfigResponseBodyParameters self = new DescribeDtsJobConfigResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobConfigResponseBodyParameters setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeDtsJobConfigResponseBodyParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDtsJobConfigResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDtsJobConfigResponseBodyParameters setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeDtsJobConfigResponseBodyParameters setModifiable(String modifiable) {
            this.modifiable = modifiable;
            return this;
        }
        public String getModifiable() {
            return this.modifiable;
        }

        public DescribeDtsJobConfigResponseBodyParameters setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeDtsJobConfigResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDtsJobConfigResponseBodyParameters setRunningValue(String runningValue) {
            this.runningValue = runningValue;
            return this;
        }
        public String getRunningValue() {
            return this.runningValue;
        }

        public DescribeDtsJobConfigResponseBodyParameters setValueType(Integer valueType) {
            this.valueType = valueType;
            return this;
        }
        public Integer getValueType() {
            return this.valueType;
        }

    }

}
