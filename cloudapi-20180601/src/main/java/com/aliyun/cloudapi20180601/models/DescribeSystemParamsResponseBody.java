// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeSystemParamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemParams")
    public DescribeSystemParamsResponseBodySystemParams systemParams;

    public static DescribeSystemParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemParamsResponseBody self = new DescribeSystemParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemParamsResponseBody setSystemParams(DescribeSystemParamsResponseBodySystemParams systemParams) {
        this.systemParams = systemParams;
        return this;
    }
    public DescribeSystemParamsResponseBodySystemParams getSystemParams() {
        return this.systemParams;
    }

    public static class DescribeSystemParamsResponseBodySystemParamsSystemParam extends TeaModel {
        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamType")
        public String paramType;

        public static DescribeSystemParamsResponseBodySystemParamsSystemParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemParamsResponseBodySystemParamsSystemParam self = new DescribeSystemParamsResponseBodySystemParamsSystemParam();
            return TeaModel.build(map, self);
        }

        public DescribeSystemParamsResponseBodySystemParamsSystemParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeSystemParamsResponseBodySystemParamsSystemParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSystemParamsResponseBodySystemParamsSystemParam setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeSystemParamsResponseBodySystemParamsSystemParam setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

    }

    public static class DescribeSystemParamsResponseBodySystemParams extends TeaModel {
        @NameInMap("SystemParam")
        public java.util.List<DescribeSystemParamsResponseBodySystemParamsSystemParam> systemParam;

        public static DescribeSystemParamsResponseBodySystemParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemParamsResponseBodySystemParams self = new DescribeSystemParamsResponseBodySystemParams();
            return TeaModel.build(map, self);
        }

        public DescribeSystemParamsResponseBodySystemParams setSystemParam(java.util.List<DescribeSystemParamsResponseBodySystemParamsSystemParam> systemParam) {
            this.systemParam = systemParam;
            return this;
        }
        public java.util.List<DescribeSystemParamsResponseBodySystemParamsSystemParam> getSystemParam() {
            return this.systemParam;
        }

    }

}
