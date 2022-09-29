// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListDiagnoseInfoForSingleCardRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Status")
    public String status;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static ListDiagnoseInfoForSingleCardRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseInfoForSingleCardRequest self = new ListDiagnoseInfoForSingleCardRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseInfoForSingleCardRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDiagnoseInfoForSingleCardRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDiagnoseInfoForSingleCardRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public ListDiagnoseInfoForSingleCardRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListDiagnoseInfoForSingleCardRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListDiagnoseInfoForSingleCardRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDiagnoseInfoForSingleCardRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
