// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateForwardStrategyResponseBody extends TeaModel {
    /**
     * <p>The traffic forwarding rule.</p>
     */
    @NameInMap("ForwardStrategy")
    public CreateForwardStrategyResponseBodyForwardStrategy forwardStrategy;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>60D4601C-B693-51A8-BB30-0944CE500B75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateForwardStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardStrategyResponseBody self = new CreateForwardStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateForwardStrategyResponseBody setForwardStrategy(CreateForwardStrategyResponseBodyForwardStrategy forwardStrategy) {
        this.forwardStrategy = forwardStrategy;
        return this;
    }
    public CreateForwardStrategyResponseBodyForwardStrategy getForwardStrategy() {
        return this.forwardStrategy;
    }

    public CreateForwardStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateForwardStrategyResponseBodyForwardStrategy extends TeaModel {
        /**
         * <p>The description of the traffic forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The target instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-af9b4ee6fd15d82d</p>
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
         * <p>The ID of the traffic forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-345d6ab82b5a43a3</p>
         */
        @NameInMap("ForwardId")
        public String forwardId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>xftp</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The policy priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The status of the internal-facing access application. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateForwardStrategyResponseBodyForwardStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardStrategyResponseBodyForwardStrategy self = new CreateForwardStrategyResponseBodyForwardStrategy();
            return TeaModel.build(map, self);
        }

        public CreateForwardStrategyResponseBodyForwardStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateForwardStrategyResponseBodyForwardStrategy setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public CreateForwardStrategyResponseBodyForwardStrategy setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public CreateForwardStrategyResponseBodyForwardStrategy setForwardId(String forwardId) {
            this.forwardId = forwardId;
            return this;
        }
        public String getForwardId() {
            return this.forwardId;
        }

        public CreateForwardStrategyResponseBodyForwardStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateForwardStrategyResponseBodyForwardStrategy setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateForwardStrategyResponseBodyForwardStrategy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
