// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationCategoriesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Set this parameter to the NextToken value returned in the previous API call to retrieve the next page of results. You do not need to specify this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the normalization rule category. Valid values:</p>
     * <ul>
     * <li><p>log</p>
     * </li>
     * <li><p>entity</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>entity</p>
     */
    @NameInMap("NormalizationCategoryType")
    public String normalizationCategoryType;

    /**
     * <p>The region of the Data Management center for threat analysis. Select the region for the Data Management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. An administrator can use this parameter to switch to the perspective of this member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListNormalizationCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationCategoriesRequest self = new ListNormalizationCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListNormalizationCategoriesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListNormalizationCategoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationCategoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationCategoriesRequest setNormalizationCategoryType(String normalizationCategoryType) {
        this.normalizationCategoryType = normalizationCategoryType;
        return this;
    }
    public String getNormalizationCategoryType() {
        return this.normalizationCategoryType;
    }

    public ListNormalizationCategoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNormalizationCategoriesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
