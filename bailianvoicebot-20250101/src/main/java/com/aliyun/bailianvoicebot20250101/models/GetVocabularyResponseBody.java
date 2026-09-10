// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetVocabularyResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The hot word vocabulary object.</p>
     */
    @NameInMap("Data")
    public GetVocabularyResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance llm-zzu528i29ecnprcl does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of dynamic error parameters.</p>
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

    public static GetVocabularyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVocabularyResponseBody self = new GetVocabularyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVocabularyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVocabularyResponseBody setData(GetVocabularyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVocabularyResponseBodyData getData() {
        return this.data;
    }

    public GetVocabularyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVocabularyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVocabularyResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetVocabularyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVocabularyResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1773453676000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Contains professional terminology for financial scenarios</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Model Studio business space.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-zop7ukgtksltamo4</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the hot word vocabulary.</p>
         * 
         * <strong>example:</strong>
         * <p>Financial scenario hot words</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1308144684576655</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1773453676000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The hot word vocabulary ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        /**
         * <p>The number of hot words.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("WordCount")
        public String wordCount;

        /**
         * <p>The hot words.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;苹果\&quot;:\&quot;2\&quot;,\&quot;香蕉\&quot;:\&quot;3\&quot;}</p>
         */
        @NameInMap("Words")
        public String words;

        public static GetVocabularyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVocabularyResponseBodyData self = new GetVocabularyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVocabularyResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetVocabularyResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVocabularyResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetVocabularyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVocabularyResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVocabularyResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public GetVocabularyResponseBodyData setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public GetVocabularyResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

        public GetVocabularyResponseBodyData setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

}
