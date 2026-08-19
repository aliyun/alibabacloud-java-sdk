// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyForwardStrategyResponseBody extends TeaModel {
    /**
     * <p>The forwarding rule.</p>
     */
    @NameInMap("ForwardStrategy")
    public ModifyForwardStrategyResponseBodyForwardStrategy forwardStrategy;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2EBEEB93-E7AF-5667-B492-FA95C70821A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyForwardStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardStrategyResponseBody self = new ModifyForwardStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyForwardStrategyResponseBody setForwardStrategy(ModifyForwardStrategyResponseBodyForwardStrategy forwardStrategy) {
        this.forwardStrategy = forwardStrategy;
        return this;
    }
    public ModifyForwardStrategyResponseBodyForwardStrategy getForwardStrategy() {
        return this.forwardStrategy;
    }

    public ModifyForwardStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyForwardStrategyResponseBodyForwardStrategy extends TeaModel {
        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>material_versions_rec</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The target instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-f0b9195a6f2597fa</p>
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
         * <p>fs-037cee3b6ebaa919</p>
         */
        @NameInMap("ForwardId")
        public String forwardId;

        /**
         * <p>The name of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SaseSSO</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

        public static ModifyForwardStrategyResponseBodyForwardStrategy build(java.util.Map<String, ?> map) throws Exception {
            ModifyForwardStrategyResponseBodyForwardStrategy self = new ModifyForwardStrategyResponseBodyForwardStrategy();
            return TeaModel.build(map, self);
        }

        public ModifyForwardStrategyResponseBodyForwardStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyForwardStrategyResponseBodyForwardStrategy setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public ModifyForwardStrategyResponseBodyForwardStrategy setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ModifyForwardStrategyResponseBodyForwardStrategy setForwardId(String forwardId) {
            this.forwardId = forwardId;
            return this;
        }
        public String getForwardId() {
            return this.forwardId;
        }

        public ModifyForwardStrategyResponseBodyForwardStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyForwardStrategyResponseBodyForwardStrategy setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ModifyForwardStrategyResponseBodyForwardStrategy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
