// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class OperateAvatarProjectRequest extends TeaModel {
    @NameInMap("operateType")
    public String operateType;

    @NameInMap("projectId")
    public String projectId;

    @NameInMap("resChannelNumber")
    public Integer resChannelNumber;

    @NameInMap("resType")
    public String resType;

    public static OperateAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAvatarProjectRequest self = new OperateAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public OperateAvatarProjectRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateAvatarProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public OperateAvatarProjectRequest setResChannelNumber(Integer resChannelNumber) {
        this.resChannelNumber = resChannelNumber;
        return this;
    }
    public Integer getResChannelNumber() {
        return this.resChannelNumber;
    }

    public OperateAvatarProjectRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

}
