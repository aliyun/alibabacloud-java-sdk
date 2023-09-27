// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceEndpointResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The endpoints of the instance.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListInstanceEndpointResponseBodyEndpoints> endpoints;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceEndpointResponseBody self = new ListInstanceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceEndpointResponseBody setEndpoints(java.util.List<ListInstanceEndpointResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListInstanceEndpointResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListInstanceEndpointResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListInstanceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceEndpointResponseBodyEndpointsAclEntries extends TeaModel {
        /**
         * <p>Details about the ACL.</p>
         */
        @NameInMap("Entry")
        public String entry;

        public static ListInstanceEndpointResponseBodyEndpointsAclEntries build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceEndpointResponseBodyEndpointsAclEntries self = new ListInstanceEndpointResponseBodyEndpointsAclEntries();
            return TeaModel.build(map, self);
        }

        public ListInstanceEndpointResponseBodyEndpointsAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

    public static class ListInstanceEndpointResponseBodyEndpointsDomains extends TeaModel {
        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Type</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstanceEndpointResponseBodyEndpointsDomains build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceEndpointResponseBodyEndpointsDomains self = new ListInstanceEndpointResponseBodyEndpointsDomains();
            return TeaModel.build(map, self);
        }

        public ListInstanceEndpointResponseBodyEndpointsDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListInstanceEndpointResponseBodyEndpointsDomains setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInstanceEndpointResponseBodyEndpointsLinkedVpcs extends TeaModel {
        /**
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListInstanceEndpointResponseBodyEndpointsLinkedVpcs build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceEndpointResponseBodyEndpointsLinkedVpcs self = new ListInstanceEndpointResponseBodyEndpointsLinkedVpcs();
            return TeaModel.build(map, self);
        }

        public ListInstanceEndpointResponseBodyEndpointsLinkedVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListInstanceEndpointResponseBodyEndpoints extends TeaModel {
        /**
         * <p>Indicates whether the access control list (ACL) feature is enabled.</p>
         */
        @NameInMap("AclEnable")
        public Boolean aclEnable;

        /**
         * <p>The ACL configured for the instance.</p>
         */
        @NameInMap("AclEntries")
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsAclEntries> aclEntries;

        /**
         * <p>Domain names.</p>
         */
        @NameInMap("Domains")
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsDomains> domains;

        /**
         * <p>Indicates whether the ACL feature is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The type of the endpoint.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The virtual private clouds (VPCs) that are associated with the instance.</p>
         */
        @NameInMap("LinkedVpcs")
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsLinkedVpcs> linkedVpcs;

        /**
         * <p>The status of the instance.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstanceEndpointResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceEndpointResponseBodyEndpoints self = new ListInstanceEndpointResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListInstanceEndpointResponseBodyEndpoints setAclEnable(Boolean aclEnable) {
            this.aclEnable = aclEnable;
            return this;
        }
        public Boolean getAclEnable() {
            return this.aclEnable;
        }

        public ListInstanceEndpointResponseBodyEndpoints setAclEntries(java.util.List<ListInstanceEndpointResponseBodyEndpointsAclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsAclEntries> getAclEntries() {
            return this.aclEntries;
        }

        public ListInstanceEndpointResponseBodyEndpoints setDomains(java.util.List<ListInstanceEndpointResponseBodyEndpointsDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsDomains> getDomains() {
            return this.domains;
        }

        public ListInstanceEndpointResponseBodyEndpoints setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListInstanceEndpointResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListInstanceEndpointResponseBodyEndpoints setLinkedVpcs(java.util.List<ListInstanceEndpointResponseBodyEndpointsLinkedVpcs> linkedVpcs) {
            this.linkedVpcs = linkedVpcs;
            return this;
        }
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsLinkedVpcs> getLinkedVpcs() {
            return this.linkedVpcs;
        }

        public ListInstanceEndpointResponseBodyEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
