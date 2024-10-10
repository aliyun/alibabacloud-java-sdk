// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ver-1005682639679266816</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <strong>example:</strong>
     * <p>Appid</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    public static ListEdgeContainerAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppsRequest self = new ListEdgeContainerAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppsRequest setOrderKey(String orderKey) {
        this.orderKey = orderKey;
        return this;
    }
    public String getOrderKey() {
        return this.orderKey;
    }

    public ListEdgeContainerAppsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListEdgeContainerAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeContainerAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeContainerAppsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListEdgeContainerAppsRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

}
