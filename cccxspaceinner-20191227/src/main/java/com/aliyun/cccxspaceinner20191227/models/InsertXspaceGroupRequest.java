// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class InsertXspaceGroupRequest extends TeaModel {
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

    public static InsertXspaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertXspaceGroupRequest self = new InsertXspaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public InsertXspaceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public InsertXspaceGroupRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public InsertXspaceGroupRequest setSupportIm(Boolean supportIm) {
        this.supportIm = supportIm;
        return this;
    }
    public Boolean getSupportIm() {
        return this.supportIm;
    }

    public InsertXspaceGroupRequest setSupportPhone(Boolean supportPhone) {
        this.supportPhone = supportPhone;
        return this;
    }
    public Boolean getSupportPhone() {
        return this.supportPhone;
    }

    public InsertXspaceGroupRequest setSupportCase(Boolean supportCase) {
        this.supportCase = supportCase;
        return this;
    }
    public Boolean getSupportCase() {
        return this.supportCase;
    }

    public InsertXspaceGroupRequest setIsSwitchShow(Integer isSwitchShow) {
        this.isSwitchShow = isSwitchShow;
        return this;
    }
    public Integer getIsSwitchShow() {
        return this.isSwitchShow;
    }

    public InsertXspaceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertXspaceGroupRequest setCreateAgentId(Long createAgentId) {
        this.createAgentId = createAgentId;
        return this;
    }
    public Long getCreateAgentId() {
        return this.createAgentId;
    }

}
