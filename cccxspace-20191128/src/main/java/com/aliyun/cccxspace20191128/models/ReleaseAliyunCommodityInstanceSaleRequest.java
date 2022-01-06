// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseAliyunCommodityInstanceSaleRequest extends TeaModel {
    @NameInMap("CommodityList")
    public java.util.List<ReleaseAliyunCommodityInstanceSaleRequestCommodityList> commodityList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseAliyunCommodityInstanceSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAliyunCommodityInstanceSaleRequest self = new ReleaseAliyunCommodityInstanceSaleRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAliyunCommodityInstanceSaleRequest setCommodityList(java.util.List<ReleaseAliyunCommodityInstanceSaleRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<ReleaseAliyunCommodityInstanceSaleRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public ReleaseAliyunCommodityInstanceSaleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class ReleaseAliyunCommodityInstanceSaleRequestCommodityList extends TeaModel {
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

        public static ReleaseAliyunCommodityInstanceSaleRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            ReleaseAliyunCommodityInstanceSaleRequestCommodityList self = new ReleaseAliyunCommodityInstanceSaleRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
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

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

        public ReleaseAliyunCommodityInstanceSaleRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
