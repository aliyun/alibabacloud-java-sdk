// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListSpareIpsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("SpareIp")
        public String spareIp;

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
