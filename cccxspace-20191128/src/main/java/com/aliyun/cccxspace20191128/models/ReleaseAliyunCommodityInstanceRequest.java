// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseAliyunCommodityInstanceRequest extends TeaModel {
    @NameInMap("CommodityList")
    public java.util.List<ReleaseAliyunCommodityInstanceRequestCommodityList> commodityList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseAliyunCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAliyunCommodityInstanceRequest self = new ReleaseAliyunCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAliyunCommodityInstanceRequest setCommodityList(java.util.List<ReleaseAliyunCommodityInstanceRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<ReleaseAliyunCommodityInstanceRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public ReleaseAliyunCommodityInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class ReleaseAliyunCommodityInstanceRequestCommodityList extends TeaModel {
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

        public static ReleaseAliyunCommodityInstanceRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            ReleaseAliyunCommodityInstanceRequestCommodityList self = new ReleaseAliyunCommodityInstanceRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
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

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

        public ReleaseAliyunCommodityInstanceRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
