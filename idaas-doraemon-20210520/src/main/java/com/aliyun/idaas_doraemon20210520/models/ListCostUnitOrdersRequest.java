// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListCostUnitOrdersRequest extends TeaModel {
    // 开始创建时间
    @NameInMap("BeginDate")
    public String beginDate;

    // 结束创建时间
    @NameInMap("FinalDate")
    public String finalDate;

    // 第几页
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListCostUnitOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCostUnitOrdersRequest self = new ListCostUnitOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListCostUnitOrdersRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public ListCostUnitOrdersRequest setFinalDate(String finalDate) {
        this.finalDate = finalDate;
        return this;
    }
    public String getFinalDate() {
        return this.finalDate;
    }

    public ListCostUnitOrdersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCostUnitOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
