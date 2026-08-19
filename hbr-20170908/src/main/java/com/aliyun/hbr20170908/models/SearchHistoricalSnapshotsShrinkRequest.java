// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class SearchHistoricalSnapshotsShrinkRequest extends TeaModel {
    /**
     * <p>The edition. Valid values are BASIC and STANDARD. The default value is STANDARD.</p>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The maximum number of results to return.
     * To retrieve only the number of rows without any data, set Limit to <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token that is required to obtain the next page of snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. The default value is ASC.</p>
     * <ul>
     * <li><p>ASC: ascending</p>
     * </li>
     * <li><p>DESC: descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The query conditions. For example:</p>
     * <pre><code>[
     *   {
     *     &quot;field&quot;: &quot;VaultId&quot;,
     *     &quot;value&quot;: &quot;v-0003rf9m*****qx5&quot;,
     *     &quot;operation&quot;: &quot;MATCH_TERM&quot;
     *   },
     *   {
     *     &quot;field&quot;: &quot;InstanceId&quot;,
     *     &quot;value&quot;: &quot;i-bp1i20zq2*****e9368m&quot;,
     *     &quot;operation&quot;: &quot;MATCH_TERM&quot;
     *   },
     *   {
     *     &quot;field&quot;: &quot;PlanId&quot;,
     *     &quot;value&quot;: &quot;plan-0005vk*****gkd1iu4f&quot;,
     *     &quot;operation&quot;: &quot;MATCH_TERM&quot;
     *   },
     *   {
     *     &quot;field&quot;: &quot;CompleteTime&quot;,
     *     &quot;value&quot;: &quot;1626769913&quot;,
     *     &quot;operation&quot;: &quot;GREATER_THAN_OR_EQUAL&quot;
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li><p>Supported fields:</p>
     * <ul>
     * <li><p>VaultId: This parameter is required. The ID of the backup vault.</p>
     * </li>
     * <li><p>InstanceId: This parameter is required only when SourceType is set to ECS_FILE. The ID of the ECS instance.</p>
     * </li>
     * <li><p>Bucket: This parameter is required only when SourceType is set to OSS. The name of the OSS bucket.</p>
     * </li>
     * <li><p>FileSystemId: This parameter is required only when SourceType is set to NAS. The ID of the NAS file system.</p>
     * </li>
     * <li><p>CreateTime: This parameter is required only when SourceType is set to NAS. The time when the NAS file system was created.</p>
     * </li>
     * <li><p>CompleteTime: The time when the snapshot was completed.</p>
     * </li>
     * <li><p>PlanId: The ID of the backup plan.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Supported operations:</p>
     * <ul>
     * <li><p>MATCH_TERM: exact match.</p>
     * </li>
     * <li><p>GREATER_THAN: greater than.</p>
     * </li>
     * <li><p>GREATER_THAN_OR_EQUAL: greater than or equal to.</p>
     * </li>
     * <li><p>LESS_THAN: less than.</p>
     * </li>
     * <li><p>LESS_THAN_OR_EQUAL: less than or equal to.</p>
     * </li>
     * <li><p>BETWEEN: a range. The value is a JSON array in the <code>[lower bound,upper bound]</code> format.</p>
     * </li>
     * <li><p>IN: in a collection. The value is an array.</p>
     * </li>
     * <li><p>NOT_IN: not in a collection. The value is an array.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[   {     &quot;field&quot;: &quot;VaultId&quot;,     &quot;value&quot;: &quot;v-0003rf9m17pap3ltpqx5&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;InstanceId&quot;,     &quot;value&quot;: &quot;i-bp1i20zq2wuzdie9368m&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;PlanId&quot;,     &quot;value&quot;: &quot;plan-0005vkqhpesqgkd1iu4f&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;CompleteTime&quot;,     &quot;value&quot;: 1626769913,     &quot;operation&quot;: &quot;GREATER_THAN_OR_EQUAL&quot;   } ]</p>
     */
    @NameInMap("Query")
    public String queryShrink;

    /**
     * <p>The field to sort by.</p>
     * 
     * <strong>example:</strong>
     * <p>CreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p><strong>ECS_FILE</strong>: a backup snapshot of ECS files.</p>
     * </li>
     * <li><p><strong>OSS</strong>: a backup snapshot of Alibaba Cloud OSS.</p>
     * </li>
     * <li><p><strong>NAS</strong>: a backup snapshot of Alibaba Cloud NAS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static SearchHistoricalSnapshotsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchHistoricalSnapshotsShrinkRequest self = new SearchHistoricalSnapshotsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchHistoricalSnapshotsShrinkRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public SearchHistoricalSnapshotsShrinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchHistoricalSnapshotsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchHistoricalSnapshotsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public SearchHistoricalSnapshotsShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

    public SearchHistoricalSnapshotsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchHistoricalSnapshotsShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
