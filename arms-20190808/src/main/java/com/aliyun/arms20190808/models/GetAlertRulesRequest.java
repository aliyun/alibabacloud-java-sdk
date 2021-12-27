// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesRequest extends TeaModel {
    @NameInMap("AlertIds")
    public java.util.List<byte[]> alertIds;

    @NameInMap("AlertNames")
    public java.util.List<byte[]> alertNames;

    @NameInMap("AlertStatus")
    public String alertStatus;

    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("Page")
    public Long page;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Size")
    public Long size;

    public static GetAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRulesRequest self = new GetAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRulesRequest setAlertIds(java.util.List<byte[]> alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public java.util.List<byte[]> getAlertIds() {
        return this.alertIds;
    }

    public GetAlertRulesRequest setAlertNames(java.util.List<byte[]> alertNames) {
        this.alertNames = alertNames;
        return this;
    }
    public java.util.List<byte[]> getAlertNames() {
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
