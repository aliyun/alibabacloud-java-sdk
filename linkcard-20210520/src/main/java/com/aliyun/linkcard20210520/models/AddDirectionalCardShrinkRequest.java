// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalCardShrinkRequest extends TeaModel {
    @NameInMap("FileUri")
    public String fileUri;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("OrderList")
    public String orderListShrink;

    @NameInMap("TagList")
    public String tagListShrink;

    @NameInMap("UploadMethod")
    public String uploadMethod;

    @NameInMap("UploadType")
    public String uploadType;

    public static AddDirectionalCardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalCardShrinkRequest self = new AddDirectionalCardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDirectionalCardShrinkRequest setFileUri(String fileUri) {
        this.fileUri = fileUri;
        return this;
    }
    public String getFileUri() {
        return this.fileUri;
    }

    public AddDirectionalCardShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddDirectionalCardShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddDirectionalCardShrinkRequest setOrderListShrink(String orderListShrink) {
        this.orderListShrink = orderListShrink;
        return this;
    }
    public String getOrderListShrink() {
        return this.orderListShrink;
    }

    public AddDirectionalCardShrinkRequest setTagListShrink(String tagListShrink) {
        this.tagListShrink = tagListShrink;
        return this;
    }
    public String getTagListShrink() {
        return this.tagListShrink;
    }

    public AddDirectionalCardShrinkRequest setUploadMethod(String uploadMethod) {
        this.uploadMethod = uploadMethod;
        return this;
    }
    public String getUploadMethod() {
        return this.uploadMethod;
    }

    public AddDirectionalCardShrinkRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
