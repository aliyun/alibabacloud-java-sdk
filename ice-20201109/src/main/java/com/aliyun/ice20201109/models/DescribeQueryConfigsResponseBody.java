// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeQueryConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<DescribeQueryConfigsResponseBodyConfigs> configs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeQueryConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryConfigsResponseBody self = new DescribeQueryConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQueryConfigsResponseBody setConfigs(java.util.List<DescribeQueryConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<DescribeQueryConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public DescribeQueryConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeQueryConfigsResponseBodyConfigs extends TeaModel {
        @NameInMap("Value")
        public String value;

        public static DescribeQueryConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeQueryConfigsResponseBodyConfigs self = new DescribeQueryConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeQueryConfigsResponseBodyConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
