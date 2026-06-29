// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListNetworkOptimizationsRequest extends TeaModel {
    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type. You can use this parameter to query global or rule configurations. Valid values:</p>
     * <ul>
     * <li>global: queries global configurations.</li>
     * <li>rule: queries rule configurations.</li>
     * </ul>
     * <p>This parameter is optional. If you do not specify this parameter, both global and rule configurations are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
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
     * <p>The rule name. You can use this parameter to query the rule that matches the specified name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231231221****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site. For sites with version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static ListNetworkOptimizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkOptimizationsRequest self = new ListNetworkOptimizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListNetworkOptimizationsRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public ListNetworkOptimizationsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListNetworkOptimizationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNetworkOptimizationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNetworkOptimizationsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListNetworkOptimizationsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListNetworkOptimizationsRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
