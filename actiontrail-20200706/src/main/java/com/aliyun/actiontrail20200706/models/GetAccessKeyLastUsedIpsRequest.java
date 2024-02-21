// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedIpsRequest extends TeaModel {
    /**
     * <p>The AccessKey ID.</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>The token that determines the start point of the query.</p>
     * <br>
     * <p>> The request parameters must be the same as those of the last request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 0 to 100.</p>
     * <br>
     * <p>Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The Alibaba Cloud service. For more information about the Alibaba Cloud services supported by ActionTrail, see [Supported Alibaba Cloud services](~~28829~~).</p>
     */
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
