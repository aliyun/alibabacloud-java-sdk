// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesShrinkRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileIds")
    public String fileIdsShrink;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("ParentFileId")
    public String parentFileId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    public static ListCdsFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCdsFilesShrinkRequest self = new ListCdsFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCdsFilesShrinkRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ListCdsFilesShrinkRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListCdsFilesShrinkRequest setFileIdsShrink(String fileIdsShrink) {
        this.fileIdsShrink = fileIdsShrink;
        return this;
    }
    public String getFileIdsShrink() {
        return this.fileIdsShrink;
    }

    public ListCdsFilesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCdsFilesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCdsFilesShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListCdsFilesShrinkRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public ListCdsFilesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCdsFilesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
