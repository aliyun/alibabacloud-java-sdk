// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatAttributeResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatEntryId")
    public String snatEntryId;

    @NameInMap("SnatEntryName")
    public String snatEntryName;

    @NameInMap("SnatIp")
    public String snatIp;

    @NameInMap("SnatIps")
    public java.util.List<DescribeSnatAttributeResponseBodySnatIps> snatIps;

    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    @NameInMap("Status")
    public String status;

    public static DescribeSnatAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatAttributeResponseBody self = new DescribeSnatAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnatAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeSnatAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeSnatAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatAttributeResponseBody setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public DescribeSnatAttributeResponseBody setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public DescribeSnatAttributeResponseBody setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public DescribeSnatAttributeResponseBody setSnatIps(java.util.List<DescribeSnatAttributeResponseBodySnatIps> snatIps) {
        this.snatIps = snatIps;
        return this;
    }
    public java.util.List<DescribeSnatAttributeResponseBodySnatIps> getSnatIps() {
        return this.snatIps;
    }

    public DescribeSnatAttributeResponseBody setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public DescribeSnatAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeSnatAttributeResponseBodySnatIps extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Status")
        public String status;

        public static DescribeSnatAttributeResponseBodySnatIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatAttributeResponseBodySnatIps self = new DescribeSnatAttributeResponseBodySnatIps();
            return TeaModel.build(map, self);
        }

        public DescribeSnatAttributeResponseBodySnatIps setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnatAttributeResponseBodySnatIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSnatAttributeResponseBodySnatIps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
