// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateUserGroupsMappingShrinkRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("GroupNames")
    public String groupNamesShrink;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("UserName")
    public String userName;

    public static CreateUserGroupsMappingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupsMappingShrinkRequest self = new CreateUserGroupsMappingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupsMappingShrinkRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateUserGroupsMappingShrinkRequest setGroupNamesShrink(String groupNamesShrink) {
        this.groupNamesShrink = groupNamesShrink;
        return this;
    }
    public String getGroupNamesShrink() {
        return this.groupNamesShrink;
    }

    public CreateUserGroupsMappingShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateUserGroupsMappingShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
