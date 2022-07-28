// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryChildDivisionCodeByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryChildDivisionCodeByIdResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryChildDivisionCodeByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChildDivisionCodeByIdResponseBody self = new QueryChildDivisionCodeByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryChildDivisionCodeByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryChildDivisionCodeByIdResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryChildDivisionCodeByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryChildDivisionCodeByIdResponseBody setModel(QueryChildDivisionCodeByIdResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryChildDivisionCodeByIdResponseBodyModel getModel() {
        return this.model;
    }

    public QueryChildDivisionCodeByIdResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryChildDivisionCodeByIdResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryChildDivisionCodeByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryChildDivisionCodeByIdResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryChildDivisionCodeByIdResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryChildDivisionCodeByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryChildDivisionCodeByIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryChildDivisionCodeByIdResponseBodyModelDivisionList extends TeaModel {
        @NameInMap("DivisionCode")
        public Long divisionCode;

        @NameInMap("DivisionLevel")
        public Long divisionLevel;

        @NameInMap("DivisionName")
        public String divisionName;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Pinyin")
        public String pinyin;

        public static QueryChildDivisionCodeByIdResponseBodyModelDivisionList build(java.util.Map<String, ?> map) throws Exception {
            QueryChildDivisionCodeByIdResponseBodyModelDivisionList self = new QueryChildDivisionCodeByIdResponseBodyModelDivisionList();
            return TeaModel.build(map, self);
        }

        public QueryChildDivisionCodeByIdResponseBodyModelDivisionList setDivisionCode(Long divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public Long getDivisionCode() {
            return this.divisionCode;
        }

        public QueryChildDivisionCodeByIdResponseBodyModelDivisionList setDivisionLevel(Long divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        public QueryChildDivisionCodeByIdResponseBodyModelDivisionList setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryChildDivisionCodeByIdResponseBodyModelDivisionList setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryChildDivisionCodeByIdResponseBodyModelDivisionList setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

    }

    public static class QueryChildDivisionCodeByIdResponseBodyModel extends TeaModel {
        @NameInMap("DivisionList")
        public java.util.List<QueryChildDivisionCodeByIdResponseBodyModelDivisionList> divisionList;

        public static QueryChildDivisionCodeByIdResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryChildDivisionCodeByIdResponseBodyModel self = new QueryChildDivisionCodeByIdResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryChildDivisionCodeByIdResponseBodyModel setDivisionList(java.util.List<QueryChildDivisionCodeByIdResponseBodyModelDivisionList> divisionList) {
            this.divisionList = divisionList;
            return this;
        }
        public java.util.List<QueryChildDivisionCodeByIdResponseBodyModelDivisionList> getDivisionList() {
            return this.divisionList;
        }

    }

}
