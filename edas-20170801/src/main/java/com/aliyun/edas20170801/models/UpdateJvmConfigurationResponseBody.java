// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateJvmConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("JvmConfiguration")
    public UpdateJvmConfigurationResponseBodyJvmConfiguration jvmConfiguration;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateJvmConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateJvmConfigurationResponseBody self = new UpdateJvmConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateJvmConfigurationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateJvmConfigurationResponseBody setJvmConfiguration(UpdateJvmConfigurationResponseBodyJvmConfiguration jvmConfiguration) {
        this.jvmConfiguration = jvmConfiguration;
        return this;
    }
    public UpdateJvmConfigurationResponseBodyJvmConfiguration getJvmConfiguration() {
        return this.jvmConfiguration;
    }

    public UpdateJvmConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateJvmConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateJvmConfigurationResponseBodyJvmConfiguration extends TeaModel {
        @NameInMap("MaxHeapSize")
        public Integer maxHeapSize;

        @NameInMap("MaxPermSize")
        public Integer maxPermSize;

        @NameInMap("MinHeapSize")
        public Integer minHeapSize;

        @NameInMap("Options")
        public String options;

        public static UpdateJvmConfigurationResponseBodyJvmConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateJvmConfigurationResponseBodyJvmConfiguration self = new UpdateJvmConfigurationResponseBodyJvmConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateJvmConfigurationResponseBodyJvmConfiguration setMaxHeapSize(Integer maxHeapSize) {
            this.maxHeapSize = maxHeapSize;
            return this;
        }
        public Integer getMaxHeapSize() {
            return this.maxHeapSize;
        }

        public UpdateJvmConfigurationResponseBodyJvmConfiguration setMaxPermSize(Integer maxPermSize) {
            this.maxPermSize = maxPermSize;
            return this;
        }
        public Integer getMaxPermSize() {
            return this.maxPermSize;
        }

        public UpdateJvmConfigurationResponseBodyJvmConfiguration setMinHeapSize(Integer minHeapSize) {
            this.minHeapSize = minHeapSize;
            return this;
        }
        public Integer getMinHeapSize() {
            return this.minHeapSize;
        }

        public UpdateJvmConfigurationResponseBodyJvmConfiguration setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

}
