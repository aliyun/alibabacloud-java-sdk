// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobSpeechResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.speechsolution.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySpeechPushJobSpeechResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>speech solution has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>AF71BF1D-B552-47CD-B34B-352557627992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySpeechPushJobSpeechResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobSpeechResponseBody self = new QuerySpeechPushJobSpeechResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobSpeechResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechPushJobSpeechResponseBody setData(QuerySpeechPushJobSpeechResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechPushJobSpeechResponseBodyData getData() {
        return this.data;
    }

    public QuerySpeechPushJobSpeechResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechPushJobSpeechResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechPushJobSpeechResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SYS_TONE_0</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>Xiaoyun</p>
         */
        @NameInMap("Voice")
        public String voice;

        public static QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems self = new QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems> items;

        public static QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList self = new QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList setItems(java.util.List<QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZFDZ</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("SpeechList")
        public QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList speechList;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("SpeechType")
        public String speechType;

        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>Xiaoyun</p>
         */
        @NameInMap("Voice")
        public String voice;

        public static QuerySpeechPushJobSpeechResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseBodyDataListItems self = new QuerySpeechPushJobSpeechResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItems setSpeechList(QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList speechList) {
            this.speechList = speechList;
            return this;
        }
        public QuerySpeechPushJobSpeechResponseBodyDataListItemsSpeechList getSpeechList() {
            return this.speechList;
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItems setSpeechType(String speechType) {
            this.speechType = speechType;
            return this;
        }
        public String getSpeechType() {
            return this.speechType;
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechPushJobSpeechResponseBodyDataListItems setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySpeechPushJobSpeechResponseBodyDataListItems> items;

        public static QuerySpeechPushJobSpeechResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseBodyDataList self = new QuerySpeechPushJobSpeechResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseBodyDataList setItems(java.util.List<QuerySpeechPushJobSpeechResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobSpeechResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobSpeechResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySpeechPushJobSpeechResponseBodyDataList list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySpeechPushJobSpeechResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobSpeechResponseBodyData self = new QuerySpeechPushJobSpeechResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobSpeechResponseBodyData setList(QuerySpeechPushJobSpeechResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechPushJobSpeechResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySpeechPushJobSpeechResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechPushJobSpeechResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechPushJobSpeechResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
