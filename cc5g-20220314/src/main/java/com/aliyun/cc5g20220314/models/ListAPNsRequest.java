// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAPNsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CMWAP</p>
     */
    @NameInMap("APN")
    public String APN;

    /**
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAPNsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAPNsRequest self = new ListAPNsRequest();
        return TeaModel.build(map, self);
    }

    public ListAPNsRequest setAPN(String APN) {
        this.APN = APN;
        return this;
    }
    public String getAPN() {
        return this.APN;
    }

    public ListAPNsRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public ListAPNsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAPNsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAPNsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
