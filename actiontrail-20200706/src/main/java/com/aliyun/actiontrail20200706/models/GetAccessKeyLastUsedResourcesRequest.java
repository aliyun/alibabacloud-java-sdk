// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResourcesRequest extends TeaModel {
    /**
     * <p>The AccessKey ID.</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <br>
     * <p>> The request parameters must be the same as those of the last request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>*   Valid values: 0 to 100.</p>
     * <p>*   Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The Alibaba Cloud service. For more information about the Alibaba Cloud services supported by ActionTrail, see [Supported Alibaba Cloud services](~~28829~~).</p>
     */
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
