// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListCrossAccountsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCrossAccountsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>5B2F09BF-CEBD-5A7E-AC01-E7F86169A5E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCrossAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrossAccountsResponseBody self = new ListCrossAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrossAccountsResponseBody setData(ListCrossAccountsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCrossAccountsResponseBodyData getData() {
        return this.data;
    }

    public ListCrossAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCrossAccountsResponseBodyDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1773738311</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("ManagementMode")
        public String managementMode;

        /**
         * <strong>example:</strong>
         * <p>r-***</p>
         */
        @NameInMap("ParentTargetId")
        public String parentTargetId;

        /**
         * <strong>example:</strong>
         * <p>123***7890</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>ACCOUNT</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static ListCrossAccountsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCrossAccountsResponseBodyDataContent self = new ListCrossAccountsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCrossAccountsResponseBodyDataContent setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListCrossAccountsResponseBodyDataContent setManagementMode(String managementMode) {
            this.managementMode = managementMode;
            return this;
        }
        public String getManagementMode() {
            return this.managementMode;
        }

        public ListCrossAccountsResponseBodyDataContent setParentTargetId(String parentTargetId) {
            this.parentTargetId = parentTargetId;
            return this;
        }
        public String getParentTargetId() {
            return this.parentTargetId;
        }

        public ListCrossAccountsResponseBodyDataContent setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListCrossAccountsResponseBodyDataContent setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListCrossAccountsResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListCrossAccountsResponseBodyDataContent> content;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>eKDyCM0zFQ5op7jVMWmNNA==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCrossAccountsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCrossAccountsResponseBodyData self = new ListCrossAccountsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCrossAccountsResponseBodyData setContent(java.util.List<ListCrossAccountsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCrossAccountsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCrossAccountsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListCrossAccountsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListCrossAccountsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
