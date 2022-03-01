// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class HighlightGameVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public HighlightGameVideoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static HighlightGameVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HighlightGameVideoResponseBody self = new HighlightGameVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public HighlightGameVideoResponseBody setData(HighlightGameVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HighlightGameVideoResponseBodyData getData() {
        return this.data;
    }

    public HighlightGameVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HighlightGameVideoResponseBodyDataGameList extends TeaModel {
        @NameInMap("End")
        public Float end;

        @NameInMap("GameInfo")
        public java.util.Map<String, ?> gameInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Start")
        public Float start;

        public static HighlightGameVideoResponseBodyDataGameList build(java.util.Map<String, ?> map) throws Exception {
            HighlightGameVideoResponseBodyDataGameList self = new HighlightGameVideoResponseBodyDataGameList();
            return TeaModel.build(map, self);
        }

        public HighlightGameVideoResponseBodyDataGameList setEnd(Float end) {
            this.end = end;
            return this;
        }
        public Float getEnd() {
            return this.end;
        }

        public HighlightGameVideoResponseBodyDataGameList setGameInfo(java.util.Map<String, ?> gameInfo) {
            this.gameInfo = gameInfo;
            return this;
        }
        public java.util.Map<String, ?> getGameInfo() {
            return this.gameInfo;
        }

        public HighlightGameVideoResponseBodyDataGameList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public HighlightGameVideoResponseBodyDataGameList setStart(Float start) {
            this.start = start;
            return this;
        }
        public Float getStart() {
            return this.start;
        }

    }

    public static class HighlightGameVideoResponseBodyDataHighlightList extends TeaModel {
        @NameInMap("End")
        public Float end;

        @NameInMap("Start")
        public Float start;

        public static HighlightGameVideoResponseBodyDataHighlightList build(java.util.Map<String, ?> map) throws Exception {
            HighlightGameVideoResponseBodyDataHighlightList self = new HighlightGameVideoResponseBodyDataHighlightList();
            return TeaModel.build(map, self);
        }

        public HighlightGameVideoResponseBodyDataHighlightList setEnd(Float end) {
            this.end = end;
            return this;
        }
        public Float getEnd() {
            return this.end;
        }

        public HighlightGameVideoResponseBodyDataHighlightList setStart(Float start) {
            this.start = start;
            return this;
        }
        public Float getStart() {
            return this.start;
        }

    }

    public static class HighlightGameVideoResponseBodyData extends TeaModel {
        @NameInMap("GameList")
        public java.util.List<HighlightGameVideoResponseBodyDataGameList> gameList;

        @NameInMap("HighlightList")
        public java.util.List<HighlightGameVideoResponseBodyDataHighlightList> highlightList;

        public static HighlightGameVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HighlightGameVideoResponseBodyData self = new HighlightGameVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HighlightGameVideoResponseBodyData setGameList(java.util.List<HighlightGameVideoResponseBodyDataGameList> gameList) {
            this.gameList = gameList;
            return this;
        }
        public java.util.List<HighlightGameVideoResponseBodyDataGameList> getGameList() {
            return this.gameList;
        }

        public HighlightGameVideoResponseBodyData setHighlightList(java.util.List<HighlightGameVideoResponseBodyDataHighlightList> highlightList) {
            this.highlightList = highlightList;
            return this;
        }
        public java.util.List<HighlightGameVideoResponseBodyDataHighlightList> getHighlightList() {
            return this.highlightList;
        }

    }

}
