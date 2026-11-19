// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsOrderResult extends TeaModel {
    /**
     * <p>The data source.</p>
     * 
     * <strong>example:</strong>
     * <p>Cainiao</p>
     */
    @NameInMap("dataProvider")
    public String dataProvider;

    /**
     * <p>The data text.</p>
     * 
     * <strong>example:</strong>
     * <p>Cainiao Guoguo</p>
     */
    @NameInMap("dataProviderTitle")
    public String dataProviderTitle;

    /**
     * <p>The product details.</p>
     */
    @NameInMap("goods")
    public java.util.List<Good> goods;

    /**
     * <p>The logistics company code.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>ZTKY: China Railway Logistics</li>
     * <li>POST: China Post</li>
     * <li>DBKD: Deppon Express</li>
     * <li>JT: J&amp;T Express</li>
     * <li>QFKD: Quanfeng Express</li>
     * <li>EYB: China Post E-commerce Express EYB</li>
     * <li>STO: STO Express</li>
     * <li>SF: SF Express</li>
     * <li>ZTO: ZTO Express</li>
     * <li>YTO: YTO Express</li>
     * <li>TTKDEX: Tiantian Express</li>
     * <li>JDLEx: JD Express</li>
     * <li>ETICKET: Electronic vouchers</li>
     * <li>HTKY: Best Express</li>
     * <li>SHQ: Huaqiang Logistics</li>
     * <li>TAOBAO: Taobao Logistics</li>
     * <li>YUNDA: Yunda Express</li>
     * <li>ZJS: ZJS Express</li>
     * <li>FEDEX: FedEx</li>
     * <li>EMS: EMS</li>
     * <li>POSTB: China Post Parcel</li>
     * <li>OTHER: Other</li>
     * <li>CNDJWL: Cainiao Large Item Logistics</li>
     * <li>TN: Teneng</li>
     * <li>ZMKM: Cainiao Express</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SF</p>
     */
    @NameInMap("logisticsCompanyCode")
    public String logisticsCompanyCode;

    /**
     * <p>The logistics company name.</p>
     * 
     * <strong>example:</strong>
     * <p>SF Express</p>
     */
    @NameInMap("logisticsCompanyName")
    public String logisticsCompanyName;

    /**
     * <p>The logistics details.</p>
     */
    @NameInMap("logisticsDetailList")
    public java.util.List<LogisticsDetail> logisticsDetailList;

    /**
     * <p>The logistics tracking number.</p>
     * <blockquote>
     * <p>The logistics tracking number for electronic vouchers is a fixed value: *.</p>
     * </blockquote>
     * 
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
