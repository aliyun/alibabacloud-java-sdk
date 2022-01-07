// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySpeechListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySpeechListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechListResponseBody self = new QuerySpeechListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechListResponseBody setData(QuerySpeechListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechListResponseBodyData getData() {
        return this.data;
    }

    public QuerySpeechListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySpeechListResponseBodyDataListItemsSpeechListItems extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("SpeechCode")
        public String speechCode;

        @NameInMap("Text")
        public String text;

        @NameInMap("Voice")
        public String voice;

        public static QuerySpeechListResponseBodyDataListItemsSpeechListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseBodyDataListItemsSpeechListItems self = new QuerySpeechListResponseBodyDataListItemsSpeechListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseBodyDataListItemsSpeechListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechListResponseBodyDataListItemsSpeechListItems setSpeechCode(String speechCode) {
            this.speechCode = speechCode;
            return this;
        }
        public String getSpeechCode() {
            return this.speechCode;
        }

        public QuerySpeechListResponseBodyDataListItemsSpeechListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechListResponseBodyDataListItemsSpeechListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class QuerySpeechListResponseBodyDataListItemsSpeechList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySpeechListResponseBodyDataListItemsSpeechListItems> items;

        public static QuerySpeechListResponseBodyDataListItemsSpeechList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseBodyDataListItemsSpeechList self = new QuerySpeechListResponseBodyDataListItemsSpeechList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseBodyDataListItemsSpeechList setItems(java.util.List<QuerySpeechListResponseBodyDataListItemsSpeechListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechListResponseBodyDataListItemsSpeechListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechListResponseBodyDataListItems extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("SpeechCode")
        public String speechCode;

        @NameInMap("SpeechList")
        public QuerySpeechListResponseBodyDataListItemsSpeechList speechList;

        @NameInMap("SpeechType")
        public String speechType;

        @NameInMap("Text")
        public String text;

        @NameInMap("Voice")
        public String voice;

        public static QuerySpeechListResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseBodyDataListItems self = new QuerySpeechListResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseBodyDataListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechListResponseBodyDataListItems setSpeechCode(String speechCode) {
            this.speechCode = speechCode;
            return this;
        }
        public String getSpeechCode() {
            return this.speechCode;
        }

        public QuerySpeechListResponseBodyDataListItems setSpeechList(QuerySpeechListResponseBodyDataListItemsSpeechList speechList) {
            this.speechList = speechList;
            return this;
        }
        public QuerySpeechListResponseBodyDataListItemsSpeechList getSpeechList() {
            return this.speechList;
        }

        public QuerySpeechListResponseBodyDataListItems setSpeechType(String speechType) {
            this.speechType = speechType;
            return this;
        }
        public String getSpeechType() {
            return this.speechType;
        }

        public QuerySpeechListResponseBodyDataListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechListResponseBodyDataListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class QuerySpeechListResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySpeechListResponseBodyDataListItems> items;

        public static QuerySpeechListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseBodyDataList self = new QuerySpeechListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseBodyDataList setItems(java.util.List<QuerySpeechListResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechListResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySpeechListResponseBodyDataList list;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QuerySpeechListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseBodyData self = new QuerySpeechListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseBodyData setList(QuerySpeechListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechListResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySpeechListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
