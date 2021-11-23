// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<DescribeParametersResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponseBody self = new DescribeParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponseBody setParameters(java.util.List<DescribeParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public DescribeParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParametersResponseBodyParameters extends TeaModel {
        @NameInMap("CurrentValue")
        public String currentValue;

        @NameInMap("ForceRestartInstance")
        public String forceRestartInstance;

        @NameInMap("IsChangeableConfig")
        public String isChangeableConfig;

        @NameInMap("OptionalRange")
        public String optionalRange;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyParameters self = new DescribeParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyParameters setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public String getCurrentValue() {
            return this.currentValue;
        }

        public DescribeParametersResponseBodyParameters setForceRestartInstance(String forceRestartInstance) {
            this.forceRestartInstance = forceRestartInstance;
            return this;
        }
        public String getForceRestartInstance() {
            return this.forceRestartInstance;
        }

        public DescribeParametersResponseBodyParameters setIsChangeableConfig(String isChangeableConfig) {
            this.isChangeableConfig = isChangeableConfig;
            return this;
        }
        public String getIsChangeableConfig() {
            return this.isChangeableConfig;
        }

        public DescribeParametersResponseBodyParameters setOptionalRange(String optionalRange) {
            this.optionalRange = optionalRange;
            return this;
        }
        public String getOptionalRange() {
            return this.optionalRange;
        }

        public DescribeParametersResponseBodyParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParametersResponseBodyParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
