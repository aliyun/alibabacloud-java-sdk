// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppsRequest extends TeaModel {
    /**
     * <p>The sorting field. This parameter is left empty by default. Valid values:</p>
     * <ul>
     * <li>Name: the version name.</li>
     * <li>CreateTime: the time when the version was created.</li>
     * <li>UpdateTime: the time when the version was last modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The order in which you want to sort the query results. This parameter is left empty by default. Valid values:</p>
     * <ul>
     * <li>ASC: in ascending order.</li>
     * <li>DESC: in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The page number. Default value: <strong>1</strong>. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>. Valid values: 1 to 500.</p>
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
     * <p>The search criterion based on which you want to perform fuzzy search. Valid values:</p>
     * <ul>
     * <li>Appid: the application ID.</li>
     * <li>Name: the application name.</li>
     * </ul>
     * 
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
