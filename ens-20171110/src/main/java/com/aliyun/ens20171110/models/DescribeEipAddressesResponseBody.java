// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponseBody extends TeaModel {
    @NameInMap("EipAddresses")
    public DescribeEipAddressesResponseBodyEipAddresses eipAddresses;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponseBody self = new DescribeEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponseBody setEipAddresses(DescribeEipAddressesResponseBodyEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public DescribeEipAddressesResponseBodyEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public DescribeEipAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddress extends TeaModel {
        @NameInMap("Eip")
        public String eip;

        @NameInMap("InstanceIdInternetIp")
        public String instanceIdInternetIp;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddress self = new DescribeEipAddressesResponseBodyEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceIdInternetIp(String instanceIdInternetIp) {
            this.instanceIdInternetIp = instanceIdInternetIp;
            return this;
        }
        public String getInstanceIdInternetIp() {
            return this.instanceIdInternetIp;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> eipAddress;

        public static DescribeEipAddressesResponseBodyEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddresses self = new DescribeEipAddressesResponseBodyEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddresses setEipAddress(java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
