// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListTicketTemplatesRequest extends TeaModel {
    /**
     * <p>The ID of the ticket category.</p>
     * 
     * <strong>example:</strong>
     * <p>43c2671b-********86d0-6bd187905cc8</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value must be between 1 and 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The value must be between 1 and 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the template. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>模板1</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <p>The status of the template.</p>
     * <ul>
     * <li><p>Enabled: The template is published.</p>
     * </li>
     * <li><p>Disabled: The template is unpublished.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("State")
    public String state;

    public static ListTicketTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketTemplatesRequest self = new ListTicketTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketTemplatesRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ListTicketTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTicketTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTicketTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTicketTemplatesRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListTicketTemplatesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
