// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetHistoryAdvicesRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Language")
    public String language;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Product")
    public String product;

    @NameInMap("Reverse")
    public Boolean reverse;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("StartDate")
    public String startDate;

    public static GetHistoryAdvicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryAdvicesRequest self = new GetHistoryAdvicesRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoryAdvicesRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetHistoryAdvicesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetHistoryAdvicesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetHistoryAdvicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetHistoryAdvicesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetHistoryAdvicesRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetHistoryAdvicesRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public GetHistoryAdvicesRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
