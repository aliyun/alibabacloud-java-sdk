// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteUserGroupsMappingRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("GroupNames")
    public java.util.Map<String, ?> groupNames;

    @NameInMap("InputRegionId")
    public String inputRegionId;

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

    public DeleteUserGroupsMappingRequest setGroupNames(java.util.Map<String, ?> groupNames) {
        this.groupNames = groupNames;
        return this;
    }
    public java.util.Map<String, ?> getGroupNames() {
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
