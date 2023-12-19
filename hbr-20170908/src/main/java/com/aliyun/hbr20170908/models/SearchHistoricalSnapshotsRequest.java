// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class SearchHistoricalSnapshotsRequest extends TeaModel {
    /**
     * <p>The maximum number of rows that you want the current query to return. To query only the number of matched rows without the need to return specific data, you can set the Limit parameter to `0`. Then, the operation returns only the number of matched rows.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token that is required to obtain the next page of backup snapshots.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The query conditions. Example:</p>
     * <br>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "field": "VaultId",</p>
     * <p>        "value": "v-0003rf9m*****qx5",</p>
     * <p>        "operation": "MATCH_TERM"</p>
     * <p>      },</p>
     * <p>      {</p>
     * <p>        "field": "InstanceId",</p>
     * <p>        "value": "i-bp1i20zq2*****e9368m",</p>
     * <p>        "operation": "MATCH_TERM"</p>
     * <p>      },</p>
     * <p>      {</p>
     * <p>        "field": "PlanId",</p>
     * <p>        "value": "plan-0005vk*****gkd1iu4f",</p>
     * <p>        "operation": "MATCH_TERM"</p>
     * <p>      },</p>
     * <p>      {</p>
     * <p>        "field": "CompleteTime",</p>
     * <p>        "value": 1626769913,</p>
     * <p>        "operation": "GREATER_THAN_OR_EQUAL"</p>
     * <p>      }</p>
     * <p>    ]</p>
     * <br>
     * <p>*   The following fields are supported:</p>
     * <br>
     * <p>    *   VaultId: specifies the ID of the backup vault. This field is required.</p>
     * <p>    *   InstanceId: specifies the ID of the ECS instance. If the SourceType parameter is set to ECS_FILE, this field is required.</p>
     * <p>    *   Bucket: specifies the ID of the OSS bucket. If the SourceType parameter is set to OSS, this field is required.</p>
     * <p>    *   FileSystemId: specifies the ID of the NAS file system. If the SourceType parameter is set to NAS, this field is required.</p>
     * <p>    *   CreateTime: specifies the time when the NAS file system was created. If the SourceType parameter is set to NAS, this field is required.</p>
     * <p>    *   CompleteTime: specifies the time when the backup snapshot was completed.</p>
     * <p>    *   PlanId: the ID of a backup plan.</p>
     * <br>
     * <p>*   The following operations are supported:</p>
     * <br>
     * <p>    *   MATCH_TERM: exact match.</p>
     * <p>    *   GREATER_THAN: greater than.</p>
     * <p>    *   GREATER_THAN_OR_EQUAL: greater than or equal to.</p>
     * <p>    *   LESS_THAN: less than.</p>
     * <p>    *   LESS_THAN_OR_EQUAL: less than or equal to.</p>
     * <p>    *   BETWEEN: specifies a JSON array as a range. The results must fall within the range in the `[Minimum value,Maximum value]` format.</p>
     * <p>    *   IN: specifies an array as a collection. The results must fall within the collection.</p>
     * <p>    *   NOT_IN: specifies an array as a collection. The results cannot fall within the collection.</p>
     */
    @NameInMap("Query")
    public java.util.List<?> query;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: backup snapshots for Elastic Compute Service (ECS) files</p>
     * <p>*   **OSS**: backup snapshots for Object Storage Service (OSS) buckets</p>
     * <p>*   **NAS**: backup snapshots for Apsara File Storage NAS file systems</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static SearchHistoricalSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchHistoricalSnapshotsRequest self = new SearchHistoricalSnapshotsRequest();
        return TeaModel.build(map, self);
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

    public SearchHistoricalSnapshotsRequest setQuery(java.util.List<?> query) {
        this.query = query;
        return this;
    }
    public java.util.List<?> getQuery() {
        return this.query;
    }

    public SearchHistoricalSnapshotsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
