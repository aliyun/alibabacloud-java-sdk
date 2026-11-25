// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceBelongIdentifiersRequest extends TeaModel {
    /**
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
        @NameInMap("IdentifierType")
        public String identifierType;

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
