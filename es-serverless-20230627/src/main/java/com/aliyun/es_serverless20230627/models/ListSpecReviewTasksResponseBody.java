// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListSpecReviewTasksResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>55F7B3FE-05D8-5F0F-BD55-A18967D447DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSpecReviewTasksResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListSpecReviewTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpecReviewTasksResponseBody self = new ListSpecReviewTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpecReviewTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpecReviewTasksResponseBody setResult(java.util.List<ListSpecReviewTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSpecReviewTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public ListSpecReviewTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSpecReviewTasksResponseBodyResult extends TeaModel {
        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>339</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("appName")
        public String appName;

        @NameInMap("applyReason")
        public String applyReason;

        /**
         * <strong>example:</strong>
         * <p>2024-05-27T10:13:22.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>QUOTA</p>
         */
        @NameInMap("type")
        public String type;

        public static ListSpecReviewTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSpecReviewTasksResponseBodyResult self = new ListSpecReviewTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSpecReviewTasksResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSpecReviewTasksResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSpecReviewTasksResponseBodyResult setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public ListSpecReviewTasksResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSpecReviewTasksResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListSpecReviewTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSpecReviewTasksResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
