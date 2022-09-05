// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDrivesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Drives")
    public java.util.List<DescribeDrivesResponseBodyDrives> drives;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrivesResponseBody self = new DescribeDrivesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrivesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDrivesResponseBody setDrives(java.util.List<DescribeDrivesResponseBodyDrives> drives) {
        this.drives = drives;
        return this;
    }
    public java.util.List<DescribeDrivesResponseBodyDrives> getDrives() {
        return this.drives;
    }

    public DescribeDrivesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDrivesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrivesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrivesResponseBodyDrivesDesktopGroups extends TeaModel {
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        public static DescribeDrivesResponseBodyDrivesDesktopGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrivesResponseBodyDrivesDesktopGroups self = new DescribeDrivesResponseBodyDrivesDesktopGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDrivesResponseBodyDrivesDesktopGroups setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDrivesResponseBodyDrivesDesktopGroups setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

    }

    public static class DescribeDrivesResponseBodyDrives extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Description")
        public String description;

        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        @NameInMap("DesktopGroups")
        public java.util.List<DescribeDrivesResponseBodyDrivesDesktopGroups> desktopGroups;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("DriveId")
        public String driveId;

        @NameInMap("EnableProfileManagement")
        public Boolean enableProfileManagement;

        @NameInMap("ExternalDomainId")
        public String externalDomainId;

        @NameInMap("ExternalDriveId")
        public String externalDriveId;

        @NameInMap("ExternalUserId")
        public String externalUserId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProfileRoaming")
        public Boolean profileRoaming;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("Type")
        public String type;

        @NameInMap("UsedSize")
        public Long usedSize;

        @NameInMap("UserId")
        public String userId;

        public static DescribeDrivesResponseBodyDrives build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrivesResponseBodyDrives self = new DescribeDrivesResponseBodyDrives();
            return TeaModel.build(map, self);
        }

        public DescribeDrivesResponseBodyDrives setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDrivesResponseBodyDrives setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrivesResponseBodyDrives setDesktopGroupCount(Integer desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public DescribeDrivesResponseBodyDrives setDesktopGroups(java.util.List<DescribeDrivesResponseBodyDrivesDesktopGroups> desktopGroups) {
            this.desktopGroups = desktopGroups;
            return this;
        }
        public java.util.List<DescribeDrivesResponseBodyDrivesDesktopGroups> getDesktopGroups() {
            return this.desktopGroups;
        }

        public DescribeDrivesResponseBodyDrives setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDrivesResponseBodyDrives setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public DescribeDrivesResponseBodyDrives setEnableProfileManagement(Boolean enableProfileManagement) {
            this.enableProfileManagement = enableProfileManagement;
            return this;
        }
        public Boolean getEnableProfileManagement() {
            return this.enableProfileManagement;
        }

        public DescribeDrivesResponseBodyDrives setExternalDomainId(String externalDomainId) {
            this.externalDomainId = externalDomainId;
            return this;
        }
        public String getExternalDomainId() {
            return this.externalDomainId;
        }

        public DescribeDrivesResponseBodyDrives setExternalDriveId(String externalDriveId) {
            this.externalDriveId = externalDriveId;
            return this;
        }
        public String getExternalDriveId() {
            return this.externalDriveId;
        }

        public DescribeDrivesResponseBodyDrives setExternalUserId(String externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }
        public String getExternalUserId() {
            return this.externalUserId;
        }

        public DescribeDrivesResponseBodyDrives setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDrivesResponseBodyDrives setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDrivesResponseBodyDrives setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDrivesResponseBodyDrives setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDrivesResponseBodyDrives setProfileRoaming(Boolean profileRoaming) {
            this.profileRoaming = profileRoaming;
            return this;
        }
        public Boolean getProfileRoaming() {
            return this.profileRoaming;
        }

        public DescribeDrivesResponseBodyDrives setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrivesResponseBodyDrives setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeDrivesResponseBodyDrives setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrivesResponseBodyDrives setUsedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }
        public Long getUsedSize() {
            return this.usedSize;
        }

        public DescribeDrivesResponseBodyDrives setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
