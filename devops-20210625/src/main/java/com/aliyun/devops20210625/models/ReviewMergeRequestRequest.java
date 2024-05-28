// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ReviewMergeRequestRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("draftCommentIds")
    public java.util.List<String> draftCommentIds;

    @NameInMap("reviewComment")
    public String reviewComment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("reviewOpinion")
    public String reviewOpinion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ReviewMergeRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        ReviewMergeRequestRequest self = new ReviewMergeRequestRequest();
        return TeaModel.build(map, self);
    }

    public ReviewMergeRequestRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ReviewMergeRequestRequest setDraftCommentIds(java.util.List<String> draftCommentIds) {
        this.draftCommentIds = draftCommentIds;
        return this;
    }
    public java.util.List<String> getDraftCommentIds() {
        return this.draftCommentIds;
    }

    public ReviewMergeRequestRequest setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
        return this;
    }
    public String getReviewComment() {
        return this.reviewComment;
    }

    public ReviewMergeRequestRequest setReviewOpinion(String reviewOpinion) {
        this.reviewOpinion = reviewOpinion;
        return this;
    }
    public String getReviewOpinion() {
        return this.reviewOpinion;
    }

    public ReviewMergeRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
