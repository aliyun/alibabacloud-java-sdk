// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsOrderResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>菜鸟</p>
     */
    @NameInMap("dataProvider")
    public String dataProvider;

    /**
     * <strong>example:</strong>
     * <p>菜鸟裹裹</p>
     */
    @NameInMap("dataProviderTitle")
    public String dataProviderTitle;

    @NameInMap("goods")
    public java.util.List<Good> goods;

    /**
     * <strong>example:</strong>
     * <p>SF （OTHER-其他 POST-中国邮政 EMS-EMS EYB-EMS快递包裹 POSTB-邮政快递包裹 STO-申通快递 YTO-圆通快递 YUNDA-韵达快递 ZJS-宅急送 FEDEX-联邦快递 DBKD-德邦物流 SHQ-华强物流 TN-特能 TAOBAO-淘宝物流 ZTO-中通快递 HTKY-百世快递 TTKDEX-天天快递 SF-顺丰速运 ZTKY-中铁物流 QFKD-全峰快递 JT-极兔物流）</p>
     */
    @NameInMap("logisticsCompanyCode")
    public String logisticsCompanyCode;

    /**
     * <strong>example:</strong>
     * <p>顺丰</p>
     */
    @NameInMap("logisticsCompanyName")
    public String logisticsCompanyName;

    @NameInMap("logisticsDetailList")
    public java.util.List<LogisticsDetail> logisticsDetailList;

    /**
     * <strong>example:</strong>
     * <p>SF234***2345</p>
     */
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
