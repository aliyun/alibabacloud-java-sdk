// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20200710.models;

import com.aliyun.tea.*;

public class GetDeployDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30GRJUY95TMYWBYJ</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public Long nextToken;

    /**
     * <strong>example:</strong>
     * <p>1713597738</p>
     */
    @NameInMap("RefId")
    public String refId;

    /**
     * <strong>example:</strong>
     * <p>rg-aekz44tg3bnpyba</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxxxxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>rgm-ecs</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetDeployDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeployDetailRequest self = new GetDeployDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDeployDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetDeployDetailRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetDeployDetailRequest setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public GetDeployDetailRequest setRefId(String refId) {
        this.refId = refId;
        return this;
    }
    public String getRefId() {
        return this.refId;
    }

    public GetDeployDetailRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetDeployDetailRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetDeployDetailRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetDeployDetailRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
