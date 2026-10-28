// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCommissionableProductsRequest extends TeaModel {
    /**
     * <p>The commodity codes. Separate multiple codes with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;oceanbase_obpre_public_intl,savingplan_common_public_intl&quot;</p>
     */
    @NameInMap("CommodityCodeList")
    public String commodityCodeList;

    /**
     * <p>The fiscal year. If this parameter is left empty, the current fiscal year is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>“FY26”</p>
     */
    @NameInMap("FiscalYear")
    public String fiscalYear;

    /**
     * <p>The list of display statuses for commission-eligible commodities.</p>
     */
    @NameInMap("ListShowStatusList")
    public java.util.List<String> listShowStatusList;

    /**
     * <p>The current page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product codes. Separate multiple codes with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;oceanbase&quot;</p>
     */
    @NameInMap("PipCodeList")
    public String pipCodeList;

    /**
     * <p>The actual end month in the yyyymm format.</p>
     * 
     * <strong>example:</strong>
     * <p>“202509”</p>
     */
    @NameInMap("RealEndMonth")
    public String realEndMonth;

    /**
     * <p>The actual start month in the yyyymm format.</p>
     * 
     * <strong>example:</strong>
     * <p>“202502”</p>
     */
    @NameInMap("RealStartMonth")
    public String realStartMonth;

    public static GetCommissionableProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommissionableProductsRequest self = new GetCommissionableProductsRequest();
        return TeaModel.build(map, self);
    }

    public GetCommissionableProductsRequest setCommodityCodeList(String commodityCodeList) {
        this.commodityCodeList = commodityCodeList;
        return this;
    }
    public String getCommodityCodeList() {
        return this.commodityCodeList;
    }

    public GetCommissionableProductsRequest setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }
    public String getFiscalYear() {
        return this.fiscalYear;
    }

    public GetCommissionableProductsRequest setListShowStatusList(java.util.List<String> listShowStatusList) {
        this.listShowStatusList = listShowStatusList;
        return this;
    }
    public java.util.List<String> getListShowStatusList() {
        return this.listShowStatusList;
    }

    public GetCommissionableProductsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCommissionableProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCommissionableProductsRequest setPipCodeList(String pipCodeList) {
        this.pipCodeList = pipCodeList;
        return this;
    }
    public String getPipCodeList() {
        return this.pipCodeList;
    }

    public GetCommissionableProductsRequest setRealEndMonth(String realEndMonth) {
        this.realEndMonth = realEndMonth;
        return this;
    }
    public String getRealEndMonth() {
        return this.realEndMonth;
    }

    public GetCommissionableProductsRequest setRealStartMonth(String realStartMonth) {
        this.realStartMonth = realStartMonth;
        return this;
    }
    public String getRealStartMonth() {
        return this.realStartMonth;
    }

}
