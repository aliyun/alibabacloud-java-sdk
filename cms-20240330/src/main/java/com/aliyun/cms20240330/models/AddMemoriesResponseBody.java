// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddMemoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("results")
    public java.util.List<AddMemoriesResponseBodyResults> results;

    public static AddMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMemoriesResponseBody self = new AddMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMemoriesResponseBody setResults(java.util.List<AddMemoriesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddMemoriesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AddMemoriesResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>897294a7-67a4-4f60-976c-e136edc5f97e</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>Memory processing has been queued for background execution</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        public static AddMemoriesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddMemoriesResponseBodyResults self = new AddMemoriesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddMemoriesResponseBodyResults setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public AddMemoriesResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddMemoriesResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
