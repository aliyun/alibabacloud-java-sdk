// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpIncomingResponseHeaderModificationRulesRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can call the ListHttpIncomingResponseHeaderModificationRules operation to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>432915173664768</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type to query. Valid values:</p>
     * <ul>
     * <li>global: global configurations.</li>
     * <li>rule: rule configurations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 500. Default value: 500.</p>
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
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>624516866852544</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the website configurations. You can use this parameter to specify a version of your website to apply the feature settings. By default, version 0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static ListHttpIncomingResponseHeaderModificationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpIncomingResponseHeaderModificationRulesRequest self = new ListHttpIncomingResponseHeaderModificationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpIncomingResponseHeaderModificationRulesRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public ListHttpIncomingResponseHeaderModificationRulesRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListHttpIncomingResponseHeaderModificationRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpIncomingResponseHeaderModificationRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpIncomingResponseHeaderModificationRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListHttpIncomingResponseHeaderModificationRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListHttpIncomingResponseHeaderModificationRulesRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
