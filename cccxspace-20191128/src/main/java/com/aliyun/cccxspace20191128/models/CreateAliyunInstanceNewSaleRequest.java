// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewSaleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Region")
    public String region;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("Source")
    public Long source;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceComponent")
    public String instanceComponent;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("CommodityList")
    public java.util.List<CreateAliyunInstanceNewSaleRequestCommodityList> commodityList;

    public static CreateAliyunInstanceNewSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewSaleRequest self = new CreateAliyunInstanceNewSaleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewSaleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAliyunInstanceNewSaleRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAliyunInstanceNewSaleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateAliyunInstanceNewSaleRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateAliyunInstanceNewSaleRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public CreateAliyunInstanceNewSaleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAliyunInstanceNewSaleRequest setInstanceComponent(String instanceComponent) {
        this.instanceComponent = instanceComponent;
        return this;
    }
    public String getInstanceComponent() {
        return this.instanceComponent;
    }

    public CreateAliyunInstanceNewSaleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAliyunInstanceNewSaleRequest setCommodityList(java.util.List<CreateAliyunInstanceNewSaleRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<CreateAliyunInstanceNewSaleRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public static class CreateAliyunInstanceNewSaleRequestCommodityList extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityNum")
        public Integer commodityNum;

        @NameInMap("Description")
        public String description;

        @NameInMap("CommodityStartTime")
        public Long commodityStartTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CommodityEndTime")
        public Long commodityEndTime;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("CommodityEdition")
        public Integer commodityEdition;

        @NameInMap("CommodityType")
        public Integer commodityType;

        public static CreateAliyunInstanceNewSaleRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            CreateAliyunInstanceNewSaleRequestCommodityList self = new CreateAliyunInstanceNewSaleRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

    }

}
