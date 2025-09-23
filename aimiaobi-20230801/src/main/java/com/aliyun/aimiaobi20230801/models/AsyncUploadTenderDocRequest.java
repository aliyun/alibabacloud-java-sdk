// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncUploadTenderDocRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oss://default/aimiaobi-service-prod/aimiaobi/materialDocument/1601892701595700_10169811/208757545922605632_yst-test_9eb7d7e1deb543d88e2d6f1c9df456ef.docx</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <strong>example:</strong>
     * <p>tender.pdf</p>
     */
    @NameInMap("TenderDocName")
    public String tenderDocName;

    /**
     * <strong>example:</strong>
     * <p>llm-az2gglkjauwnnhpq</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncUploadTenderDocRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncUploadTenderDocRequest self = new AsyncUploadTenderDocRequest();
        return TeaModel.build(map, self);
    }

    public AsyncUploadTenderDocRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public AsyncUploadTenderDocRequest setTenderDocName(String tenderDocName) {
        this.tenderDocName = tenderDocName;
        return this;
    }
    public String getTenderDocName() {
        return this.tenderDocName;
    }

    public AsyncUploadTenderDocRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
