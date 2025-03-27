// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCertificatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1107550004253538</p>
     */
    @NameInMap("CreateUser")
    public String createUser;

    /**
     * <strong>example:</strong>
     * <p>1593877765000</p>
     */
    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    /**
     * <strong>example:</strong>
     * <p>xm_create_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>1730217600000</p>
     */
    @NameInMap("StartCreateTime")
    public Long startCreateTime;

    public static ListCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesRequest self = new ListCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCertificatesRequest setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public ListCertificatesRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public ListCertificatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCertificatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCertificatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCertificatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCertificatesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCertificatesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListCertificatesRequest setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }
    public Long getStartCreateTime() {
        return this.startCreateTime;
    }

}
