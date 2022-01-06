// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateXspaceCommodityInstanceRequest extends TeaModel {
    @NameInMap("AlipkUserId")
    public Long alipkUserId;

    @NameInMap("Chargetype")
    public String chargetype;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CommodityInstanceComponent")
    public String commodityInstanceComponent;

    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    @NameInMap("CommodityInstanceName")
    public String commodityInstanceName;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Env")
    public String env;

    @NameInMap("HotlineSeatNum")
    public Integer hotlineSeatNum;

    @NameInMap("HotlineVersion")
    public String hotlineVersion;

    @NameInMap("OnlineSeatNum")
    public Integer onlineSeatNum;

    @NameInMap("OnlineVersion")
    public String onlineVersion;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartDate")
    public Long startDate;

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

    public CreateXspaceCommodityInstanceRequest setChargetype(String chargetype) {
        this.chargetype = chargetype;
        return this;
    }
    public String getChargetype() {
        return this.chargetype;
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

    public CreateXspaceCommodityInstanceRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

    public CreateXspaceCommodityInstanceRequest setCommodityInstanceName(String commodityInstanceName) {
        this.commodityInstanceName = commodityInstanceName;
        return this;
    }
    public String getCommodityInstanceName() {
        return this.commodityInstanceName;
    }

    public CreateXspaceCommodityInstanceRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public CreateXspaceCommodityInstanceRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public CreateXspaceCommodityInstanceRequest setHotlineSeatNum(Integer hotlineSeatNum) {
        this.hotlineSeatNum = hotlineSeatNum;
        return this;
    }
    public Integer getHotlineSeatNum() {
        return this.hotlineSeatNum;
    }

    public CreateXspaceCommodityInstanceRequest setHotlineVersion(String hotlineVersion) {
        this.hotlineVersion = hotlineVersion;
        return this;
    }
    public String getHotlineVersion() {
        return this.hotlineVersion;
    }

    public CreateXspaceCommodityInstanceRequest setOnlineSeatNum(Integer onlineSeatNum) {
        this.onlineSeatNum = onlineSeatNum;
        return this;
    }
    public Integer getOnlineSeatNum() {
        return this.onlineSeatNum;
    }

    public CreateXspaceCommodityInstanceRequest setOnlineVersion(String onlineVersion) {
        this.onlineVersion = onlineVersion;
        return this;
    }
    public String getOnlineVersion() {
        return this.onlineVersion;
    }

    public CreateXspaceCommodityInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateXspaceCommodityInstanceRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
