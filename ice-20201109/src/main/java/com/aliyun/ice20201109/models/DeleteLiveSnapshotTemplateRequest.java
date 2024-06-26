// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteLiveSnapshotTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotTemplateRequest self = new DeleteLiveSnapshotTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
