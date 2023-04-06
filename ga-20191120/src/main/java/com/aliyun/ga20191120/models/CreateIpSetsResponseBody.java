// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The details about the acceleration regions.</p>
     */
    @NameInMap("IpSets")
    public java.util.List<CreateIpSetsResponseBodyIpSets> ipSets;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSetsResponseBody self = new CreateIpSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpSetsResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateIpSetsResponseBody setIpSets(java.util.List<CreateIpSetsResponseBodyIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }
    public java.util.List<CreateIpSetsResponseBodyIpSets> getIpSets() {
        return this.ipSets;
    }

    public CreateIpSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIpSetsResponseBodyIpSets extends TeaModel {
        /**
         * <p>The ID of the region that requires acceleration.</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The bandwidth allocated to the acceleration region. Unit: **Mbit/s**.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        /**
         * <p>The line type of the EIP in the acceleration region.</p>
         */
        @NameInMap("IspType")
        public String ispType;

        public static CreateIpSetsResponseBodyIpSets build(java.util.Map<String, ?> map) throws Exception {
            CreateIpSetsResponseBodyIpSets self = new CreateIpSetsResponseBodyIpSets();
            return TeaModel.build(map, self);
        }

        public CreateIpSetsResponseBodyIpSets setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public CreateIpSetsResponseBodyIpSets setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CreateIpSetsResponseBodyIpSets setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

        public CreateIpSetsResponseBodyIpSets setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

    }

}
