// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJvmConfigurationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JvmConfiguration")
    public GetJvmConfigurationResponseBodyJvmConfiguration jvmConfiguration;

    @NameInMap("Code")
    public Integer code;

    public static GetJvmConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJvmConfigurationResponseBody self = new GetJvmConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJvmConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJvmConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJvmConfigurationResponseBody setJvmConfiguration(GetJvmConfigurationResponseBodyJvmConfiguration jvmConfiguration) {
        this.jvmConfiguration = jvmConfiguration;
        return this;
    }
    public GetJvmConfigurationResponseBodyJvmConfiguration getJvmConfiguration() {
        return this.jvmConfiguration;
    }

    public GetJvmConfigurationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetJvmConfigurationResponseBodyJvmConfiguration extends TeaModel {
        @NameInMap("MaxPermSize")
        public Integer maxPermSize;

        @NameInMap("MaxHeapSize")
        public Integer maxHeapSize;

        @NameInMap("Options")
        public String options;

        @NameInMap("MinHeapSize")
        public Integer minHeapSize;

        public static GetJvmConfigurationResponseBodyJvmConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetJvmConfigurationResponseBodyJvmConfiguration self = new GetJvmConfigurationResponseBodyJvmConfiguration();
            return TeaModel.build(map, self);
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setMaxPermSize(Integer maxPermSize) {
            this.maxPermSize = maxPermSize;
            return this;
        }
        public Integer getMaxPermSize() {
            return this.maxPermSize;
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setMaxHeapSize(Integer maxHeapSize) {
            this.maxHeapSize = maxHeapSize;
            return this;
        }
        public Integer getMaxHeapSize() {
            return this.maxHeapSize;
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setMinHeapSize(Integer minHeapSize) {
            this.minHeapSize = minHeapSize;
            return this;
        }
        public Integer getMinHeapSize() {
            return this.minHeapSize;
        }

    }

}
