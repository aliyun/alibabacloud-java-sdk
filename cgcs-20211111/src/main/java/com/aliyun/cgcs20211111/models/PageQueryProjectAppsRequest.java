// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryProjectAppsRequest extends TeaModel {
    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // 当前页码，默认1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页项数，默认20,最大100
    @NameInMap("PageSize")
    public Integer pageSize;

    // projectId
    @NameInMap("ProjectId")
    public String projectId;

    public static PageQueryProjectAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryProjectAppsRequest self = new PageQueryProjectAppsRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryProjectAppsRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public PageQueryProjectAppsRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public PageQueryProjectAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PageQueryProjectAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQueryProjectAppsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
