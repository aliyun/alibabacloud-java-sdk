// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ListProtectedResourcesRequest extends TeaModel {
    /**
     * <p>The product capability to which the resource belongs. Valid values:</p>
     * <ul>
     * <li><strong>HBR</strong>: Cloud Backup standard capability.</li>
     * <li><strong>BASIC</strong>: ECS File Backup Essential Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("CreatedByProduct")
    public String createdByProduct;

    /**
     * <p>Specifies whether the resource has backup points.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasSnapshot")
    public Boolean hasSnapshot;

    /**
     * <p>The number of results per query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. If this parameter is empty, no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>aWQj********MCMy</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource ID.</p>
     * <ul>
     * <li><strong>SourceType=ECS_FILE</strong>: the ECS instance ID.</li>
     * <li><strong>SourceType=COMMON_FILE_SYSTEM</strong>: the CPFS data source ID.</li>
     * <li><strong>SourceType=COMMON_NAS</strong>: the on-premises NAS data source ID.</li>
     * <li><strong>SourceType=File</strong>: the local service client ID.</li>
     * <li><strong>SourceType=NAS</strong>: the Alibaba Cloud NAS file system ID.</li>
     * <li><strong>SourceType=OSS</strong>: the OSS bucket.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-wz95************7zrd</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The number of entries to skip for paging.
     * If the number of skipped entries exceeds the total number of conditional entries, an empty list is returned. The number of skipped entries must be a multiple of MaxResults.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>The backup feature type. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: ECS file backup.</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: Cloud Parallel File Storage (CPFS) backup.</li>
     * <li><strong>COMMON_NAS</strong>: on-premises NAS backup.</li>
     * <li><strong>File</strong>: on-premises file backup.</li>
     * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
     * <li><strong>OSS</strong>: OSS backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListProtectedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProtectedResourcesRequest self = new ListProtectedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListProtectedResourcesRequest setCreatedByProduct(String createdByProduct) {
        this.createdByProduct = createdByProduct;
        return this;
    }
    public String getCreatedByProduct() {
        return this.createdByProduct;
    }

    public ListProtectedResourcesRequest setHasSnapshot(Boolean hasSnapshot) {
        this.hasSnapshot = hasSnapshot;
        return this;
    }
    public Boolean getHasSnapshot() {
        return this.hasSnapshot;
    }

    public ListProtectedResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProtectedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProtectedResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListProtectedResourcesRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListProtectedResourcesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
