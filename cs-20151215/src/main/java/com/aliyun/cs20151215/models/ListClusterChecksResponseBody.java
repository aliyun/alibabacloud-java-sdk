// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterChecksResponseBody extends TeaModel {
    /**
     * <p>The list of check items.</p>
     */
    @NameInMap("checks")
    public java.util.List<ListClusterChecksResponseBodyChecks> checks;

    public static ListClusterChecksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterChecksResponseBody self = new ListClusterChecksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterChecksResponseBody setChecks(java.util.List<ListClusterChecksResponseBodyChecks> checks) {
        this.checks = checks;
        return this;
    }
    public java.util.List<ListClusterChecksResponseBodyChecks> getChecks() {
        return this.checks;
    }

    public static class ListClusterChecksResponseBodyChecks extends TeaModel {
        /**
         * <p>The ID of the cluster check task.</p>
         * 
         * <strong>example:</strong>
         * <p>1697100584236600453-ce0da5a1d627e4e9e9f96cae8ad07****-clustercheck-lboto</p>
         */
        @NameInMap("check_id")
        public String checkId;

        /**
         * <p>The time when the cluster check task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T08:31:20.292030178Z</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>The time when the cluster check task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T08:35:20.292030178Z</p>
         */
        @NameInMap("finished_at")
        public String finishedAt;

        /**
         * <p>The message that indicates the status of the cluster check task.</p>
         * 
         * <strong>example:</strong>
         * <p>task succeed</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The status of the cluster check.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The check method.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterUpgrade</p>
         */
        @NameInMap("type")
        public String type;

        public static ListClusterChecksResponseBodyChecks build(java.util.Map<String, ?> map) throws Exception {
            ListClusterChecksResponseBodyChecks self = new ListClusterChecksResponseBodyChecks();
            return TeaModel.build(map, self);
        }

        public ListClusterChecksResponseBodyChecks setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public ListClusterChecksResponseBodyChecks setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListClusterChecksResponseBodyChecks setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListClusterChecksResponseBodyChecks setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListClusterChecksResponseBodyChecks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterChecksResponseBodyChecks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
