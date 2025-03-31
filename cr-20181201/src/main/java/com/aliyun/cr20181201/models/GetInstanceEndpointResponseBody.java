// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceEndpointResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the access control list (ACL) feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AclEnable")
    public Boolean aclEnable;

    /**
     * <p>The ACLs.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<GetInstanceEndpointResponseBodyAclEntries> aclEntries;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<GetInstanceEndpointResponseBodyDomains> domains;

    /**
     * <p>Indicates whether the ACL feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8F3D5EC5-39D1-4C53-A198-48C54C658FA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
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
        /**
         * <p>Remarks for public IP address whitelists.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The public IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
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
        /**
         * <p>The domain name that is used to access the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>shanghai-instance1-registry.cn-shanghai.cr.aliyuncs.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><code>SYSTEM</code>: a system domain name.</li>
         * <li><code>USER</code>: a user domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
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
