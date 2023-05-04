// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnWafDomainResponseBody extends TeaModel {
    /**
     * <p>The information about the accelerated domain name.</p>
     */
    @NameInMap("OutPutDomains")
    public java.util.List<DescribeCdnWafDomainResponseBodyOutPutDomains> outPutDomains;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of accelerated domain names.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCdnWafDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnWafDomainResponseBody self = new DescribeCdnWafDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnWafDomainResponseBody setOutPutDomains(java.util.List<DescribeCdnWafDomainResponseBodyOutPutDomains> outPutDomains) {
        this.outPutDomains = outPutDomains;
        return this;
    }
    public java.util.List<DescribeCdnWafDomainResponseBodyOutPutDomains> getOutPutDomains() {
        return this.outPutDomains;
    }

    public DescribeCdnWafDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnWafDomainResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCdnWafDomainResponseBodyOutPutDomains extends TeaModel {
        /**
         * <p>The status of the access control list (ACL) feature. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The status of protection against HTTP flood attacks. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("CcStatus")
        public String ccStatus;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The WAF status of the domain name. Valid values:</p>
         * <br>
         * <p>*   **1**: The domain name is added to WAF or valid.</p>
         * <p>*   **10**: The domain name is being added to WAF.</p>
         * <p>*   **11**: The domain name failed to be added to WAF.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of WAF. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("WafStatus")
        public String wafStatus;

        public static DescribeCdnWafDomainResponseBodyOutPutDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnWafDomainResponseBodyOutPutDomains self = new DescribeCdnWafDomainResponseBodyOutPutDomains();
            return TeaModel.build(map, self);
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setCcStatus(String ccStatus) {
            this.ccStatus = ccStatus;
            return this;
        }
        public String getCcStatus() {
            return this.ccStatus;
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setWafStatus(String wafStatus) {
            this.wafStatus = wafStatus;
            return this;
        }
        public String getWafStatus() {
            return this.wafStatus;
        }

    }

}
