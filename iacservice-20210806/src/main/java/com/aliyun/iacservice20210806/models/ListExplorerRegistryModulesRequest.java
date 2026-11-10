// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModulesRequest extends TeaModel {
    /**
     * <p>The search keyword for the module name. A fuzzy match is performed based on <code>moduleName</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 0 to 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The name of the module.</p>
     * <p>Note: The module name may differ from the product name or resource name.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <p>The token used to query the next page of results.</p>
     * <p>If the total number of entries exceeds the value of <code>maxResults</code>, the returned data is truncated. You can use <code>nextToken</code> to query the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>DxEkv+3w0EDAQgcRFBp8Ep4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The sorting method for the returned results. Valid values:</p>
     * <ul>
     * <li>Normal: returns results in default order. This is the default value.</li>
     * <li>Top: returns results sorted by popularity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("sort")
    public String sort;

    public static ListExplorerRegistryModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModulesRequest self = new ListExplorerRegistryModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListExplorerRegistryModulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExplorerRegistryModulesRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListExplorerRegistryModulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExplorerRegistryModulesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
