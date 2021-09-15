// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Parameters")
    public java.util.List<DescribeParametersResponseBodyParameters> parameters;

    public static DescribeParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponseBody self = new DescribeParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParametersResponseBody setParameters(java.util.List<DescribeParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public static class DescribeParametersResponseBodyParameters extends TeaModel {
        @NameInMap("IsChangeableConfig")
        public String isChangeableConfig;

        @NameInMap("ForceRestartInstance")
        public String forceRestartInstance;

        @NameInMap("OptionalRange")
        public String optionalRange;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("CurrentValue")
        public String currentValue;

        public static DescribeParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyParameters self = new DescribeParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyParameters setIsChangeableConfig(String isChangeableConfig) {
            this.isChangeableConfig = isChangeableConfig;
            return this;
        }
        public String getIsChangeableConfig() {
            return this.isChangeableConfig;
        }

        public DescribeParametersResponseBodyParameters setForceRestartInstance(String forceRestartInstance) {
            this.forceRestartInstance = forceRestartInstance;
            return this;
        }
        public String getForceRestartInstance() {
            return this.forceRestartInstance;
        }

        public DescribeParametersResponseBodyParameters setOptionalRange(String optionalRange) {
            this.optionalRange = optionalRange;
            return this;
        }
        public String getOptionalRange() {
            return this.optionalRange;
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

        public DescribeParametersResponseBodyParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParametersResponseBodyParameters setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public String getCurrentValue() {
            return this.currentValue;
        }

    }

}
