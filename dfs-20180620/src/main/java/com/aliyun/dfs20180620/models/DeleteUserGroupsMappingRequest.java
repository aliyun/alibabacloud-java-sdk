// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteUserGroupsMappingRequest extends TeaModel {
    /**
     * <p>The instance ID of the Apsara File Storage for HDFS file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The names of the groups to which the user belongs.
     * Limits:</p>
     * <ul>
     * <li><p>Must start with a letter or an underscore (_).</p>
     * </li>
     * <li><p>Must be 1 to 32 characters in length and cannot be empty.</p>
     * </li>
     * <li><p>Can contain only lowercase letters, digits, and underscores (_).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group1&quot;,&quot;group2&quot;]</p>
     */
    @NameInMap("GroupNames")
    public java.util.List<String> groupNames;

    /**
     * <p>The region where the file system resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>The username.
     * Limits:</p>
     * <ul>
     * <li><p>Must start with a letter or an underscore (_).</p>
     * </li>
     * <li><p>Must be 1 to 32 characters in length and cannot be empty.</p>
     * </li>
     * <li><p>Can contain only lowercase letters, digits, and underscores (_).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Each user can belong to up to 10 groups.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DeleteUserGroupsMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupsMappingRequest self = new DeleteUserGroupsMappingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupsMappingRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteUserGroupsMappingRequest setGroupNames(java.util.List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }
    public java.util.List<String> getGroupNames() {
        return this.groupNames;
    }

    public DeleteUserGroupsMappingRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DeleteUserGroupsMappingRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
