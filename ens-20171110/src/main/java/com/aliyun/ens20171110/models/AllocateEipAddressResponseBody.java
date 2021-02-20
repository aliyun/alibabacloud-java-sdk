// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AllocateEipAddressResponseBody extends TeaModel {
    @NameInMap("BizStatusCode")
    public String bizStatusCode;

    @NameInMap("EipAddresses")
    public AllocateEipAddressResponseBodyEipAddresses eipAddresses;

    @NameInMap("RequestId")
    public String requestId;

    public static AllocateEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressResponseBody self = new AllocateEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressResponseBody setBizStatusCode(String bizStatusCode) {
        this.bizStatusCode = bizStatusCode;
        return this;
    }
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    public AllocateEipAddressResponseBody setEipAddresses(AllocateEipAddressResponseBodyEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public AllocateEipAddressResponseBodyEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public AllocateEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AllocateEipAddressResponseBodyEipAddressesEipAddress extends TeaModel {
        @NameInMap("Eip")
        public String eip;

        public static AllocateEipAddressResponseBodyEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            AllocateEipAddressResponseBodyEipAddressesEipAddress self = new AllocateEipAddressResponseBodyEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public AllocateEipAddressResponseBodyEipAddressesEipAddress setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

    }

    public static class AllocateEipAddressResponseBodyEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        public java.util.List<AllocateEipAddressResponseBodyEipAddressesEipAddress> eipAddress;

        public static AllocateEipAddressResponseBodyEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            AllocateEipAddressResponseBodyEipAddresses self = new AllocateEipAddressResponseBodyEipAddresses();
            return TeaModel.build(map, self);
        }

        public AllocateEipAddressResponseBodyEipAddresses setEipAddress(java.util.List<AllocateEipAddressResponseBodyEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<AllocateEipAddressResponseBodyEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
