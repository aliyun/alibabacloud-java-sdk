// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryModifyInstancePriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModifyPrepayInstanceSpecRequest")
    public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest;

    public static QueryModifyInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyInstancePriceRequest self = new QueryModifyInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryModifyInstancePriceRequest setModifyPrepayInstanceSpecRequest(QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest) {
        this.modifyPrepayInstanceSpecRequest = modifyPrepayInstanceSpecRequest;
        return this;
    }
    public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest getModifyPrepayInstanceSpecRequest() {
        return this.modifyPrepayInstanceSpecRequest;
    }

    public static class QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec self = new QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec self = new QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest extends TeaModel {
        @NameInMap("Ha")
        public Boolean ha;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HaResourceSpec")
        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec haResourceSpec;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HaVSwitchIds")
        public java.util.List<String> haVSwitchIds;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HaZoneId")
        public String haZoneId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sc_flinkserverless_public_cn-******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceSpec")
        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec resourceSpec;

        public static QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest self = new QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest setHaResourceSpec(QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec haResourceSpec) {
            this.haResourceSpec = haResourceSpec;
            return this;
        }
        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestHaResourceSpec getHaResourceSpec() {
            return this.haResourceSpec;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }
        public java.util.List<String> getHaVSwitchIds() {
            return this.haVSwitchIds;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest setHaZoneId(String haZoneId) {
            this.haZoneId = haZoneId;
            return this;
        }
        public String getHaZoneId() {
            return this.haZoneId;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequest setResourceSpec(QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public QueryModifyInstancePriceRequestModifyPrepayInstanceSpecRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
