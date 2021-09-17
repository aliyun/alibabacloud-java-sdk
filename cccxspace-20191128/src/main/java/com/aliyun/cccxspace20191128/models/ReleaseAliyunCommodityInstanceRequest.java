// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseAliyunCommodityInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommodityList")
    public java.util.List<ReleaseAliyunCommodityInstanceRequestCommodityList> commodityList;

    public static ReleaseAliyunCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAliyunCommodityInstanceRequest self = new ReleaseAliyunCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAliyunCommodityInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseAliyunCommodityInstanceRequest setCommodityList(java.util.List<ReleaseAliyunCommodityInstanceRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<ReleaseAliyunCommodityInstanceRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public static class ReleaseAliyunCommodityInstanceRequestCommodityList extends TeaModel {
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

        public static ReleaseAliyunCommodityInstanceRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            ReleaseAliyunCommodityInstanceRequestCommodityList self = new ReleaseAliyunCommodityInstanceRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

    }

}
