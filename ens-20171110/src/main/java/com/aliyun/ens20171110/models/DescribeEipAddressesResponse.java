// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EipAddresses")
    @Validation(required = true)
    public DescribeEipAddressesResponseEipAddresses eipAddresses;

    public static DescribeEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponse self = new DescribeEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipAddressesResponse setEipAddresses(DescribeEipAddressesResponseEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public DescribeEipAddressesResponseEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddress extends TeaModel {
        @NameInMap("Eip")
        @Validation(required = true)
        public String eip;

        @NameInMap("InstanceIdInternetIp")
        @Validation(required = true)
        public String instanceIdInternetIp;

        public static DescribeEipAddressesResponseEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddress self = new DescribeEipAddressesResponseEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeEipAddressesResponseEipAddressesEipAddress setInstanceIdInternetIp(String instanceIdInternetIp) {
            this.instanceIdInternetIp = instanceIdInternetIp;
            return this;
        }
        public String getInstanceIdInternetIp() {
            return this.instanceIdInternetIp;
        }

    }

    public static class DescribeEipAddressesResponseEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        @Validation(required = true)
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> eipAddress;

        public static DescribeEipAddressesResponseEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddresses self = new DescribeEipAddressesResponseEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseEipAddresses setEipAddress(java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
