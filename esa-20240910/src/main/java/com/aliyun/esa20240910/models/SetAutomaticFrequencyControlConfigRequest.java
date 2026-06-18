// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetAutomaticFrequencyControlConfigRequest extends TeaModel {
    /**
     * <p>The action to take on requests that trigger the control. Valid values:</p>
     * <ul>
     * <li><p><strong>observe</strong>: Monitors the requests.</p>
     * </li>
     * <li><p><strong>deny</strong>: Blocks the requests.</p>
     * </li>
     * <li><p><strong>js</strong>: Issues a JS challenge.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>js</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>Specifies whether to enable automatic frequency control. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables automatic frequency control.</p>
     * </li>
     * <li><p><strong>off</strong>: Disables automatic frequency control.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The protection level. Valid values:</p>
     * <ul>
     * <li><p><strong>loose</strong>: Loose protection.</p>
     * </li>
     * <li><p><strong>normal</strong>: Normal protection.</p>
     * </li>
     * <li><p><strong>strict</strong>: Strict protection.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The ID of the site. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version of the site. For a site with version management enabled, this parameter specifies the version to which the configuration applies. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static SetAutomaticFrequencyControlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAutomaticFrequencyControlConfigRequest self = new SetAutomaticFrequencyControlConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetAutomaticFrequencyControlConfigRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public SetAutomaticFrequencyControlConfigRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public SetAutomaticFrequencyControlConfigRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public SetAutomaticFrequencyControlConfigRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SetAutomaticFrequencyControlConfigRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
