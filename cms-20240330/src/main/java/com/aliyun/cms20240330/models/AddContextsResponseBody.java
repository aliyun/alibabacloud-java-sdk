// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddContextsResponseBody extends TeaModel {
    /**
     * <p>The unique ID for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>An array of objects containing the results of the write operation.</p>
     */
    @NameInMap("results")
    public java.util.List<AddContextsResponseBodyResults> results;

    public static AddContextsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddContextsResponseBody self = new AddContextsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddContextsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddContextsResponseBody setResults(java.util.List<AddContextsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddContextsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AddContextsResponseBodyResults extends TeaModel {
        /**
         * <p>The ID of the written record or event.</p>
         * 
         * <strong>example:</strong>
         * <p>897294a7-67a4-4f60-976c-e136edc5f97e</p>
         */
        @NameInMap("contextId")
        public String contextId;

        /**
         * <p>The write status. Can be &quot;accepted&quot;, &quot;queued&quot;, or &quot;created&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>accepted</p>
         */
        @NameInMap("status")
        public String status;

        public static AddContextsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddContextsResponseBodyResults self = new AddContextsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddContextsResponseBodyResults setContextId(String contextId) {
            this.contextId = contextId;
            return this;
        }
        public String getContextId() {
            return this.contextId;
        }

        public AddContextsResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
