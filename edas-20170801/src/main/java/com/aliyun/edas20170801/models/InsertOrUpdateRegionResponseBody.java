// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertOrUpdateRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserDefineRegionEntity")
    public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity userDefineRegionEntity;

    public static InsertOrUpdateRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertOrUpdateRegionResponseBody self = new InsertOrUpdateRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertOrUpdateRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertOrUpdateRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertOrUpdateRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertOrUpdateRegionResponseBody setUserDefineRegionEntity(InsertOrUpdateRegionResponseBodyUserDefineRegionEntity userDefineRegionEntity) {
        this.userDefineRegionEntity = userDefineRegionEntity;
        return this;
    }
    public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity getUserDefineRegionEntity() {
        return this.userDefineRegionEntity;
    }

    public static class InsertOrUpdateRegionResponseBodyUserDefineRegionEntity extends TeaModel {
        @NameInMap("BelongRegion")
        public String belongRegion;

        @NameInMap("DebugEnable")
        public Boolean debugEnable;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("UserId")
        public String userId;

        public static InsertOrUpdateRegionResponseBodyUserDefineRegionEntity build(java.util.Map<String, ?> map) throws Exception {
            InsertOrUpdateRegionResponseBodyUserDefineRegionEntity self = new InsertOrUpdateRegionResponseBodyUserDefineRegionEntity();
            return TeaModel.build(map, self);
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setBelongRegion(String belongRegion) {
            this.belongRegion = belongRegion;
            return this;
        }
        public String getBelongRegion() {
            return this.belongRegion;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setDebugEnable(Boolean debugEnable) {
            this.debugEnable = debugEnable;
            return this;
        }
        public Boolean getDebugEnable() {
            return this.debugEnable;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
