// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceSpeechResponse extends TeaModel {
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
    public QueryDeviceSpeechResponseData data;

    public static QueryDeviceSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSpeechResponse self = new QueryDeviceSpeechResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSpeechResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceSpeechResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceSpeechResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceSpeechResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceSpeechResponse setData(QueryDeviceSpeechResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceSpeechResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceSpeechResponseDataListItems extends TeaModel {
        @NameInMap("BizCode")
        @Validation(required = true)
        public String bizCode;

        @NameInMap("Size")
        @Validation(required = true)
        public Float size;

        @NameInMap("AudioFormat")
        @Validation(required = true)
        public String audioFormat;

        public static QueryDeviceSpeechResponseDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceSpeechResponseDataListItems self = new QueryDeviceSpeechResponseDataListItems();
            return TeaModel.build(map, self);
        }

        public QueryDeviceSpeechResponseDataListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QueryDeviceSpeechResponseDataListItems setSize(Float size) {
            this.size = size;
            return this;
        }
        public Float getSize() {
            return this.size;
        }

        public QueryDeviceSpeechResponseDataListItems setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

    }

    public static class QueryDeviceSpeechResponseDataList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QueryDeviceSpeechResponseDataListItems> items;

        public static QueryDeviceSpeechResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceSpeechResponseDataList self = new QueryDeviceSpeechResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceSpeechResponseDataList setItems(java.util.List<QueryDeviceSpeechResponseDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryDeviceSpeechResponseDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QueryDeviceSpeechResponseData extends TeaModel {
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
        public QueryDeviceSpeechResponseDataList list;

        public static QueryDeviceSpeechResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceSpeechResponseData self = new QueryDeviceSpeechResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceSpeechResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDeviceSpeechResponseData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QueryDeviceSpeechResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDeviceSpeechResponseData setList(QueryDeviceSpeechResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceSpeechResponseDataList getList() {
            return this.list;
        }

    }

}
