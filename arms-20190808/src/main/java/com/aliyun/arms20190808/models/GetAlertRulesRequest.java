// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesRequest extends TeaModel {
    // The unique identifiers (IDs) of alert rules.
    // 
    // *   If you do not specify this parameter, the API operation does not filter alert rules based on their IDs.
    // *   If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.
    // 
    // > When you call the GetAlertRules operation, you can specify other request parameters to obtain the AlertIds parameter from the response. Then, you can specify the AlertIds parameter to query the specified alert rules.
    @NameInMap("AlertIds")
    public String alertIds;

    // The names of alert rules. When you create alert rules of the new version, you cannot specify duplicate names. However, existing alert rules may have duplicate names. Therefore, the **AlertName** parameter does not uniquely identify an alert rule.
    // 
    // *   If you do not specify this parameter, the API operation does not filter alert rules based on their names.
    // *   If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.
    @NameInMap("AlertNames")
    public String alertNames;

    // The status of the alert rule. Valid values:
    // 
    // *   RUNNING
    // *   STOPPED
    // *   PAUSED
    // 
    // > The **PAUSED** status indicates that the alert rule is abnormal and is actively paused by the system. The alert rule may be paused because that it is not unique or the associated cluster has been deleted.
    @NameInMap("AlertStatus")
    public String alertStatus;

    // The type of the alert rule. Valid values:
    // 
    // *   APPLICATION_MONITORING_ALERT_RULE: an alert rule of Application Monitoring
    // *   BROWSER_MONITORING_ALERT_RULE: an alert rule of Browser Monitoring
    // *   PROMETHEUS_MONITORING_ALERT_RULE: an alert rule of Prometheus Service
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("ClusterId")
    public String clusterId;

    // The number of the page to return.
    @NameInMap("Page")
    public Long page;

    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the region
    @NameInMap("RegionId")
    public String regionId;

    // The number of alert rules to return on each page.
    @NameInMap("Size")
    public Long size;

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

}
