// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJvmConfigurationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The JVM configuration of the application or instance group.</p>
     */
    @NameInMap("JvmConfiguration")
    public GetJvmConfigurationResponseBodyJvmConfiguration jvmConfiguration;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetJvmConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJvmConfigurationResponseBody self = new GetJvmConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJvmConfigurationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJvmConfigurationResponseBody setJvmConfiguration(GetJvmConfigurationResponseBodyJvmConfiguration jvmConfiguration) {
        this.jvmConfiguration = jvmConfiguration;
        return this;
    }
    public GetJvmConfigurationResponseBodyJvmConfiguration getJvmConfiguration() {
        return this.jvmConfiguration;
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

    public static class GetJvmConfigurationResponseBodyJvmConfiguration extends TeaModel {
        /**
         * <p>The maximum size of the heap memory. Unit: MB.</p>
         */
        @NameInMap("MaxHeapSize")
        public Integer maxHeapSize;

        /**
         * <p>The size of the permanent generation heap memory. Unit: MB.</p>
         */
        @NameInMap("MaxPermSize")
        public Integer maxPermSize;

        /**
         * <p>The initial size of the heap memory. Unit: MB.</p>
         */
        @NameInMap("MinHeapSize")
        public Integer minHeapSize;

        /**
         * <p>The custom parameter.</p>
         */
        @NameInMap("Options")
        public String options;

        public static GetJvmConfigurationResponseBodyJvmConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetJvmConfigurationResponseBodyJvmConfiguration self = new GetJvmConfigurationResponseBodyJvmConfiguration();
            return TeaModel.build(map, self);
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setMaxHeapSize(Integer maxHeapSize) {
            this.maxHeapSize = maxHeapSize;
            return this;
        }
        public Integer getMaxHeapSize() {
            return this.maxHeapSize;
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setMaxPermSize(Integer maxPermSize) {
            this.maxPermSize = maxPermSize;
            return this;
        }
        public Integer getMaxPermSize() {
            return this.maxPermSize;
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setMinHeapSize(Integer minHeapSize) {
            this.minHeapSize = minHeapSize;
            return this;
        }
        public Integer getMinHeapSize() {
            return this.minHeapSize;
        }

        public GetJvmConfigurationResponseBodyJvmConfiguration setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

}
