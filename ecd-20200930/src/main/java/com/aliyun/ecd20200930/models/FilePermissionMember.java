// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class FilePermissionMember extends TeaModel {
    /**
     * <p>The object that you want to grant permissions. The object can be a user or a group.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CdsIdentity")
    public FilePermissionMemberCdsIdentity cdsIdentity;

    /**
     * <p>Indicates whether to disable the permission from users in the subgroup.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisinheritSubGroup")
    public Boolean disinheritSubGroup;

    /**
     * <p>The expiration time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC</p>
     * 
     * <strong>example:</strong>
     * <p>1633598866642</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The role.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SystemFileEditorWithoutShareLink: The role that can edit but cannot share files.</li>
     * <li>SystemFileUploaderAndDownloaderWithShareLink: The role that can upload, download, and share files.</li>
     * <li>SystemFileDownloader: The role that can download files.</li>
     * <li>SystemFileEditorWithoutDelete: The role that can edit but cannot edit files.</li>
     * <li>SystemFileOwner: The role that can collaborate with others on files.</li>
     * <li>SystemFileDownloaderWithShareLink: The role that can download and share files.</li>
     * <li>SystemFileUploaderAndViewer: The role that can preview and upload files.</li>
     * <li>SystemFileViewer: The role that can preview files.</li>
     * <li>SystemFileEditor: The role that can edit files.</li>
     * <li>SystemFileUploaderWithShareLink: The role that can upload and share files.</li>
     * <li>SystemFileUploader: The role that can upload files.</li>
     * <li>SystemFileUploaderAndDownloader: The role that can upload and download files.</li>
     * <li>SystemFileMetaViewer: The role that can view file list.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemFileEditor</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    public static FilePermissionMember build(java.util.Map<String, ?> map) throws Exception {
        FilePermissionMember self = new FilePermissionMember();
        return TeaModel.build(map, self);
    }

    public FilePermissionMember setCdsIdentity(FilePermissionMemberCdsIdentity cdsIdentity) {
        this.cdsIdentity = cdsIdentity;
        return this;
    }
    public FilePermissionMemberCdsIdentity getCdsIdentity() {
        return this.cdsIdentity;
    }

    public FilePermissionMember setDisinheritSubGroup(Boolean disinheritSubGroup) {
        this.disinheritSubGroup = disinheritSubGroup;
        return this;
    }
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    public FilePermissionMember setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public FilePermissionMember setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public static class FilePermissionMemberCdsIdentity extends TeaModel {
        /**
         * <p>The user ID or a team ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16435bdf934248b788b7b3771ee9****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The object type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IT_Group: team</li>
         * <li>IT_User: user</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IT_User</p>
         */
        @NameInMap("Type")
        public String type;

        public static FilePermissionMemberCdsIdentity build(java.util.Map<String, ?> map) throws Exception {
            FilePermissionMemberCdsIdentity self = new FilePermissionMemberCdsIdentity();
            return TeaModel.build(map, self);
        }

        public FilePermissionMemberCdsIdentity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FilePermissionMemberCdsIdentity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
