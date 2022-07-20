// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedIpsRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ServiceName")
    public String serviceName;

    public static GetAccessKeyLastUsedIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedIpsRequest self = new GetAccessKeyLastUsedIpsRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedIpsRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetAccessKeyLastUsedIpsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAccessKeyLastUsedIpsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetAccessKeyLastUsedIpsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
