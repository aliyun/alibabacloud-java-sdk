// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComputeResourceAuthUserMappingsRequest extends TeaModel {
    /**
     * <p>The compute resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123455</p>
     */
    @NameInMap("ComputeResourceId")
    public Long computeResourceId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of user mappings to remove.</p>
     */
    @NameInMap("RemoveUserIds")
    public java.util.List<String> removeUserIds;

    /**
     * <p>The list of objects to update.</p>
     */
    @NameInMap("Upserts")
    public java.util.List<UpdateComputeResourceAuthUserMappingsRequestUpserts> upserts;

    public static UpdateComputeResourceAuthUserMappingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeResourceAuthUserMappingsRequest self = new UpdateComputeResourceAuthUserMappingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeResourceAuthUserMappingsRequest setComputeResourceId(Long computeResourceId) {
        this.computeResourceId = computeResourceId;
        return this;
    }
    public Long getComputeResourceId() {
        return this.computeResourceId;
    }

    public UpdateComputeResourceAuthUserMappingsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateComputeResourceAuthUserMappingsRequest setRemoveUserIds(java.util.List<String> removeUserIds) {
        this.removeUserIds = removeUserIds;
        return this;
    }
    public java.util.List<String> getRemoveUserIds() {
        return this.removeUserIds;
    }

    public UpdateComputeResourceAuthUserMappingsRequest setUpserts(java.util.List<UpdateComputeResourceAuthUserMappingsRequestUpserts> upserts) {
        this.upserts = upserts;
        return this;
    }
    public java.util.List<UpdateComputeResourceAuthUserMappingsRequestUpserts> getUpserts() {
        return this.upserts;
    }

    public static class UpdateComputeResourceAuthUserMappingsRequestUpserts extends TeaModel {
        /**
         * <p>The password of the target system for the mapping, such as an LDAP password.</p>
         * 
         * <strong>example:</strong>
         * <p>123xx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>12747300953xxx62</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username of the target system for the mapping, such as an LDAP username.</p>
         * 
         * <strong>example:</strong>
         * <p>lisa</p>
         */
        @NameInMap("Username")
        public String username;

        public static UpdateComputeResourceAuthUserMappingsRequestUpserts build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeResourceAuthUserMappingsRequestUpserts self = new UpdateComputeResourceAuthUserMappingsRequestUpserts();
            return TeaModel.build(map, self);
        }

        public UpdateComputeResourceAuthUserMappingsRequestUpserts setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateComputeResourceAuthUserMappingsRequestUpserts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateComputeResourceAuthUserMappingsRequestUpserts setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
