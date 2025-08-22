// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>tokenForNextPage</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("product")
    public String product;

    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("sort")
    public String sort;

    /**
     * <strong>example:</strong>
     * <p>Available,Deprecated</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("subcategory")
    public String subcategory;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("supportTerraformer")
    public Boolean supportTerraformer;

    /**
     * <strong>example:</strong>
     * <p>1.227.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

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
