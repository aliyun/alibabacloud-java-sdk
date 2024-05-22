// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetLiveSnapshotTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveSnapshotTemplateRequest self = new GetLiveSnapshotTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveSnapshotTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
