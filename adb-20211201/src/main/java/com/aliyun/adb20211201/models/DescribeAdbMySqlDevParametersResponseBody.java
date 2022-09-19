// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlDevParametersResponseBody extends TeaModel {
    @NameInMap("DevParams")
    public java.util.List<DescribeAdbMySqlDevParametersResponseBodyDevParams> devParams;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAdbMySqlDevParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlDevParametersResponseBody self = new DescribeAdbMySqlDevParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlDevParametersResponseBody setDevParams(java.util.List<DescribeAdbMySqlDevParametersResponseBodyDevParams> devParams) {
        this.devParams = devParams;
        return this;
    }
    public java.util.List<DescribeAdbMySqlDevParametersResponseBodyDevParams> getDevParams() {
        return this.devParams;
    }

    public DescribeAdbMySqlDevParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbMySqlDevParametersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAdbMySqlDevParametersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAdbMySqlDevParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbMySqlDevParametersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAdbMySqlDevParametersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps self = new DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps();
            return TeaModel.build(map, self);
        }

        public DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAdbMySqlDevParametersResponseBodyDevParams extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DevParamId")
        public Long devParamId;

        @NameInMap("DevParamName")
        public String devParamName;

        @NameInMap("DevParamProps")
        public java.util.List<DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps> devParamProps;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAdbMySqlDevParametersResponseBodyDevParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbMySqlDevParametersResponseBodyDevParams self = new DescribeAdbMySqlDevParametersResponseBodyDevParams();
            return TeaModel.build(map, self);
        }

        public DescribeAdbMySqlDevParametersResponseBodyDevParams setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAdbMySqlDevParametersResponseBodyDevParams setDevParamId(Long devParamId) {
            this.devParamId = devParamId;
            return this;
        }
        public Long getDevParamId() {
            return this.devParamId;
        }

        public DescribeAdbMySqlDevParametersResponseBodyDevParams setDevParamName(String devParamName) {
            this.devParamName = devParamName;
            return this;
        }
        public String getDevParamName() {
            return this.devParamName;
        }

        public DescribeAdbMySqlDevParametersResponseBodyDevParams setDevParamProps(java.util.List<DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps> devParamProps) {
            this.devParamProps = devParamProps;
            return this;
        }
        public java.util.List<DescribeAdbMySqlDevParametersResponseBodyDevParamsDevParamProps> getDevParamProps() {
            return this.devParamProps;
        }

        public DescribeAdbMySqlDevParametersResponseBodyDevParams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
