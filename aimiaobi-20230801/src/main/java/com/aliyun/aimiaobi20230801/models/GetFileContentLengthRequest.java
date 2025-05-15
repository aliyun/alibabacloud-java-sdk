// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetFileContentLengthRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test.pdf</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx/test.pdf">https://xxx/test.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetFileContentLengthRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileContentLengthRequest self = new GetFileContentLengthRequest();
        return TeaModel.build(map, self);
    }

    public GetFileContentLengthRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public GetFileContentLengthRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public GetFileContentLengthRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
