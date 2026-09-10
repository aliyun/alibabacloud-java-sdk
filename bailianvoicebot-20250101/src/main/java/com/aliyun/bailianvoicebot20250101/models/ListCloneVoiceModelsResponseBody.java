// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListCloneVoiceModelsResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The paginated data of voice cloning models.</p>
     */
    @NameInMap("Data")
    public ListCloneVoiceModelsResponseBodyData data;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CF6D3484-19A1-5C77-863B-AC8B5754D37C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCloneVoiceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoiceModelsResponseBody self = new ListCloneVoiceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloneVoiceModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCloneVoiceModelsResponseBody setData(ListCloneVoiceModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCloneVoiceModelsResponseBodyData getData() {
        return this.data;
    }

    public ListCloneVoiceModelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCloneVoiceModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloneVoiceModelsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCloneVoiceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCloneVoiceModelsResponseBodyDataCloneVoiceModels extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>High accent restoration similarity with fluent prosody</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListCloneVoiceModelsResponseBodyDataCloneVoiceModels build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoiceModelsResponseBodyDataCloneVoiceModels self = new ListCloneVoiceModelsResponseBodyDataCloneVoiceModels();
            return TeaModel.build(map, self);
        }

        public ListCloneVoiceModelsResponseBodyDataCloneVoiceModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloneVoiceModelsResponseBodyDataCloneVoiceModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCloneVoiceModelsResponseBodyDataCloneVoiceModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListCloneVoiceModelsResponseBodyData extends TeaModel {
        /**
         * <p>The list of voice cloning models.</p>
         */
        @NameInMap("CloneVoiceModels")
        public java.util.List<ListCloneVoiceModelsResponseBodyDataCloneVoiceModels> cloneVoiceModels;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCloneVoiceModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoiceModelsResponseBodyData self = new ListCloneVoiceModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloneVoiceModelsResponseBodyData setCloneVoiceModels(java.util.List<ListCloneVoiceModelsResponseBodyDataCloneVoiceModels> cloneVoiceModels) {
            this.cloneVoiceModels = cloneVoiceModels;
            return this;
        }
        public java.util.List<ListCloneVoiceModelsResponseBodyDataCloneVoiceModels> getCloneVoiceModels() {
            return this.cloneVoiceModels;
        }

        public ListCloneVoiceModelsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCloneVoiceModelsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloneVoiceModelsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
