// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QuerySlsLogStoreListRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af58edcf-f7eb-<strong><strong>-</strong></strong>-db4e425f****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of the page to return. Pages start from Page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of data that is collected by Log Service. Valid values:</p>
     * <ul>
     * <li>file: the file type</li>
     * <li>stdout: the standard output type</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    public static QuerySlsLogStoreListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsLogStoreListRequest self = new QuerySlsLogStoreListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlsLogStoreListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QuerySlsLogStoreListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QuerySlsLogStoreListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySlsLogStoreListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
