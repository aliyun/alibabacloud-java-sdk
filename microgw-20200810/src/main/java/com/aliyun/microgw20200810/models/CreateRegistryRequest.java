// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateRegistryRequest extends TeaModel {
    // ServiceCreateDTO
    @NameInMap("data")
    public CreateRegistryRequestData data;

    public static CreateRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryRequest self = new CreateRegistryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRegistryRequest setData(CreateRegistryRequestData data) {
        this.data = data;
        return this;
    }
    public CreateRegistryRequestData getData() {
        return this.data;
    }

    public static class CreateRegistryRequestData extends TeaModel {
        // address
        @NameInMap("address")
        public String address;

        // description
        @NameInMap("description")
        public String description;

        // gatewayId
        @NameInMap("gatewayId")
        public Long gatewayId;

        // id
        @NameInMap("id")
        public String id;

        // name
        @NameInMap("name")
        public String name;

        // type
        @NameInMap("type")
        public Long type;

        public static CreateRegistryRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateRegistryRequestData self = new CreateRegistryRequestData();
            return TeaModel.build(map, self);
        }

        public CreateRegistryRequestData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateRegistryRequestData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRegistryRequestData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public CreateRegistryRequestData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateRegistryRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRegistryRequestData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
