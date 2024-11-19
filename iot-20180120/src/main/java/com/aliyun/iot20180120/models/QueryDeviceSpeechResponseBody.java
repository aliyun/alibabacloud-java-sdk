// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceSpeechResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.speechsolution.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceSpeechResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>speech solution has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceSpeechResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSpeechResponseBody self = new QueryDeviceSpeechResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSpeechResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceSpeechResponseBody setData(QueryDeviceSpeechResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceSpeechResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceSpeechResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceSpeechResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceSpeechResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceSpeechResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wav</p>
         */
        @NameInMap("AudioFormat")
        public String audioFormat;

        /**
         * <strong>example:</strong>
         * <p>ZFDZ</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Size")
        public Float size;

        public static QueryDeviceSpeechResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceSpeechResponseBodyDataListItems self = new QueryDeviceSpeechResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QueryDeviceSpeechResponseBodyDataListItems setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public QueryDeviceSpeechResponseBodyDataListItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QueryDeviceSpeechResponseBodyDataListItems setSize(Float size) {
            this.size = size;
            return this;
        }
        public Float getSize() {
            return this.size;
        }

    }

    public static class QueryDeviceSpeechResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QueryDeviceSpeechResponseBodyDataListItems> items;

        public static QueryDeviceSpeechResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceSpeechResponseBodyDataList self = new QueryDeviceSpeechResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceSpeechResponseBodyDataList setItems(java.util.List<QueryDeviceSpeechResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryDeviceSpeechResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QueryDeviceSpeechResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryDeviceSpeechResponseBodyDataList list;

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
         * <p>200</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryDeviceSpeechResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceSpeechResponseBodyData self = new QueryDeviceSpeechResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceSpeechResponseBodyData setList(QueryDeviceSpeechResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceSpeechResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceSpeechResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QueryDeviceSpeechResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDeviceSpeechResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
