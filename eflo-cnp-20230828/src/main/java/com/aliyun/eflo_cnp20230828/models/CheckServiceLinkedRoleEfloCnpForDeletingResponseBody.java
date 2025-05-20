// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleEfloCnpForDeletingResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the SLR can be deleted. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The SLR can be deleted.</li>
     * <li><code>false</code>: The SLR cannot be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Deletable")
    public Boolean deletable;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>6C212C4A-2CB3-56E6-BA2F-1CE2B03C5C94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources> resources;

    public static CheckServiceLinkedRoleEfloCnpForDeletingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleEfloCnpForDeletingResponseBody self = new CheckServiceLinkedRoleEfloCnpForDeletingResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingResponseBody setDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }
    public Boolean getDeletable() {
        return this.deletable;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingResponseBody setResources(java.util.List<CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources extends TeaModel {
        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The resources.</p>
         */
        @NameInMap("Resources")
        public java.util.List<String> resources;

        public static CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources self = new CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CheckServiceLinkedRoleEfloCnpForDeletingResponseBodyResources setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

    }

}
