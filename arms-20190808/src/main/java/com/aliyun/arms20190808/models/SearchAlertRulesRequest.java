// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesRequest extends TeaModel {
    /**
     * <p>The id of AlertRule.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("AlertRuleId")
    public String alertRuleId;

    /**
     * <p>The type of the application that is associated with the alert rule. Valid values:</p>
     * <ul>
     * <li><code>TRACE</code>: application</li>
     * <li><code>RETCODE</code>: browser</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The page number of the page to return. Default value: <code>1</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return per page. Default value: <code>10</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process identifier (PID) of the application that is associated with the alert rule. For more information about how to obtain the PID, see <a href="https://help.aliyun.com/document_detail/186100.html?spm=a2c4g.11186623.6.792.1b50654cqcDPyk#title-imy-7gj-qhr">Obtain the PID of an application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>atc889zkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID of the alert data. For more information about the mappings between <strong>RegionId</strong> and <strong>SystemRegionId</strong>, see the detailed description below the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can obtain the resource group ID in the <strong>Resource Management</strong> console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The region ID of the alert rule. For more information about the mappings between <strong>RegionId</strong> and <strong>SystemRegionId</strong>, see the detailed description below the table.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SystemRegionId")
    public String systemRegionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<SearchAlertRulesRequestTags> tags;

    /**
     * <p>The alert rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>AlertRuleTitle</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The alert rule type. Valid values:</p>
     * <ul>
     * <li><code>1</code>: custom alert rules that are used to monitor drill-down data sets</li>
     * <li><code>3</code>: custom alert rules that are used to monitor tiled data sets</li>
     * <li><code>4</code>: alert rules that are used to monitor the browser, including the default frontend alert rules</li>
     * <li><code>5</code>: alert rules that are used to monitor applications, including the default application alert rules</li>
     * <li><code>6</code>: the default browser alert rules</li>
     * <li><code>7</code>: the default application alert rules</li>
     * <li><code>8</code>: Tracing Analysis alert rules</li>
     * <li><code>101</code>: Prometheus alert rules</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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

    public SearchAlertRulesRequest setTags(java.util.List<SearchAlertRulesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SearchAlertRulesRequestTags> getTags() {
        return this.tags;
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

    public static class SearchAlertRulesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag. The following system preset fields are provided:</p>
         * <ul>
         * <li>traceId: the ID of the trace.</li>
         * <li>serverApp: the name of the server application.</li>
         * <li>clientApp: the name of the client application.</li>
         * <li>service: the name of the operation.</li>
         * <li>rpc: the type of the call.</li>
         * <li>msOfSpan: the duration exceeds a specific value.</li>
         * <li>clientIp: the IP address of the client.</li>
         * <li>serverIp: the IP address of the server.</li>
         * <li>isError: specifies whether the call is abnormal.</li>
         * <li>hasTprof: contains only thread profiling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static SearchAlertRulesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesRequestTags self = new SearchAlertRulesRequestTags();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchAlertRulesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
