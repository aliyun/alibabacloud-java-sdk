// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetApiEndpointsResponseBody extends TeaModel {
    /**
     * <p>The list of parameters.</p>
     */
    @NameInMap("Items")
    public java.util.List<GetApiEndpointsResponseBodyItems> items;

    /**
     * <p>The maximum number of records to return in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query during paging. Use this token to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static GetApiEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiEndpointsResponseBody self = new GetApiEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiEndpointsResponseBody setItems(java.util.List<GetApiEndpointsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetApiEndpointsResponseBodyItems> getItems() {
        return this.items;
    }

    public GetApiEndpointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetApiEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetApiEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApiEndpointsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class GetApiEndpointsResponseBodyItems extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api-longmemory-cn-beijing.opentrust.net/">https://api-longmemory-cn-beijing.opentrust.net/</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><strong>memory</strong></li>
         * <li><strong>drama</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        public static GetApiEndpointsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetApiEndpointsResponseBodyItems self = new GetApiEndpointsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetApiEndpointsResponseBodyItems setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetApiEndpointsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetApiEndpointsResponseBodyItems setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
