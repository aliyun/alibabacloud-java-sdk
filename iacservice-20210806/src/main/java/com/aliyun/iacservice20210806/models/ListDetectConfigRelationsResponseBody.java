// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListDetectConfigRelationsResponseBody extends TeaModel {
    /**
     * <p>List of associations</p>
     */
    @NameInMap("detectConfigRelations")
    public java.util.List<ListDetectConfigRelationsResponseBodyDetectConfigRelations> detectConfigRelations;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0D797DC3-FF04-5C21-81EB-XXXXXXXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDetectConfigRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetectConfigRelationsResponseBody self = new ListDetectConfigRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetectConfigRelationsResponseBody setDetectConfigRelations(java.util.List<ListDetectConfigRelationsResponseBodyDetectConfigRelations> detectConfigRelations) {
        this.detectConfigRelations = detectConfigRelations;
        return this;
    }
    public java.util.List<ListDetectConfigRelationsResponseBodyDetectConfigRelations> getDetectConfigRelations() {
        return this.detectConfigRelations;
    }

    public ListDetectConfigRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetectConfigRelationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDetectConfigRelationsResponseBodyDetectConfigRelations extends TeaModel {
        /**
         * <p>Association time</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-08T08:53:07.000+00:00</p>
         */
        @NameInMap("attachDate")
        public String attachDate;

        /**
         * <p>Drift detection configuration ID</p>
         * 
         * <strong>example:</strong>
         * <p>dc-xxxx</p>
         */
        @NameInMap("detectConfigId")
        public String detectConfigId;

        /**
         * <p>Whether enabled</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public String enabled;

        /**
         * <p>Target ID. StackId or TaskId</p>
         * 
         * <strong>example:</strong>
         * <p>stack-xxxx</p>
         */
        @NameInMap("targetId")
        public String targetId;

        /**
         * <p>Target name</p>
         * 
         * <strong>example:</strong>
         * <p>stack-name-xxx</p>
         */
        @NameInMap("targetName")
        public String targetName;

        /**
         * <p>Target type  </p>
         * <ul>
         * <li>Task: orchestration job  </li>
         * <li>Stack: resource stack</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stack</p>
         */
        @NameInMap("targetType")
        public String targetType;

        public static ListDetectConfigRelationsResponseBodyDetectConfigRelations build(java.util.Map<String, ?> map) throws Exception {
            ListDetectConfigRelationsResponseBodyDetectConfigRelations self = new ListDetectConfigRelationsResponseBodyDetectConfigRelations();
            return TeaModel.build(map, self);
        }

        public ListDetectConfigRelationsResponseBodyDetectConfigRelations setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListDetectConfigRelationsResponseBodyDetectConfigRelations setDetectConfigId(String detectConfigId) {
            this.detectConfigId = detectConfigId;
            return this;
        }
        public String getDetectConfigId() {
            return this.detectConfigId;
        }

        public ListDetectConfigRelationsResponseBodyDetectConfigRelations setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public ListDetectConfigRelationsResponseBodyDetectConfigRelations setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListDetectConfigRelationsResponseBodyDetectConfigRelations setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListDetectConfigRelationsResponseBodyDetectConfigRelations setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
