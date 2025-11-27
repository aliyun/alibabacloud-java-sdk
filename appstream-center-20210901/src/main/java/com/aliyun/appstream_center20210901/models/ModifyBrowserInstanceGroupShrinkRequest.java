// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyBrowserInstanceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The browser settings.</p>
     */
    @NameInMap("BrowserConfig")
    public String browserConfigShrink;

    /**
     * <p>The ID of the cloud browser to be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>big-0bz55ixxxxx9xi9w9</p>
     */
    @NameInMap("BrowserInstanceGroupId")
    public String browserInstanceGroupId;

    /**
     * <p>The name of the cloud browser.</p>
     * 
     * <strong>example:</strong>
     * <p>BrowserTest</p>
     */
    @NameInMap("CloudBrowserName")
    public String cloudBrowserName;

    /**
     * <p>The network configurations.</p>
     */
    @NameInMap("Network")
    public String networkShrink;

    /**
     * <p>The access policy.</p>
     */
    @NameInMap("Policy")
    public String policyShrink;

    /**
     * <p>The timer.</p>
     */
    @NameInMap("Timers")
    public String timersShrink;

    public static ModifyBrowserInstanceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBrowserInstanceGroupShrinkRequest self = new ModifyBrowserInstanceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBrowserInstanceGroupShrinkRequest setBrowserConfigShrink(String browserConfigShrink) {
        this.browserConfigShrink = browserConfigShrink;
        return this;
    }
    public String getBrowserConfigShrink() {
        return this.browserConfigShrink;
    }

    public ModifyBrowserInstanceGroupShrinkRequest setBrowserInstanceGroupId(String browserInstanceGroupId) {
        this.browserInstanceGroupId = browserInstanceGroupId;
        return this;
    }
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    public ModifyBrowserInstanceGroupShrinkRequest setCloudBrowserName(String cloudBrowserName) {
        this.cloudBrowserName = cloudBrowserName;
        return this;
    }
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    public ModifyBrowserInstanceGroupShrinkRequest setNetworkShrink(String networkShrink) {
        this.networkShrink = networkShrink;
        return this;
    }
    public String getNetworkShrink() {
        return this.networkShrink;
    }

    public ModifyBrowserInstanceGroupShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public ModifyBrowserInstanceGroupShrinkRequest setTimersShrink(String timersShrink) {
        this.timersShrink = timersShrink;
        return this;
    }
    public String getTimersShrink() {
        return this.timersShrink;
    }

}
