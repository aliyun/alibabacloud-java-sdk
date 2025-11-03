// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDrivesResponseBody extends TeaModel {
    /**
     * <p>The response code. The value 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of storage resources.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The user-level storage resources.</p>
     */
    @NameInMap("Drives")
    public java.util.List<DescribeDrivesResponseBodyDrives> drives;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAA****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7AA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The ID of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-aaaa****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the cloud computer pool.</p>
         * 
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
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1202****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The introduction to the storage resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of associated cloud computer pools.</p>
         * <blockquote>
         * <p> This parameter is returned only if ResourceType is set to NAS and Type is set to USER_PROFILE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        /**
         * <p>The details of the associated cloud computers.</p>
         * <blockquote>
         * <p> This parameter is returned only if ResourceType is set to NAS and Type is set to USER_PROFILE.</p>
         * </blockquote>
         */
        @NameInMap("DesktopGroups")
        public java.util.List<DescribeDrivesResponseBodyDrivesDesktopGroups> desktopGroups;

        /**
         * <p>The ID of the storage resource.</p>
         * 
         * <strong>example:</strong>
         * <p>dom-aaaa****</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>The ID of the user-level storage resource.</p>
         * 
         * <strong>example:</strong>
         * <p>dri-aaaa****</p>
         */
        @NameInMap("DriveId")
        public String driveId;

        /**
         * <p>Indicates whether the UPM feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableProfileManagement")
        public Boolean enableProfileManagement;

        /**
         * <p>The ID of the external storage resource.</p>
         * <ul>
         * <li>If ResourceType is set to NAS, the NAS ID is returned for this parameter.</li>
         * <li>If ResourceType is set to PDS, the PDS ID is returned for this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0976****</p>
         */
        @NameInMap("ExternalDomainId")
        public String externalDomainId;

        /**
         * <p>The ID of the storage resource at the external user level.</p>
         * <blockquote>
         * <p> This parameter is returned only if ResourceType is set to PDS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1100****</p>
         */
        @NameInMap("ExternalDriveId")
        public String externalDriveId;

        /**
         * <p>The ID of the external user.</p>
         * <blockquote>
         * <p> This parameter is returned only if ResourceType is set to PDS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user01@cn-hangzhou.120">user01@cn-hangzhou.120</a>****</p>
         */
        @NameInMap("ExternalUserId")
        public String externalUserId;

        /**
         * <p>The time when the storage resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-02T08:42:26.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the storage resource was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-07T02:46:04.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The user ID.</p>
         * <blockquote>
         * <p> You can ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the storage resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <blockquote>
         * <p> This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ProfileRoaming")
        public Boolean profileRoaming;

        /**
         * <p>The status of the user-level storage resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>INIT: initializing</li>
         * <li>MAINTAIN: maintaining</li>
         * <li>DELETING: deleting</li>
         * <li>INVALID: invalid</li>
         * <li>NORMAL: normal</li>
         * <li>FAIL: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total amount of user-level storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>536870912000</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <p>The usage of the storage resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DESKTOP: data disk space</li>
         * <li>USER_PROFILE: personal data space</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_PROFILE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The amount of user-level storage capacity used.</p>
         * 
         * <strong>example:</strong>
         * <p>243175936</p>
         */
        @NameInMap("UsedSize")
        public Long usedSize;

        /**
         * <p>The user ID.</p>
         * 
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
