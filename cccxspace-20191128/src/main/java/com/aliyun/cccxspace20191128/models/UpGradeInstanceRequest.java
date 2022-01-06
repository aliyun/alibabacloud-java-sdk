// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpGradeInstanceRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    @NameInMap("HotlineSeatNum")
    public Integer hotlineSeatNum;

    @NameInMap("HotlineVersion")
    public String hotlineVersion;

    @NameInMap("OnlineSeatNum")
    public Integer onlineSeatNum;

    @NameInMap("OnlineVersion")
    public String onlineVersion;

    public static UpGradeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpGradeInstanceRequest self = new UpGradeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpGradeInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public UpGradeInstanceRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

    public UpGradeInstanceRequest setHotlineSeatNum(Integer hotlineSeatNum) {
        this.hotlineSeatNum = hotlineSeatNum;
        return this;
    }
    public Integer getHotlineSeatNum() {
        return this.hotlineSeatNum;
    }

    public UpGradeInstanceRequest setHotlineVersion(String hotlineVersion) {
        this.hotlineVersion = hotlineVersion;
        return this;
    }
    public String getHotlineVersion() {
        return this.hotlineVersion;
    }

    public UpGradeInstanceRequest setOnlineSeatNum(Integer onlineSeatNum) {
        this.onlineSeatNum = onlineSeatNum;
        return this;
    }
    public Integer getOnlineSeatNum() {
        return this.onlineSeatNum;
    }

    public UpGradeInstanceRequest setOnlineVersion(String onlineVersion) {
        this.onlineVersion = onlineVersion;
        return this;
    }
    public String getOnlineVersion() {
        return this.onlineVersion;
    }

}
