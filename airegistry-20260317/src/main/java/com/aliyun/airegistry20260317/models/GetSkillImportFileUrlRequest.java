// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetSkillImportFileUrlRequest extends TeaModel {
    /**
     * <p>The Content-Type of the uploaded file. Default value: application/zip.</p>
     * 
     * <strong>example:</strong>
     * <p>application/zip</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static GetSkillImportFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillImportFileUrlRequest self = new GetSkillImportFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillImportFileUrlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetSkillImportFileUrlRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
