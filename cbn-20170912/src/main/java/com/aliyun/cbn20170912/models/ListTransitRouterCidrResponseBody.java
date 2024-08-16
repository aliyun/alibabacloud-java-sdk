// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrResponseBody extends TeaModel {
    /**
     * <p>The information about the CIDR block.</p>
     */
    @NameInMap("CidrLists")
    public java.util.List<ListTransitRouterCidrResponseBodyCidrLists> cidrLists;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0876E54E-3E36-5C31-89F0-9EE8A9266F9A</p>
     */
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
        /**
         * <p>The CIDR block of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the CIDR block.</p>
         * <p>The value is <strong>IPv4</strong>, which indicates that the CIDR block is of the IPv4 type.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("Family")
        public String family;

        /**
         * <p>The name of the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the system is allowed to automatically add a route to the route table of the transit router. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * <p>A value of <strong>true</strong> indicates that after you create a private VPN connection and enable route learning for the connection, the system automatically adds a blackhole route to the route table of the transit router to which the VPN connection is attached.</p>
         * <p>The destination CIDR block of the blackhole route is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections.</p>
         * <p>The blackhole route is advertised only to the route table of the virtual border router (VBR) that is connected to the transit router.</p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublishCidrRoute")
        public Boolean publishCidrRoute;

        /**
         * <p>The ID of the transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>cidr-0zv0q9crqpntzz****</p>
         */
        @NameInMap("TransitRouterCidrId")
        public String transitRouterCidrId;

        /**
         * <p>The transit router ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0w3x8c9em72a40nw****</p>
         */
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
