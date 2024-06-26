// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationPeersResponseBody extends TeaModel {
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
    public java.util.List<DescribeOrganizationPeersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationPeersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationPeersResponseBody self = new DescribeOrganizationPeersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationPeersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationPeersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationPeersResponseBody setResult(java.util.List<DescribeOrganizationPeersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrganizationPeersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrganizationPeersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationPeersResponseBodyResult extends TeaModel {
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
        @NameInMap("Name")
        public String name;

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

        public static DescribeOrganizationPeersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationPeersResponseBodyResult self = new DescribeOrganizationPeersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationPeersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOrganizationPeersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeOrganizationPeersResponseBodyResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeOrganizationPeersResponseBodyResult setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeOrganizationPeersResponseBodyResult setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeOrganizationPeersResponseBodyResult setIsAnchor(Boolean isAnchor) {
            this.isAnchor = isAnchor;
            return this;
        }
        public Boolean getIsAnchor() {
            return this.isAnchor;
        }

        public DescribeOrganizationPeersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationPeersResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeOrganizationPeersResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
