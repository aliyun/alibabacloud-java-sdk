// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteUserGroupsMappingShrinkRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("GroupNames")
    public String groupNamesShrink;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("UserName")
    public String userName;

    public static DeleteUserGroupsMappingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupsMappingShrinkRequest self = new DeleteUserGroupsMappingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupsMappingShrinkRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteUserGroupsMappingShrinkRequest setGroupNamesShrink(String groupNamesShrink) {
        this.groupNamesShrink = groupNamesShrink;
        return this;
    }
    public String getGroupNamesShrink() {
        return this.groupNamesShrink;
    }

    public DeleteUserGroupsMappingShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DeleteUserGroupsMappingShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
