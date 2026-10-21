// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRuleCapacitiesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * This parameter is required in practice. If you do not specify this parameter or pass an empty string, the API returns a 400 error (The specified Lang can not be empty.).</li>
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
     * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The normalization rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nr-z0b2ssjteut85uoh9nzp</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <p>The list of normalization rule IDs.</p>
     */
    @NameInMap("NormalizationRuleIds")
    public java.util.List<String> normalizationRuleIds;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to the view of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListNormalizationRuleCapacitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationRuleCapacitiesRequest self = new ListNormalizationRuleCapacitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListNormalizationRuleCapacitiesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListNormalizationRuleCapacitiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationRuleCapacitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationRuleCapacitiesRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public ListNormalizationRuleCapacitiesRequest setNormalizationRuleIds(java.util.List<String> normalizationRuleIds) {
        this.normalizationRuleIds = normalizationRuleIds;
        return this;
    }
    public java.util.List<String> getNormalizationRuleIds() {
        return this.normalizationRuleIds;
    }

    public ListNormalizationRuleCapacitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNormalizationRuleCapacitiesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
