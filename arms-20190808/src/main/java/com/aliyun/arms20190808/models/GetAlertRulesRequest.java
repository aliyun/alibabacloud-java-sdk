// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesRequest extends TeaModel {
    /**
     * <p>The unique IDs of alert rules.</p>
     * <ul>
     * <li>If you do not specify this parameter, the API operation does not filter alert rules based on their IDs.</li>
     * <li>If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.</li>
     * </ul>
     * <blockquote>
     * <p>When you call the GetAlertRules operation, you can specify other request parameters to obtain the AlertIds parameter from the response. Then, you can specify the AlertIds parameter to query the specified alert rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;12345&quot;]</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <p>The names of alert rules. When you create alert rules of the new version, you cannot specify duplicate names. However, existing alert rules may have duplicate names. Therefore, the <strong>AlertName</strong> parameter does not uniquely identify an alert rule.</p>
     * <ul>
     * <li>If you do not specify this parameter, the API operation does not filter alert rules based on their names.</li>
     * <li>If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;test&quot;]</p>
     */
    @NameInMap("AlertNames")
    public String alertNames;

    /**
     * <p>The status of the alert rule. Valid values:</p>
     * <ul>
     * <li>RUNNING</li>
     * <li>STOPPED</li>
     * <li>PAUSED</li>
     * </ul>
     * <blockquote>
     * <p>The <strong>PAUSED</strong> status indicates that the alert rule is abnormal and is actively paused by the system. The alert rule may be paused because that it is not unique or the associated cluster has been deleted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("AlertStatus")
    public String alertStatus;

    /**
     * <p>The type of the alert rule.</p>
     * <ul>
     * <li>APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring</li>
     * <li>BROWSER_MONITORING_ALERT_RULE: an alert rule for Browser Monitoring.</li>
     * <li>PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Managed Service for Prometheus.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION_MONITORING_ALERT_RULE</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The ID of the monitored cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ceba9b9ea5b924dd0b6726d2de6******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of alert rules to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetAlertRulesRequestTags> tags;

    public static GetAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRulesRequest self = new GetAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRulesRequest setAlertIds(String alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public String getAlertIds() {
        return this.alertIds;
    }

    public GetAlertRulesRequest setAlertNames(String alertNames) {
        this.alertNames = alertNames;
        return this;
    }
    public String getAlertNames() {
        return this.alertNames;
    }

    public GetAlertRulesRequest setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public String getAlertStatus() {
        return this.alertStatus;
    }

    public GetAlertRulesRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public GetAlertRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAlertRulesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public GetAlertRulesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAlertRulesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetAlertRulesRequest setTags(java.util.List<GetAlertRulesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetAlertRulesRequestTags> getTags() {
        return this.tags;
    }

    public static class GetAlertRulesRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAlertRulesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesRequestTags self = new GetAlertRulesRequestTags();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAlertRulesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
