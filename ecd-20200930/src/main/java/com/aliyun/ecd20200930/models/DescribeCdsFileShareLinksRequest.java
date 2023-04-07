// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCdsFileShareLinksRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("Creators")
    public java.util.List<String> creators;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ShareId")
    public String shareId;

    @NameInMap("ShareName")
    public String shareName;

    @NameInMap("Status")
    public String status;

    public static DescribeCdsFileShareLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdsFileShareLinksRequest self = new DescribeCdsFileShareLinksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdsFileShareLinksRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DescribeCdsFileShareLinksRequest setCreators(java.util.List<String> creators) {
        this.creators = creators;
        return this;
    }
    public java.util.List<String> getCreators() {
        return this.creators;
    }

    public DescribeCdsFileShareLinksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCdsFileShareLinksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCdsFileShareLinksRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public DescribeCdsFileShareLinksRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public DescribeCdsFileShareLinksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
