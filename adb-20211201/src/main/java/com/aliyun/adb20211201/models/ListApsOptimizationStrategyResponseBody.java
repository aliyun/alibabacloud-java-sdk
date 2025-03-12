// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsOptimizationStrategyResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public java.util.List<ListApsOptimizationStrategyResponseBodyData> data;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, a success message is returned.****</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListApsOptimizationStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApsOptimizationStrategyResponseBody self = new ListApsOptimizationStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApsOptimizationStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApsOptimizationStrategyResponseBody setData(java.util.List<ListApsOptimizationStrategyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListApsOptimizationStrategyResponseBodyData> getData() {
        return this.data;
    }

    public ListApsOptimizationStrategyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApsOptimizationStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApsOptimizationStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApsOptimizationStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApsOptimizationStrategyResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-23xxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The status of the lifecycle management policy. Valid values:</p>
         * <ol>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the lifecycle management policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrategyDesc")
        public String strategyDesc;

        /**
         * <p>The name of the lifecycle management policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The type of the lifecycle management policy. Only StrategyValue is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>StrategyValue</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        public static ListApsOptimizationStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApsOptimizationStrategyResponseBodyData self = new ListApsOptimizationStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApsOptimizationStrategyResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public ListApsOptimizationStrategyResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApsOptimizationStrategyResponseBodyData setStrategyDesc(String strategyDesc) {
            this.strategyDesc = strategyDesc;
            return this;
        }
        public String getStrategyDesc() {
            return this.strategyDesc;
        }

        public ListApsOptimizationStrategyResponseBodyData setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ListApsOptimizationStrategyResponseBodyData setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

    }

}
