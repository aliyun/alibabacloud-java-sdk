// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetRouteResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the route.</p>
     */
    @NameInMap("Route")
    public GetRouteResponseBodyRoute route;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRouteResponseBody self = new GetRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRouteResponseBody setRoute(GetRouteResponseBodyRoute route) {
        this.route = route;
        return this;
    }
    public GetRouteResponseBodyRoute getRoute() {
        return this.route;
    }

    public GetRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRouteResponseBodyRoute extends TeaModel {
        /**
         * <p>The time when the route was created. The value is a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The CIDR block of the destination-based route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NetworkId")
        public Long networkId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The network resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ns-679XXXXX</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static GetRouteResponseBodyRoute build(java.util.Map<String, ?> map) throws Exception {
            GetRouteResponseBodyRoute self = new GetRouteResponseBodyRoute();
            return TeaModel.build(map, self);
        }

        public GetRouteResponseBodyRoute setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRouteResponseBodyRoute setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public GetRouteResponseBodyRoute setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRouteResponseBodyRoute setNetworkId(Long networkId) {
            this.networkId = networkId;
            return this;
        }
        public Long getNetworkId() {
            return this.networkId;
        }

        public GetRouteResponseBodyRoute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetRouteResponseBodyRoute setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
