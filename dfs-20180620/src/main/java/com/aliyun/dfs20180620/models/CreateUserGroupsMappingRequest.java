// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateUserGroupsMappingRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("GroupNames")
    public java.util.List<String> groupNames;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("UserName")
    public String userName;

    public static CreateUserGroupsMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupsMappingRequest self = new CreateUserGroupsMappingRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupsMappingRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateUserGroupsMappingRequest setGroupNames(java.util.List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }
    public java.util.List<String> getGroupNames() {
        return this.groupNames;
    }

    public CreateUserGroupsMappingRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateUserGroupsMappingRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
