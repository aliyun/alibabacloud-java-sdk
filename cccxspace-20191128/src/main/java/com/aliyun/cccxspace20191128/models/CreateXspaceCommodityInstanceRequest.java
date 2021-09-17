// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateXspaceCommodityInstanceRequest extends TeaModel {
    @NameInMap("AlipkUserId")
    public Long alipkUserId;

    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CommodityInstanceComponent")
    public String commodityInstanceComponent;

    @NameInMap("Env")
    public String env;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Chargetype")
    public String chargetype;

    @NameInMap("HotlineSeatNum")
    public Integer hotlineSeatNum;

    @NameInMap("OnlineSeatNum")
    public Integer onlineSeatNum;

    @NameInMap("Region")
    public String region;

    @NameInMap("CommodityInstanceName")
    public String commodityInstanceName;

    @NameInMap("HotlineVersion")
    public String hotlineVersion;

    @NameInMap("OnlineVersion")
    public String onlineVersion;

    public static CreateXspaceCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateXspaceCommodityInstanceRequest self = new CreateXspaceCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateXspaceCommodityInstanceRequest setAlipkUserId(Long alipkUserId) {
        this.alipkUserId = alipkUserId;
        return this;
    }
    public Long getAlipkUserId() {
        return this.alipkUserId;
    }

    public CreateXspaceCommodityInstanceRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

    public CreateXspaceCommodityInstanceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateXspaceCommodityInstanceRequest setCommodityInstanceComponent(String commodityInstanceComponent) {
        this.commodityInstanceComponent = commodityInstanceComponent;
        return this;
    }
    public String getCommodityInstanceComponent() {
        return this.commodityInstanceComponent;
    }

    public CreateXspaceCommodityInstanceRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public CreateXspaceCommodityInstanceRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public CreateXspaceCommodityInstanceRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public CreateXspaceCommodityInstanceRequest setChargetype(String chargetype) {
        this.chargetype = chargetype;
        return this;
    }
    public String getChargetype() {
        return this.chargetype;
    }

    public CreateXspaceCommodityInstanceRequest setHotlineSeatNum(Integer hotlineSeatNum) {
        this.hotlineSeatNum = hotlineSeatNum;
        return this;
    }
    public Integer getHotlineSeatNum() {
        return this.hotlineSeatNum;
    }

    public CreateXspaceCommodityInstanceRequest setOnlineSeatNum(Integer onlineSeatNum) {
        this.onlineSeatNum = onlineSeatNum;
        return this;
    }
    public Integer getOnlineSeatNum() {
        return this.onlineSeatNum;
    }

    public CreateXspaceCommodityInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateXspaceCommodityInstanceRequest setCommodityInstanceName(String commodityInstanceName) {
        this.commodityInstanceName = commodityInstanceName;
        return this;
    }
    public String getCommodityInstanceName() {
        return this.commodityInstanceName;
    }

    public CreateXspaceCommodityInstanceRequest setHotlineVersion(String hotlineVersion) {
        this.hotlineVersion = hotlineVersion;
        return this;
    }
    public String getHotlineVersion() {
        return this.hotlineVersion;
    }

    public CreateXspaceCommodityInstanceRequest setOnlineVersion(String onlineVersion) {
        this.onlineVersion = onlineVersion;
        return this;
    }
    public String getOnlineVersion() {
        return this.onlineVersion;
    }

}
