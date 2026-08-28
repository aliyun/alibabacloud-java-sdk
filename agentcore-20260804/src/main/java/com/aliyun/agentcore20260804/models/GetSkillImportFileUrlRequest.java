// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetSkillImportFileUrlRequest extends TeaModel {
    /**
     * <p>The Content-Type of the upload file. Default value: application/zip.</p>
     * 
     * <strong>example:</strong>
     * <p>application/zip</p>
     */
    @NameInMap("contentType")
    public String contentType;

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

}
