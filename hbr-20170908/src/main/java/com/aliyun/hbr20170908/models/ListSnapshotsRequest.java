// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    /**
     * <p>The end completion time. The value is a UNIX timestamp in seconds. Only backup points whose completion time is less than this value are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1776059382</p>
     */
    @NameInMap("CompleteTimeEnd")
    public Long completeTimeEnd;

    /**
     * <p>The start completion time. The value is a UNIX timestamp in seconds. Only backup points whose completion time is greater than or equal to this value are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1776059082</p>
     */
    @NameInMap("CompleteTimeStart")
    public Long completeTimeStart;

    /**
     * <p>The maximum number of results to return for a paged query. Default value: 10. The value must be greater than 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the <strong>NextToken</strong> value returned from the previous page. If <strong>NextToken</strong> is empty, no more pages exist. This parameter cannot be used together with <strong>Skip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJJbmRleCI6NjUwMX0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the backup plan. This is an optional filter. If you specify this parameter, only the backup points under the specified backup plan are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>po-0000****123</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the protected resource. The protected resource must exist, and its data source type must be the same as the value of the <strong>SourceType</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pr-123***7890</p>
     */
    @NameInMap("ProtectedResourceId")
    public String protectedResourceId;

    /**
     * <p>The number of entries to skip. The value must be a non-negative integer and a multiple of <strong>MaxResults</strong>. This parameter cannot be used together with <strong>NextToken</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>The data source type. It must be the same as the data source type of the protected resource specified by ProtectedResourceId. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the vault. This is an optional filter. If you specify this parameter, only the backup points in the specified vault are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>v-00030j3c******sn</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static ListSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsRequest self = new ListSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsRequest setCompleteTimeEnd(Long completeTimeEnd) {
        this.completeTimeEnd = completeTimeEnd;
        return this;
    }
    public Long getCompleteTimeEnd() {
        return this.completeTimeEnd;
    }

    public ListSnapshotsRequest setCompleteTimeStart(Long completeTimeStart) {
        this.completeTimeStart = completeTimeStart;
        return this;
    }
    public Long getCompleteTimeStart() {
        return this.completeTimeStart;
    }

    public ListSnapshotsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSnapshotsRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ListSnapshotsRequest setProtectedResourceId(String protectedResourceId) {
        this.protectedResourceId = protectedResourceId;
        return this;
    }
    public String getProtectedResourceId() {
        return this.protectedResourceId;
    }

    public ListSnapshotsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListSnapshotsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListSnapshotsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
