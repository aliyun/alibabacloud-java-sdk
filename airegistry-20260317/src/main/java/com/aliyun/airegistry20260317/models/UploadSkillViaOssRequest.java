// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UploadSkillViaOssRequest extends TeaModel {
    @NameInMap("CommitMsg")
    public String commitMsg;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    public static UploadSkillViaOssRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSkillViaOssRequest self = new UploadSkillViaOssRequest();
        return TeaModel.build(map, self);
    }

    public UploadSkillViaOssRequest setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }
    public String getCommitMsg() {
        return this.commitMsg;
    }

    public UploadSkillViaOssRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UploadSkillViaOssRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public UploadSkillViaOssRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

}
