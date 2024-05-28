// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class MergeMergeRequestRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("mergeMessage")
    public String mergeMessage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("mergeType")
    public String mergeType;

    @NameInMap("removeSourceBranch")
    public Boolean removeSourceBranch;

    /**
     * <p>This parameter is required.</p>
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
