// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsOrderResult extends TeaModel {
    /**
     * <p>The data provider.</p>
     * 
     * <strong>example:</strong>
     * <p>菜鸟</p>
     */
    @NameInMap("dataProvider")
    public String dataProvider;

    /**
     * <p>The display title of the data provider.</p>
     * 
     * <strong>example:</strong>
     * <p>菜鸟裹裹</p>
     */
    @NameInMap("dataProviderTitle")
    public String dataProviderTitle;

    /**
     * <p>Details of the goods.</p>
     */
    @NameInMap("goods")
    public java.util.List<Good> goods;

    /**
     * <p>The logistics company code.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>ZTKY</code> - China Railway Logistics</p>
     * </li>
     * <li><p><code>POST</code> - China Post</p>
     * </li>
     * <li><p><code>DBKD</code> - Deppon Express</p>
     * </li>
     * <li><p><code>JT</code> - J\&amp;T Express</p>
     * </li>
     * <li><p><code>QFKD</code> - Quanfeng Express</p>
     * </li>
     * <li><p><code>EYB</code> - China Post E-commerce Express</p>
     * </li>
     * <li><p><code>STO</code> - STO Express</p>
     * </li>
     * <li><p><code>SF</code> - SF Express</p>
     * </li>
     * <li><p><code>ZTO</code> - ZTO Express</p>
     * </li>
     * <li><p><code>YTO</code> - YTO Express</p>
     * </li>
     * <li><p><code>TTKDEX</code> - Tiantian Express</p>
     * </li>
     * <li><p><code>JDLEx</code> - JD Express</p>
     * </li>
     * <li><p><code>ETICKET</code> - e-ticket</p>
     * </li>
     * <li><p><code>HTKY</code> - Best Express</p>
     * </li>
     * <li><p><code>SHQ</code> - Huaqiang Logistics</p>
     * </li>
     * <li><p><code>TAOBAO</code> - Taobao Logistics</p>
     * </li>
     * <li><p><code>YUNDA</code> - Yunda Express</p>
     * </li>
     * <li><p><code>ZJS</code> - ZJS Express</p>
     * </li>
     * <li><p><code>FEDEX</code> - FedEx</p>
     * </li>
     * <li><p><code>EMS</code> - EMS</p>
     * </li>
     * <li><p><code>POSTB</code> - China Post Parcel</p>
     * </li>
     * <li><p><code>OTHER</code> - other</p>
     * </li>
     * <li><p><code>CNDJWL</code> - Cainiao Heavy Parcel Logistics</p>
     * </li>
     * <li><p><code>TN</code> - T-neng Logistics</p>
     * </li>
     * <li><p><code>ZMKM</code> - Cainiao Express</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SF</p>
     */
    @NameInMap("logisticsCompanyCode")
    public String logisticsCompanyCode;

    /**
     * <p>The name of the logistics company.</p>
     * 
     * <strong>example:</strong>
     * <p>顺丰</p>
     */
    @NameInMap("logisticsCompanyName")
    public String logisticsCompanyName;

    /**
     * <p>A list of logistics details.</p>
     */
    @NameInMap("logisticsDetailList")
    public java.util.List<LogisticsDetail> logisticsDetailList;

    /**
     * <p>The tracking number.</p>
     * <blockquote>
     * <p>For an e-ticket, the tracking number is a fixed value: \*</p>
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
