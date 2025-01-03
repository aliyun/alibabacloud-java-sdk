// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetTestcaseListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    @NameInMap("testcase")
    public java.util.List<GetTestcaseListResponseBodyTestcase> testcase;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static GetTestcaseListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTestcaseListResponseBody self = new GetTestcaseListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTestcaseListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTestcaseListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetTestcaseListResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetTestcaseListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetTestcaseListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTestcaseListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTestcaseListResponseBody setTestcase(java.util.List<GetTestcaseListResponseBodyTestcase> testcase) {
        this.testcase = testcase;
        return this;
    }
    public java.util.List<GetTestcaseListResponseBodyTestcase> getTestcase() {
        return this.testcase;
    }

    public GetTestcaseListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetTestcaseListResponseBodyTestcaseAssignedTo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12xxxxx456</p>
         */
        @NameInMap("assignedToIdenttifier")
        public String assignedToIdenttifier;

        @NameInMap("name")
        public String name;

        public static GetTestcaseListResponseBodyTestcaseAssignedTo build(java.util.Map<String, ?> map) throws Exception {
            GetTestcaseListResponseBodyTestcaseAssignedTo self = new GetTestcaseListResponseBodyTestcaseAssignedTo();
            return TeaModel.build(map, self);
        }

        public GetTestcaseListResponseBodyTestcaseAssignedTo setAssignedToIdenttifier(String assignedToIdenttifier) {
            this.assignedToIdenttifier = assignedToIdenttifier;
            return this;
        }
        public String getAssignedToIdenttifier() {
            return this.assignedToIdenttifier;
        }

        public GetTestcaseListResponseBodyTestcaseAssignedTo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTestcaseListResponseBodyTestcaseCustomFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("fieldClassName")
        public String fieldClassName;

        /**
         * <strong>example:</strong>
         * <p>Input</p>
         */
        @NameInMap("fieldFormat")
        public String fieldFormat;

        /**
         * <strong>example:</strong>
         * <p>85702b33f14bfa82cb458173ba</p>
         */
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        /**
         * <strong>example:</strong>
         * <p>d7f112f9d023e2108fa1b0d8</p>
         */
        @NameInMap("value")
        public String value;

        public static GetTestcaseListResponseBodyTestcaseCustomFields build(java.util.Map<String, ?> map) throws Exception {
            GetTestcaseListResponseBodyTestcaseCustomFields self = new GetTestcaseListResponseBodyTestcaseCustomFields();
            return TeaModel.build(map, self);
        }

        public GetTestcaseListResponseBodyTestcaseCustomFields setFieldClassName(String fieldClassName) {
            this.fieldClassName = fieldClassName;
            return this;
        }
        public String getFieldClassName() {
            return this.fieldClassName;
        }

        public GetTestcaseListResponseBodyTestcaseCustomFields setFieldFormat(String fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        public GetTestcaseListResponseBodyTestcaseCustomFields setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public GetTestcaseListResponseBodyTestcaseCustomFields setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTestcaseListResponseBodyTestcaseSpace extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22c32972b853cd703dbf0efe4c</p>
         */
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        /**
         * <strong>example:</strong>
         * <p>TestRepo</p>
         */
        @NameInMap("type")
        public String type;

        public static GetTestcaseListResponseBodyTestcaseSpace build(java.util.Map<String, ?> map) throws Exception {
            GetTestcaseListResponseBodyTestcaseSpace self = new GetTestcaseListResponseBodyTestcaseSpace();
            return TeaModel.build(map, self);
        }

        public GetTestcaseListResponseBodyTestcaseSpace setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public GetTestcaseListResponseBodyTestcaseSpace setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTestcaseListResponseBodyTestcaseTags extends TeaModel {
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>85702b33f14bxxxxxx58173ba</p>
         */
        @NameInMap("tagIdentifier")
        public String tagIdentifier;

        public static GetTestcaseListResponseBodyTestcaseTags build(java.util.Map<String, ?> map) throws Exception {
            GetTestcaseListResponseBodyTestcaseTags self = new GetTestcaseListResponseBodyTestcaseTags();
            return TeaModel.build(map, self);
        }

        public GetTestcaseListResponseBodyTestcaseTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTestcaseListResponseBodyTestcaseTags setTagIdentifier(String tagIdentifier) {
            this.tagIdentifier = tagIdentifier;
            return this;
        }
        public String getTagIdentifier() {
            return this.tagIdentifier;
        }

    }

    public static class GetTestcaseListResponseBodyTestcase extends TeaModel {
        @NameInMap("assignedTo")
        public GetTestcaseListResponseBodyTestcaseAssignedTo assignedTo;

        /**
         * <strong>example:</strong>
         * <p>Req</p>
         */
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        @NameInMap("customFields")
        public java.util.List<GetTestcaseListResponseBodyTestcaseCustomFields> customFields;

        /**
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("space")
        public GetTestcaseListResponseBodyTestcaseSpace space;

        /**
         * <strong>example:</strong>
         * <p>测试工作项</p>
         */
        @NameInMap("subject")
        public String subject;

        @NameInMap("tags")
        public java.util.List<GetTestcaseListResponseBodyTestcaseTags> tags;

        public static GetTestcaseListResponseBodyTestcase build(java.util.Map<String, ?> map) throws Exception {
            GetTestcaseListResponseBodyTestcase self = new GetTestcaseListResponseBodyTestcase();
            return TeaModel.build(map, self);
        }

        public GetTestcaseListResponseBodyTestcase setAssignedTo(GetTestcaseListResponseBodyTestcaseAssignedTo assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public GetTestcaseListResponseBodyTestcaseAssignedTo getAssignedTo() {
            return this.assignedTo;
        }

        public GetTestcaseListResponseBodyTestcase setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public GetTestcaseListResponseBodyTestcase setCustomFields(java.util.List<GetTestcaseListResponseBodyTestcaseCustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<GetTestcaseListResponseBodyTestcaseCustomFields> getCustomFields() {
            return this.customFields;
        }

        public GetTestcaseListResponseBodyTestcase setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTestcaseListResponseBodyTestcase setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetTestcaseListResponseBodyTestcase setSpace(GetTestcaseListResponseBodyTestcaseSpace space) {
            this.space = space;
            return this;
        }
        public GetTestcaseListResponseBodyTestcaseSpace getSpace() {
            return this.space;
        }

        public GetTestcaseListResponseBodyTestcase setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetTestcaseListResponseBodyTestcase setTags(java.util.List<GetTestcaseListResponseBodyTestcaseTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTestcaseListResponseBodyTestcaseTags> getTags() {
            return this.tags;
        }

    }

}
