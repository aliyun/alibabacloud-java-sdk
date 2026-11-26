// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceBelongIdentifiersRequest extends TeaModel {
    /**
     * <p>The list of device ownership identifiers to add. Each batch supports 1 to 1,000 items. Each item must include IdentifierType and IdentifierValue.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Identifiers")
    public java.util.List<AddDeviceBelongIdentifiersRequestIdentifiers> identifiers;

    public static AddDeviceBelongIdentifiersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceBelongIdentifiersRequest self = new AddDeviceBelongIdentifiersRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceBelongIdentifiersRequest setIdentifiers(java.util.List<AddDeviceBelongIdentifiersRequestIdentifiers> identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public java.util.List<AddDeviceBelongIdentifiersRequestIdentifiers> getIdentifiers() {
        return this.identifiers;
    }

    public static class AddDeviceBelongIdentifiersRequestIdentifiers extends TeaModel {
        /**
         * <p>The identifier type. MAC indicates a network interface controller (NIC) MAC address, SystemSN indicates a system serial number, and BIOSSN indicates a BIOS serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>MAC</p>
         */
        @NameInMap("IdentifierType")
        public String identifierType;

        /**
         * <p>The identifier value. A MAC address must be a 6-byte address. A system serial number accepts 1 to 64 characters, and a BIOS serial number accepts 1 to 128 characters. MAC addresses are converted to the lowercase colon-separated format when stored, while system serial numbers and BIOS serial numbers retain their original values.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00:00:00:01</p>
         */
        @NameInMap("IdentifierValue")
        public String identifierValue;

        public static AddDeviceBelongIdentifiersRequestIdentifiers build(java.util.Map<String, ?> map) throws Exception {
            AddDeviceBelongIdentifiersRequestIdentifiers self = new AddDeviceBelongIdentifiersRequestIdentifiers();
            return TeaModel.build(map, self);
        }

        public AddDeviceBelongIdentifiersRequestIdentifiers setIdentifierType(String identifierType) {
            this.identifierType = identifierType;
            return this;
        }
        public String getIdentifierType() {
            return this.identifierType;
        }

        public AddDeviceBelongIdentifiersRequestIdentifiers setIdentifierValue(String identifierValue) {
            this.identifierValue = identifierValue;
            return this;
        }
        public String getIdentifierValue() {
            return this.identifierValue;
        }

    }

}
