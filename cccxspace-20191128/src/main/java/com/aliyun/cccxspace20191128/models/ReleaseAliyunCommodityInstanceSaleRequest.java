// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseAliyunCommodityInstanceSaleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommodityList")
    public java.util.List<ReleaseAliyunCommodityInstanceSaleRequestCommodityList> commodityList;

    public static ReleaseAliyunCommodityInstanceSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAliyunCommodityInstanceSaleRequest self = new ReleaseAliyunCommodityInstanceSaleRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAliyunCommodityInstanceSaleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseAliyunCommodityInstanceSaleRequest setCommodityList(java.util.List<ReleaseAliyunCommodityInstanceSaleRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<ReleaseAliyunCommodityInstanceSaleRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public static class ReleaseAliyunCommodityInstanceSaleRequestCommodityList extends TeaModel {
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

        public static ReleaseAliyunCommodityInstanceSaleRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            ReleaseAliyunCommodityInstanceSaleRequestCommodityList self = new ReleaseAliyunCommodityInstanceSaleRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

    }

}
