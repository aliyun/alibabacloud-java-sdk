// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListTrustedOriginsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page that takes effect for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page query.</p>
     * 
     * <strong>example:</strong>
     * <p>NT_example</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of trusted origins.</p>
     */
    @NameInMap("TrustedOrigins")
    public java.util.List<ListTrustedOriginsResponseBodyTrustedOrigins> trustedOrigins;

    public static ListTrustedOriginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedOriginsResponseBody self = new ListTrustedOriginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrustedOriginsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrustedOriginsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrustedOriginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrustedOriginsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTrustedOriginsResponseBody setTrustedOrigins(java.util.List<ListTrustedOriginsResponseBodyTrustedOrigins> trustedOrigins) {
        this.trustedOrigins = trustedOrigins;
        return this;
    }
    public java.util.List<ListTrustedOriginsResponseBodyTrustedOrigins> getTrustedOrigins() {
        return this.trustedOrigins;
    }

    public static class ListTrustedOriginsResponseBodyTrustedOrigins extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T08:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_example</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The browser origin.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The trusted origin name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qoder Production Console</p>
         */
        @NameInMap("TrustOriginName")
        public String trustOriginName;

        /**
         * <p>The trusted origin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>to_example</p>
         */
        @NameInMap("TrustedOriginId")
        public String trustedOriginId;

        /**
         * <p>The trusted origin scene.</p>
         */
        @NameInMap("TrustedOriginScene")
        public java.util.List<String> trustedOriginScene;

        /**
         * <p>The update time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T08:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListTrustedOriginsResponseBodyTrustedOrigins build(java.util.Map<String, ?> map) throws Exception {
            ListTrustedOriginsResponseBodyTrustedOrigins self = new ListTrustedOriginsResponseBodyTrustedOrigins();
            return TeaModel.build(map, self);
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setTrustOriginName(String trustOriginName) {
            this.trustOriginName = trustOriginName;
            return this;
        }
        public String getTrustOriginName() {
            return this.trustOriginName;
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setTrustedOriginId(String trustedOriginId) {
            this.trustedOriginId = trustedOriginId;
            return this;
        }
        public String getTrustedOriginId() {
            return this.trustedOriginId;
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setTrustedOriginScene(java.util.List<String> trustedOriginScene) {
            this.trustedOriginScene = trustedOriginScene;
            return this;
        }
        public java.util.List<String> getTrustedOriginScene() {
            return this.trustedOriginScene;
        }

        public ListTrustedOriginsResponseBodyTrustedOrigins setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
