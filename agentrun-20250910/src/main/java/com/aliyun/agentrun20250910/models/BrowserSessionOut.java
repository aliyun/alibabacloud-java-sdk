// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserSessionOut extends TeaModel {
    /**
     * <p>The unique identifier for the browser.</p>
     * 
     * <strong>example:</strong>
     * <p>browser-1234567890abcdef</p>
     */
    @NameInMap("browserId")
    public String browserId;

    /**
     * <p>The browser name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-browser-session</p>
     */
    @NameInMap("browserName")
    public String browserName;

    /**
     * <p>The time the session was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The time the session was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The unique identifier for the session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bs-1234567890abcdef</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The session idle timeout, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    /**
     * <p>The session status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
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
