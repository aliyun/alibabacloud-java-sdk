// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFunctionsRequest extends TeaModel {
    /**
     * <p>The filter condition: the UDF function name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The filter condition: the ID of the UDF function owner.</p>
     * 
     * <strong>example:</strong>
     * <p>110755000425XXXX</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Default value: 1. Minimum value: 1.</p>
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
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Storage Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API call operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The filter condition: the function type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Math: mathematical operation function</li>
     * <li>Aggregate: aggregate functions</li>
     * <li>String: character string processing function</li>
     * <li>Date: date function</li>
     * <li>Analytic: window function</li>
     * <li>Other: other function</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Math</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsRequest self = new ListFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFunctionsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListFunctionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFunctionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunctionsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListFunctionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
