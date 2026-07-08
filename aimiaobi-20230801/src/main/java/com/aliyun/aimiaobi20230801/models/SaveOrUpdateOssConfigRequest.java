// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveOrUpdateOssConfigRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The endpoint of OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("EndPoint")
    public String endPoint;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a workspace ID</a>.</p>
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
