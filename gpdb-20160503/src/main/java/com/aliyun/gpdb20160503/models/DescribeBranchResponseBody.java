// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBranchResponseBody extends TeaModel {
    /**
     * <p>The branch information. Each element represents a Supabase branch.</p>
     */
    @NameInMap("Branch")
    public DescribeBranchResponseBodyBranch branch;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBranchResponseBody self = new DescribeBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBranchResponseBody setBranch(DescribeBranchResponseBodyBranch branch) {
        this.branch = branch;
        return this;
    }
    public DescribeBranchResponseBodyBranch getBranch() {
        return this.branch;
    }

    public DescribeBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBranchResponseBodyBranchTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeBranchResponseBodyBranchTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeBranchResponseBodyBranchTags self = new DescribeBranchResponseBodyBranchTags();
            return TeaModel.build(map, self);
        }

        public DescribeBranchResponseBodyBranchTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBranchResponseBodyBranchTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeBranchResponseBodyBranch extends TeaModel {
        /**
         * <p>The branch ID, which uniquely identifies a Supabase branch.</p>
         * 
         * <strong>example:</strong>
         * <p>br-xxxx</p>
         */
        @NameInMap("BranchId")
        public String branchId;

        /**
         * <p>The branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        /**
         * <p>The connection information of the compute node associated with the branch.</p>
         * 
         * <strong>example:</strong>
         * <p>postgresql://user:password@host:5432/db</p>
         */
        @NameInMap("ComputeEndpoint")
        public String computeEndpoint;

        /**
         * <p>The time when the branch was created, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-08T09:11:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The branch description.</p>
         * 
         * <strong>example:</strong>
         * <p>test branch</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the branch automatically expires and is deleted, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-08T09:11:12Z</p>
         */
        @NameInMap("ExpiresAt")
        public String expiresAt;

        /**
         * <p>The initialization source of the branch.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ParentData: Copies the schema and data from the parent branch. This is the default value.</li>
         * <li>SchemaOnly: Copies only the schema structure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ParentData</p>
         */
        @NameInMap("InitSource")
        public String initSource;

        /**
         * <p>Indicates whether the branch is the default branch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The parent branch ID, which specifies the parent branch for a new branch or a query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>br-main</p>
         */
        @NameInMap("ParentBranchId")
        public String parentBranchId;

        /**
         * <p>The parent branch name. This value is empty or displayed as - for the primary branch.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("ParentBranchName")
        public String parentBranchName;

        /**
         * <p>The LSN of the parent branch at the time this branch was created.</p>
         * 
         * <strong>example:</strong>
         * <p>0/3522648</p>
         */
        @NameInMap("ParentLSN")
        public String parentLSN;

        /**
         * <p>The data synchronization point in time selected from the parent branch when this branch was created, in ISO 8601 UTC format.</p>
         * <p>Note:</p>
         * <ul>
         * <li>For child branches, this value indicates the point in time of the parent branch selected during creation.</li>
         * <li>If no parent branch exists, the value 1970-01-01T00:00:00.000Z is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2026-04-08T09:11:12Z</p>
         */
        @NameInMap("ParentTimestamp")
        public String parentTimestamp;

        /**
         * <p>The Supabase project ID associated with the primary branch.</p>
         * 
         * <strong>example:</strong>
         * <p>spb-xxxx</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>Indicates whether branch protection is enabled. A value of true indicates that branch protection is enabled. A value of false indicates that branch protection is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Protected")
        public Boolean _protected;

        /**
         * <p>The service type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Supabase: Supabase service.</li>
         * <li>Memory: Memory service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Supabase</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The branch status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The branch tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeBranchResponseBodyBranchTags> tags;

        public static DescribeBranchResponseBodyBranch build(java.util.Map<String, ?> map) throws Exception {
            DescribeBranchResponseBodyBranch self = new DescribeBranchResponseBodyBranch();
            return TeaModel.build(map, self);
        }

        public DescribeBranchResponseBodyBranch setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }
        public String getBranchId() {
            return this.branchId;
        }

        public DescribeBranchResponseBodyBranch setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public DescribeBranchResponseBodyBranch setComputeEndpoint(String computeEndpoint) {
            this.computeEndpoint = computeEndpoint;
            return this;
        }
        public String getComputeEndpoint() {
            return this.computeEndpoint;
        }

        public DescribeBranchResponseBodyBranch setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeBranchResponseBodyBranch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBranchResponseBodyBranch setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public DescribeBranchResponseBodyBranch setInitSource(String initSource) {
            this.initSource = initSource;
            return this;
        }
        public String getInitSource() {
            return this.initSource;
        }

        public DescribeBranchResponseBodyBranch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeBranchResponseBodyBranch setParentBranchId(String parentBranchId) {
            this.parentBranchId = parentBranchId;
            return this;
        }
        public String getParentBranchId() {
            return this.parentBranchId;
        }

        public DescribeBranchResponseBodyBranch setParentBranchName(String parentBranchName) {
            this.parentBranchName = parentBranchName;
            return this;
        }
        public String getParentBranchName() {
            return this.parentBranchName;
        }

        public DescribeBranchResponseBodyBranch setParentLSN(String parentLSN) {
            this.parentLSN = parentLSN;
            return this;
        }
        public String getParentLSN() {
            return this.parentLSN;
        }

        public DescribeBranchResponseBodyBranch setParentTimestamp(String parentTimestamp) {
            this.parentTimestamp = parentTimestamp;
            return this;
        }
        public String getParentTimestamp() {
            return this.parentTimestamp;
        }

        public DescribeBranchResponseBodyBranch setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeBranchResponseBodyBranch set_protected(Boolean _protected) {
            this._protected = _protected;
            return this;
        }
        public Boolean get_protected() {
            return this._protected;
        }

        public DescribeBranchResponseBodyBranch setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeBranchResponseBodyBranch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBranchResponseBodyBranch setTags(java.util.List<DescribeBranchResponseBodyBranchTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeBranchResponseBodyBranchTags> getTags() {
            return this.tags;
        }

    }

}
