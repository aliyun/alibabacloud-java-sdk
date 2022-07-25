// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorEIPsResponseBody extends TeaModel {
    @NameInMap("EIPs")
    public java.util.List<String> EIPs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIoTCloudConnectorEIPsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorEIPsResponseBody self = new ListIoTCloudConnectorEIPsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorEIPsResponseBody setEIPs(java.util.List<String> EIPs) {
        this.EIPs = EIPs;
        return this;
    }
    public java.util.List<String> getEIPs() {
        return this.EIPs;
    }

    public ListIoTCloudConnectorEIPsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorEIPsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorEIPsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCloudConnectorEIPsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
