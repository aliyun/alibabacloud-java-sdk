// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodeDependenciesRequest extends TeaModel {
    /**
     * <p>The ID of the node.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The data type of this parameter is Long in SDKs earlier than V8.0.0, and is String in SDKs of V8.0.0 and later versions. <strong>The change does not affect the normal use of the SDKs. The parameter is still returned as the type defined in the SDKs.</strong> When you upgrade an SDK to a version later than V8.0.0, a compilation error may occur due to the type change. In this case, you must manually change the data type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The number of the page to return. The value of this parameter must be a positive integer. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can go to the Workspace Management page in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> to obtain the workspace ID.</p>
     * <p>This parameter is used to specify the DataWorks workspace for the API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListNodeDependenciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDependenciesRequest self = new ListNodeDependenciesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeDependenciesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListNodeDependenciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeDependenciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeDependenciesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
