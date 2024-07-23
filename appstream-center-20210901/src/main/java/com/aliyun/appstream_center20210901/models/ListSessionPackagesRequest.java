// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListSessionPackagesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>p-xxxxxxxxxxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>tp-xxxxxxxx</p>
     */
    @NameInMap("SessionPackageId")
    public String sessionPackageId;

    @NameInMap("SessionPackageName")
    public String sessionPackageName;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortType")
    public String sortType;

    @NameInMap("StateList")
    public java.util.List<Integer> stateList;

    public static ListSessionPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSessionPackagesRequest self = new ListSessionPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListSessionPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSessionPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSessionPackagesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListSessionPackagesRequest setSessionPackageId(String sessionPackageId) {
        this.sessionPackageId = sessionPackageId;
        return this;
    }
    public String getSessionPackageId() {
        return this.sessionPackageId;
    }

    public ListSessionPackagesRequest setSessionPackageName(String sessionPackageName) {
        this.sessionPackageName = sessionPackageName;
        return this;
    }
    public String getSessionPackageName() {
        return this.sessionPackageName;
    }

    public ListSessionPackagesRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListSessionPackagesRequest setStateList(java.util.List<Integer> stateList) {
        this.stateList = stateList;
        return this;
    }
    public java.util.List<Integer> getStateList() {
        return this.stateList;
    }

}
