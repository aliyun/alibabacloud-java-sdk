// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class RenewAliyunCommodityInstanceSaleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommodityList")
    public java.util.List<RenewAliyunCommodityInstanceSaleRequestCommodityList> commodityList;

    public static RenewAliyunCommodityInstanceSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAliyunCommodityInstanceSaleRequest self = new RenewAliyunCommodityInstanceSaleRequest();
        return TeaModel.build(map, self);
    }

    public RenewAliyunCommodityInstanceSaleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewAliyunCommodityInstanceSaleRequest setCommodityList(java.util.List<RenewAliyunCommodityInstanceSaleRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<RenewAliyunCommodityInstanceSaleRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public static class RenewAliyunCommodityInstanceSaleRequestCommodityList extends TeaModel {
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

        public static RenewAliyunCommodityInstanceSaleRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            RenewAliyunCommodityInstanceSaleRequestCommodityList self = new RenewAliyunCommodityInstanceSaleRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public RenewAliyunCommodityInstanceSaleRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

    }

}
