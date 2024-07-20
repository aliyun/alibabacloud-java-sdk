// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListSpareIpsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The secondary IP addresses that are associated with the CNAME.</p>
     */
    @NameInMap("SpareIps")
    public java.util.List<ListSpareIpsResponseBodySpareIps> spareIps;

    public static ListSpareIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpareIpsResponseBody self = new ListSpareIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpareIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpareIpsResponseBody setSpareIps(java.util.List<ListSpareIpsResponseBodySpareIps> spareIps) {
        this.spareIps = spareIps;
        return this;
    }
    public java.util.List<ListSpareIpsResponseBodySpareIps> getSpareIps() {
        return this.spareIps;
    }

    public static class ListSpareIpsResponseBodySpareIps extends TeaModel {
        /**
         * <p>The secondary IP address that is associated with the CNAME. If the acceleration area becomes unavailable, GA redirects traffic to the secondary IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("SpareIp")
        public String spareIp;

        /**
         * <p>The status of the secondary IP address. Valid values:</p>
         * <ul>
         * <li><strong>active:</strong> The secondary IP address is available.</li>
         * <li><strong>inuse:</strong> The secondary IP address is in use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        public static ListSpareIpsResponseBodySpareIps build(java.util.Map<String, ?> map) throws Exception {
            ListSpareIpsResponseBodySpareIps self = new ListSpareIpsResponseBodySpareIps();
            return TeaModel.build(map, self);
        }

        public ListSpareIpsResponseBodySpareIps setSpareIp(String spareIp) {
            this.spareIp = spareIp;
            return this;
        }
        public String getSpareIp() {
            return this.spareIp;
        }

        public ListSpareIpsResponseBodySpareIps setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
