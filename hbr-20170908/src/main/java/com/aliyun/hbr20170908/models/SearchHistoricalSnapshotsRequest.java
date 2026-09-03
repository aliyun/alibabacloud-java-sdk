// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class SearchHistoricalSnapshotsRequest extends TeaModel {
    /**
     * <p>The edition type. Valid values: BASIC and STANDARD. Default value: STANDARD.</p>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The maximum number of results to return for this query.
     * If you only want to obtain the row count without actual data, set <code>limit=0</code> to return no rows.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token required to retrieve the next page of snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Default value: ASC.</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The query conditions. Example of Query:</p>
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
     * <li>VaultId: required. The vault ID.</li>
     * <li>InstanceId: required only when SourceType=ECS_FILE. The ECS instance ID.</li>
     * <li>Bucket: required only when SourceType=OSS. The OSS bucket name.</li>
     * <li>FileSystemId: required only when SourceType=NAS. The NAS file system ID.</li>
     * <li>CreateTime: required only when SourceType=NAS. The creation time of the NAS file system.</li>
     * <li>CompleteTime: the time when the snapshot is completed.</li>
     * <li>PlanId: the backup plan ID.</li>
     * </ul>
     * </li>
     * <li><p>Supported operations:</p>
     * <ul>
     * <li>MATCH_TERM: exact match.</li>
     * <li>GREATER_THAN: greater than.</li>
     * <li>GREATER_THAN_OR_EQUAL: greater than or equal to.</li>
     * <li>LESS_THAN: less than.</li>
     * <li>LESS_THAN_OR_EQUAL: less than or equal to.</li>
     * <li>BETWEEN: range. The value is a JSON array <code>[lower bound, upper bound]</code>.</li>
     * <li>IN: in the set. The value is an array.</li>
     * <li>NOT_IN: not in the set. The value is an array.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[   {     &quot;field&quot;: &quot;VaultId&quot;,     &quot;value&quot;: &quot;v-0003rf9m17pap3ltpqx5&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;InstanceId&quot;,     &quot;value&quot;: &quot;i-bp1i20zq2wuzdie9368m&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;PlanId&quot;,     &quot;value&quot;: &quot;plan-0005vkqhpesqgkd1iu4f&quot;,     &quot;operation&quot;: &quot;MATCH_TERM&quot;   },   {     &quot;field&quot;: &quot;CompleteTime&quot;,     &quot;value&quot;: 1626769913,     &quot;operation&quot;: &quot;GREATER_THAN_OR_EQUAL&quot;   } ]</p>
     */
    @NameInMap("Query")
    public java.util.List<?> query;

    /**
     * <p>The field used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>CreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: backup snapshots of ECS files.</li>
     * <li><strong>OSS</strong>: backup snapshots of Alibaba Cloud OSS.</li>
     * <li><strong>NAS</strong>: backup snapshots of Alibaba Cloud NAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static SearchHistoricalSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchHistoricalSnapshotsRequest self = new SearchHistoricalSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public SearchHistoricalSnapshotsRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public SearchHistoricalSnapshotsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchHistoricalSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchHistoricalSnapshotsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public SearchHistoricalSnapshotsRequest setQuery(java.util.List<?> query) {
        this.query = query;
        return this;
    }
    public java.util.List<?> getQuery() {
        return this.query;
    }

    public SearchHistoricalSnapshotsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchHistoricalSnapshotsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
