// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddFilePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the enterprise drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-352282****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the user who uses the network disk.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID. You can call the <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> operation to query the ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6333e553a133ce21e6f747cf948bb9ef95d7****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the team space.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The users that you want to authorize to use the cloud disk.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberList")
    public java.util.List<AddFilePermissionRequestMemberList> memberList;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddFilePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFilePermissionRequest self = new AddFilePermissionRequest();
        return TeaModel.build(map, self);
    }

    public AddFilePermissionRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public AddFilePermissionRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public AddFilePermissionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddFilePermissionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddFilePermissionRequest setMemberList(java.util.List<AddFilePermissionRequestMemberList> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<AddFilePermissionRequestMemberList> getMemberList() {
        return this.memberList;
    }

    public AddFilePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AddFilePermissionRequestMemberListCdsIdentity extends TeaModel {
        /**
         * <p>The ID of the convenience user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The user type.</p>
         * <p>Set the value to TENANT_ADMIN.</p>
         * <ul>
         * <li>IT_Group: group.</li>
         * <li>IT_User: user.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IT_User</p>
         */
        @NameInMap("Type")
        public String type;

        public static AddFilePermissionRequestMemberListCdsIdentity build(java.util.Map<String, ?> map) throws Exception {
            AddFilePermissionRequestMemberListCdsIdentity self = new AddFilePermissionRequestMemberListCdsIdentity();
            return TeaModel.build(map, self);
        }

        public AddFilePermissionRequestMemberListCdsIdentity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddFilePermissionRequestMemberListCdsIdentity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddFilePermissionRequestMemberList extends TeaModel {
        /**
         * <p>The user of the cloud disk.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CdsIdentity")
        public AddFilePermissionRequestMemberListCdsIdentity cdsIdentity;

        /**
         * <p>Specifies whether the users of the child group can inherit the folder permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisinheritSubGroup")
        public Boolean disinheritSubGroup;

        /**
         * <p>The time when the authorization expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The value never expires. You can specify a value that is predefined by the system for this parameter. Example: 4775500800000.</p>
         * 
         * <strong>example:</strong>
         * <p>4775500800000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>You can set permissions by specifying roles or by customizing operation permissions. This field is used to set permissions by specifying roles. This field is mutually exclusive with <code>ActionList</code>.</p>
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
         * <p>SystemFileUploaderAndDownloader</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        public static AddFilePermissionRequestMemberList build(java.util.Map<String, ?> map) throws Exception {
            AddFilePermissionRequestMemberList self = new AddFilePermissionRequestMemberList();
            return TeaModel.build(map, self);
        }

        public AddFilePermissionRequestMemberList setCdsIdentity(AddFilePermissionRequestMemberListCdsIdentity cdsIdentity) {
            this.cdsIdentity = cdsIdentity;
            return this;
        }
        public AddFilePermissionRequestMemberListCdsIdentity getCdsIdentity() {
            return this.cdsIdentity;
        }

        public AddFilePermissionRequestMemberList setDisinheritSubGroup(Boolean disinheritSubGroup) {
            this.disinheritSubGroup = disinheritSubGroup;
            return this;
        }
        public Boolean getDisinheritSubGroup() {
            return this.disinheritSubGroup;
        }

        public AddFilePermissionRequestMemberList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public AddFilePermissionRequestMemberList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

}
