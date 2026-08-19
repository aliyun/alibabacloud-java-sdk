// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetForwardStrategyResponseBody extends TeaModel {
    /**
     * <p>The forwarding rule.</p>
     */
    @NameInMap("ForwardStrategy")
    public GetForwardStrategyResponseBodyForwardStrategy forwardStrategy;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetForwardStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetForwardStrategyResponseBody self = new GetForwardStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetForwardStrategyResponseBody setForwardStrategy(GetForwardStrategyResponseBodyForwardStrategy forwardStrategy) {
        this.forwardStrategy = forwardStrategy;
        return this;
    }
    public GetForwardStrategyResponseBodyForwardStrategy getForwardStrategy() {
        return this.forwardStrategy;
    }

    public GetForwardStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetForwardStrategyResponseBodyForwardStrategy extends TeaModel {
        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>solemn_index</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The target instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-bb95f515b6818623</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The destination type. Valid values:</p>
         * <ul>
         * <li><strong>Connector</strong>: connector.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connector</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The forwarding rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-b87a2f8e863bf02c</p>
         */
        @NameInMap("ForwardId")
        public String forwardId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamic_route_name_eb55d3a3</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The policy priority. The value 1 indicates the highest priority, and the value 100 indicates the lowest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The policy status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetForwardStrategyResponseBodyForwardStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetForwardStrategyResponseBodyForwardStrategy self = new GetForwardStrategyResponseBodyForwardStrategy();
            return TeaModel.build(map, self);
        }

        public GetForwardStrategyResponseBodyForwardStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetForwardStrategyResponseBodyForwardStrategy setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public GetForwardStrategyResponseBodyForwardStrategy setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public GetForwardStrategyResponseBodyForwardStrategy setForwardId(String forwardId) {
            this.forwardId = forwardId;
            return this;
        }
        public String getForwardId() {
            return this.forwardId;
        }

        public GetForwardStrategyResponseBodyForwardStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetForwardStrategyResponseBodyForwardStrategy setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetForwardStrategyResponseBodyForwardStrategy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
