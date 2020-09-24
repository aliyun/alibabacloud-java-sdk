// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class ValidateRegistryAddressRequest extends TeaModel {
    // RegistryValidateDTO
    @NameInMap("data")
    public ValidateRegistryAddressRequestData data;

    public static ValidateRegistryAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateRegistryAddressRequest self = new ValidateRegistryAddressRequest();
        return TeaModel.build(map, self);
    }

    public ValidateRegistryAddressRequest setData(ValidateRegistryAddressRequestData data) {
        this.data = data;
        return this;
    }
    public ValidateRegistryAddressRequestData getData() {
        return this.data;
    }

    public static class ValidateRegistryAddressRequestData extends TeaModel {
        // address
        @NameInMap("address")
        public String address;

        // type
        @NameInMap("type")
        public Long type;

        public static ValidateRegistryAddressRequestData build(java.util.Map<String, ?> map) throws Exception {
            ValidateRegistryAddressRequestData self = new ValidateRegistryAddressRequestData();
            return TeaModel.build(map, self);
        }

        public ValidateRegistryAddressRequestData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ValidateRegistryAddressRequestData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
