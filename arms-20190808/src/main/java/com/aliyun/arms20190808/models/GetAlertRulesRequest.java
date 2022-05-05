// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesRequest extends TeaModel {
    // 告警规则ID
    @NameInMap("AlertIds")
    public String alertIds;

    // 告警规则名称
    @NameInMap("AlertNames")
    public String alertNames;

    // 告警规则运行状态
    @NameInMap("AlertStatus")
    public String alertStatus;

    // 告警规则类型
    @NameInMap("AlertType")
    public String alertType;

    // 页数
    @NameInMap("Page")
    public Long page;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    // 每一页大小
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

    public GetAlertRulesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
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
