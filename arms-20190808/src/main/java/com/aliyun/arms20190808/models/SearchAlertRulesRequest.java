// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesRequest extends TeaModel {
    @NameInMap("AlertRuleId")
    public String alertRuleId;

    /**
     * <p>The type of the application that is associated with the alert rule. Valid values:</p>
     * <br>
     * <p>*   `TRACE`: application</p>
     * <p>*   `RETCODE`: browser</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The page number of the page to return. Default value: `1`.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return per page. Default value: `10`.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process identifier (PID) of the application that is associated with the alert rule. For more information about how to obtain the PID, see [Obtain the PID of an application](https://help.aliyun.com/document_detail/186100.html?spm=a2c4g.11186623.6.792.1b50654cqcDPyk#title-imy-7gj-qhr).</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID of the alert data. For more information about the mappings between **RegionId** and **SystemRegionId**, see the detailed description below the table.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The region ID of the alert rule. For more information about the mappings between **RegionId** and **SystemRegionId**, see the detailed description below the table.</p>
     */
    @NameInMap("SystemRegionId")
    public String systemRegionId;

    /**
     * <p>The alert rule name.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The alert rule type. Valid values:</p>
     * <br>
     * <p>*   `1`: custom alert rules that are used to monitor drill-down data sets</p>
     * <p>*   `3`: custom alert rules that are used to monitor tiled data sets</p>
     * <p>*   `4`: alert rules that are used to monitor the browser, including the default frontend alert rules</p>
     * <p>*   `5`: alert rules that are used to monitor applications, including the default application alert rules</p>
     * <p>*   `6`: the default browser alert rules</p>
     * <p>*   `7`: the default application alert rules</p>
     * <p>*   `8`: Tracing Analysis alert rules</p>
     * <p>*   `101`: Prometheus alert rules</p>
     */
    @NameInMap("Type")
    public String type;

    public static SearchAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertRulesRequest self = new SearchAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertRulesRequest setAlertRuleId(String alertRuleId) {
        this.alertRuleId = alertRuleId;
        return this;
    }
    public String getAlertRuleId() {
        return this.alertRuleId;
    }

    public SearchAlertRulesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchAlertRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchAlertRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAlertRulesRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchAlertRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SearchAlertRulesRequest setSystemRegionId(String systemRegionId) {
        this.systemRegionId = systemRegionId;
        return this;
    }
    public String getSystemRegionId() {
        return this.systemRegionId;
    }

    public SearchAlertRulesRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SearchAlertRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
