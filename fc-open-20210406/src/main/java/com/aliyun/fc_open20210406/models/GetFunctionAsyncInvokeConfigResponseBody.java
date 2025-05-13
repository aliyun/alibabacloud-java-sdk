// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionAsyncInvokeConfigResponseBody extends TeaModel {
    /**
     * <p>The time when the desktop group was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-10T02:45:02Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The configuration struct of the destination for asynchronous invocations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;onSuccess&quot;: null,&quot;onFailure&quot;: {&quot;destination&quot;: &quot;acs:mns:cn-shanghai:123:/queues/xxx/messages&quot;}}</p>
     */
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    /**
     * <p>The name of the function.</p>
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
     * <p>The maximum validity period of a message.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    /**
     * <p>The maximum number of retries allowed after an asynchronous invocation fails.</p>
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
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-service</p>
     */
    @NameInMap("service")
    public String service;

    /**
     * <p>Indicates whether the asynchronous task feature is enabled.</p>
     * <ul>
     * <li><strong>true</strong>: The asynchronous task feature is enabled.</li>
     * <li><strong>false</strong>: The asynchronous task feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("statefulInvocation")
    public Boolean statefulInvocation;

    public static GetFunctionAsyncInvokeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionAsyncInvokeConfigResponseBody self = new GetFunctionAsyncInvokeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionAsyncInvokeConfigResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }
    public Long getMaxAsyncEventAgeInSeconds() {
        return this.maxAsyncEventAgeInSeconds;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }
    public Long getMaxAsyncRetryAttempts() {
        return this.maxAsyncRetryAttempts;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setStatefulInvocation(Boolean statefulInvocation) {
        this.statefulInvocation = statefulInvocation;
        return this;
    }
    public Boolean getStatefulInvocation() {
        return this.statefulInvocation;
    }

}
