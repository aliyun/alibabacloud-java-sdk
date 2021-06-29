// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class RegisterFaceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Content")
    public String content;

    public static RegisterFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterFaceRequest self = new RegisterFaceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterFaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegisterFaceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RegisterFaceRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RegisterFaceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
