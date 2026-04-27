// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListForwardStrategiesResponseBody extends TeaModel {
    @NameInMap("ForwardStrategies")
    public java.util.List<ListForwardStrategiesResponseBodyForwardStrategies> forwardStrategies;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListForwardStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListForwardStrategiesResponseBody self = new ListForwardStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListForwardStrategiesResponseBody setForwardStrategies(java.util.List<ListForwardStrategiesResponseBodyForwardStrategies> forwardStrategies) {
        this.forwardStrategies = forwardStrategies;
        return this;
    }
    public java.util.List<ListForwardStrategiesResponseBodyForwardStrategies> getForwardStrategies() {
        return this.forwardStrategies;
    }

    public ListForwardStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListForwardStrategiesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListForwardStrategiesResponseBodyForwardStrategies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>asdasdasd</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>connector-4178bc59bec56df1</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <strong>example:</strong>
         * <p>Connector</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <strong>example:</strong>
         * <p>fs-8b299ac5a93a0a3a</p>
         */
        @NameInMap("ForwardId")
        public String forwardId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListForwardStrategiesResponseBodyForwardStrategies build(java.util.Map<String, ?> map) throws Exception {
            ListForwardStrategiesResponseBodyForwardStrategies self = new ListForwardStrategiesResponseBodyForwardStrategies();
            return TeaModel.build(map, self);
        }

        public ListForwardStrategiesResponseBodyForwardStrategies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListForwardStrategiesResponseBodyForwardStrategies setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public ListForwardStrategiesResponseBodyForwardStrategies setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListForwardStrategiesResponseBodyForwardStrategies setForwardId(String forwardId) {
            this.forwardId = forwardId;
            return this;
        }
        public String getForwardId() {
            return this.forwardId;
        }

        public ListForwardStrategiesResponseBodyForwardStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListForwardStrategiesResponseBodyForwardStrategies setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListForwardStrategiesResponseBodyForwardStrategies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
