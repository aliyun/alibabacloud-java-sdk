// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDiscountRequest extends TeaModel {
    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The cycle based on which queries are performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1:Year</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <p>The identifier of the language.</p>
     * 
     * <strong>example:</strong>
     * <p>ZH</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>The code of the pricing module.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_type</p>
     */
    @NameInMap("ModuleCode")
    public String moduleCode;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The payment mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>total</p>
     */
    @NameInMap("PayMode")
    public String payMode;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The type of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The type of the savings plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>universal</p>
     */
    @NameInMap("SpnType")
    public String spnType;

    public static QuerySavingsPlansDiscountRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDiscountRequest self = new QuerySavingsPlansDiscountRequest();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDiscountRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QuerySavingsPlansDiscountRequest setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public QuerySavingsPlansDiscountRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public QuerySavingsPlansDiscountRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

    public QuerySavingsPlansDiscountRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QuerySavingsPlansDiscountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySavingsPlansDiscountRequest setPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }
    public String getPayMode() {
        return this.payMode;
    }

    public QuerySavingsPlansDiscountRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QuerySavingsPlansDiscountRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public QuerySavingsPlansDiscountRequest setSpnType(String spnType) {
        this.spnType = spnType;
        return this;
    }
    public String getSpnType() {
        return this.spnType;
    }

}
