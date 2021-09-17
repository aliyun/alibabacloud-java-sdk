// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ChangeGradeAliyunInstanceSaleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommodityList")
    public java.util.List<ChangeGradeAliyunInstanceSaleRequestCommodityList> commodityList;

    public static ChangeGradeAliyunInstanceSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeGradeAliyunInstanceSaleRequest self = new ChangeGradeAliyunInstanceSaleRequest();
        return TeaModel.build(map, self);
    }

    public ChangeGradeAliyunInstanceSaleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeGradeAliyunInstanceSaleRequest setCommodityList(java.util.List<ChangeGradeAliyunInstanceSaleRequestCommodityList> commodityList) {
        this.commodityList = commodityList;
        return this;
    }
    public java.util.List<ChangeGradeAliyunInstanceSaleRequestCommodityList> getCommodityList() {
        return this.commodityList;
    }

    public static class ChangeGradeAliyunInstanceSaleRequestCommodityList extends TeaModel {
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

        public static ChangeGradeAliyunInstanceSaleRequestCommodityList build(java.util.Map<String, ?> map) throws Exception {
            ChangeGradeAliyunInstanceSaleRequestCommodityList self = new ChangeGradeAliyunInstanceSaleRequestCommodityList();
            return TeaModel.build(map, self);
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setCommodityNum(Integer commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Integer getCommodityNum() {
            return this.commodityNum;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setCommodityStartTime(Long commodityStartTime) {
            this.commodityStartTime = commodityStartTime;
            return this;
        }
        public Long getCommodityStartTime() {
            return this.commodityStartTime;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setCommodityEndTime(Long commodityEndTime) {
            this.commodityEndTime = commodityEndTime;
            return this;
        }
        public Long getCommodityEndTime() {
            return this.commodityEndTime;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setCommodityEdition(Integer commodityEdition) {
            this.commodityEdition = commodityEdition;
            return this;
        }
        public Integer getCommodityEdition() {
            return this.commodityEdition;
        }

        public ChangeGradeAliyunInstanceSaleRequestCommodityList setCommodityType(Integer commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public Integer getCommodityType() {
            return this.commodityType;
        }

    }

}
