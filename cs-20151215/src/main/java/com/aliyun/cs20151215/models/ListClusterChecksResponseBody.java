// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterChecksResponseBody extends TeaModel {
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
        @NameInMap("check_id")
        public String checkId;

        @NameInMap("created_at")
        public String createdAt;

        @NameInMap("finished_at")
        public String finishedAt;

        @NameInMap("message")
        public String message;

        @NameInMap("status")
        public String status;

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
