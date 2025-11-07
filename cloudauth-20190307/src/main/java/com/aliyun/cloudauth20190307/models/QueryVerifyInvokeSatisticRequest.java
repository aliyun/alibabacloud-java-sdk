// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyInvokeSatisticRequest extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>End date of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1761926399999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>List of product codes to query. Please refer to the productCode under the corresponding ProductType.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductProgramList")
    public String productProgramList;

    /**
     * <p>Product type:</p>
     * <ul>
     * <li><strong>FINANCE_VERIFY</strong>: Financial-grade real-person verification</li>
     * <li><strong>SMART_VERIFY</strong>: Enhanced real-person verification (discontinued)</li>
     * <li><strong>FACE_VERIFY</strong>: Real-person verification (discontinued)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FINANCE_VERIFY</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>List of application scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("SceneIdList")
    public String sceneIdList;

    /**
     * <p>Start date of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1743436800000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>Statistics dimension:</p>
     * <ul>
     * <li><strong>day</strong>: daily</li>
     * <li><strong>month</strong>: monthly</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("StatisticsType")
    public String statisticsType;

    public static QueryVerifyInvokeSatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyInvokeSatisticRequest self = new QueryVerifyInvokeSatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryVerifyInvokeSatisticRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryVerifyInvokeSatisticRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryVerifyInvokeSatisticRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryVerifyInvokeSatisticRequest setProductProgramList(String productProgramList) {
        this.productProgramList = productProgramList;
        return this;
    }
    public String getProductProgramList() {
        return this.productProgramList;
    }

    public QueryVerifyInvokeSatisticRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryVerifyInvokeSatisticRequest setSceneIdList(String sceneIdList) {
        this.sceneIdList = sceneIdList;
        return this;
    }
    public String getSceneIdList() {
        return this.sceneIdList;
    }

    public QueryVerifyInvokeSatisticRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public QueryVerifyInvokeSatisticRequest setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }
    public String getStatisticsType() {
        return this.statisticsType;
    }

}
