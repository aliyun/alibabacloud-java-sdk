// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneModelApplyRequest extends TeaModel {
    @NameInMap("ApplyContent")
    public String applyContent;

    @NameInMap("ApplyId")
    public Long applyId;

    @NameInMap("ApplyStatus")
    public Integer applyStatus;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateSceneModelApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneModelApplyRequest self = new UpdateSceneModelApplyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneModelApplyRequest setApplyContent(String applyContent) {
        this.applyContent = applyContent;
        return this;
    }
    public String getApplyContent() {
        return this.applyContent;
    }

    public UpdateSceneModelApplyRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public UpdateSceneModelApplyRequest setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public Integer getApplyStatus() {
        return this.applyStatus;
    }

    public UpdateSceneModelApplyRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
