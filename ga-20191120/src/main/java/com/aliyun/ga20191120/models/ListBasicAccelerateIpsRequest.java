// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpsRequest extends TeaModel {
    /**
     * <p>The accelerated IP address of the basic GA instance.</p>
     */
    @NameInMap("AccelerateIpAddress")
    public String accelerateIpAddress;

    /**
     * <p>The ID of the accelerated IP address of the basic GA instance.</p>
     */
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the acceleration region.</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query and no next queries are to be sent, ignore this parameter.</p>
     * <p>*   If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListBasicAccelerateIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAccelerateIpsRequest self = new ListBasicAccelerateIpsRequest();
        return TeaModel.build(map, self);
    }

    public ListBasicAccelerateIpsRequest setAccelerateIpAddress(String accelerateIpAddress) {
        this.accelerateIpAddress = accelerateIpAddress;
        return this;
    }
    public String getAccelerateIpAddress() {
        return this.accelerateIpAddress;
    }

    public ListBasicAccelerateIpsRequest setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public ListBasicAccelerateIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListBasicAccelerateIpsRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public ListBasicAccelerateIpsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBasicAccelerateIpsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBasicAccelerateIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
