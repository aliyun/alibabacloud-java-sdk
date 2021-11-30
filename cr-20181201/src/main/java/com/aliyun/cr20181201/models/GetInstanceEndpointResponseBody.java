// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceEndpointResponseBody extends TeaModel {
    @NameInMap("AclEnable")
    public Boolean aclEnable;

    @NameInMap("AclEntries")
    public java.util.List<GetInstanceEndpointResponseBodyAclEntries> aclEntries;

    @NameInMap("Code")
    public String code;

    @NameInMap("Domains")
    public java.util.List<GetInstanceEndpointResponseBodyDomains> domains;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetInstanceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceEndpointResponseBody self = new GetInstanceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceEndpointResponseBody setAclEnable(Boolean aclEnable) {
        this.aclEnable = aclEnable;
        return this;
    }
    public Boolean getAclEnable() {
        return this.aclEnable;
    }

    public GetInstanceEndpointResponseBody setAclEntries(java.util.List<GetInstanceEndpointResponseBodyAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<GetInstanceEndpointResponseBodyAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public GetInstanceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceEndpointResponseBody setDomains(java.util.List<GetInstanceEndpointResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<GetInstanceEndpointResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public GetInstanceEndpointResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GetInstanceEndpointResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetInstanceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceEndpointResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetInstanceEndpointResponseBodyAclEntries extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Entry")
        public String entry;

        public static GetInstanceEndpointResponseBodyAclEntries build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceEndpointResponseBodyAclEntries self = new GetInstanceEndpointResponseBodyAclEntries();
            return TeaModel.build(map, self);
        }

        public GetInstanceEndpointResponseBodyAclEntries setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetInstanceEndpointResponseBodyAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

    public static class GetInstanceEndpointResponseBodyDomains extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Type")
        public String type;

        public static GetInstanceEndpointResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceEndpointResponseBodyDomains self = new GetInstanceEndpointResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public GetInstanceEndpointResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetInstanceEndpointResponseBodyDomains setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
