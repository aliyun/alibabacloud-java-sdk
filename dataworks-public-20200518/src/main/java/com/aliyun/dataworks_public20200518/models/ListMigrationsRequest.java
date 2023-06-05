// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMigrationsRequest extends TeaModel {
    /**
     * <p>The ID of the owner.</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the migration task. Valid values: IMPORT and EXPORT.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListMigrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationsRequest self = new ListMigrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListMigrationsRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public ListMigrationsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListMigrationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMigrationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMigrationsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
