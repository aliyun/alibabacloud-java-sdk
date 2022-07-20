// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedEventsRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ServiceName")
    public String serviceName;

    public static GetAccessKeyLastUsedEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedEventsRequest self = new GetAccessKeyLastUsedEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedEventsRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetAccessKeyLastUsedEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAccessKeyLastUsedEventsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetAccessKeyLastUsedEventsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
