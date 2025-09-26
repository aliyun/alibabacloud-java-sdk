// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserSessionOut extends TeaModel {
    @NameInMap("browserId")
    public String browserId;

    @NameInMap("browserName")
    public String browserName;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>会话空闲超时时间，单位为秒</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    @NameInMap("status")
    public String status;

    public static BrowserSessionOut build(java.util.Map<String, ?> map) throws Exception {
        BrowserSessionOut self = new BrowserSessionOut();
        return TeaModel.build(map, self);
    }

    public BrowserSessionOut setBrowserId(String browserId) {
        this.browserId = browserId;
        return this;
    }
    public String getBrowserId() {
        return this.browserId;
    }

    public BrowserSessionOut setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }
    public String getBrowserName() {
        return this.browserName;
    }

    public BrowserSessionOut setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BrowserSessionOut setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public BrowserSessionOut setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public BrowserSessionOut setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
        this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
        return this;
    }
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public BrowserSessionOut setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
