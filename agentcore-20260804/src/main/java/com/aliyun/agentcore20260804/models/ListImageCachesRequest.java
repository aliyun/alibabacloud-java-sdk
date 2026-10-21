// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListImageCachesRequest extends TeaModel {
    /**
     * <p>The ID of the source ACR Enterprise instance. The match must be exact. Empty character strings are invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-example</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The complete image digest in the sha256: format followed by a 64-character lowercase hexadecimal string. The format is verified by the console. The match must be exact, and prefixes are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
     */
    @NameInMap("digest")
    public String digest;

    /**
     * <p>Performs a case-insensitive literal substring search on the complete source image reference in the registry/repository:tag format, where the repository already includes the namespace. If the value is empty after trimming leading and trailing whitespace, it is treated as not provided. Percent signs, underscores, and backslashes are treated as literal characters.</p>
     * 
     * <strong>example:</strong>
     * <p>team/app</p>
     */
    @NameInMap("imageRefContains")
    public String imageRefContains;

    /**
     * <p>The maximum number of results to return. If this parameter is not provided or is set to 0, the default value is 20. If the value exceeds 100, it is treated as 100. Negative values return an InvalidMaxResults error. The value can be adjusted for subsequent pages.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The source namespace. The match is case-sensitive and must be exact. Empty strings are invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>team</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Omit this parameter for the first request. For subsequent requests, pass the nextToken value from the previous response exactly as returned. If the filter conditions change, you must query the first page again.</p>
     * 
     * <strong>example:</strong>
     * <p>opaque-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The product entry region, which is determined by the selected region endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The domain name of the source repository. The match is case-insensitive and must be exact. Do not include the protocol, path, or tag. Public network and VPC domain names are not considered equal. Empty strings are invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>example-registry.cn-hangzhou.cr.aliyuncs.com</p>
     */
    @NameInMap("registry")
    public String registry;

    /**
     * <p>The name of the repository under the namespace. The match is case-sensitive and must be exact. Do not include the namespace. If this parameter is provided, the namespace parameter must also be provided. Empty strings are invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("repository")
    public String repository;

    /**
     * <p>Filters the results by a single cache status. Omit this parameter to query all statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The tag of the source image. The match is case-sensitive and must be exact. The latest tag is not inferred. Empty strings are invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("tag")
    public String tag;

    /**
     * <p>The current routed workspace. The server verifies the account, region, and resource ownership. This parameter cannot be omitted or used to access other workspaces.</p>
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
