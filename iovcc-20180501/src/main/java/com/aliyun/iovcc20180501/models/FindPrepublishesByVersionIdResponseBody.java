// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishesByVersionIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrepublishList")
    public java.util.List<FindPrepublishesByVersionIdResponseBodyPrepublishList> prepublishList;

    public static FindPrepublishesByVersionIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishesByVersionIdResponseBody self = new FindPrepublishesByVersionIdResponseBody();
        return TeaModel.build(map, self);
    }

    public FindPrepublishesByVersionIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindPrepublishesByVersionIdResponseBody setPrepublishList(java.util.List<FindPrepublishesByVersionIdResponseBodyPrepublishList> prepublishList) {
        this.prepublishList = prepublishList;
        return this;
    }
    public java.util.List<FindPrepublishesByVersionIdResponseBodyPrepublishList> getPrepublishList() {
        return this.prepublishList;
    }

    public static class FindPrepublishesByVersionIdResponseBodyPrepublishList extends TeaModel {
        @NameInMap("Id")
        public String id;

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

        @NameInMap("DeviceModelName")
        public String deviceModelName;

        @NameInMap("PassedCount")
        public String passedCount;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static FindPrepublishesByVersionIdResponseBodyPrepublishList build(java.util.Map<String, ?> map) throws Exception {
            FindPrepublishesByVersionIdResponseBodyPrepublishList self = new FindPrepublishesByVersionIdResponseBodyPrepublishList();
            return TeaModel.build(map, self);
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setBarrierCount(String barrierCount) {
            this.barrierCount = barrierCount;
            return this;
        }
        public String getBarrierCount() {
            return this.barrierCount;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setDeviceModelId(String deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setIsActive(String isActive) {
            this.isActive = isActive;
            return this;
        }
        public String getIsActive() {
            return this.isActive;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setIsTotalPrepublish(String isTotalPrepublish) {
            this.isTotalPrepublish = isTotalPrepublish;
            return this;
        }
        public String getIsTotalPrepublish() {
            return this.isTotalPrepublish;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setDeviceModelName(String deviceModelName) {
            this.deviceModelName = deviceModelName;
            return this;
        }
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setPassedCount(String passedCount) {
            this.passedCount = passedCount;
            return this;
        }
        public String getPassedCount() {
            return this.passedCount;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindPrepublishesByVersionIdResponseBodyPrepublishList setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

}
