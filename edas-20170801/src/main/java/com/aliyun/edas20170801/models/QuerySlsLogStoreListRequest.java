// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QuerySlsLogStoreListRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af58edcf-f7eb-<strong><strong>-</strong></strong>-db4e425f****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Simple Log Service collection type. Valid values:</p>
     * <ul>
     * <li>file: File.</li>
     * <li>stdout: Standard output.</li>
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
