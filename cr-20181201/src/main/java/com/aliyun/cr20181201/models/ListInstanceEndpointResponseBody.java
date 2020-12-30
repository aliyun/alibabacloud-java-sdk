// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceEndpointResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    public java.util.List<ListInstanceEndpointResponseBodyEndpoints> endpoints;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static ListInstanceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceEndpointResponseBody self = new ListInstanceEndpointResponseBody();
        return TeaModel.build(map, self);
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

    public ListInstanceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListInstanceEndpointResponseBodyEndpointsDomains extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Domain")
        public String domain;

        public static ListInstanceEndpointResponseBodyEndpointsDomains build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceEndpointResponseBodyEndpointsDomains self = new ListInstanceEndpointResponseBodyEndpointsDomains();
            return TeaModel.build(map, self);
        }

        public ListInstanceEndpointResponseBodyEndpointsDomains setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInstanceEndpointResponseBodyEndpointsDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

    public static class ListInstanceEndpointResponseBodyEndpointsLinkedVpcs extends TeaModel {
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

    public static class ListInstanceEndpointResponseBodyEndpointsAclEntries extends TeaModel {
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

    public static class ListInstanceEndpointResponseBodyEndpoints extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Domains")
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsDomains> domains;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("LinkedVpcs")
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsLinkedVpcs> linkedVpcs;

        @NameInMap("AclEnable")
        public Boolean aclEnable;

        @NameInMap("AclEntries")
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsAclEntries> aclEntries;

        @NameInMap("Enable")
        public Boolean enable;

        public static ListInstanceEndpointResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceEndpointResponseBodyEndpoints self = new ListInstanceEndpointResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListInstanceEndpointResponseBodyEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceEndpointResponseBodyEndpoints setDomains(java.util.List<ListInstanceEndpointResponseBodyEndpointsDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<ListInstanceEndpointResponseBodyEndpointsDomains> getDomains() {
            return this.domains;
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

        public ListInstanceEndpointResponseBodyEndpoints setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
