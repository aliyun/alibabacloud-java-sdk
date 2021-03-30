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
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("DeviceModelId")
        public String deviceModelId;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("IsMilestone")
        public String isMilestone;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("IsForceReboot")
        public String isForceReboot;

        @NameInMap("DeviceModelName")
        public String deviceModelName;

        @NameInMap("IsSilentUpgrade")
        public String isSilentUpgrade;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        @NameInMap("IsForceNightUpgrade")
        public String isForceNightUpgrade;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IsForceUpgrade")
        public String isForceUpgrade;

        @NameInMap("Id")
        public Long id;

        public static FindOsVersionsResponseBodyOsVersionListItems build(java.util.Map<String, ?> map) throws Exception {
            FindOsVersionsResponseBodyOsVersionListItems self = new FindOsVersionsResponseBodyOsVersionListItems();
            return TeaModel.build(map, self);
        }

        public FindOsVersionsResponseBodyOsVersionListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setDeviceModelId(String deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsMilestone(String isMilestone) {
            this.isMilestone = isMilestone;
            return this;
        }
        public String getIsMilestone() {
            return this.isMilestone;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsForceReboot(String isForceReboot) {
            this.isForceReboot = isForceReboot;
            return this;
        }
        public String getIsForceReboot() {
            return this.isForceReboot;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setDeviceModelName(String deviceModelName) {
            this.deviceModelName = deviceModelName;
            return this;
        }
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setIsSilentUpgrade(String isSilentUpgrade) {
            this.isSilentUpgrade = isSilentUpgrade;
            return this;
        }
        public String getIsSilentUpgrade() {
            return this.isSilentUpgrade;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
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

        public FindOsVersionsResponseBodyOsVersionListItems setIsForceUpgrade(String isForceUpgrade) {
            this.isForceUpgrade = isForceUpgrade;
            return this;
        }
        public String getIsForceUpgrade() {
            return this.isForceUpgrade;
        }

        public FindOsVersionsResponseBodyOsVersionListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class FindOsVersionsResponseBodyOsVersionList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<FindOsVersionsResponseBodyOsVersionListItems> items;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static FindOsVersionsResponseBodyOsVersionList build(java.util.Map<String, ?> map) throws Exception {
            FindOsVersionsResponseBodyOsVersionList self = new FindOsVersionsResponseBodyOsVersionList();
            return TeaModel.build(map, self);
        }

        public FindOsVersionsResponseBodyOsVersionList setItems(java.util.List<FindOsVersionsResponseBodyOsVersionListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindOsVersionsResponseBodyOsVersionListItems> getItems() {
            return this.items;
        }

        public FindOsVersionsResponseBodyOsVersionList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
