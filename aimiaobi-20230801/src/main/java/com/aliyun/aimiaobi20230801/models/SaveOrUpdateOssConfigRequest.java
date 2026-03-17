// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveOrUpdateOssConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <strong>example:</strong>
     * <p>oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("EndPoint")
    public String endPoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SaveOrUpdateOssConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdateOssConfigRequest self = new SaveOrUpdateOssConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdateOssConfigRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public SaveOrUpdateOssConfigRequest setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

    public SaveOrUpdateOssConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
