// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpRequestHeaderModificationRulesRequest extends TeaModel {
    /**
     * <p>Configuration ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2867483.html">ListHttpRequestHeaderModificationRules</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Configuration type, which can be used to query global or rule configurations. Possible values:</p>
     * <ul>
     * <li>global: Query global configuration;</li>
     * <li>rule: Query rule configuration;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>Page number, defaulting to 1 if not provided.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of items per page, with a maximum of 500. Defaults to 500 if not provided.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Rule name. This parameter is not required when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the configuration, defaulting to version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static ListHttpRequestHeaderModificationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpRequestHeaderModificationRulesRequest self = new ListHttpRequestHeaderModificationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpRequestHeaderModificationRulesRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public ListHttpRequestHeaderModificationRulesRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListHttpRequestHeaderModificationRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpRequestHeaderModificationRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpRequestHeaderModificationRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListHttpRequestHeaderModificationRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListHttpRequestHeaderModificationRulesRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
