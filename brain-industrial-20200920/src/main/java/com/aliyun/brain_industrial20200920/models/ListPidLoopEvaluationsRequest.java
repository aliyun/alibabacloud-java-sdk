// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidLoopEvaluationsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderByProperty")
    public String orderByProperty;

    @NameInMap("PidLoopName")
    public String pidLoopName;

    @NameInMap("Grade")
    public String grade;

    @NameInMap("Date")
    public String date;

    public static ListPidLoopEvaluationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPidLoopEvaluationsRequest self = new ListPidLoopEvaluationsRequest();
        return TeaModel.build(map, self);
    }

    public ListPidLoopEvaluationsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPidLoopEvaluationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPidLoopEvaluationsRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public ListPidLoopEvaluationsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListPidLoopEvaluationsRequest setOrderByProperty(String orderByProperty) {
        this.orderByProperty = orderByProperty;
        return this;
    }
    public String getOrderByProperty() {
        return this.orderByProperty;
    }

    public ListPidLoopEvaluationsRequest setPidLoopName(String pidLoopName) {
        this.pidLoopName = pidLoopName;
        return this;
    }
    public String getPidLoopName() {
        return this.pidLoopName;
    }

    public ListPidLoopEvaluationsRequest setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public ListPidLoopEvaluationsRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
