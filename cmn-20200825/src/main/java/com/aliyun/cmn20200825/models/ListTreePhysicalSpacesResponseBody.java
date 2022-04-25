// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTreePhysicalSpacesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("PhysicalSpaces")
    public java.util.List<PhysicalSpaceDto> physicalSpaces;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTreePhysicalSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTreePhysicalSpacesResponseBody self = new ListTreePhysicalSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTreePhysicalSpacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTreePhysicalSpacesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTreePhysicalSpacesResponseBody setPhysicalSpaces(java.util.List<PhysicalSpaceDto> physicalSpaces) {
        this.physicalSpaces = physicalSpaces;
        return this;
    }
    public java.util.List<PhysicalSpaceDto> getPhysicalSpaces() {
        return this.physicalSpaces;
    }

    public ListTreePhysicalSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTreePhysicalSpacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
