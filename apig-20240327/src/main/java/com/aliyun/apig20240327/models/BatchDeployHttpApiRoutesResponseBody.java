// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeployHttpApiRoutesResponseBody extends TeaModel {
    /**
     * <p>The response code of the API call. For the acceptance or publishing results of each route, see data.results.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The per-route results of the batch publishing operation. Synchronous publishing also returns the numbers of successful and failed routes, whereas asynchronous publishing returns only the per-route acceptance results.</p>
     */
    @NameInMap("data")
    public BatchDeployHttpApiRoutesResponseBodyData data;

    /**
     * <p>The response message of the API call. If a route fails or is rejected, see the errorMessage of the corresponding route for the cause.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID of the API call. You can use the ID to locate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F7B8A1C2-1234-5678-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchDeployHttpApiRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployHttpApiRoutesResponseBody self = new BatchDeployHttpApiRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeployHttpApiRoutesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeployHttpApiRoutesResponseBody setData(BatchDeployHttpApiRoutesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDeployHttpApiRoutesResponseBodyData getData() {
        return this.data;
    }

    public BatchDeployHttpApiRoutesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeployHttpApiRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchDeployHttpApiRoutesResponseBodyData extends TeaModel {
        /**
         * <p>The number of routes that failed to be published in the batch. This parameter is returned only for synchronous publishing and can be 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failedCount")
        public Integer failedCount;

        /**
         * <p>A result map with route IDs as keys. If some routes in the same batch fail, the routes that have been successfully published remain valid.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;hr-example001&quot;:{&quot;routeId&quot;:&quot;hr-example001&quot;,&quot;status&quot;:&quot;Succeeded&quot;},&quot;hr-example002&quot;:{&quot;routeId&quot;:&quot;hr-example002&quot;,&quot;status&quot;:&quot;Succeeded&quot;}}</p>
         */
        @NameInMap("results")
        public java.util.Map<String, DataResultsValue> results;

        /**
         * <p>The number of routes successfully published in the batch. This parameter is returned only for synchronous publishing and can be 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("successCount")
        public Integer successCount;

        public static BatchDeployHttpApiRoutesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDeployHttpApiRoutesResponseBodyData self = new BatchDeployHttpApiRoutesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDeployHttpApiRoutesResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public BatchDeployHttpApiRoutesResponseBodyData setResults(java.util.Map<String, DataResultsValue> results) {
            this.results = results;
            return this;
        }
        public java.util.Map<String, DataResultsValue> getResults() {
            return this.results;
        }

        public BatchDeployHttpApiRoutesResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
