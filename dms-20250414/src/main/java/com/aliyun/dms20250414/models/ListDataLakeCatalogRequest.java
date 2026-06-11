// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakeCatalogRequest extends TeaModel {
    /**
     * <p>The keyword used to search for data catalog names.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The tenant ID. Call the GetUserActiveTenant or ListUserTenants operation to get the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>3****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListDataLakeCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeCatalogRequest self = new ListDataLakeCatalogRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLakeCatalogRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListDataLakeCatalogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDataLakeCatalogRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
