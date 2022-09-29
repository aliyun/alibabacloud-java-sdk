// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchBodyTraceResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchBodyTraceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchBodyTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyTraceResponseBody self = new SearchBodyTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchBodyTraceResponseBody setData(SearchBodyTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchBodyTraceResponseBodyData getData() {
        return this.data;
    }

    public SearchBodyTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchBodyTraceResponseBodyDataMatchList extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("PersonId")
        public Long personId;

        @NameInMap("Score")
        public Float score;

        @NameInMap("TraceId")
        public Long traceId;

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

        public SearchBodyTraceResponseBodyDataMatchList setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public SearchBodyTraceResponseBodyDataMatchList setPersonId(Long personId) {
            this.personId = personId;
            return this;
        }
        public Long getPersonId() {
            return this.personId;
        }

        public SearchBodyTraceResponseBodyDataMatchList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchBodyTraceResponseBodyDataMatchList setTraceId(Long traceId) {
            this.traceId = traceId;
            return this;
        }
        public Long getTraceId() {
            return this.traceId;
        }

    }

    public static class SearchBodyTraceResponseBodyData extends TeaModel {
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
