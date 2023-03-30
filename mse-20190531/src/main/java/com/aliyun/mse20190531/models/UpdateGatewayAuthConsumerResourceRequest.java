// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResourceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ConsumerId")
    public Long consumerId;

    /**
     * <p>UpdateGatewayAuthConsumerResource</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("ResourceList")
    public java.util.List<UpdateGatewayAuthConsumerResourceRequestResourceList> resourceList;

    public static UpdateGatewayAuthConsumerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerResourceRequest self = new UpdateGatewayAuthConsumerResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthConsumerResourceRequest setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public Long getConsumerId() {
        return this.consumerId;
    }

    public UpdateGatewayAuthConsumerResourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthConsumerResourceRequest setResourceList(java.util.List<UpdateGatewayAuthConsumerResourceRequestResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<UpdateGatewayAuthConsumerResourceRequestResourceList> getResourceList() {
        return this.resourceList;
    }

    public static class UpdateGatewayAuthConsumerResourceRequestResourceList extends TeaModel {
        @NameInMap("RouteId")
        public Long routeId;

        @NameInMap("RouteName")
        public String routeName;

        public static UpdateGatewayAuthConsumerResourceRequestResourceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayAuthConsumerResourceRequestResourceList self = new UpdateGatewayAuthConsumerResourceRequestResourceList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayAuthConsumerResourceRequestResourceList setRouteId(Long routeId) {
            this.routeId = routeId;
            return this;
        }
        public Long getRouteId() {
            return this.routeId;
        }

        public UpdateGatewayAuthConsumerResourceRequestResourceList setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

    }

}
