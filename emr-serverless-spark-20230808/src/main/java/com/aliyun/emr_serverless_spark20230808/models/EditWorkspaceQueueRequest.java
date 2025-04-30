// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class EditWorkspaceQueueRequest extends TeaModel {
    @NameInMap("environments")
    public java.util.List<String> environments;

    @NameInMap("resourceSpec")
    public EditWorkspaceQueueRequestResourceSpec resourceSpec;

    /**
     * <strong>example:</strong>
     * <p>w-975bcfda9625****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>dev_queue</p>
     */
    @NameInMap("workspaceQueueName")
    public String workspaceQueueName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static EditWorkspaceQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        EditWorkspaceQueueRequest self = new EditWorkspaceQueueRequest();
        return TeaModel.build(map, self);
    }

    public EditWorkspaceQueueRequest setEnvironments(java.util.List<String> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.List<String> getEnvironments() {
        return this.environments;
    }

    public EditWorkspaceQueueRequest setResourceSpec(EditWorkspaceQueueRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public EditWorkspaceQueueRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public EditWorkspaceQueueRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public EditWorkspaceQueueRequest setWorkspaceQueueName(String workspaceQueueName) {
        this.workspaceQueueName = workspaceQueueName;
        return this;
    }
    public String getWorkspaceQueueName() {
        return this.workspaceQueueName;
    }

    public EditWorkspaceQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class EditWorkspaceQueueRequestResourceSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("cu")
        public Long cu;

        public static EditWorkspaceQueueRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            EditWorkspaceQueueRequestResourceSpec self = new EditWorkspaceQueueRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public EditWorkspaceQueueRequestResourceSpec setCu(Long cu) {
            this.cu = cu;
            return this;
        }
        public Long getCu() {
            return this.cu;
        }

    }

}
