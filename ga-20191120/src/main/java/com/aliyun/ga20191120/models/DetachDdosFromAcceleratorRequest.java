// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachDdosFromAcceleratorRequest extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>A list of Anti-DDoS Pro or Anti-DDoS Premium instances that are associated with the Global Accelerator instance.</p>
     */
    @NameInMap("DdosConfigList")
    public java.util.List<DetachDdosFromAcceleratorRequestDdosConfigList> ddosConfigList;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the system returns an HTTP 2xx status code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, an HTTP 2xx status code is returned and the instance is detached.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the Global Accelerator instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DetachDdosFromAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDdosFromAcceleratorRequest self = new DetachDdosFromAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public DetachDdosFromAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DetachDdosFromAcceleratorRequest setDdosConfigList(java.util.List<DetachDdosFromAcceleratorRequestDdosConfigList> ddosConfigList) {
        this.ddosConfigList = ddosConfigList;
        return this;
    }
    public java.util.List<DetachDdosFromAcceleratorRequestDdosConfigList> getDdosConfigList() {
        return this.ddosConfigList;
    }

    public DetachDdosFromAcceleratorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachDdosFromAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DetachDdosFromAcceleratorRequestDdosConfigList extends TeaModel {
        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance that is associated with the Global Accelerator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosDip-cn-pj64b8cz101</p>
         */
        @NameInMap("DdosId")
        public String ddosId;

        /**
         * <p>The region where the Anti-DDoS Pro or Anti-DDoS Premium instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("DdosRegionId")
        public String ddosRegionId;

        public static DetachDdosFromAcceleratorRequestDdosConfigList build(java.util.Map<String, ?> map) throws Exception {
            DetachDdosFromAcceleratorRequestDdosConfigList self = new DetachDdosFromAcceleratorRequestDdosConfigList();
            return TeaModel.build(map, self);
        }

        public DetachDdosFromAcceleratorRequestDdosConfigList setDdosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }
        public String getDdosId() {
            return this.ddosId;
        }

        public DetachDdosFromAcceleratorRequestDdosConfigList setDdosRegionId(String ddosRegionId) {
            this.ddosRegionId = ddosRegionId;
            return this;
        }
        public String getDdosRegionId() {
            return this.ddosRegionId;
        }

    }

}
