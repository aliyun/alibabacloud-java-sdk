// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishesByParentIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrepublishList")
    public FindPrepublishesByParentIdResponseBodyPrepublishList prepublishList;

    public static FindPrepublishesByParentIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishesByParentIdResponseBody self = new FindPrepublishesByParentIdResponseBody();
        return TeaModel.build(map, self);
    }

    public FindPrepublishesByParentIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindPrepublishesByParentIdResponseBody setPrepublishList(FindPrepublishesByParentIdResponseBodyPrepublishList prepublishList) {
        this.prepublishList = prepublishList;
        return this;
    }
    public FindPrepublishesByParentIdResponseBodyPrepublishList getPrepublishList() {
        return this.prepublishList;
    }

    public static class FindPrepublishesByParentIdResponseBodyPrepublishListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("VersionType")
        public String versionType;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("BarrierCount")
        public String barrierCount;

        @NameInMap("DeviceModelId")
        public String deviceModelId;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("IsActive")
        public String isActive;

        @NameInMap("IsTotalPrepublish")
        public String isTotalPrepublish;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static FindPrepublishesByParentIdResponseBodyPrepublishListItems build(java.util.Map<String, ?> map) throws Exception {
            FindPrepublishesByParentIdResponseBodyPrepublishListItems self = new FindPrepublishesByParentIdResponseBodyPrepublishListItems();
            return TeaModel.build(map, self);
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setBarrierCount(String barrierCount) {
            this.barrierCount = barrierCount;
            return this;
        }
        public String getBarrierCount() {
            return this.barrierCount;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setDeviceModelId(String deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setIsActive(String isActive) {
            this.isActive = isActive;
            return this;
        }
        public String getIsActive() {
            return this.isActive;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setIsTotalPrepublish(String isTotalPrepublish) {
            this.isTotalPrepublish = isTotalPrepublish;
            return this;
        }
        public String getIsTotalPrepublish() {
            return this.isTotalPrepublish;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

    public static class FindPrepublishesByParentIdResponseBodyPrepublishList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindPrepublishesByParentIdResponseBodyPrepublishListItems> items;

        public static FindPrepublishesByParentIdResponseBodyPrepublishList build(java.util.Map<String, ?> map) throws Exception {
            FindPrepublishesByParentIdResponseBodyPrepublishList self = new FindPrepublishesByParentIdResponseBodyPrepublishList();
            return TeaModel.build(map, self);
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindPrepublishesByParentIdResponseBodyPrepublishList setItems(java.util.List<FindPrepublishesByParentIdResponseBodyPrepublishListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindPrepublishesByParentIdResponseBodyPrepublishListItems> getItems() {
            return this.items;
        }

    }

}
