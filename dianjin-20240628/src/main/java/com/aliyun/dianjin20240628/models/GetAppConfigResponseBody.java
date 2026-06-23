// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetAppConfigResponseBody extends TeaModel {
    /**
     * <p>Time consumed</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>Returned data</p>
     */
    @NameInMap("data")
    public GetAppConfigResponseBodyData data;

    /**
     * <p>Data type</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>EF4B5C9B-3BC8-5171-A47B-4C5CF3DC3258</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Is successful</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Timestamp</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppConfigResponseBody self = new GetAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppConfigResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetAppConfigResponseBody setData(GetAppConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppConfigResponseBodyData getData() {
        return this.data;
    }

    public GetAppConfigResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetAppConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetAppConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAppConfigResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetAppConfigResponseBodyData extends TeaModel {
        /**
         * <p>Embedding type list</p>
         */
        @NameInMap("embeddingTypeList")
        public java.util.List<java.util.Map<String, String>> embeddingTypeList;

        /**
         * <p>Frontend configuration</p>
         */
        @NameInMap("frontendConfig")
        public java.util.Map<String, Boolean> frontendConfig;

        /**
         * <p>Document library status list</p>
         */
        @NameInMap("libraryDocumentStatusList")
        public java.util.List<java.util.Map<String, String>> libraryDocumentStatusList;

        /**
         * <p>Large Language Model (LLM) type list</p>
         */
        @NameInMap("llmHelperTypeList")
        public java.util.List<java.util.Map<String, String>> llmHelperTypeList;

        /**
         * <p>Text index category list</p>
         */
        @NameInMap("textIndexCategoryList")
        public java.util.List<String> textIndexCategoryList;

        /**
         * <p>Vector index category list</p>
         */
        @NameInMap("vectorIndexCategoryList")
        public java.util.List<String> vectorIndexCategoryList;

        public static GetAppConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppConfigResponseBodyData self = new GetAppConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppConfigResponseBodyData setEmbeddingTypeList(java.util.List<java.util.Map<String, String>> embeddingTypeList) {
            this.embeddingTypeList = embeddingTypeList;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getEmbeddingTypeList() {
            return this.embeddingTypeList;
        }

        public GetAppConfigResponseBodyData setFrontendConfig(java.util.Map<String, Boolean> frontendConfig) {
            this.frontendConfig = frontendConfig;
            return this;
        }
        public java.util.Map<String, Boolean> getFrontendConfig() {
            return this.frontendConfig;
        }

        public GetAppConfigResponseBodyData setLibraryDocumentStatusList(java.util.List<java.util.Map<String, String>> libraryDocumentStatusList) {
            this.libraryDocumentStatusList = libraryDocumentStatusList;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getLibraryDocumentStatusList() {
            return this.libraryDocumentStatusList;
        }

        public GetAppConfigResponseBodyData setLlmHelperTypeList(java.util.List<java.util.Map<String, String>> llmHelperTypeList) {
            this.llmHelperTypeList = llmHelperTypeList;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getLlmHelperTypeList() {
            return this.llmHelperTypeList;
        }

        public GetAppConfigResponseBodyData setTextIndexCategoryList(java.util.List<String> textIndexCategoryList) {
            this.textIndexCategoryList = textIndexCategoryList;
            return this;
        }
        public java.util.List<String> getTextIndexCategoryList() {
            return this.textIndexCategoryList;
        }

        public GetAppConfigResponseBodyData setVectorIndexCategoryList(java.util.List<String> vectorIndexCategoryList) {
            this.vectorIndexCategoryList = vectorIndexCategoryList;
            return this;
        }
        public java.util.List<String> getVectorIndexCategoryList() {
            return this.vectorIndexCategoryList;
        }

    }

}
