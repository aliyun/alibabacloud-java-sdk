// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    /**
     * <p>The environment name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>默认环境</p>
     */
    @NameInMap("EnvironmentName")
    public String environmentName;

    /**
     * <p>The new environment name.</p>
     * 
     * <strong>example:</strong>
     * <p>环境A</p>
     */
    @NameInMap("NewName")
    public String newName;

    /**
     * <p>Specifies whether the environment is read-only.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReadOnly")
    public Boolean readOnly;

    /**
     * <p>The Wireshark rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;duduko5.top&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33993121955****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The new site version number. Only the environment with the highest priority can be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static UpdateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentRequest self = new UpdateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public UpdateEnvironmentRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateEnvironmentRequest setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public UpdateEnvironmentRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateEnvironmentRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateEnvironmentRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
