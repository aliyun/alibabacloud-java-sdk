// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    /**
     * <p>The keyword for searching products. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of results per page. Valid values: 0 to 200. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0b2tlbiI6IjEwMjM0NTY3ODkwIn0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>Normal: default sorting (default value)</li>
     * <li>Top: sorted by popularity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("sort")
    public String sort;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>Available</li>
     * <li>Deprecated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Specifies whether Terraformer is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("supportTerraformer")
    public Boolean supportTerraformer;

    /**
     * <p>The Terraform Provider version. If this parameter is left empty, the latest version is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1.227.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListProductsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListProductsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListProductsRequest setSupportTerraformer(Boolean supportTerraformer) {
        this.supportTerraformer = supportTerraformer;
        return this;
    }
    public Boolean getSupportTerraformer() {
        return this.supportTerraformer;
    }

    public ListProductsRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

}
