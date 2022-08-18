// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsAccountSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribePdnsAccountSummaryResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePdnsAccountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsAccountSummaryResponseBody self = new DescribePdnsAccountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsAccountSummaryResponseBody setData(DescribePdnsAccountSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePdnsAccountSummaryResponseBodyData getData() {
        return this.data;
    }

    public DescribePdnsAccountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePdnsAccountSummaryResponseBodyData extends TeaModel {
        @NameInMap("DomainCount")
        public Long domainCount;

        @NameInMap("HttpCount")
        public Long httpCount;

        @NameInMap("HttpsCount")
        public Long httpsCount;

        @NameInMap("SubDomainCount")
        public Long subDomainCount;

        @NameInMap("ThreatCount")
        public Long threatCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UserId")
        public Long userId;

        public static DescribePdnsAccountSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsAccountSummaryResponseBodyData self = new DescribePdnsAccountSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePdnsAccountSummaryResponseBodyData setDomainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Long getDomainCount() {
            return this.domainCount;
        }

        public DescribePdnsAccountSummaryResponseBodyData setHttpCount(Long httpCount) {
            this.httpCount = httpCount;
            return this;
        }
        public Long getHttpCount() {
            return this.httpCount;
        }

        public DescribePdnsAccountSummaryResponseBodyData setHttpsCount(Long httpsCount) {
            this.httpsCount = httpsCount;
            return this;
        }
        public Long getHttpsCount() {
            return this.httpsCount;
        }

        public DescribePdnsAccountSummaryResponseBodyData setSubDomainCount(Long subDomainCount) {
            this.subDomainCount = subDomainCount;
            return this;
        }
        public Long getSubDomainCount() {
            return this.subDomainCount;
        }

        public DescribePdnsAccountSummaryResponseBodyData setThreatCount(Long threatCount) {
            this.threatCount = threatCount;
            return this;
        }
        public Long getThreatCount() {
            return this.threatCount;
        }

        public DescribePdnsAccountSummaryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribePdnsAccountSummaryResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
