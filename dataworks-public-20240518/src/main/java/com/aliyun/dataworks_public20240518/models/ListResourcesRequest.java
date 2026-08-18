// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>The name of the file resource. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the owner, which is the account UID of the workspace administrator. You can log on to the Alibaba Cloud Management Console and view the account UID in the security management section of account management.</p>
     * 
     * <strong>example:</strong>
     * <p>110755000425XXXX</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number of the request, used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The filter condition: resource file type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Python</li>
     * <li>Jar</li>
     * <li>Archive</li>
     * <li>File</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Python</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourcesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListResourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
