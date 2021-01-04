// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Parameters")
    public DescribeParametersResponseBodyParameters parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponseBody self = new DescribeParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeParametersResponseBody setParameters(DescribeParametersResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeParametersResponseBodyParameters getParameters() {
        return this.parameters;
    }

    public DescribeParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParametersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeParametersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeParametersResponseBodyParametersParameter extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("AllowedValues")
        public String allowedValues;

        public static DescribeParametersResponseBodyParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyParametersParameter self = new DescribeParametersResponseBodyParametersParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyParametersParameter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeParametersResponseBodyParametersParameter setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeParametersResponseBodyParametersParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeParametersResponseBodyParametersParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParametersResponseBodyParametersParameter setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeParametersResponseBodyParametersParameter setAllowedValues(String allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }
        public String getAllowedValues() {
            return this.allowedValues;
        }

    }

    public static class DescribeParametersResponseBodyParameters extends TeaModel {
        @NameInMap("Parameter")
        public java.util.List<DescribeParametersResponseBodyParametersParameter> parameter;

        public static DescribeParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyParameters self = new DescribeParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyParameters setParameter(java.util.List<DescribeParametersResponseBodyParametersParameter> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.List<DescribeParametersResponseBodyParametersParameter> getParameter() {
            return this.parameter;
        }

    }

}
