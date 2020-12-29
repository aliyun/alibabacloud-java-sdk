// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationPeersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationPeersResponseBodyResult> result;

    public static DescribeFabricOrganizationPeersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationPeersResponseBody self = new DescribeFabricOrganizationPeersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationPeersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationPeersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationPeersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricOrganizationPeersResponseBody setResult(java.util.List<DescribeFabricOrganizationPeersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationPeersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricOrganizationPeersResponseBodyResult extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IsAnchor")
        public Boolean isAnchor;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("OrganizationPeerName")
        public String organizationPeerName;

        @NameInMap("IntranetIp")
        public String intranetIp;

        public static DescribeFabricOrganizationPeersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationPeersResponseBodyResult self = new DescribeFabricOrganizationPeersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setIsAnchor(Boolean isAnchor) {
            this.isAnchor = isAnchor;
            return this;
        }
        public Boolean getIsAnchor() {
            return this.isAnchor;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setOrganizationPeerName(String organizationPeerName) {
            this.organizationPeerName = organizationPeerName;
            return this;
        }
        public String getOrganizationPeerName() {
            return this.organizationPeerName;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

    }

}
