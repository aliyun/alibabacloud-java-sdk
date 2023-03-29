// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnWafDomainResponseBody extends TeaModel {
    @NameInMap("OutPutDomains")
    public java.util.List<DescribeCdnWafDomainResponseBodyOutPutDomains> outPutDomains;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
        @NameInMap("AclStatus")
        public String aclStatus;

        @NameInMap("CcStatus")
        public String ccStatus;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Status")
        public String status;

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
