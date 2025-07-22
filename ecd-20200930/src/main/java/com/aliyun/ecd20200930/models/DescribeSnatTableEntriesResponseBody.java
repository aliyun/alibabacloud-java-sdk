// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatTableEntries")
    public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> snatTableEntries;

    public static DescribeSnatTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesResponseBody self = new DescribeSnatTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSnatTableEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnatTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatTableEntriesResponseBody setSnatTableEntries(java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> snatTableEntries) {
        this.snatTableEntries = snatTableEntries;
        return this;
    }
    public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntries> getSnatTableEntries() {
        return this.snatTableEntries;
    }

    public static class DescribeSnatTableEntriesResponseBodySnatTableEntries extends TeaModel {
        @NameInMap("EipAffinity")
        public String eipAffinity;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("SnatEntryId")
        public String snatEntryId;

        @NameInMap("SnatEntryName")
        public String snatEntryName;

        @NameInMap("SnatIp")
        public String snatIp;

        @NameInMap("SnatTableId")
        public String snatTableId;

        @NameInMap("SourceCIDR")
        public String sourceCIDR;

        @NameInMap("SourceVSwitchId")
        public String sourceVSwitchId;

        @NameInMap("Status")
        public String status;

        public static DescribeSnatTableEntriesResponseBodySnatTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseBodySnatTableEntries self = new DescribeSnatTableEntriesResponseBodySnatTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setEipAffinity(String eipAffinity) {
            this.eipAffinity = eipAffinity;
            return this;
        }
        public String getEipAffinity() {
            return this.eipAffinity;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }
        public String getSnatEntryName() {
            return this.snatEntryName;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }
        public String getSnatIp() {
            return this.snatIp;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatTableId(String snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public String getSnatTableId() {
            return this.snatTableId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSourceVSwitchId(String sourceVSwitchId) {
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }
        public String getSourceVSwitchId() {
            return this.sourceVSwitchId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
