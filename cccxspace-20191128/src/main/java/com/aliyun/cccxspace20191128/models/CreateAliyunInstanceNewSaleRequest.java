// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewSaleRequest extends TeaModel {
    @NameInMap("CommodityList")
    public java.util.List<CreateAliyunInstanceNewSaleRequestCommodityList> commodityList;

    @NameInMap("Description")
    public String description;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceComponent")
    public String instanceComponent;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Region")
    public String region;

    @NameInMap("Source")
    public Long source;

    @NameInMap("UserId")
    public String userId;

    public static CreateAliyunInstanceNewSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewSaleRequest self = new CreateAliyunInstanceNewSaleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewSaleRequest setCommodityList(java.util.List<CreateAliyunInstanceNewSaleRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<CreateAliyunInstanceNewSaleRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public CreateAliyunInstanceNewSaleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAliyunInstanceNewSaleRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateAliyunInstanceNewSaleRequest setInstanceComponent(String instanceComponent) {
        this.instanceComponent = instanceComponent;
        return this;
    }
    public String getInstanceComponent() {
        return this.instanceComponent;
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

    public CreateAliyunInstanceNewSaleRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public CreateAliyunInstanceNewSaleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateAliyunInstanceNewSaleRequestCommodityList extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityEdition")
        public Integer commodityEdition;

        @NameInMap("CommodityEndTime")
        public Long commodityEndTime;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("CommodityNum")
        public Integer commodityNum;

        @NameInMap("CommodityStartTime")
        public Long commodityStartTime;

        @NameInMap("CommodityType")
        public Integer commodityType;

        @NameInMap("Description")
        public String description;

        public static CreateAliyunInstanceNewSaleRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            CreateAliyunInstanceNewSaleRequestCommodityList self = new CreateAliyunInstanceNewSaleRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
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

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

        public CreateAliyunInstanceNewSaleRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
