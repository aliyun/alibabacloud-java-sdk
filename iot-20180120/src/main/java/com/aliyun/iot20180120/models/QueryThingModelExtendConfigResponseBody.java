// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryThingModelExtendConfigResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryThingModelExtendConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigResponseBody self = new QueryThingModelExtendConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelExtendConfigResponseBody setData(QueryThingModelExtendConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelExtendConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryThingModelExtendConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelExtendConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelExtendConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThingModelExtendConfigResponseBodyData extends TeaModel {
        /**
         * <p>The information of the extended TSL parameters. For more information about the definition of extended parameters, see <a href="https://help.aliyun.com/document_detail/150323.html">CreateThingModel</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;profile\&quot;:{\&quot;productKey\&quot;:\&quot;a114x******\&quot;},\&quot;properties\&quot;:[{\&quot;originalDataType\&quot;:{\&quot;specs\&quot;:{\&quot;registerCount\&quot;:1,\&quot;reverseRegister\&quot;:0,\&quot;swap16\&quot;:0},\&quot;type\&quot;:\&quot;bool\&quot;},\&quot;identifier\&quot;:\&quot;WakeUpData\&quot;,\&quot;registerAddress\&quot;:\&quot;0x04\&quot;,\&quot;scaling\&quot;:1,\&quot;writeFunctionCode\&quot;:0,\&quot;operateType\&quot;:\&quot;inputStatus\&quot;,\&quot;pollingTime\&quot;:1000,\&quot;trigger\&quot;:1}]}</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        public static QueryThingModelExtendConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelExtendConfigResponseBodyData self = new QueryThingModelExtendConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelExtendConfigResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
