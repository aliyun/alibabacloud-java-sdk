// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteFunctionsRequest extends TeaModel {
    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ListSiteFunctions</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static ListSiteFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSiteFunctionsRequest self = new ListSiteFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSiteFunctionsRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public ListSiteFunctionsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListSiteFunctionsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListSiteFunctionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSiteFunctionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSiteFunctionsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSiteFunctionsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListSiteFunctionsRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
