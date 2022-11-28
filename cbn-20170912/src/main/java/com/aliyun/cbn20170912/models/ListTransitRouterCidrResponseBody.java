// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrResponseBody extends TeaModel {
    @NameInMap("CidrLists")
    public java.util.List<ListTransitRouterCidrResponseBodyCidrLists> cidrLists;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTransitRouterCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterCidrResponseBody self = new ListTransitRouterCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterCidrResponseBody setCidrLists(java.util.List<ListTransitRouterCidrResponseBodyCidrLists> cidrLists) {
        this.cidrLists = cidrLists;
        return this;
    }
    public java.util.List<ListTransitRouterCidrResponseBodyCidrLists> getCidrLists() {
        return this.cidrLists;
    }

    public ListTransitRouterCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTransitRouterCidrResponseBodyCidrLists extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Description")
        public String description;

        @NameInMap("Family")
        public String family;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublishCidrRoute")
        public Boolean publishCidrRoute;

        @NameInMap("TransitRouterCidrId")
        public String transitRouterCidrId;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static ListTransitRouterCidrResponseBodyCidrLists build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterCidrResponseBodyCidrLists self = new ListTransitRouterCidrResponseBodyCidrLists();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterCidrResponseBodyCidrLists setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListTransitRouterCidrResponseBodyCidrLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTransitRouterCidrResponseBodyCidrLists setFamily(String family) {
            this.family = family;
            return this;
        }
        public String getFamily() {
            return this.family;
        }

        public ListTransitRouterCidrResponseBodyCidrLists setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTransitRouterCidrResponseBodyCidrLists setPublishCidrRoute(Boolean publishCidrRoute) {
            this.publishCidrRoute = publishCidrRoute;
            return this;
        }
        public Boolean getPublishCidrRoute() {
            return this.publishCidrRoute;
        }

        public ListTransitRouterCidrResponseBodyCidrLists setTransitRouterCidrId(String transitRouterCidrId) {
            this.transitRouterCidrId = transitRouterCidrId;
            return this;
        }
        public String getTransitRouterCidrId() {
            return this.transitRouterCidrId;
        }

        public ListTransitRouterCidrResponseBodyCidrLists setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
