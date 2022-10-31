// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteLiveStreamWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamWatermarkRequest self = new DeleteLiveStreamWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamWatermarkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamWatermarkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
