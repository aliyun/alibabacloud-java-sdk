// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechListResponse extends TeaModel {
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
    public QuerySpeechListResponseData data;

    public static QuerySpeechListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechListResponse self = new QuerySpeechListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySpeechListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechListResponse setData(QuerySpeechListResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechListResponseData getData() {
        return this.data;
    }

    public static class QuerySpeechListResponseDataListItemsSpeechListItems extends TeaModel {
        @NameInMap("SpeechCode")
        @Validation(required = true)
        public String speechCode;

        @NameInMap("BizCode")
        @Validation(required = true)
        public String bizCode;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("Voice")
        @Validation(required = true)
        public String voice;

        public static QuerySpeechListResponseDataListItemsSpeechListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseDataListItemsSpeechListItems self = new QuerySpeechListResponseDataListItemsSpeechListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseDataListItemsSpeechListItems setSpeechCode(String speechCode) {
            this.speechCode = speechCode;
            return this;
        }
        public String getSpeechCode() {
            return this.speechCode;
        }

        public QuerySpeechListResponseDataListItemsSpeechListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechListResponseDataListItemsSpeechListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechListResponseDataListItemsSpeechListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class QuerySpeechListResponseDataListItemsSpeechList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySpeechListResponseDataListItemsSpeechListItems> items;

        public static QuerySpeechListResponseDataListItemsSpeechList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseDataListItemsSpeechList self = new QuerySpeechListResponseDataListItemsSpeechList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseDataListItemsSpeechList setItems(java.util.List<QuerySpeechListResponseDataListItemsSpeechListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechListResponseDataListItemsSpeechListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechListResponseDataListItems extends TeaModel {
        @NameInMap("SpeechCode")
        @Validation(required = true)
        public String speechCode;

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

        @NameInMap("AudioFormat")
        @Validation(required = true)
        public String audioFormat;

        @NameInMap("SpeechList")
        @Validation(required = true)
        public QuerySpeechListResponseDataListItemsSpeechList speechList;

        public static QuerySpeechListResponseDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseDataListItems self = new QuerySpeechListResponseDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseDataListItems setSpeechCode(String speechCode) {
            this.speechCode = speechCode;
            return this;
        }
        public String getSpeechCode() {
            return this.speechCode;
        }

        public QuerySpeechListResponseDataListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechListResponseDataListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechListResponseDataListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public QuerySpeechListResponseDataListItems setSpeechType(String speechType) {
            this.speechType = speechType;
            return this;
        }
        public String getSpeechType() {
            return this.speechType;
        }

        public QuerySpeechListResponseDataListItems setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public QuerySpeechListResponseDataListItems setSpeechList(QuerySpeechListResponseDataListItemsSpeechList speechList) {
            this.speechList = speechList;
            return this;
        }
        public QuerySpeechListResponseDataListItemsSpeechList getSpeechList() {
            return this.speechList;
        }

    }

    public static class QuerySpeechListResponseDataList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySpeechListResponseDataListItems> items;

        public static QuerySpeechListResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseDataList self = new QuerySpeechListResponseDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseDataList setItems(java.util.List<QuerySpeechListResponseDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechListResponseDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechListResponseData extends TeaModel {
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
        public QuerySpeechListResponseDataList list;

        public static QuerySpeechListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechListResponseData self = new QuerySpeechListResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechListResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySpeechListResponseData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechListResponseData setList(QuerySpeechListResponseDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechListResponseDataList getList() {
            return this.list;
        }

    }

}
