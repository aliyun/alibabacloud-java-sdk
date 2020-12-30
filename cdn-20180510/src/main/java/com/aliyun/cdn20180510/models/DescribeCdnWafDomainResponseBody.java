// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnWafDomainResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OutPutDomains")
    public java.util.List<DescribeCdnWafDomainResponseBodyOutPutDomains> outPutDomains;

    public static DescribeCdnWafDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnWafDomainResponseBody self = new DescribeCdnWafDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnWafDomainResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCdnWafDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnWafDomainResponseBody setOutPutDomains(java.util.List<DescribeCdnWafDomainResponseBodyOutPutDomains> outPutDomains) {
        this.outPutDomains = outPutDomains;
        return this;
    }
    public java.util.List<DescribeCdnWafDomainResponseBodyOutPutDomains> getOutPutDomains() {
        return this.outPutDomains;
    }

    public static class DescribeCdnWafDomainResponseBodyOutPutDomains extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("CcStatus")
        public String ccStatus;

        @NameInMap("AclStatus")
        public String aclStatus;

        @NameInMap("WafStatus")
        public String wafStatus;

        public static DescribeCdnWafDomainResponseBodyOutPutDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnWafDomainResponseBodyOutPutDomains self = new DescribeCdnWafDomainResponseBodyOutPutDomains();
            return TeaModel.build(map, self);
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setCcStatus(String ccStatus) {
            this.ccStatus = ccStatus;
            return this;
        }
        public String getCcStatus() {
            return this.ccStatus;
        }

        public DescribeCdnWafDomainResponseBodyOutPutDomains setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
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
