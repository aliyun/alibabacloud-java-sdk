// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListVoiceEnginesResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of <code>OK</code> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The pagination data, which includes the list of voice engines.</p>
     */
    @NameInMap("Data")
    public ListVoiceEnginesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance llm-rj6aqmctjcit4acy does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A list of dynamic error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D771A1B6-3D5F-174A-BEE1-98CE1000D337</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVoiceEnginesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceEnginesResponseBody self = new ListVoiceEnginesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceEnginesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceEnginesResponseBody setData(ListVoiceEnginesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVoiceEnginesResponseBodyData getData() {
        return this.data;
    }

    public ListVoiceEnginesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoiceEnginesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceEnginesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListVoiceEnginesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVoiceEnginesResponseBodyDataVoiceEngines extends TeaModel {
        /**
         * <p>The engine configuration schema, provided as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;displayName\&quot;:\&quot;AppKey\&quot;,\&quot;maxLength\&quot;:64,\&quot;name\&quot;:\&quot;AppKey\&quot;,\&quot;order\&quot;:1,\&quot;required\&quot;:true},{\&quot;displayName\&quot;:\&quot;AccessKey\&quot;,\&quot;maxLength\&quot;:64,\&quot;name\&quot;:\&quot;AccessKey\&quot;,\&quot;order\&quot;:2,\&quot;required\&quot;:true}]</p>
         */
        @NameInMap("ConfigSchema")
        public String configSchema;

        /**
         * <p>The identifier for the voice engine.</p>
         * 
         * <strong>example:</strong>
         * <p>VOLC</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>The display name of the voice engine.</p>
         * 
         * <strong>example:</strong>
         * <p>豆包</p>
         */
        @NameInMap("NlsEngineName")
        public String nlsEngineName;

        public static ListVoiceEnginesResponseBodyDataVoiceEngines build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceEnginesResponseBodyDataVoiceEngines self = new ListVoiceEnginesResponseBodyDataVoiceEngines();
            return TeaModel.build(map, self);
        }

        public ListVoiceEnginesResponseBodyDataVoiceEngines setConfigSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public String getConfigSchema() {
            return this.configSchema;
        }

        public ListVoiceEnginesResponseBodyDataVoiceEngines setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public ListVoiceEnginesResponseBodyDataVoiceEngines setNlsEngineName(String nlsEngineName) {
            this.nlsEngineName = nlsEngineName;
            return this;
        }
        public String getNlsEngineName() {
            return this.nlsEngineName;
        }

    }

    public static class ListVoiceEnginesResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of voice engines.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>A list of voice engine objects.</p>
         */
        @NameInMap("VoiceEngines")
        public java.util.List<ListVoiceEnginesResponseBodyDataVoiceEngines> voiceEngines;

        public static ListVoiceEnginesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceEnginesResponseBodyData self = new ListVoiceEnginesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVoiceEnginesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVoiceEnginesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVoiceEnginesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVoiceEnginesResponseBodyData setVoiceEngines(java.util.List<ListVoiceEnginesResponseBodyDataVoiceEngines> voiceEngines) {
            this.voiceEngines = voiceEngines;
            return this;
        }
        public java.util.List<ListVoiceEnginesResponseBodyDataVoiceEngines> getVoiceEngines() {
            return this.voiceEngines;
        }

    }

}
