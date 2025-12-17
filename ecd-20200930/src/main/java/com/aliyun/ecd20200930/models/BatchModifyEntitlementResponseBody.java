// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BatchModifyEntitlementResponseBody extends TeaModel {
    @NameInMap("Entitlements")
    public BatchModifyEntitlementResponseBodyEntitlements entitlements;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchModifyEntitlementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyEntitlementResponseBody self = new BatchModifyEntitlementResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchModifyEntitlementResponseBody setEntitlements(BatchModifyEntitlementResponseBodyEntitlements entitlements) {
        this.entitlements = entitlements;
        return this;
    }
    public BatchModifyEntitlementResponseBodyEntitlements getEntitlements() {
        return this.entitlements;
    }

    public BatchModifyEntitlementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchModifyEntitlementResponseBodyEntitlementsAssignModels extends TeaModel {
        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-e94kzikmpljjx99pl</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The authorized user IDs for the cloud computer.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The assign result for each cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FAILED</li>
         * <li>NOT_STARTED</li>
         * <li>STARTED</li>
         * <li>PROCESSING</li>
         * <li>FINISHED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("InnerStatus")
        public String innerStatus;

        public static BatchModifyEntitlementResponseBodyEntitlementsAssignModels build(java.util.Map<String, ?> map) throws Exception {
            BatchModifyEntitlementResponseBodyEntitlementsAssignModels self = new BatchModifyEntitlementResponseBodyEntitlementsAssignModels();
            return TeaModel.build(map, self);
        }

        public BatchModifyEntitlementResponseBodyEntitlementsAssignModels setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public BatchModifyEntitlementResponseBodyEntitlementsAssignModels setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public BatchModifyEntitlementResponseBodyEntitlementsAssignModels setInnerStatus(String innerStatus) {
            this.innerStatus = innerStatus;
            return this;
        }
        public String getInnerStatus() {
            return this.innerStatus;
        }

    }

    public static class BatchModifyEntitlementResponseBodyEntitlements extends TeaModel {
        @NameInMap("AssignModels")
        public java.util.List<BatchModifyEntitlementResponseBodyEntitlementsAssignModels> assignModels;

        /**
         * <p>The result.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FAILED</li>
         * <li>NOT_STARTED</li>
         * <li>STARTED</li>
         * <li>PROCESSING</li>
         * <li>FINISHED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B2F4F018-0EDF-159C-B285-117B5F1C****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static BatchModifyEntitlementResponseBodyEntitlements build(java.util.Map<String, ?> map) throws Exception {
            BatchModifyEntitlementResponseBodyEntitlements self = new BatchModifyEntitlementResponseBodyEntitlements();
            return TeaModel.build(map, self);
        }

        public BatchModifyEntitlementResponseBodyEntitlements setAssignModels(java.util.List<BatchModifyEntitlementResponseBodyEntitlementsAssignModels> assignModels) {
            this.assignModels = assignModels;
            return this;
        }
        public java.util.List<BatchModifyEntitlementResponseBodyEntitlementsAssignModels> getAssignModels() {
            return this.assignModels;
        }

        public BatchModifyEntitlementResponseBodyEntitlements setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchModifyEntitlementResponseBodyEntitlements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
