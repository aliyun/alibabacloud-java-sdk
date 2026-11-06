// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListImageCachesRequest extends TeaModel {
    /**
     * <p>The ID of the source ACR Enterprise instance. The match must be exact. An empty string (a string with no characters) is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-example</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The image digest.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
     */
    @NameInMap("digest")
    public String digest;

    /**
     * <p>Performs a case-insensitive literal substring search on the full source image reference in the format of registry/repository:tag. The repository already includes the namespace. If the value is empty after trimming leading and trailing whitespace, it is treated as not provided. Percent signs, underscores, and backslashes are treated as literal characters.</p>
     * 
     * <strong>example:</strong>
     * <p>team/app</p>
     */
    @NameInMap("imageRefContains")
    public String imageRefContains;

    /**
     * <p>The maximum number of results to return. Default value: 20. If you explicitly specify this parameter, the value must be an integer from 1 to 100. Otherwise, an InvalidMaxResults error is returned. When you paginate, this value must remain the same as the previous page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The source namespace. The match is case-sensitive and must be exact. An empty string is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>team</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The pagination token. Omit this parameter for the first request. For subsequent requests, pass the nextToken value returned in the previous response as is. When you paginate, you must keep the filter conditions and maxResults unchanged. If you change any of these parameters, you must query the first page again.</p>
     * 
     * <strong>example:</strong>
     * <p>opaque-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The region ID. The region ID must be passed as a query parameter and must match the selected region endpoint and the workspace region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The domain name of the source registry. The match is case-insensitive and must be exact. Do not include the protocol, path, or tag. Public network and VPC domain names are not considered equal. An empty string is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>example-registry.cn-hangzhou.cr.aliyuncs.com</p>
     */
    @NameInMap("registry")
    public String registry;

    /**
     * <p>The repository name under the namespace. The match is case-sensitive and must be exact. Do not include the namespace. If you specify this parameter, you must also specify the namespace. An empty string is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("repository")
    public String repository;

    /**
     * <p>The cache status used to filter the results. To query all caches, omit this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The source image tag. The match is case-sensitive and must be exact. The latest tag is not inferred. An empty string is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("tag")
    public String tag;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-example</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListImageCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageCachesRequest self = new ListImageCachesRequest();
        return TeaModel.build(map, self);
    }

    public ListImageCachesRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public ListImageCachesRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public ListImageCachesRequest setImageRefContains(String imageRefContains) {
        this.imageRefContains = imageRefContains;
        return this;
    }
    public String getImageRefContains() {
        return this.imageRefContains;
    }

    public ListImageCachesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImageCachesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListImageCachesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImageCachesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImageCachesRequest setRegistry(String registry) {
        this.registry = registry;
        return this;
    }
    public String getRegistry() {
        return this.registry;
    }

    public ListImageCachesRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public ListImageCachesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListImageCachesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListImageCachesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
