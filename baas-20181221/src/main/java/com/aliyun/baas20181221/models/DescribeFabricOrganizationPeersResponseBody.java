// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationPeersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationPeersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>10.0.0.2</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>10.0.0.2</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAnchor")
        public Boolean isAnchor;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("OrganizationPeerName")
        public String organizationPeerName;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
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
