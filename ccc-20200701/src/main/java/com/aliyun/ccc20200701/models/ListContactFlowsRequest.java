// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListContactFlowsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The field by which to sort the results. Default value: updatedTime.</p>
     * 
     * <strong>example:</strong>
     * <p>updatedTime</p>
     */
    @NameInMap("OrderByField")
    public String orderByField;

    /**
     * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A keyword to search for in the names or descriptions of IVR flows.</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>ASC</code>: The results are sorted in ascending order.</p>
     * </li>
     * <li><p><code>DESC</code>: The results are sorted in descending order. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>Specifies the type of IVR flow to list. If you omit this parameter, IVR flows of all types are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>MAIN_FLOW</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListContactFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactFlowsRequest self = new ListContactFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListContactFlowsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListContactFlowsRequest setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public ListContactFlowsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListContactFlowsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContactFlowsRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListContactFlowsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListContactFlowsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
