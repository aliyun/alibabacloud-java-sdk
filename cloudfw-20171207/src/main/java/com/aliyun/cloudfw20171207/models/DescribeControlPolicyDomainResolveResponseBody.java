// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyDomainResolveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResolveResult")
    public java.util.List<DescribeControlPolicyDomainResolveResponseBodyResolveResult> resolveResult;

    public static DescribeControlPolicyDomainResolveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyDomainResolveResponseBody self = new DescribeControlPolicyDomainResolveResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyDomainResolveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeControlPolicyDomainResolveResponseBody setResolveResult(java.util.List<DescribeControlPolicyDomainResolveResponseBodyResolveResult> resolveResult) {
        this.resolveResult = resolveResult;
        return this;
    }
    public java.util.List<DescribeControlPolicyDomainResolveResponseBodyResolveResult> getResolveResult() {
        return this.resolveResult;
    }

    public static class DescribeControlPolicyDomainResolveResponseBodyResolveResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        @NameInMap("IpAddrList")
        public java.util.List<String> ipAddrList;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <strong>example:</strong>
         * <p>1579091739</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeControlPolicyDomainResolveResponseBodyResolveResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeControlPolicyDomainResolveResponseBodyResolveResult self = new DescribeControlPolicyDomainResolveResponseBodyResolveResult();
            return TeaModel.build(map, self);
        }

        public DescribeControlPolicyDomainResolveResponseBodyResolveResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeControlPolicyDomainResolveResponseBodyResolveResult setIpAddrList(java.util.List<String> ipAddrList) {
            this.ipAddrList = ipAddrList;
            return this;
        }
        public java.util.List<String> getIpAddrList() {
            return this.ipAddrList;
        }

        public DescribeControlPolicyDomainResolveResponseBodyResolveResult setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeControlPolicyDomainResolveResponseBodyResolveResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
