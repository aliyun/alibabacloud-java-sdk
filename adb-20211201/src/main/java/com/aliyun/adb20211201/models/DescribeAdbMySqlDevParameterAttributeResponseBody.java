// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlDevParameterAttributeResponseBody extends TeaModel {
    @NameInMap("DevParam")
    public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam devParam;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAdbMySqlDevParameterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlDevParameterAttributeResponseBody self = new DescribeAdbMySqlDevParameterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlDevParameterAttributeResponseBody setDevParam(DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam devParam) {
        this.devParam = devParam;
        return this;
    }
    public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam getDevParam() {
        return this.devParam;
    }

    public DescribeAdbMySqlDevParameterAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbMySqlDevParameterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbMySqlDevParameterAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps self = new DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps();
            return TeaModel.build(map, self);
        }

        public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DevParamId")
        public Long devParamId;

        @NameInMap("DevParamName")
        public String devParamName;

        @NameInMap("DevParamProps")
        public java.util.List<DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps> devParamProps;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam self = new DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam();
            return TeaModel.build(map, self);
        }

        public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam setDevParamId(Long devParamId) {
            this.devParamId = devParamId;
            return this;
        }
        public Long getDevParamId() {
            return this.devParamId;
        }

        public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam setDevParamName(String devParamName) {
            this.devParamName = devParamName;
            return this;
        }
        public String getDevParamName() {
            return this.devParamName;
        }

        public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam setDevParamProps(java.util.List<DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps> devParamProps) {
            this.devParamProps = devParamProps;
            return this;
        }
        public java.util.List<DescribeAdbMySqlDevParameterAttributeResponseBodyDevParamDevParamProps> getDevParamProps() {
            return this.devParamProps;
        }

        public DescribeAdbMySqlDevParameterAttributeResponseBodyDevParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
