// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AllocateEipAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BizStatusCode")
    @Validation(required = true)
    public String bizStatusCode;

    @NameInMap("EipAddresses")
    @Validation(required = true)
    public AllocateEipAddressResponseEipAddresses eipAddresses;

    public static AllocateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressResponse self = new AllocateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateEipAddressResponse setBizStatusCode(String bizStatusCode) {
        this.bizStatusCode = bizStatusCode;
        return this;
    }
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    public AllocateEipAddressResponse setEipAddresses(AllocateEipAddressResponseEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public AllocateEipAddressResponseEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public static class AllocateEipAddressResponseEipAddressesEipAddress extends TeaModel {
        @NameInMap("Eip")
        @Validation(required = true)
        public String eip;

        public static AllocateEipAddressResponseEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            AllocateEipAddressResponseEipAddressesEipAddress self = new AllocateEipAddressResponseEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public AllocateEipAddressResponseEipAddressesEipAddress setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

    }

    public static class AllocateEipAddressResponseEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        @Validation(required = true)
        public java.util.List<AllocateEipAddressResponseEipAddressesEipAddress> eipAddress;

        public static AllocateEipAddressResponseEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            AllocateEipAddressResponseEipAddresses self = new AllocateEipAddressResponseEipAddresses();
            return TeaModel.build(map, self);
        }

        public AllocateEipAddressResponseEipAddresses setEipAddress(java.util.List<AllocateEipAddressResponseEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<AllocateEipAddressResponseEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
