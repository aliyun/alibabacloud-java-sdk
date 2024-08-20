// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("OutPutDomains")
    public java.util.List<DescribeDcdnWafDomainResponseBodyOutPutDomains> outPutDomains;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-802B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of accelerated domain names returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnWafDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainResponseBody self = new DescribeDcdnWafDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainResponseBody setOutPutDomains(java.util.List<DescribeDcdnWafDomainResponseBodyOutPutDomains> outPutDomains) {
        this.outPutDomains = outPutDomains;
        return this;
    }
    public java.util.List<DescribeDcdnWafDomainResponseBodyOutPutDomains> getOutPutDomains() {
        return this.outPutDomains;
    }

    public DescribeDcdnWafDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafDomainResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnWafDomainResponseBodyOutPutDomains extends TeaModel {
        /**
         * <p>The status of the ACL. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>1: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AclStatus")
        public Integer aclStatus;

        /**
         * <p>The status of protection against HTTP flood attacks. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>1: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CcStatus")
        public Integer ccStatus;

        /**
         * <p>The domain name that has WAF enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li>1: The domain name is added to WAF, or the domain name is valid.</li>
         * <li>10: The domain name is being added to WAF.</li>
         * <li>11: The domain name failed to be added to WAF.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The status of WAF. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>1: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WafStatus")
        public Integer wafStatus;

        public static DescribeDcdnWafDomainResponseBodyOutPutDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafDomainResponseBodyOutPutDomains self = new DescribeDcdnWafDomainResponseBodyOutPutDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setAclStatus(Integer aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public Integer getAclStatus() {
            return this.aclStatus;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setCcStatus(Integer ccStatus) {
            this.ccStatus = ccStatus;
            return this;
        }
        public Integer getCcStatus() {
            return this.ccStatus;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setWafStatus(Integer wafStatus) {
            this.wafStatus = wafStatus;
            return this;
        }
        public Integer getWafStatus() {
            return this.wafStatus;
        }

    }

}
