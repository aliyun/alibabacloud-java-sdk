// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationAssignmentsResponseBody extends TeaModel {
    @NameInMap("ApplicationAssignment")
    public ListApplicationAssignmentsResponseBodyApplicationAssignment applicationAssignment;

    /**
     * <p>The maximum number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is returned only when the response is truncated. To retrieve the remaining content in subsequent API calls, use the NextToken value.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationAssignmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAssignmentsResponseBody self = new ListApplicationAssignmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationAssignmentsResponseBody setApplicationAssignment(ListApplicationAssignmentsResponseBodyApplicationAssignment applicationAssignment) {
        this.applicationAssignment = applicationAssignment;
        return this;
    }
    public ListApplicationAssignmentsResponseBodyApplicationAssignment getApplicationAssignment() {
        return this.applicationAssignment;
    }

    public ListApplicationAssignmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationAssignmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationAssignmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("PrincipalType")
        public String principalType;

        public static ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo self = new ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo();
            return TeaModel.build(map, self);
        }

        public ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListApplicationAssignmentsResponseBodyApplicationAssignment extends TeaModel {
        @NameInMap("ApplicationAssignmentInfo")
        public java.util.List<ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo> applicationAssignmentInfo;

        public static ListApplicationAssignmentsResponseBodyApplicationAssignment build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAssignmentsResponseBodyApplicationAssignment self = new ListApplicationAssignmentsResponseBodyApplicationAssignment();
            return TeaModel.build(map, self);
        }

        public ListApplicationAssignmentsResponseBodyApplicationAssignment setApplicationAssignmentInfo(java.util.List<ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo> applicationAssignmentInfo) {
            this.applicationAssignmentInfo = applicationAssignmentInfo;
            return this;
        }
        public java.util.List<ListApplicationAssignmentsResponseBodyApplicationAssignmentApplicationAssignmentInfo> getApplicationAssignmentInfo() {
            return this.applicationAssignmentInfo;
        }

    }

}
