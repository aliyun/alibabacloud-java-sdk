// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpNonePoolListResponseBody extends TeaModel {
    /**
     * <p>Information on IPs not added to the IP pool</p>
     */
    @NameInMap("Ips")
    public java.util.List<DedicatedIpNonePoolListResponseBodyIps> ips;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DedicatedIpNonePoolListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpNonePoolListResponseBody self = new DedicatedIpNonePoolListResponseBody();
        return TeaModel.build(map, self);
    }

    public DedicatedIpNonePoolListResponseBody setIps(java.util.List<DedicatedIpNonePoolListResponseBodyIps> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<DedicatedIpNonePoolListResponseBodyIps> getIps() {
        return this.ips;
    }

    public DedicatedIpNonePoolListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DedicatedIpNonePoolListResponseBodyIps extends TeaModel {
        /**
         * <p>Purchased instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>IP address</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Ip")
        public String ip;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DedicatedIpNonePoolListResponseBodyIps build(java.util.Map<String, ?> map) throws Exception {
            DedicatedIpNonePoolListResponseBodyIps self = new DedicatedIpNonePoolListResponseBodyIps();
            return TeaModel.build(map, self);
        }

        public DedicatedIpNonePoolListResponseBodyIps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DedicatedIpNonePoolListResponseBodyIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DedicatedIpNonePoolListResponseBodyIps setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
