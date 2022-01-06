// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class RenewAliyunCommodityInstanceRequest extends TeaModel {
    @NameInMap("CommodityList")
    public java.util.List<RenewAliyunCommodityInstanceRequestCommodityList> commodityList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static RenewAliyunCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAliyunCommodityInstanceRequest self = new RenewAliyunCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewAliyunCommodityInstanceRequest setCommodityList(java.util.List<RenewAliyunCommodityInstanceRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<RenewAliyunCommodityInstanceRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public RenewAliyunCommodityInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class RenewAliyunCommodityInstanceRequestCommodityList extends TeaModel {
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

        public static RenewAliyunCommodityInstanceRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            RenewAliyunCommodityInstanceRequestCommodityList self = new RenewAliyunCommodityInstanceRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
