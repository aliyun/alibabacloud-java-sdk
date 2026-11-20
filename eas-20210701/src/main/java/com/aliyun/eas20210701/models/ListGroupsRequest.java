// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGroupsRequest extends TeaModel {
    /**
     * <p>The name filter. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The custom labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:null}</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The current page number of the service group list. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The Settings for the number of service groups to return on each page during paging in a paged query. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The traffic distribution mode filter.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("TrafficMode")
    public String trafficMode;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsRequest self = new ListGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListGroupsRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public ListGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListGroupsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListGroupsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListGroupsRequest setTrafficMode(String trafficMode) {
        this.trafficMode = trafficMode;
        return this;
    }
    public String getTrafficMode() {
        return this.trafficMode;
    }

    public ListGroupsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
