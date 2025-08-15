// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedEventsRequest extends TeaModel {
    /**
     * <p>The AccessKey ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI****************</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>The token that determines the start point of the query.</p>
     * <blockquote>
     * <p>The request parameters must be the same as those of the last request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 0 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The Alibaba Cloud service. For more information about the Alibaba Cloud services supported by ActionTrail, see <a href="https://help.aliyun.com/document_detail/28829.html">Supported Alibaba Cloud services</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
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
