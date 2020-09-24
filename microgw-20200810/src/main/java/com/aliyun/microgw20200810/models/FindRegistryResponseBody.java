// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindRegistryResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.List<FindRegistryResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static FindRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindRegistryResponseBody self = new FindRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public FindRegistryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public FindRegistryResponseBody setData(java.util.List<FindRegistryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FindRegistryResponseBodyData> getData() {
        return this.data;
    }

    public FindRegistryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class FindRegistryResponseBodyData extends TeaModel {
        // address
        @NameInMap("address")
        public String address;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // description
        @NameInMap("description")
        public String description;

        // gatewayId
        @NameInMap("gatewayId")
        public String gatewayId;

        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // type
        @NameInMap("type")
        public Long type;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static FindRegistryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindRegistryResponseBodyData self = new FindRegistryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindRegistryResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public FindRegistryResponseBodyData setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindRegistryResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindRegistryResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public FindRegistryResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindRegistryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindRegistryResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public FindRegistryResponseBodyData setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

}
