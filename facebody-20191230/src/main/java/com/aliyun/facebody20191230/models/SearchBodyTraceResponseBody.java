// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchBodyTraceResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SearchBodyTraceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static SearchBodyTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyTraceResponseBody self = new SearchBodyTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchBodyTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchBodyTraceResponseBody setData(SearchBodyTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchBodyTraceResponseBodyData getData() {
        return this.data;
    }

    public SearchBodyTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchBodyTraceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class SearchBodyTraceResponseBodyDataMatchList extends TeaModel {
        // 数据库ID
        @NameInMap("DbId")
        public Long dbId;

        // 人员ID
        @NameInMap("PersonId")
        public Long personId;

        // TraceId
        @NameInMap("TraceId")
        public Long traceId;

        // 匹配度分值，越大越相似，取值范围[-1.0, 1.0]
        @NameInMap("Score")
        public Float score;

        // 自定义数据信息
        @NameInMap("ExtraData")
        public String extraData;

        public static SearchBodyTraceResponseBodyDataMatchList build(java.util.Map<String, ?> map) throws Exception {
            SearchBodyTraceResponseBodyDataMatchList self = new SearchBodyTraceResponseBodyDataMatchList();
            return TeaModel.build(map, self);
        }

        public SearchBodyTraceResponseBodyDataMatchList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public SearchBodyTraceResponseBodyDataMatchList setPersonId(Long personId) {
            this.personId = personId;
            return this;
        }
        public Long getPersonId() {
            return this.personId;
        }

        public SearchBodyTraceResponseBodyDataMatchList setTraceId(Long traceId) {
            this.traceId = traceId;
            return this;
        }
        public Long getTraceId() {
            return this.traceId;
        }

        public SearchBodyTraceResponseBodyDataMatchList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchBodyTraceResponseBodyDataMatchList setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

    }

    public static class SearchBodyTraceResponseBodyData extends TeaModel {
        // 匹配的Trace列表
        @NameInMap("MatchList")
        public java.util.List<SearchBodyTraceResponseBodyDataMatchList> matchList;

        public static SearchBodyTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchBodyTraceResponseBodyData self = new SearchBodyTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchBodyTraceResponseBodyData setMatchList(java.util.List<SearchBodyTraceResponseBodyDataMatchList> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<SearchBodyTraceResponseBodyDataMatchList> getMatchList() {
            return this.matchList;
        }

    }

}
