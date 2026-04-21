// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListVoicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListVoicesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance llm-xdne77rxe14ziszr
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>CF6D3484-19A1-5C77-863B-AC8B5754D37C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVoicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoicesResponseBody self = new ListVoicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoicesResponseBody setData(ListVoicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVoicesResponseBodyData getData() {
        return this.data;
    }

    public ListVoicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoicesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListVoicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVoicesResponseBodyDataVoices extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>Qwen</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        @NameInMap("Style")
        public String style;

        @NameInMap("SupportedParams")
        public java.util.List<String> supportedParams;

        /**
         * <strong>example:</strong>
         * <p>Cherry</p>
         */
        @NameInMap("Voice")
        public String voice;

        public static ListVoicesResponseBodyDataVoices build(java.util.Map<String, ?> map) throws Exception {
            ListVoicesResponseBodyDataVoices self = new ListVoicesResponseBodyDataVoices();
            return TeaModel.build(map, self);
        }

        public ListVoicesResponseBodyDataVoices setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListVoicesResponseBodyDataVoices setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListVoicesResponseBodyDataVoices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListVoicesResponseBodyDataVoices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVoicesResponseBodyDataVoices setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public ListVoicesResponseBodyDataVoices setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public ListVoicesResponseBodyDataVoices setSupportedParams(java.util.List<String> supportedParams) {
            this.supportedParams = supportedParams;
            return this;
        }
        public java.util.List<String> getSupportedParams() {
            return this.supportedParams;
        }

        public ListVoicesResponseBodyDataVoices setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class ListVoicesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Voices")
        public java.util.List<ListVoicesResponseBodyDataVoices> voices;

        public static ListVoicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVoicesResponseBodyData self = new ListVoicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVoicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVoicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVoicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVoicesResponseBodyData setVoices(java.util.List<ListVoicesResponseBodyDataVoices> voices) {
            this.voices = voices;
            return this;
        }
        public java.util.List<ListVoicesResponseBodyDataVoices> getVoices() {
            return this.voices;
        }

    }

}
