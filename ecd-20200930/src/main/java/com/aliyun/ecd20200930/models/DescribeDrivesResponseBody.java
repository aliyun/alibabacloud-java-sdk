// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDrivesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Drives")
    public java.util.List<DescribeDrivesResponseBodyDrives> drives;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAA****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>B7AA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    public DescribeDrivesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
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

    public DescribeDrivesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <strong>example:</strong>
         * <p>dg-aaaa****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <strong>example:</strong>
         * <p>group01</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1202****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        @NameInMap("DesktopGroups")
        public java.util.List<DescribeDrivesResponseBodyDrivesDesktopGroups> desktopGroups;

        /**
         * <strong>example:</strong>
         * <p>dom-aaaa****</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <strong>example:</strong>
         * <p>dri-aaaa****</p>
         */
        @NameInMap("DriveId")
        public String driveId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableProfileManagement")
        public Boolean enableProfileManagement;

        /**
         * <strong>example:</strong>
         * <p>0976****</p>
         */
        @NameInMap("ExternalDomainId")
        public String externalDomainId;

        /**
         * <strong>example:</strong>
         * <p>1100****</p>
         */
        @NameInMap("ExternalDriveId")
        public String externalDriveId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:user01@cn-hangzhou.120">user01@cn-hangzhou.120</a>****</p>
         */
        @NameInMap("ExternalUserId")
        public String externalUserId;

        /**
         * <strong>example:</strong>
         * <p>2025-07-02T08:42:26.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-07-07T02:46:04.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ProfileRoaming")
        public Boolean profileRoaming;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>536870912000</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <strong>example:</strong>
         * <p>USER_PROFILE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>243175936</p>
         */
        @NameInMap("UsedSize")
        public Long usedSize;

        /**
         * <strong>example:</strong>
         * <p>user01</p>
         */
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
