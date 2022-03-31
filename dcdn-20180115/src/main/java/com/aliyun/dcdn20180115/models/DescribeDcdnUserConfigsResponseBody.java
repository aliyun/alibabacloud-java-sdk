// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<DescribeDcdnUserConfigsResponseBodyConfigs> configs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnUserConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserConfigsResponseBody self = new DescribeDcdnUserConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserConfigsResponseBody setConfigs(java.util.List<DescribeDcdnUserConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<DescribeDcdnUserConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public DescribeDcdnUserConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnUserConfigsResponseBodyConfigs extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

        @NameInMap("ArgValue")
        public String argValue;

        @NameInMap("FunctionName")
        public String functionName;

        public static DescribeDcdnUserConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserConfigsResponseBodyConfigs self = new DescribeDcdnUserConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserConfigsResponseBodyConfigs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeDcdnUserConfigsResponseBodyConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public DescribeDcdnUserConfigsResponseBodyConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
