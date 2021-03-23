// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindOsVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OsVersionList")
    public FindOsVersionsResponseBodyOsVersionList osVersionList;

    public static FindOsVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindOsVersionsResponseBody self = new FindOsVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public FindOsVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindOsVersionsResponseBody setOsVersionList(FindOsVersionsResponseBodyOsVersionList osVersionList) {
        this.osVersionList = osVersionList;
        return this;
    }
    public FindOsVersionsResponseBodyOsVersionList getOsVersionList() {
        return this.osVersionList;
    }

    public static class FindOsVersionsResponseBodyOsVersionListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("DeviceModelId")
        public String deviceModelId;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("Status")
        public String status;

        @NameInMap("IsMilestone")
        public String isMilestone;

        @NameInMap("IsForceUpgrade")
        public String isForceUpgrade;

        @NameInMap("IsSilentUpgrade")
        public String isSilentUpgrade;

        @NameInMap("IsForceReboot")
        public String isForceReboot;

        @NameInMap("IsForceNightUpgrade")
        public String isForceNightUpgrade;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("DeviceModelName")
        public String deviceModelName;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static FindOsVersionsResponseBodyOsVersionListItems build(java.util.Map<String, ?> map) throws Exception {
            FindOsVersionsResponseBodyOsVersionListItems self = new FindOsVersionsResponseBodyOsVersionListItems();
            return TeaModel.build(map, self);
        }

        public FindOsVersionsResponseBodyOsVersionListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setDeviceModelId(String deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsMilestone(String isMilestone) {
            this.isMilestone = isMilestone;
            return this;
        }
        public String getIsMilestone() {
            return this.isMilestone;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsForceUpgrade(String isForceUpgrade) {
            this.isForceUpgrade = isForceUpgrade;
            return this;
        }
        public String getIsForceUpgrade() {
            return this.isForceUpgrade;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsSilentUpgrade(String isSilentUpgrade) {
            this.isSilentUpgrade = isSilentUpgrade;
            return this;
        }
        public String getIsSilentUpgrade() {
            return this.isSilentUpgrade;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsForceReboot(String isForceReboot) {
            this.isForceReboot = isForceReboot;
            return this;
        }
        public String getIsForceReboot() {
            return this.isForceReboot;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsForceNightUpgrade(String isForceNightUpgrade) {
            this.isForceNightUpgrade = isForceNightUpgrade;
            return this;
        }
        public String getIsForceNightUpgrade() {
            return this.isForceNightUpgrade;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setDeviceModelName(String deviceModelName) {
            this.deviceModelName = deviceModelName;
            return this;
        }
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

    public static class FindOsVersionsResponseBodyOsVersionList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindOsVersionsResponseBodyOsVersionListItems> items;

        public static FindOsVersionsResponseBodyOsVersionList build(java.util.Map<String, ?> map) throws Exception {
            FindOsVersionsResponseBodyOsVersionList self = new FindOsVersionsResponseBodyOsVersionList();
            return TeaModel.build(map, self);
        }

        public FindOsVersionsResponseBodyOsVersionList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindOsVersionsResponseBodyOsVersionList setItems(java.util.List<FindOsVersionsResponseBodyOsVersionListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindOsVersionsResponseBodyOsVersionListItems> getItems() {
            return this.items;
        }

    }

}
