// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCommissionableProductsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;oceanbase_obpre_public_intl,savingplan_common_public_intl&quot;</p>
     */
    @NameInMap("CommodityCodeList")
    public String commodityCodeList;

    /**
     * <strong>example:</strong>
     * <p>“FY26”</p>
     */
    @NameInMap("FiscalYear")
    public String fiscalYear;

    @NameInMap("ListShowStatusList")
    public String listShowStatusListShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>&quot;oceanbase&quot;</p>
     */
    @NameInMap("PipCodeList")
    public String pipCodeList;

    /**
     * <strong>example:</strong>
     * <p>“202509”</p>
     */
    @NameInMap("RealEndMonth")
    public String realEndMonth;

    /**
     * <strong>example:</strong>
     * <p>“202502”</p>
     */
    @NameInMap("RealStartMonth")
    public String realStartMonth;

    public static GetCommissionableProductsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommissionableProductsShrinkRequest self = new GetCommissionableProductsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCommissionableProductsShrinkRequest setCommodityCodeList(String commodityCodeList) {
        this.commodityCodeList = commodityCodeList;
        return this;
    }
    public String getCommodityCodeList() {
        return this.commodityCodeList;
    }

    public GetCommissionableProductsShrinkRequest setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }
    public String getFiscalYear() {
        return this.fiscalYear;
    }

    public GetCommissionableProductsShrinkRequest setListShowStatusListShrink(String listShowStatusListShrink) {
        this.listShowStatusListShrink = listShowStatusListShrink;
        return this;
    }
    public String getListShowStatusListShrink() {
        return this.listShowStatusListShrink;
    }

    public GetCommissionableProductsShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCommissionableProductsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCommissionableProductsShrinkRequest setPipCodeList(String pipCodeList) {
        this.pipCodeList = pipCodeList;
        return this;
    }
    public String getPipCodeList() {
        return this.pipCodeList;
    }

    public GetCommissionableProductsShrinkRequest setRealEndMonth(String realEndMonth) {
        this.realEndMonth = realEndMonth;
        return this;
    }
    public String getRealEndMonth() {
        return this.realEndMonth;
    }

    public GetCommissionableProductsShrinkRequest setRealStartMonth(String realStartMonth) {
        this.realStartMonth = realStartMonth;
        return this;
    }
    public String getRealStartMonth() {
        return this.realStartMonth;
    }

}
