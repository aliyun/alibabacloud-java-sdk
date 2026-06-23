// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterChecksResponseBody extends TeaModel {
    /**
     * <p>The list of checks.</p>
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
         * <p>The check ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1697100584236600453-ce0da5a1d627e4e9e9f96cae8ad07****-clustercheck-lboto</p>
         */
        @NameInMap("check_id")
        public String checkId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-11T02:56:02.565982623Z</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>The completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-11T02:56:18.881054031Z</p>
         */
        @NameInMap("finished_at")
        public String finishedAt;

        /**
         * <p>The check status message.</p>
         * 
         * <strong>example:</strong>
         * <p>task succeed</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The check status.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The check type.</p>
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
