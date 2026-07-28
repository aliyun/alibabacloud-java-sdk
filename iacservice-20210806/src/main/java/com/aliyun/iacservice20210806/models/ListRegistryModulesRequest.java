// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryModulesRequest extends TeaModel {
    /**
     * <p>The search keyword. Fuzzy search by module name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>NamespaceName</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>NFzbQCa7/yd7rAuSo5xZb54dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("status")
    public String status;

    /**
     * <p>The workspace type. Valid values:</p>
     * <ul>
     * <li><p>system: public module</p>
     * </li>
     * <li><p>self: custom module</p>
     * </li>
     * <li><p>shared: shared module</p>
     * </li>
     * <li><p>community: community module</p>
     * </li>
     * </ul>
     * <p>By default, all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("type")
    public String type;

    public static ListRegistryModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryModulesRequest self = new ListRegistryModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRegistryModulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListRegistryModulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegistryModulesRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public ListRegistryModulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRegistryModulesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListRegistryModulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
