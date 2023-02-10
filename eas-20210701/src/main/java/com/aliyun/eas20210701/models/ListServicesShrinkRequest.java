// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServicesShrinkRequest extends TeaModel {
    /**
     * <p>关键字搜索。</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>所属的group。</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Label")
    public String labelShrink;

    /**
     * <p>排序顺序，支持升序或将序。</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>页号。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>每页大小。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Band类型服务主服务的UID</p>
     */
    @NameInMap("ParentServiceUid")
    public String parentServiceUid;

    /**
     * <p>服务的类型，例如Async, OfflineTask和Standard等</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>排序字段。</p>
     */
    @NameInMap("Sort")
    public String sort;

    public static ListServicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesShrinkRequest self = new ListServicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServicesShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListServicesShrinkRequest setLabelShrink(String labelShrink) {
        this.labelShrink = labelShrink;
        return this;
    }
    public String getLabelShrink() {
        return this.labelShrink;
    }

    public ListServicesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServicesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesShrinkRequest setParentServiceUid(String parentServiceUid) {
        this.parentServiceUid = parentServiceUid;
        return this;
    }
    public String getParentServiceUid() {
        return this.parentServiceUid;
    }

    public ListServicesShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListServicesShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
