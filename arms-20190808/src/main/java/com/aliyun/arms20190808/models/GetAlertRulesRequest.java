// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesRequest extends TeaModel {
    @NameInMap("AlertIds")
    public String alertIds;

    @NameInMap("AlertNames")
    public String alertNames;

    @NameInMap("AlertStatus")
    public String alertStatus;

    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Size")
    public Long size;

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
        @NameInMap("Key")
        public String key;

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
