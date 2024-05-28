// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemAttachmentCreatemetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileName")
    public String fileName;

    public static GetWorkitemAttachmentCreatemetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemAttachmentCreatemetaRequest self = new GetWorkitemAttachmentCreatemetaRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkitemAttachmentCreatemetaRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
