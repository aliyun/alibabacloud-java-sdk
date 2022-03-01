// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationPeersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationPeersResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricOrganizationPeersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationPeersResponseBody self = new DescribeFabricOrganizationPeersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationPeersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationPeersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationPeersResponseBody setResult(java.util.List<DescribeFabricOrganizationPeersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationPeersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricOrganizationPeersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricOrganizationPeersResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("IsAnchor")
        public Boolean isAnchor;

        @NameInMap("OrganizationPeerName")
        public String organizationPeerName;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeFabricOrganizationPeersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationPeersResponseBodyResult self = new DescribeFabricOrganizationPeersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setIsAnchor(Boolean isAnchor) {
            this.isAnchor = isAnchor;
            return this;
        }
        public Boolean getIsAnchor() {
            return this.isAnchor;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setOrganizationPeerName(String organizationPeerName) {
            this.organizationPeerName = organizationPeerName;
            return this;
        }
        public String getOrganizationPeerName() {
            return this.organizationPeerName;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeFabricOrganizationPeersResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
