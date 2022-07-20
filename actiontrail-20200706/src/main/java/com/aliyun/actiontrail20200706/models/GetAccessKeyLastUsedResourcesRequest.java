// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResourcesRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ServiceName")
    public String serviceName;

    public static GetAccessKeyLastUsedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResourcesRequest self = new GetAccessKeyLastUsedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResourcesRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetAccessKeyLastUsedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAccessKeyLastUsedResourcesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetAccessKeyLastUsedResourcesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
