// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class MergeMergeRequestRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0cf2c8458ac44d9481aab2dd6ec10596v3</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("mergeMessage")
    public String mergeMessage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>no-fast-forward</p>
     */
    @NameInMap("mergeType")
    public String mergeType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("removeSourceBranch")
    public Boolean removeSourceBranch;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static MergeMergeRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeMergeRequestRequest self = new MergeMergeRequestRequest();
        return TeaModel.build(map, self);
    }

    public MergeMergeRequestRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public MergeMergeRequestRequest setMergeMessage(String mergeMessage) {
        this.mergeMessage = mergeMessage;
        return this;
    }
    public String getMergeMessage() {
        return this.mergeMessage;
    }

    public MergeMergeRequestRequest setMergeType(String mergeType) {
        this.mergeType = mergeType;
        return this;
    }
    public String getMergeType() {
        return this.mergeType;
    }

    public MergeMergeRequestRequest setRemoveSourceBranch(Boolean removeSourceBranch) {
        this.removeSourceBranch = removeSourceBranch;
        return this;
    }
    public Boolean getRemoveSourceBranch() {
        return this.removeSourceBranch;
    }

    public MergeMergeRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
