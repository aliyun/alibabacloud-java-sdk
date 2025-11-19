// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserConfiguration extends TeaModel {
    @NameInMap("browserType")
    public String browserType;

    /**
     * <p>要启用的浏览器扩展列表</p>
     */
    @NameInMap("enableExtension")
    public java.util.List<String> enableExtension;

    /**
     * <p>是否以无头模式运行浏览器</p>
     */
    @NameInMap("headless")
    public Boolean headless;

    /**
     * <p>浏览器用户代理字符串</p>
     */
    @NameInMap("userAgent")
    public String userAgent;

    @NameInMap("viewPort")
    public ViewPortConfiguration viewPort;

    public static BrowserConfiguration build(java.util.Map<String, ?> map) throws Exception {
        BrowserConfiguration self = new BrowserConfiguration();
        return TeaModel.build(map, self);
    }

    public BrowserConfiguration setBrowserType(String browserType) {
        this.browserType = browserType;
        return this;
    }
    public String getBrowserType() {
        return this.browserType;
    }

    public BrowserConfiguration setEnableExtension(java.util.List<String> enableExtension) {
        this.enableExtension = enableExtension;
        return this;
    }
    public java.util.List<String> getEnableExtension() {
        return this.enableExtension;
    }

    public BrowserConfiguration setHeadless(Boolean headless) {
        this.headless = headless;
        return this;
    }
    public Boolean getHeadless() {
        return this.headless;
    }

    public BrowserConfiguration setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    public String getUserAgent() {
        return this.userAgent;
    }

    public BrowserConfiguration setViewPort(ViewPortConfiguration viewPort) {
        this.viewPort = viewPort;
        return this;
    }
    public ViewPortConfiguration getViewPort() {
        return this.viewPort;
    }

}
