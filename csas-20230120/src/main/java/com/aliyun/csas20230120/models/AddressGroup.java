// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddressGroup extends TeaModel {
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    @NameInMap("Ports")
    public java.util.List<AddressGroupPorts> ports;

    public static AddressGroup build(java.util.Map<String, ?> map) throws Exception {
        AddressGroup self = new AddressGroup();
        return TeaModel.build(map, self);
    }

    public AddressGroup setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public AddressGroup setPorts(java.util.List<AddressGroupPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<AddressGroupPorts> getPorts() {
        return this.ports;
    }

    public static class AddressGroupPorts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("End")
        public Integer end;

        public static AddressGroupPorts build(java.util.Map<String, ?> map) throws Exception {
            AddressGroupPorts self = new AddressGroupPorts();
            return TeaModel.build(map, self);
        }

        public AddressGroupPorts setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public AddressGroupPorts setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
