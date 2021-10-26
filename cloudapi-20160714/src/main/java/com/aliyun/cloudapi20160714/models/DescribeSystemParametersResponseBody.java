// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSystemParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemParams")
    public DescribeSystemParametersResponseBodySystemParams systemParams;

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

    public DescribeSystemParametersResponseBody setSystemParams(DescribeSystemParametersResponseBodySystemParams systemParams) {
        this.systemParams = systemParams;
        return this;
    }
    public DescribeSystemParametersResponseBodySystemParams getSystemParams() {
        return this.systemParams;
    }

    public static class DescribeSystemParametersResponseBodySystemParamsSystemParamItem extends TeaModel {
        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamType")
        public String paramType;

        public static DescribeSystemParametersResponseBodySystemParamsSystemParamItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemParametersResponseBodySystemParamsSystemParamItem self = new DescribeSystemParametersResponseBodySystemParamsSystemParamItem();
            return TeaModel.build(map, self);
        }

        public DescribeSystemParametersResponseBodySystemParamsSystemParamItem setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeSystemParametersResponseBodySystemParamsSystemParamItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSystemParametersResponseBodySystemParamsSystemParamItem setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeSystemParametersResponseBodySystemParamsSystemParamItem setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

    }

    public static class DescribeSystemParametersResponseBodySystemParams extends TeaModel {
        @NameInMap("SystemParamItem")
        public java.util.List<DescribeSystemParametersResponseBodySystemParamsSystemParamItem> systemParamItem;

        public static DescribeSystemParametersResponseBodySystemParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemParametersResponseBodySystemParams self = new DescribeSystemParametersResponseBodySystemParams();
            return TeaModel.build(map, self);
        }

        public DescribeSystemParametersResponseBodySystemParams setSystemParamItem(java.util.List<DescribeSystemParametersResponseBodySystemParamsSystemParamItem> systemParamItem) {
            this.systemParamItem = systemParamItem;
            return this;
        }
        public java.util.List<DescribeSystemParametersResponseBodySystemParamsSystemParamItem> getSystemParamItem() {
            return this.systemParamItem;
        }

    }

}
