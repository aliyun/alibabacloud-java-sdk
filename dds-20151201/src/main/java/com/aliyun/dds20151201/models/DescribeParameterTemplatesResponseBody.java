// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponseBody extends TeaModel {
    // The database engine of the instance.
    @NameInMap("Engine")
    public String engine;

    // The database engine version of the instance.
    @NameInMap("EngineVersion")
    public String engineVersion;

    // The number of parameters that are supported by the instance.
    @NameInMap("ParameterCount")
    public String parameterCount;

    // Details about the parameter templates.
    @NameInMap("Parameters")
    public DescribeParameterTemplatesResponseBodyParameters parameters;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesResponseBody self = new DescribeParameterTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeParameterTemplatesResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterTemplatesResponseBody setParameterCount(String parameterCount) {
        this.parameterCount = parameterCount;
        return this;
    }
    public String getParameterCount() {
        return this.parameterCount;
    }

    public DescribeParameterTemplatesResponseBody setParameters(DescribeParameterTemplatesResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeParameterTemplatesResponseBodyParameters getParameters() {
        return this.parameters;
    }

    public DescribeParameterTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterTemplatesResponseBodyParametersTemplateRecord extends TeaModel {
        // The value range of modifiable parameters.
        @NameInMap("CheckingCode")
        public String checkingCode;

        // Indicates whether the parameter is modifiable.
        // 
        // *   **false**: The parameter cannot be modified.
        // *   **true**: The parameter can be modified.
        @NameInMap("ForceModify")
        public Boolean forceModify;

        // Indicates whether a restart is required for parameter modifications to take effect.
        // 
        // *   **false**: A restart is not required. Parameter modifications immediately take effect.
        // *   **true**: A restart is required for parameter modifications to take effect.
        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        // The description of the parameter.
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        // The name of the parameter.
        @NameInMap("ParameterName")
        public String parameterName;

        // The default value of the parameter.
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParameterTemplatesResponseBodyParametersTemplateRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseBodyParametersTemplateRecord self = new DescribeParameterTemplatesResponseBodyParametersTemplateRecord();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setForceModify(Boolean forceModify) {
            this.forceModify = forceModify;
            return this;
        }
        public Boolean getForceModify() {
            return this.forceModify;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParameterTemplatesResponseBodyParameters extends TeaModel {
        @NameInMap("TemplateRecord")
        public java.util.List<DescribeParameterTemplatesResponseBodyParametersTemplateRecord> templateRecord;

        public static DescribeParameterTemplatesResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseBodyParameters self = new DescribeParameterTemplatesResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseBodyParameters setTemplateRecord(java.util.List<DescribeParameterTemplatesResponseBodyParametersTemplateRecord> templateRecord) {
            this.templateRecord = templateRecord;
            return this;
        }
        public java.util.List<DescribeParameterTemplatesResponseBodyParametersTemplateRecord> getTemplateRecord() {
            return this.templateRecord;
        }

    }

}
