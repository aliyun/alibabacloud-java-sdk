// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindAllServiceResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public FindAllServiceResponseBodyData data;

    // message
    @NameInMap("message")
    public String message;

    public static FindAllServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindAllServiceResponseBody self = new FindAllServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public FindAllServiceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public FindAllServiceResponseBody setData(FindAllServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindAllServiceResponseBodyData getData() {
        return this.data;
    }

    public FindAllServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class FindAllServiceResponseBodyDataListServiceEnds extends TeaModel {
        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // id
        @NameInMap("id")
        public Long id;

        // ipAddress
        @NameInMap("ipAddress")
        public String ipAddress;

        // port
        @NameInMap("port")
        public String port;

        // serviceId
        @NameInMap("serviceId")
        public Long serviceId;

        // status
        @NameInMap("status")
        public Long status;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static FindAllServiceResponseBodyDataListServiceEnds build(java.util.Map<String, ?> map) throws Exception {
            FindAllServiceResponseBodyDataListServiceEnds self = new FindAllServiceResponseBodyDataListServiceEnds();
            return TeaModel.build(map, self);
        }

        public FindAllServiceResponseBodyDataListServiceEnds setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindAllServiceResponseBodyDataListServiceEnds setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindAllServiceResponseBodyDataListServiceEnds setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public FindAllServiceResponseBodyDataListServiceEnds setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public FindAllServiceResponseBodyDataListServiceEnds setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public FindAllServiceResponseBodyDataListServiceEnds setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public FindAllServiceResponseBodyDataListServiceEnds setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindAllServiceResponseBodyDataList extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // description
        @NameInMap("description")
        public String description;

        // id
        @NameInMap("id")
        public Long id;

        // isAutoRefresh
        @NameInMap("isAutoRefresh")
        public Boolean isAutoRefresh;

        // isHealth
        @NameInMap("isHealth")
        public Boolean isHealth;

        // name
        @NameInMap("name")
        public String name;

        // registryId
        @NameInMap("registryId")
        public String registryId;

        // serviceEnds
        @NameInMap("serviceEnds")
        public java.util.List<FindAllServiceResponseBodyDataListServiceEnds> serviceEnds;

        // serviceNameInRegistry
        @NameInMap("serviceNameInRegistry")
        public String serviceNameInRegistry;

        // sourceType
        @NameInMap("sourceType")
        public Long sourceType;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static FindAllServiceResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            FindAllServiceResponseBodyDataList self = new FindAllServiceResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public FindAllServiceResponseBodyDataList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public FindAllServiceResponseBodyDataList setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindAllServiceResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindAllServiceResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindAllServiceResponseBodyDataList setIsAutoRefresh(Boolean isAutoRefresh) {
            this.isAutoRefresh = isAutoRefresh;
            return this;
        }
        public Boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        public FindAllServiceResponseBodyDataList setIsHealth(Boolean isHealth) {
            this.isHealth = isHealth;
            return this;
        }
        public Boolean getIsHealth() {
            return this.isHealth;
        }

        public FindAllServiceResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindAllServiceResponseBodyDataList setRegistryId(String registryId) {
            this.registryId = registryId;
            return this;
        }
        public String getRegistryId() {
            return this.registryId;
        }

        public FindAllServiceResponseBodyDataList setServiceEnds(java.util.List<FindAllServiceResponseBodyDataListServiceEnds> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<FindAllServiceResponseBodyDataListServiceEnds> getServiceEnds() {
            return this.serviceEnds;
        }

        public FindAllServiceResponseBodyDataList setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public FindAllServiceResponseBodyDataList setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public FindAllServiceResponseBodyDataList setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindAllServiceResponseBodyData extends TeaModel {
        // list
        @NameInMap("list")
        public java.util.List<FindAllServiceResponseBodyDataList> list;

        // totalCount
        @NameInMap("totalCount")
        public Long totalCount;

        public static FindAllServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindAllServiceResponseBodyData self = new FindAllServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindAllServiceResponseBodyData setList(java.util.List<FindAllServiceResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FindAllServiceResponseBodyDataList> getList() {
            return this.list;
        }

        public FindAllServiceResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
