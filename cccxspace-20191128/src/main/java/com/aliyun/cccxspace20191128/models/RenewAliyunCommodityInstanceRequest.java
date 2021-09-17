// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class RenewAliyunCommodityInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommodityList")
    public java.util.List<RenewAliyunCommodityInstanceRequestCommodityList> commodityList;

    public static RenewAliyunCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAliyunCommodityInstanceRequest self = new RenewAliyunCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewAliyunCommodityInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewAliyunCommodityInstanceRequest setCommodityList(java.util.List<RenewAliyunCommodityInstanceRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<RenewAliyunCommodityInstanceRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public static class RenewAliyunCommodityInstanceRequestCommodityList extends TeaModel {
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

        public static RenewAliyunCommodityInstanceRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            RenewAliyunCommodityInstanceRequestCommodityList self = new RenewAliyunCommodityInstanceRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
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

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public RenewAliyunCommodityInstanceRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

    }

}
