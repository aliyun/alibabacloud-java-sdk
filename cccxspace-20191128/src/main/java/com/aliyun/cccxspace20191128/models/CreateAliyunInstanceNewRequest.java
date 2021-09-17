// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewRequest extends TeaModel {
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
    public java.util.List<CreateAliyunInstanceNewRequestCommodityList> commodityList;

    public static CreateAliyunInstanceNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewRequest self = new CreateAliyunInstanceNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAliyunInstanceNewRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAliyunInstanceNewRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateAliyunInstanceNewRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateAliyunInstanceNewRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public CreateAliyunInstanceNewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAliyunInstanceNewRequest setInstanceComponent(String instanceComponent) {
        this.instanceComponent = instanceComponent;
        return this;
    }
    public String getInstanceComponent() {
        return this.instanceComponent;
    }

    public CreateAliyunInstanceNewRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAliyunInstanceNewRequest setCommodityList(java.util.List<CreateAliyunInstanceNewRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<CreateAliyunInstanceNewRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public static class CreateAliyunInstanceNewRequestCommodityList extends TeaModel {
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

        public static CreateAliyunInstanceNewRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            CreateAliyunInstanceNewRequestCommodityList self = new CreateAliyunInstanceNewRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public CreateAliyunInstanceNewRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public CreateAliyunInstanceNewRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

    }

}
