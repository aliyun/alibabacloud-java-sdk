// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Hook extends TeaModel {
    @NameInMap("apiVersion")
    public String apiVersion;

    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("event")
    public String event;

    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("url")
    public String url;

    public static Hook build(java.util.Map<String, ?> map) throws Exception {
        Hook self = new Hook();
        return TeaModel.build(map, self);
    }

    public Hook setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public Hook setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Hook setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public Hook setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public Hook setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Hook setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public Hook setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
