// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class IllustrationTask extends TeaModel {
    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("illustrationIds")
    public java.util.List<Long> illustrationIds;

    @NameInMap("illustrationTaskId")
    public Long illustrationTaskId;

    @NameInMap("taskStatus")
    public String taskStatus;

    @NameInMap("textId")
    public Long textId;

    public static IllustrationTask build(java.util.Map<String, ?> map) throws Exception {
        IllustrationTask self = new IllustrationTask();
        return TeaModel.build(map, self);
    }

    public IllustrationTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public IllustrationTask setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public IllustrationTask setIllustrationIds(java.util.List<Long> illustrationIds) {
        this.illustrationIds = illustrationIds;
        return this;
    }
    public java.util.List<Long> getIllustrationIds() {
        return this.illustrationIds;
    }

    public IllustrationTask setIllustrationTaskId(Long illustrationTaskId) {
        this.illustrationTaskId = illustrationTaskId;
        return this;
    }
    public Long getIllustrationTaskId() {
        return this.illustrationTaskId;
    }

    public IllustrationTask setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public IllustrationTask setTextId(Long textId) {
        this.textId = textId;
        return this;
    }
    public Long getTextId() {
        return this.textId;
    }

}
