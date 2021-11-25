// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateFaceGroupRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("GroupCoverFaceId")
    public String groupCoverFaceId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Project")
    public String project;

    @NameInMap("RemarksA")
    public String remarksA;

    @NameInMap("RemarksArrayA")
    public String remarksArrayA;

    @NameInMap("RemarksArrayB")
    public String remarksArrayB;

    @NameInMap("RemarksB")
    public String remarksB;

    @NameInMap("RemarksC")
    public String remarksC;

    @NameInMap("RemarksD")
    public String remarksD;

    @NameInMap("ResetItems")
    public String resetItems;

    @NameInMap("SetId")
    public String setId;

    public static UpdateFaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceGroupRequest self = new UpdateFaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceGroupRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateFaceGroupRequest setGroupCoverFaceId(String groupCoverFaceId) {
        this.groupCoverFaceId = groupCoverFaceId;
        return this;
    }
    public String getGroupCoverFaceId() {
        return this.groupCoverFaceId;
    }

    public UpdateFaceGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateFaceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateFaceGroupRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public UpdateFaceGroupRequest setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public UpdateFaceGroupRequest setRemarksArrayA(String remarksArrayA) {
        this.remarksArrayA = remarksArrayA;
        return this;
    }
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    public UpdateFaceGroupRequest setRemarksArrayB(String remarksArrayB) {
        this.remarksArrayB = remarksArrayB;
        return this;
    }
    public String getRemarksArrayB() {
        return this.remarksArrayB;
    }

    public UpdateFaceGroupRequest setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public UpdateFaceGroupRequest setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public UpdateFaceGroupRequest setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public UpdateFaceGroupRequest setResetItems(String resetItems) {
        this.resetItems = resetItems;
        return this;
    }
    public String getResetItems() {
        return this.resetItems;
    }

    public UpdateFaceGroupRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}
