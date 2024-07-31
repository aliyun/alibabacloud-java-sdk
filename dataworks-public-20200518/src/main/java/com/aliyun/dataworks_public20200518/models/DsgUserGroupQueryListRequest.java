// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupQueryListRequest extends TeaModel {
    /**
     * <p>The keyword of the user group name. A fuzzy match is performed based on the keyword to search for the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>yun_group</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner of the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the compute engine. If you want to query the information about a MaxCompute user group, you need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static DsgUserGroupQueryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupQueryListRequest self = new DsgUserGroupQueryListRequest();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupQueryListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DsgUserGroupQueryListRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DsgUserGroupQueryListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DsgUserGroupQueryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DsgUserGroupQueryListRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
