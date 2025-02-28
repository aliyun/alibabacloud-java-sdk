// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestCasesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListServiceTestCasesResponseBodyData> data;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CA3AE512-6D30-549A-B52D-B9042CA8D515</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceTestCasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestCasesResponseBody self = new ListServiceTestCasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceTestCasesResponseBody setData(java.util.List<ListServiceTestCasesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServiceTestCasesResponseBodyData> getData() {
        return this.data;
    }

    public ListServiceTestCasesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTestCasesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTestCasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceTestCasesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceTestCasesResponseBodyData extends TeaModel {
        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The service test case id.</p>
         * 
         * <strong>example:</strong>
         * <p>stc-83fcee1383354e35b151</p>
         */
        @NameInMap("TestCaseId")
        public String testCaseId;

        /**
         * <p>The service test case name.</p>
         * 
         * <strong>example:</strong>
         * <p>case1</p>
         */
        @NameInMap("TestCaseName")
        public String testCaseName;

        /**
         * <p>The service test config.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         * <p>parameters:
         *   PayType: &quot;PostPaid&quot;
         *   EcsInstanceType: &quot;$[iact3-auto]&quot;
         *   InstancePassword: &quot;$[iact3-auto]&quot;</p>
         */
        @NameInMap("TestConfig")
        public String testConfig;

        public static ListServiceTestCasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceTestCasesResponseBodyData self = new ListServiceTestCasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceTestCasesResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListServiceTestCasesResponseBodyData setTestCaseId(String testCaseId) {
            this.testCaseId = testCaseId;
            return this;
        }
        public String getTestCaseId() {
            return this.testCaseId;
        }

        public ListServiceTestCasesResponseBodyData setTestCaseName(String testCaseName) {
            this.testCaseName = testCaseName;
            return this;
        }
        public String getTestCaseName() {
            return this.testCaseName;
        }

        public ListServiceTestCasesResponseBodyData setTestConfig(String testConfig) {
            this.testConfig = testConfig;
            return this;
        }
        public String getTestConfig() {
            return this.testConfig;
        }

    }

}
