// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateRepositoryMemberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("accessLevel")
    public Integer accessLevel;

    /**
     * <strong>example:</strong>
     * <p>2020-08-08 08:08:08</p>
     */
    @NameInMap("expireAt")
    public String expireAt;

    /**
     * <strong>example:</strong>
     * <p>USERS</p>
     */
    @NameInMap("memberType")
    public String memberType;

    /**
     * <strong>example:</strong>
     * <p>10010</p>
     */
    @NameInMap("relatedId")
    public String relatedId;

    @NameInMap("relatedInfos")
    public java.util.List<UpdateRepositoryMemberRequestRelatedInfos> relatedInfos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateRepositoryMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryMemberRequest self = new UpdateRepositoryMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateRepositoryMemberRequest setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    public UpdateRepositoryMemberRequest setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public UpdateRepositoryMemberRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

    public UpdateRepositoryMemberRequest setRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }
    public String getRelatedId() {
        return this.relatedId;
    }

    public UpdateRepositoryMemberRequest setRelatedInfos(java.util.List<UpdateRepositoryMemberRequestRelatedInfos> relatedInfos) {
        this.relatedInfos = relatedInfos;
        return this;
    }
    public java.util.List<UpdateRepositoryMemberRequestRelatedInfos> getRelatedInfos() {
        return this.relatedInfos;
    }

    public UpdateRepositoryMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class UpdateRepositoryMemberRequestRelatedInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10011</p>
         */
        @NameInMap("relatedId")
        public String relatedId;

        /**
         * <strong>example:</strong>
         * <p>24790</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static UpdateRepositoryMemberRequestRelatedInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryMemberRequestRelatedInfos self = new UpdateRepositoryMemberRequestRelatedInfos();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryMemberRequestRelatedInfos setRelatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public String getRelatedId() {
            return this.relatedId;
        }

        public UpdateRepositoryMemberRequestRelatedInfos setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public UpdateRepositoryMemberRequestRelatedInfos setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
