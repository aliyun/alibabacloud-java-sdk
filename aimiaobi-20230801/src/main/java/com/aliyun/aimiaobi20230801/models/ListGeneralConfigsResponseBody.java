// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneralConfigsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListGeneralConfigsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The fault description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The current page number.</p>
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
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of \<code>true\\</code> indicates success. A value of \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListGeneralConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGeneralConfigsResponseBody self = new ListGeneralConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGeneralConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGeneralConfigsResponseBody setData(java.util.List<ListGeneralConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGeneralConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListGeneralConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGeneralConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGeneralConfigsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGeneralConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGeneralConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGeneralConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGeneralConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListGeneralConfigsResponseBodyData extends TeaModel {
        /**
         * <p>The description of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ConfigDesc")
        public String configDesc;

        /**
         * <p>The unique identifier of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The type of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSemanticSearch</p>
         */
        @NameInMap("ConfigValueType")
        public String configValueType;

        public static ListGeneralConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGeneralConfigsResponseBodyData self = new ListGeneralConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGeneralConfigsResponseBodyData setConfigDesc(String configDesc) {
            this.configDesc = configDesc;
            return this;
        }
        public String getConfigDesc() {
            return this.configDesc;
        }

        public ListGeneralConfigsResponseBodyData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ListGeneralConfigsResponseBodyData setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ListGeneralConfigsResponseBodyData setConfigValueType(String configValueType) {
            this.configValueType = configValueType;
            return this;
        }
        public String getConfigValueType() {
            return this.configValueType;
        }

    }

}
