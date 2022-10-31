// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAPNsRequest extends TeaModel {
    @NameInMap("APN")
    public String APN;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

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
