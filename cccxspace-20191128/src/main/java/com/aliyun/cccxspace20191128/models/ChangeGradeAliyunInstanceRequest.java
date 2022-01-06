// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ChangeGradeAliyunInstanceRequest extends TeaModel {
    @NameInMap("CommodityList")
    public java.util.List<ChangeGradeAliyunInstanceRequestCommodityList> commodityList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ChangeGradeAliyunInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeGradeAliyunInstanceRequest self = new ChangeGradeAliyunInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ChangeGradeAliyunInstanceRequest setCommodityList(java.util.List<ChangeGradeAliyunInstanceRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<ChangeGradeAliyunInstanceRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public ChangeGradeAliyunInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class ChangeGradeAliyunInstanceRequestCommodityList extends TeaModel {
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

        public static ChangeGradeAliyunInstanceRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            ChangeGradeAliyunInstanceRequestCommodityList self = new ChangeGradeAliyunInstanceRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

        public ChangeGradeAliyunInstanceRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
