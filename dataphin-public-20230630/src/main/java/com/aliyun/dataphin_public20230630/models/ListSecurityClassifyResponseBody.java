// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityClassifyResponseBody extends TeaModel {
    /**
     * <p>The result of the data classification list.</p>
     */
    @NameInMap("ClassifyListResult")
    public ListSecurityClassifyResponseBodyClassifyListResult classifyListResult;

    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend error.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSecurityClassifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityClassifyResponseBody self = new ListSecurityClassifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityClassifyResponseBody setClassifyListResult(ListSecurityClassifyResponseBodyClassifyListResult classifyListResult) {
        this.classifyListResult = classifyListResult;
        return this;
    }
    public ListSecurityClassifyResponseBodyClassifyListResult getClassifyListResult() {
        return this.classifyListResult;
    }

    public ListSecurityClassifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecurityClassifyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityClassifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityClassifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityClassifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSecurityClassifyResponseBodyClassifyListResultClassifyList extends TeaModel {
        /**
         * <p>The catalog path of the classification.</p>
         * 
         * <strong>example:</strong>
         * <p>/Root/Personal Information</p>
         */
        @NameInMap("CatalogPath")
        public String catalogPath;

        /**
         * <p>The classification description.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal sensitive information classification</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of effective fields.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EffectiveFieldCount")
        public Integer effectiveFieldCount;

        /**
         * <p>The classification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether a masking rule is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsBindDesensitizeRule")
        public Boolean isBindDesensitizeRule;

        /**
         * <p>The level ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelId")
        public Long levelId;

        /**
         * <p>The level name.</p>
         * 
         * <strong>example:</strong>
         * <p>L3</p>
         */
        @NameInMap("LevelName")
        public String levelName;

        /**
         * <p>The classification name.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal Information</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The short name of the classification.</p>
         * 
         * <strong>example:</strong>
         * <p>PI</p>
         */
        @NameInMap("ShortName")
        public String shortName;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSecurityClassifyResponseBodyClassifyListResultClassifyList build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityClassifyResponseBodyClassifyListResultClassifyList self = new ListSecurityClassifyResponseBodyClassifyListResultClassifyList();
            return TeaModel.build(map, self);
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setCatalogPath(String catalogPath) {
            this.catalogPath = catalogPath;
            return this;
        }
        public String getCatalogPath() {
            return this.catalogPath;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setEffectiveFieldCount(Integer effectiveFieldCount) {
            this.effectiveFieldCount = effectiveFieldCount;
            return this;
        }
        public Integer getEffectiveFieldCount() {
            return this.effectiveFieldCount;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setIsBindDesensitizeRule(Boolean isBindDesensitizeRule) {
            this.isBindDesensitizeRule = isBindDesensitizeRule;
            return this;
        }
        public Boolean getIsBindDesensitizeRule() {
            return this.isBindDesensitizeRule;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setLevelId(Long levelId) {
            this.levelId = levelId;
            return this;
        }
        public Long getLevelId() {
            return this.levelId;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public ListSecurityClassifyResponseBodyClassifyListResultClassifyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListSecurityClassifyResponseBodyClassifyListResult extends TeaModel {
        /**
         * <p>The list of data classifications.</p>
         */
        @NameInMap("ClassifyList")
        public java.util.List<ListSecurityClassifyResponseBodyClassifyListResultClassifyList> classifyList;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSecurityClassifyResponseBodyClassifyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityClassifyResponseBodyClassifyListResult self = new ListSecurityClassifyResponseBodyClassifyListResult();
            return TeaModel.build(map, self);
        }

        public ListSecurityClassifyResponseBodyClassifyListResult setClassifyList(java.util.List<ListSecurityClassifyResponseBodyClassifyListResultClassifyList> classifyList) {
            this.classifyList = classifyList;
            return this;
        }
        public java.util.List<ListSecurityClassifyResponseBodyClassifyListResultClassifyList> getClassifyList() {
            return this.classifyList;
        }

        public ListSecurityClassifyResponseBodyClassifyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
