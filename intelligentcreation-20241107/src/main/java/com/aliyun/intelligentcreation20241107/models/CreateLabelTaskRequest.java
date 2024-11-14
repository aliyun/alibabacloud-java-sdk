// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20241107.models;

import com.aliyun.tea.*;

public class CreateLabelTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oss://test/test</p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>7caa09aa60204086909ba3958810a567</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    /**
     * <strong>example:</strong>
     * <p>1_for_7_label_v1</p>
     */
    @NameInMap("labelTemplateId")
    public String labelTemplateId;

    public static CreateLabelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTaskRequest self = new CreateLabelTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabelTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateLabelTaskRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public CreateLabelTaskRequest setLabelTemplateId(String labelTemplateId) {
        this.labelTemplateId = labelTemplateId;
        return this;
    }
    public String getLabelTemplateId() {
        return this.labelTemplateId;
    }

}
