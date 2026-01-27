// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16dad2b6-3c6d-4e4c-b057-78ecb13c****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The cloud computer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The logon token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v16abfb945208fc5745061668654680853da4a25202d1a394fcad57bba484e9827ad43ea7d10fb6bf13d44a4adc0e9****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a99b9aca-bac5-4da2-819e-400ce98f****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>s-2ze81owrnv9pity4****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeSnapshotsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeSnapshotsRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public DescribeSnapshotsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeSnapshotsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
