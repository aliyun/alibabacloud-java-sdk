// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListUserDefineRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
