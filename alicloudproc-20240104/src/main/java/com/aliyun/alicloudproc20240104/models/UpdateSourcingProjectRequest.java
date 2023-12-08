// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class UpdateSourcingProjectRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static UpdateSourcingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSourcingProjectRequest self = new UpdateSourcingProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSourcingProjectRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateSourcingProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateSourcingProjectRequest setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
