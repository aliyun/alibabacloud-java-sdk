// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDriveResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Drive")
    public CreateDriveResponseBodyDrive drive;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDriveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDriveResponseBody self = new CreateDriveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDriveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDriveResponseBody setDrive(CreateDriveResponseBodyDrive drive) {
        this.drive = drive;
        return this;
    }
    public CreateDriveResponseBodyDrive getDrive() {
        return this.drive;
    }

    public CreateDriveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDriveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDriveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDriveResponseBodyDrive extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("DriveId")
        public String driveId;

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

        public static CreateDriveResponseBodyDrive build(java.util.Map<String, ?> map) throws Exception {
            CreateDriveResponseBodyDrive self = new CreateDriveResponseBodyDrive();
            return TeaModel.build(map, self);
        }

        public CreateDriveResponseBodyDrive setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public CreateDriveResponseBodyDrive setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDriveResponseBodyDrive setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public CreateDriveResponseBodyDrive setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public CreateDriveResponseBodyDrive setExternalDriveId(String externalDriveId) {
            this.externalDriveId = externalDriveId;
            return this;
        }
        public String getExternalDriveId() {
            return this.externalDriveId;
        }

        public CreateDriveResponseBodyDrive setExternalUserId(String externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }
        public String getExternalUserId() {
            return this.externalUserId;
        }

        public CreateDriveResponseBodyDrive setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDriveResponseBodyDrive setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateDriveResponseBodyDrive setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateDriveResponseBodyDrive setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDriveResponseBodyDrive setProfileRoaming(Boolean profileRoaming) {
            this.profileRoaming = profileRoaming;
            return this;
        }
        public Boolean getProfileRoaming() {
            return this.profileRoaming;
        }

        public CreateDriveResponseBodyDrive setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateDriveResponseBodyDrive setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public CreateDriveResponseBodyDrive setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDriveResponseBodyDrive setUsedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }
        public Long getUsedSize() {
            return this.usedSize;
        }

        public CreateDriveResponseBodyDrive setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
