// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationSchemasRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return in this request.</p>
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
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the normalization rule category.</p>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_CATEGORY</p>
     */
    @NameInMap("NormalizationCategoryId")
    public String normalizationCategoryId;

    /**
     * <p>The field source filter. Valid values: normalized / native.</p>
     * 
     * <strong>example:</strong>
     * <p>normalized</p>
     */
    @NameInMap("NormalizationFieldSource")
    public String normalizationFieldSource;

    /**
     * <p>The normalization schema type. Valid values:</p>
     * <ul>
     * <li>log: log.</li>
     * <li>entity: entity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>entity</p>
     */
    @NameInMap("NormalizationSchemaType")
    public String normalizationSchemaType;

    /**
     * <p>The security domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_AND_WEB_SECURITY</p>
     */
    @NameInMap("NormalizationSecurityDomainId")
    public String normalizationSecurityDomainId;

    /**
     * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: the asset is in the Chinese mainland.</li>
     * <li>ap-southeast-1: the asset is outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator switches to when viewing as another member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListNormalizationSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationSchemasRequest self = new ListNormalizationSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListNormalizationSchemasRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListNormalizationSchemasRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationSchemasRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationSchemasRequest setNormalizationCategoryId(String normalizationCategoryId) {
        this.normalizationCategoryId = normalizationCategoryId;
        return this;
    }
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    public ListNormalizationSchemasRequest setNormalizationFieldSource(String normalizationFieldSource) {
        this.normalizationFieldSource = normalizationFieldSource;
        return this;
    }
    public String getNormalizationFieldSource() {
        return this.normalizationFieldSource;
    }

    public ListNormalizationSchemasRequest setNormalizationSchemaType(String normalizationSchemaType) {
        this.normalizationSchemaType = normalizationSchemaType;
        return this;
    }
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    public ListNormalizationSchemasRequest setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
        this.normalizationSecurityDomainId = normalizationSecurityDomainId;
        return this;
    }
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
    }

    public ListNormalizationSchemasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNormalizationSchemasRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
