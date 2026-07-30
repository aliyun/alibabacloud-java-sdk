// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{         &quot;fail&quot;: false,         &quot;data&quot;: {             &quot;ad78a4e7d3ce81590c9dc2d5f4bc****&quot;: {                 &quot;sqlId&quot;: &quot;ad78a4e7d3ce81590c9dc2d5f4bc****&quot;,                 &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,                 &quot;count&quot;: 1             },             &quot;0f92feacd92c048b06a16617a633****&quot;: {                 &quot;sqlId&quot;: &quot;0f92feacd92c048b06a16617a633****&quot;,                 &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,                 &quot;count&quot;: 2             }         },         &quot;resultId&quot;: &quot;async__61f45ee381b2fa4e8a6545e3bee9****&quot;,         &quot;isFinish&quot;: true,         &quot;state&quot;: &quot;SUCCESS&quot;,         &quot;complete&quot;: true,         &quot;timestamp&quot;: 1644558576717     }</p>
     */
    @NameInMap("Data")
    public GetAsyncErrorRequestStatResultResponseBodyData data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>If the request succeeds, this parameter returns <strong>Successful</strong>. If the request fails, this parameter returns an error message.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FC3F8EB-3564-5D1A-B187-3B03E5B0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAsyncErrorRequestStatResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatResultResponseBody self = new GetAsyncErrorRequestStatResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAsyncErrorRequestStatResultResponseBody setData(GetAsyncErrorRequestStatResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncErrorRequestStatResultResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncErrorRequestStatResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncErrorRequestStatResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncErrorRequestStatResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsyncErrorRequestStatResultResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the asynchronous request is complete.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request is complete.</p>
         * </li>
         * <li><p><strong>false</strong>: The request is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("complete")
        public Boolean complete;

        /**
         * <p>Indicates whether the request failed.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request failed.</p>
         * </li>
         * <li><p><strong>false</strong>: The request succeeded.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fail")
        public Boolean fail;

        /**
         * <p>Indicates whether the asynchronous request is complete.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request is complete.</p>
         * </li>
         * <li><p><strong>false</strong>: The request is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFinish")
        public Boolean isFinish;

        /**
         * <p>The data returned by the asynchronous request.</p>
         */
        @NameInMap("result")
        public java.util.Map<String, DataResultValue> result;

        /**
         * <p>The asynchronous request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>async__61f45ee381b2fa4e8a6545e3bee9****</p>
         */
        @NameInMap("resultId")
        public String resultId;

        /**
         * <p>The state of the asynchronous request. Valid values:</p>
         * <ul>
         * <li><p><strong>RUNNING</strong>: The request is running.</p>
         * </li>
         * <li><p><strong>SUCCESS</strong>: The request succeeded.</p>
         * </li>
         * <li><p><strong>FAIL</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The time when the asynchronous request was complete. The time is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644558576717</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        public static GetAsyncErrorRequestStatResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncErrorRequestStatResultResponseBodyData self = new GetAsyncErrorRequestStatResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setResult(java.util.Map<String, DataResultValue> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, DataResultValue> getResult() {
            return this.result;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAsyncErrorRequestStatResultResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
