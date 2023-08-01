// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListUserDefineRegionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The namespaces.</p>
     */
    @NameInMap("UserDefineRegionList")
    public ListUserDefineRegionResponseBodyUserDefineRegionList userDefineRegionList;

    public static ListUserDefineRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDefineRegionResponseBody self = new ListUserDefineRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDefineRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListUserDefineRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserDefineRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDefineRegionResponseBody setUserDefineRegionList(ListUserDefineRegionResponseBodyUserDefineRegionList userDefineRegionList) {
        this.userDefineRegionList = userDefineRegionList;
        return this;
    }
    public ListUserDefineRegionResponseBodyUserDefineRegionList getUserDefineRegionList() {
        return this.userDefineRegionList;
    }

    public static class ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity extends TeaModel {
        /**
         * <p>The ID of the region to which the namespace belongs.</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>Indicates whether remote debugging is allowed.</p>
         */
        @NameInMap("DebugEnable")
        public Boolean debugEnable;

        /**
         * <p>The description of the namespace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique identifier of the namespace.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the registry. Valid values:</p>
         * <br>
         * <p>*   default: shared service registry of Enterprise Distributed Application Service (EDAS)</p>
         * <p>*   exclusive_mse: Microservices Engine (MSE) Nacos registry</p>
         */
        @NameInMap("MseInstanceId")
        public String mseInstanceId;

        /**
         * <p>The ID of the namespace.</p>
         * <br>
         * <p>> The ID cannot be changed after the namespace is created. The ID is in the `Physical region ID:Logical region identifier` format .</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The ID of the MSE instance.</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the namespace belongs.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity self = new ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity();
            return TeaModel.build(map, self);
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setBelongRegion(String belongRegion) {
            this.belongRegion = belongRegion;
            return this;
        }
        public String getBelongRegion() {
            return this.belongRegion;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setDebugEnable(Boolean debugEnable) {
            this.debugEnable = debugEnable;
            return this;
        }
        public Boolean getDebugEnable() {
            return this.debugEnable;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setMseInstanceId(String mseInstanceId) {
            this.mseInstanceId = mseInstanceId;
            return this;
        }
        public String getMseInstanceId() {
            return this.mseInstanceId;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListUserDefineRegionResponseBodyUserDefineRegionList extends TeaModel {
        @NameInMap("UserDefineRegionEntity")
        public java.util.List<ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity> userDefineRegionEntity;

        public static ListUserDefineRegionResponseBodyUserDefineRegionList build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefineRegionResponseBodyUserDefineRegionList self = new ListUserDefineRegionResponseBodyUserDefineRegionList();
            return TeaModel.build(map, self);
        }

        public ListUserDefineRegionResponseBodyUserDefineRegionList setUserDefineRegionEntity(java.util.List<ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity> userDefineRegionEntity) {
            this.userDefineRegionEntity = userDefineRegionEntity;
            return this;
        }
        public java.util.List<ListUserDefineRegionResponseBodyUserDefineRegionListUserDefineRegionEntity> getUserDefineRegionEntity() {
            return this.userDefineRegionEntity;
        }

    }

}
