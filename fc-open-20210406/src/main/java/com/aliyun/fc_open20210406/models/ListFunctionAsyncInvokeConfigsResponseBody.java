// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionAsyncInvokeConfigsResponseBody extends TeaModel {
    /**
     * <p>The list of asynchronous invocation configurations.</p>
     */
    @NameInMap("configs")
    public java.util.List<ListFunctionAsyncInvokeConfigsResponseBodyConfigs> configs;

    /**
     * <p>The token used to obtain more results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0be03****f84eb48b699f0a4883</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListFunctionAsyncInvokeConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionAsyncInvokeConfigsResponseBody self = new ListFunctionAsyncInvokeConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionAsyncInvokeConfigsResponseBody setConfigs(java.util.List<ListFunctionAsyncInvokeConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListFunctionAsyncInvokeConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListFunctionAsyncInvokeConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListFunctionAsyncInvokeConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The time when the asynchronous invocation configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-10T02:45:02Z</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The configuration struct of the destination for asynchronous invocations. If you did not configure this parameter, this parameter is null.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;onSuccess&quot;: null,&quot;onFailure&quot;: {&quot;destination&quot;: &quot;acs:mns:cn-shanghai:123:/queues/xxx/messages&quot;}}</p>
         */
        @NameInMap("destinationConfig")
        public DestinationConfig destinationConfig;

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>helloworld</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <p>The time when the configuration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-10T02:45:02Z</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The maximum validity period of a message. If you have not configured this parameter, this parameter is null.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("maxAsyncEventAgeInSeconds")
        public Long maxAsyncEventAgeInSeconds;

        /**
         * <p>The maximum number of retries allowed after an asynchronous invocation fails. If you have not configured this parameter, this parameter is null.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxAsyncRetryAttempts")
        public Long maxAsyncRetryAttempts;

        /**
         * <p>The version or alias of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-service</p>
         */
        @NameInMap("service")
        public String service;

        /**
         * <p>Specifies whether to enable the asynchronous task feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>If you have not configured this parameter, this parameter is null.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("statefulInvocation")
        public Boolean statefulInvocation;

        public static ListFunctionAsyncInvokeConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionAsyncInvokeConfigsResponseBodyConfigs self = new ListFunctionAsyncInvokeConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setDestinationConfig(DestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }
        public DestinationConfig getDestinationConfig() {
            return this.destinationConfig;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }
        public Long getMaxAsyncEventAgeInSeconds() {
            return this.maxAsyncEventAgeInSeconds;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }
        public Long getMaxAsyncRetryAttempts() {
            return this.maxAsyncRetryAttempts;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setStatefulInvocation(Boolean statefulInvocation) {
            this.statefulInvocation = statefulInvocation;
            return this;
        }
        public Boolean getStatefulInvocation() {
            return this.statefulInvocation;
        }

    }

}
