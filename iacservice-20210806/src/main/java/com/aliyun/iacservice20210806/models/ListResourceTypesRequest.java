// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese.</li>
     * <li>en-US: English.</li>
     * </ul>
     * <p>Default value: zh-CN.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The keyword for searching resource codes or names. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries per page. Valid values: 0 to 200. Default value: 100.</p>
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
     * <p>tokenForNextPage</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The product code. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("product")
    public String product;

    /**
     * <p>The order in which resource types are returned. Valid values:</p>
     * <ul>
     * <li>Normal (default): returned in normal order.</li>
     * <li>Top: returned in order of popularity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("sort")
    public String sort;

    /**
     * <p>The status filter list. Valid values:</p>
     * <ul>
     * <li>Available</li>
     * <li>Deprecated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available,Deprecated</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The product subcategory in Terraform.</p>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("subcategory")
    public String subcategory;

    /**
     * <p>Specifies whether Terraformer is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("supportTerraformer")
    public Boolean supportTerraformer;

    /**
     * <p>The Terraform provider version. If this parameter is left empty, the latest version is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1.227.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <p>The Terraform resources.</p>
     */
    @NameInMap("terraformResourceTypes")
    public java.util.List<String> terraformResourceTypes;

    public static ListResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesRequest self = new ListResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListResourceTypesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceTypesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceTypesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceTypesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListResourceTypesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListResourceTypesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListResourceTypesRequest setSubcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }
    public String getSubcategory() {
        return this.subcategory;
    }

    public ListResourceTypesRequest setSupportTerraformer(Boolean supportTerraformer) {
        this.supportTerraformer = supportTerraformer;
        return this;
    }
    public Boolean getSupportTerraformer() {
        return this.supportTerraformer;
    }

    public ListResourceTypesRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public ListResourceTypesRequest setTerraformResourceTypes(java.util.List<String> terraformResourceTypes) {
        this.terraformResourceTypes = terraformResourceTypes;
        return this;
    }
    public java.util.List<String> getTerraformResourceTypes() {
        return this.terraformResourceTypes;
    }

}
