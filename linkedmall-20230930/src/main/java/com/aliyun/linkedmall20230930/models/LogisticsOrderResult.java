// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsOrderResult extends TeaModel {
    @NameInMap("dataProvider")
    public String dataProvider;

    @NameInMap("dataProviderTitle")
    public String dataProviderTitle;

    @NameInMap("goods")
    public java.util.List<Good> goods;

    @NameInMap("logisticsCompanyCode")
    public String logisticsCompanyCode;

    @NameInMap("logisticsCompanyName")
    public String logisticsCompanyName;

    @NameInMap("logisticsDetailList")
    public java.util.List<LogisticsDetail> logisticsDetailList;

    @NameInMap("mailNo")
    public String mailNo;

    public static LogisticsOrderResult build(java.util.Map<String, ?> map) throws Exception {
        LogisticsOrderResult self = new LogisticsOrderResult();
        return TeaModel.build(map, self);
    }

    public LogisticsOrderResult setDataProvider(String dataProvider) {
        this.dataProvider = dataProvider;
        return this;
    }
    public String getDataProvider() {
        return this.dataProvider;
    }

    public LogisticsOrderResult setDataProviderTitle(String dataProviderTitle) {
        this.dataProviderTitle = dataProviderTitle;
        return this;
    }
    public String getDataProviderTitle() {
        return this.dataProviderTitle;
    }

    public LogisticsOrderResult setGoods(java.util.List<Good> goods) {
        this.goods = goods;
        return this;
    }
    public java.util.List<Good> getGoods() {
        return this.goods;
    }

    public LogisticsOrderResult setLogisticsCompanyCode(String logisticsCompanyCode) {
        this.logisticsCompanyCode = logisticsCompanyCode;
        return this;
    }
    public String getLogisticsCompanyCode() {
        return this.logisticsCompanyCode;
    }

    public LogisticsOrderResult setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName;
        return this;
    }
    public String getLogisticsCompanyName() {
        return this.logisticsCompanyName;
    }

    public LogisticsOrderResult setLogisticsDetailList(java.util.List<LogisticsDetail> logisticsDetailList) {
        this.logisticsDetailList = logisticsDetailList;
        return this;
    }
    public java.util.List<LogisticsDetail> getLogisticsDetailList() {
        return this.logisticsDetailList;
    }

    public LogisticsOrderResult setMailNo(String mailNo) {
        this.mailNo = mailNo;
        return this;
    }
    public String getMailNo() {
        return this.mailNo;
    }

}
