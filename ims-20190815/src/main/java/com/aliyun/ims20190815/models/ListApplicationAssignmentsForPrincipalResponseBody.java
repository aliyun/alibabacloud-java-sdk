// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationAssignmentsForPrincipalResponseBody extends TeaModel {
    @NameInMap("ApplicationAssignment")
    public ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment applicationAssignment;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is returned only when the results are truncated. To retrieve the subsequent results, use NextToken in the next call.</p>
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

    public static ListApplicationAssignmentsForPrincipalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAssignmentsForPrincipalResponseBody self = new ListApplicationAssignmentsForPrincipalResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationAssignmentsForPrincipalResponseBody setApplicationAssignment(ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment applicationAssignment) {
        this.applicationAssignment = applicationAssignment;
        return this;
    }
    public ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment getApplicationAssignment() {
        return this.applicationAssignment;
    }

    public ListApplicationAssignmentsForPrincipalResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationAssignmentsForPrincipalResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationAssignmentsForPrincipalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("PrincipalType")
        public String principalType;

        public static ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo self = new ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo();
            return TeaModel.build(map, self);
        }

        public ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment extends TeaModel {
        @NameInMap("ApplicationAssignmentInfo")
        public java.util.List<ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo> applicationAssignmentInfo;

        public static ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment self = new ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment();
            return TeaModel.build(map, self);
        }

        public ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignment setApplicationAssignmentInfo(java.util.List<ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo> applicationAssignmentInfo) {
            this.applicationAssignmentInfo = applicationAssignmentInfo;
            return this;
        }
        public java.util.List<ListApplicationAssignmentsForPrincipalResponseBodyApplicationAssignmentApplicationAssignmentInfo> getApplicationAssignmentInfo() {
            return this.applicationAssignmentInfo;
        }

    }

}
