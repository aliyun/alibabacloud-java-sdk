// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewRequest extends TeaModel {
    @NameInMap("CommodityList")
    public java.util.List<CreateAliyunInstanceNewRequestCommodityList> commodityList;

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

    public static CreateAliyunInstanceNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewRequest self = new CreateAliyunInstanceNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewRequest setCommodityList(java.util.List<CreateAliyunInstanceNewRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<CreateAliyunInstanceNewRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public CreateAliyunInstanceNewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAliyunInstanceNewRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateAliyunInstanceNewRequest setInstanceComponent(String instanceComponent) {
        this.instanceComponent = instanceComponent;
        return this;
    }
    public String getInstanceComponent() {
        return this.instanceComponent;
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

    public CreateAliyunInstanceNewRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public CreateAliyunInstanceNewRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateAliyunInstanceNewRequestCommodityList extends TeaModel {
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

        public static CreateAliyunInstanceNewRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            CreateAliyunInstanceNewRequestCommodityList self = new CreateAliyunInstanceNewRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public CreateAliyunInstanceNewRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
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

        public CreateAliyunInstanceNewRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public CreateAliyunInstanceNewRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

        public CreateAliyunInstanceNewRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
