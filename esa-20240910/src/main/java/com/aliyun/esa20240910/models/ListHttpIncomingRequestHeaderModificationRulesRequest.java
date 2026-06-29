// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpIncomingRequestHeaderModificationRulesRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can call the ListHttpIncomingRequestHeaderModificationRules operation to obtain the configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>424371770570752</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type. You can use this parameter to query global or rule configurations. Valid values:</p>
     * <ul>
     * <li>global: queries global configurations.</li>
     * <li>rule: queries rule configurations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The page number for a paged query. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>608665779308176</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. The default value is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static ListHttpIncomingRequestHeaderModificationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpIncomingRequestHeaderModificationRulesRequest self = new ListHttpIncomingRequestHeaderModificationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpIncomingRequestHeaderModificationRulesRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public ListHttpIncomingRequestHeaderModificationRulesRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListHttpIncomingRequestHeaderModificationRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpIncomingRequestHeaderModificationRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpIncomingRequestHeaderModificationRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListHttpIncomingRequestHeaderModificationRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListHttpIncomingRequestHeaderModificationRulesRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
