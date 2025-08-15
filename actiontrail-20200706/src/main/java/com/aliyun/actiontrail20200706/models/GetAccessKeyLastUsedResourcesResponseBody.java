// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResourcesResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of returned resources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resources")
    public java.util.List<GetAccessKeyLastUsedResourcesResponseBodyResources> resources;

    public static GetAccessKeyLastUsedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResourcesResponseBody self = new GetAccessKeyLastUsedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAccessKeyLastUsedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessKeyLastUsedResourcesResponseBody setResources(java.util.List<GetAccessKeyLastUsedResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<GetAccessKeyLastUsedResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class GetAccessKeyLastUsedResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The event details.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
         *   &quot;eventVersion&quot;: 1,
         *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
         *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
         *   &quot;eventType&quot;: &quot;ApiCall&quot;,
         *   &quot;userIdentity&quot;: {
         *     &quot;accountId&quot;: &quot;104758519118****&quot;,
         *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
         *     &quot;type&quot;: &quot;ram-user&quot;,
         *     &quot;userName&quot;: &quot;alice&quot;
         *   },
         *   &quot;serviceName&quot;: &quot;Ecs&quot;,
         *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
         *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
         *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
         *   &quot;isGlobal&quot;: false,
         *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
         * }</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ltva99x1a****</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The event source.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Internal</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>other events</p>
         * <!-- -->
         * </li>
         * <li><p>ManagementEvent</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>management events</p>
         * <!-- -->
         * </li>
         * <li><p>DataEvent</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>data events</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagementEvent</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The timestamp when the resource was used. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1657247532000</p>
         */
        @NameInMap("UsedTimestamp")
        public Long usedTimestamp;

        public static GetAccessKeyLastUsedResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedResourcesResponseBodyResources self = new GetAccessKeyLastUsedResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setUsedTimestamp(Long usedTimestamp) {
            this.usedTimestamp = usedTimestamp;
            return this;
        }
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

    }

}
