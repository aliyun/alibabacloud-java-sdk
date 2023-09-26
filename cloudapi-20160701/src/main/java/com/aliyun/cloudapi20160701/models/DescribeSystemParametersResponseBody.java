// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeSystemParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemParameters")
    public DescribeSystemParametersResponseBodySystemParameters systemParameters;

    public static DescribeSystemParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemParametersResponseBody self = new DescribeSystemParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemParametersResponseBody setSystemParameters(DescribeSystemParametersResponseBodySystemParameters systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public DescribeSystemParametersResponseBodySystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public static class DescribeSystemParametersResponseBodySystemParametersSystemParameter extends TeaModel {
        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamType")
        public String paramType;

        public static DescribeSystemParametersResponseBodySystemParametersSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemParametersResponseBodySystemParametersSystemParameter self = new DescribeSystemParametersResponseBodySystemParametersSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeSystemParametersResponseBodySystemParametersSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeSystemParametersResponseBodySystemParametersSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSystemParametersResponseBodySystemParametersSystemParameter setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeSystemParametersResponseBodySystemParametersSystemParameter setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

    }

    public static class DescribeSystemParametersResponseBodySystemParameters extends TeaModel {
        @NameInMap("SystemParameter")
        public java.util.List<DescribeSystemParametersResponseBodySystemParametersSystemParameter> systemParameter;

        public static DescribeSystemParametersResponseBodySystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemParametersResponseBodySystemParameters self = new DescribeSystemParametersResponseBodySystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeSystemParametersResponseBodySystemParameters setSystemParameter(java.util.List<DescribeSystemParametersResponseBodySystemParametersSystemParameter> systemParameter) {
            this.systemParameter = systemParameter;
            return this;
        }
        public java.util.List<DescribeSystemParametersResponseBodySystemParametersSystemParameter> getSystemParameter() {
            return this.systemParameter;
        }

    }

}
