// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListTagsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The maximum number of results to return when using NextToken-based pagination. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If a next query is available, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: the asset is in the Chinese mainland.</li>
     * <li>ap-southeast-1: the asset is outside China.</li>
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
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The target relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;incident_uuid&quot;:&quot;3fce2d3b65fc2bd05cac6d******&quot;}</p>
     */
    @NameInMap("TargetRelation")
    public String targetRelation;

    /**
     * <p>The scan object type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: snapshot </li>
     * <li><strong>2</strong>: image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AliUId</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The UUID of the target asset.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3-****</p>
     */
    @NameInMap("TargetUuid")
    public String targetUuid;

    public static ListTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsRequest self = new ListTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTagsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListTagsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListTagsRequest setTargetRelation(String targetRelation) {
        this.targetRelation = targetRelation;
        return this;
    }
    public String getTargetRelation() {
        return this.targetRelation;
    }

    public ListTagsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public ListTagsRequest setTargetUuid(String targetUuid) {
        this.targetUuid = targetUuid;
        return this;
    }
    public String getTargetUuid() {
        return this.targetUuid;
    }

}
