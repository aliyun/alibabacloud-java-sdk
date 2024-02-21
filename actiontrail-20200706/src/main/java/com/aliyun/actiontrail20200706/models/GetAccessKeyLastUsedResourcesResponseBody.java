// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResourcesResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of returned resources.</p>
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
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The resource name.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The event source.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Internal</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    other events</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ManagementEvent</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    management events</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DataEvent</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    data events</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The timestamp when the resource was used. Unit: millisecond.</p>
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
