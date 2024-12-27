// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class SearchHistoricalSnapshotsShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of rows that you want the current query to return. To query only the number of matched rows without the need to return specific data, you can set the Limit parameter to <code>0</code>. Then, the operation returns only the number of matched rows.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token that is required to obtain the next page of backup snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ordering mode. Valid values:</p>
     * <ul>
     * <li>ASC (default): ascending order</li>
     * <li>DESC: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The query conditions. Example:</p>
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
     * <li><p>The following fields are supported:</p>
     * <ul>
     * <li>VaultId: specifies the ID of the backup vault. This field is required.</li>
     * <li>InstanceId: specifies the ID of the Elastic Compute Service (ECS) instance. If the SourceType parameter is set to ECS_FILE, this field is required.</li>
     * <li>Bucket: specifies the name of the Object Storage Service (OSS) bucket. If the SourceType parameter is set to OSS, this field is required.</li>
     * <li>FileSystemId: specifies the ID of the File Storage NAS (NAS) file system. If the SourceType parameter is set to NAS, this field is required.</li>
     * <li>CreateTime: specifies the time when the NAS file system was created. If the SourceType parameter is set to NAS, this field is required.</li>
     * <li>CompleteTime: specifies the time when the backup snapshot was completed.</li>
     * <li>PlanId: the ID of a backup plan.</li>
     * </ul>
     * </li>
     * <li><p>The following operations are supported:</p>
     * <ul>
     * <li>MATCH_TERM: exact match.</li>
     * <li>GREATER_THAN: greater than.</li>
     * <li>GREATER_THAN_OR_EQUAL: greater than or equal to.</li>
     * <li>LESS_THAN: less than.</li>
     * <li>LESS_THAN_OR_EQUAL: less than or equal to.</li>
     * <li>BETWEEN: specifies a JSON array as a range. The results must fall within the range in the <code>[Minimum value,Maximum value]</code> format.</li>
     * <li>IN: specifies an array as a collection. The results must fall within the collection.</li>
     * <li>NOT_IN: specifies an array as a collection. The results cannot fall within the collection.</li>
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
     * <p>The field that is used to sort data.</p>
     * 
     * <strong>example:</strong>
     * <p>CreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: backup snapshots for Elastic Compute Service (ECS) files</li>
     * <li><strong>OSS</strong>: backup snapshots for Object Storage Service (OSS) buckets</li>
     * <li><strong>NAS</strong>: backup snapshots for Apsara File Storage NAS file systems</li>
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
