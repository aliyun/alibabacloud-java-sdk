// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindCustomizedFiltersRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Name")
    public String name;

    @NameInMap("VersionType")
    public String versionType;

    public static FindCustomizedFiltersRequest build(java.util.Map<String, ?> map) throws Exception {
        FindCustomizedFiltersRequest self = new FindCustomizedFiltersRequest();
        return TeaModel.build(map, self);
    }

    public FindCustomizedFiltersRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindCustomizedFiltersRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public FindCustomizedFiltersRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindCustomizedFiltersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindCustomizedFiltersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FindCustomizedFiltersRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
