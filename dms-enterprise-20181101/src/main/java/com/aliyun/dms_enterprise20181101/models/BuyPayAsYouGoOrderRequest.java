// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BuyPayAsYouGoOrderRequest extends TeaModel {
    @NameInMap("CommodityType")
    public String commodityType;

    @NameInMap("InsNum")
    public Integer insNum;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("VersionType")
    public String versionType;

    public static BuyPayAsYouGoOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        BuyPayAsYouGoOrderRequest self = new BuyPayAsYouGoOrderRequest();
        return TeaModel.build(map, self);
    }

    public BuyPayAsYouGoOrderRequest setCommodityType(String commodityType) {
        this.commodityType = commodityType;
        return this;
    }
    public String getCommodityType() {
        return this.commodityType;
    }

    public BuyPayAsYouGoOrderRequest setInsNum(Integer insNum) {
        this.insNum = insNum;
        return this;
    }
    public Integer getInsNum() {
        return this.insNum;
    }

    public BuyPayAsYouGoOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public BuyPayAsYouGoOrderRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
