// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetAllRegistryResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public GetAllRegistryResponseBodyData data;

    // message
    @NameInMap("message")
    public String message;

    public static GetAllRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegistryResponseBody self = new GetAllRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllRegistryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAllRegistryResponseBody setData(GetAllRegistryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAllRegistryResponseBodyData getData() {
        return this.data;
    }

    public GetAllRegistryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetAllRegistryResponseBodyDataList extends TeaModel {
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

        public static GetAllRegistryResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllRegistryResponseBodyDataList self = new GetAllRegistryResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAllRegistryResponseBodyDataList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetAllRegistryResponseBodyDataList setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetAllRegistryResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAllRegistryResponseBodyDataList setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetAllRegistryResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAllRegistryResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAllRegistryResponseBodyDataList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public GetAllRegistryResponseBodyDataList setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class GetAllRegistryResponseBodyData extends TeaModel {
        // list
        @NameInMap("list")
        public java.util.List<GetAllRegistryResponseBodyDataList> list;

        // totalCount
        @NameInMap("totalCount")
        public Long totalCount;

        public static GetAllRegistryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAllRegistryResponseBodyData self = new GetAllRegistryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAllRegistryResponseBodyData setList(java.util.List<GetAllRegistryResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAllRegistryResponseBodyDataList> getList() {
            return this.list;
        }

        public GetAllRegistryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
