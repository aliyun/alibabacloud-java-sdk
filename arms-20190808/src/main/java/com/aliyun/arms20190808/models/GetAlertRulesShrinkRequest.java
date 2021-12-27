// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesShrinkRequest extends TeaModel {
    @NameInMap("AlertIds")
    public String alertIdsShrink;

    @NameInMap("AlertNames")
    public String alertNamesShrink;

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

    public static GetAlertRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRulesShrinkRequest self = new GetAlertRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRulesShrinkRequest setAlertIdsShrink(String alertIdsShrink) {
        this.alertIdsShrink = alertIdsShrink;
        return this;
    }
    public String getAlertIdsShrink() {
        return this.alertIdsShrink;
    }

    public GetAlertRulesShrinkRequest setAlertNamesShrink(String alertNamesShrink) {
        this.alertNamesShrink = alertNamesShrink;
        return this;
    }
    public String getAlertNamesShrink() {
        return this.alertNamesShrink;
    }

    public GetAlertRulesShrinkRequest setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public String getAlertStatus() {
        return this.alertStatus;
    }

    public GetAlertRulesShrinkRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public GetAlertRulesShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public GetAlertRulesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAlertRulesShrinkRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
