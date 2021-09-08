// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobSpeechResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySpeechPushJobSpeechResponseData data;

    public static QuerySpeechPushJobSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobSpeechResponse self = new QuerySpeechPushJobSpeechResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobSpeechResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechPushJobSpeechResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySpeechPushJobSpeechResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechPushJobSpeechResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechPushJobSpeechResponse setData(QuerySpeechPushJobSpeechResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechPushJobSpeechResponseData getData() {
        return this.data;
    }

    public static class QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems extends TeaModel {
        @NameInMap("BizCode")
        @Validation(required = true)
        public String bizCode;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("Voice")
        @Validation(required = true)
        public String voice;

        public static QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems self = new QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseDataListItemsSpeechList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems> items;

        public static QuerySpeechPushJobSpeechResponseDataListItemsSpeechList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseDataListItemsSpeechList self = new QuerySpeechPushJobSpeechResponseDataListItemsSpeechList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseDataListItemsSpeechList setItems(java.util.List<QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobSpeechResponseDataListItemsSpeechListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseDataListItems extends TeaModel {
        @NameInMap("BizCode")
        @Validation(required = true)
        public String bizCode;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("Voice")
        @Validation(required = true)
        public String voice;

        @NameInMap("SpeechType")
        @Validation(required = true)
        public String speechType;

        @NameInMap("SpeechList")
        @Validation(required = true)
        public QuerySpeechPushJobSpeechResponseDataListItemsSpeechList speechList;

        public static QuerySpeechPushJobSpeechResponseDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseDataListItems self = new QuerySpeechPushJobSpeechResponseDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseDataListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechPushJobSpeechResponseDataListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechPushJobSpeechResponseDataListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public QuerySpeechPushJobSpeechResponseDataListItems setSpeechType(String speechType) {
            this.speechType = speechType;
            return this;
        }
        public String getSpeechType() {
            return this.speechType;
        }

        public QuerySpeechPushJobSpeechResponseDataListItems setSpeechList(QuerySpeechPushJobSpeechResponseDataListItemsSpeechList speechList) {
            this.speechList = speechList;
            return this;
        }
        public QuerySpeechPushJobSpeechResponseDataListItemsSpeechList getSpeechList() {
            return this.speechList;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseDataList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySpeechPushJobSpeechResponseDataListItems> items;

        public static QuerySpeechPushJobSpeechResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseDataList self = new QuerySpeechPushJobSpeechResponseDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseDataList setItems(java.util.List<QuerySpeechPushJobSpeechResponseDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobSpeechResponseDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageId")
        @Validation(required = true)
        public Integer pageId;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public QuerySpeechPushJobSpeechResponseDataList list;

        public static QuerySpeechPushJobSpeechResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseData self = new QuerySpeechPushJobSpeechResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySpeechPushJobSpeechResponseData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechPushJobSpeechResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechPushJobSpeechResponseData setList(QuerySpeechPushJobSpeechResponseDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechPushJobSpeechResponseDataList getList() {
            return this.list;
        }

    }

}
