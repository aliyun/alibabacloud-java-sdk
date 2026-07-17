// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppsRequest extends TeaModel {
    /**
     * <p>The field used for sorting. If this parameter is not specified, no sorting is applied. Valid values:</p>
     * <ul>
     * <li><strong>Name</strong>: the version name.</li>
     * <li><strong>CreateTime</strong>: the version creation time.</li>
     * <li><strong>ModifyTime</strong>: the version modification time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The sort order. If this parameter is not specified, no sorting is applied. Valid values:</p>
     * <ul>
     * <li><p><strong>Asc</strong>: ascending order.</p>
     * </li>
     * <li><p><strong>Desc</strong>: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The page number. Default value: <strong>1</strong>. Valid values: <strong>1 to 65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>. Valid values: <strong>1 to 500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>ver-1005682639679266816</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The type of fuzzy match. Valid values:</p>
     * <ul>
     * <li><strong>AppId</strong>: the application ID.</li>
     * <li><strong>Name</strong>: the application name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AppId</p>
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
