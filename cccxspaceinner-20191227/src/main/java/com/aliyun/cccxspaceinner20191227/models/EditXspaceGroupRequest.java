// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class EditXspaceGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ShowName")
    public String showName;

    @NameInMap("SupportIm")
    public Boolean supportIm;

    @NameInMap("SupportPhone")
    public Boolean supportPhone;

    @NameInMap("SupportCase")
    public Boolean supportCase;

    @NameInMap("IsSwitchShow")
    public Integer isSwitchShow;

    @NameInMap("Description")
    public String description;

    @NameInMap("CreateAgentId")
    public Long createAgentId;

    public static EditXspaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        EditXspaceGroupRequest self = new EditXspaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public EditXspaceGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public EditXspaceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public EditXspaceGroupRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public EditXspaceGroupRequest setSupportIm(Boolean supportIm) {
        this.supportIm = supportIm;
        return this;
    }
    public Boolean getSupportIm() {
        return this.supportIm;
    }

    public EditXspaceGroupRequest setSupportPhone(Boolean supportPhone) {
        this.supportPhone = supportPhone;
        return this;
    }
    public Boolean getSupportPhone() {
        return this.supportPhone;
    }

    public EditXspaceGroupRequest setSupportCase(Boolean supportCase) {
        this.supportCase = supportCase;
        return this;
    }
    public Boolean getSupportCase() {
        return this.supportCase;
    }

    public EditXspaceGroupRequest setIsSwitchShow(Integer isSwitchShow) {
        this.isSwitchShow = isSwitchShow;
        return this;
    }
    public Integer getIsSwitchShow() {
        return this.isSwitchShow;
    }

    public EditXspaceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EditXspaceGroupRequest setCreateAgentId(Long createAgentId) {
        this.createAgentId = createAgentId;
        return this;
    }
    public Long getCreateAgentId() {
        return this.createAgentId;
    }

}
