// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalCardRequest extends TeaModel {
    @NameInMap("FileUri")
    public String fileUri;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("OrderList")
    public java.util.List<String> orderList;

    @NameInMap("TagList")
    public java.util.List<String> tagList;

    @NameInMap("UploadMethod")
    public String uploadMethod;

    @NameInMap("UploadType")
    public String uploadType;

    public static AddDirectionalCardRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalCardRequest self = new AddDirectionalCardRequest();
        return TeaModel.build(map, self);
    }

    public AddDirectionalCardRequest setFileUri(String fileUri) {
        this.fileUri = fileUri;
        return this;
    }
    public String getFileUri() {
        return this.fileUri;
    }

    public AddDirectionalCardRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddDirectionalCardRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddDirectionalCardRequest setOrderList(java.util.List<String> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<String> getOrderList() {
        return this.orderList;
    }

    public AddDirectionalCardRequest setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public AddDirectionalCardRequest setUploadMethod(String uploadMethod) {
        this.uploadMethod = uploadMethod;
        return this;
    }
    public String getUploadMethod() {
        return this.uploadMethod;
    }

    public AddDirectionalCardRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
