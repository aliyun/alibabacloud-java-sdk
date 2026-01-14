// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachDdosToAcceleratorRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance with which the Anti-DDoS Pro/Premium instance is associated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("DdosConfigList")
    public java.util.List<AttachDdosToAcceleratorRequestDdosConfigList> ddosConfigList;

    /**
     * <p>The ID of the Anti-DDoS Pro/Premium instance to be associated with the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-zz11vq7j****</p>
     */
    @NameInMap("DdosId")
    @Deprecated
    public String ddosId;

    /**
     * <p>The region where the Anti-DDoS Pro/Premium instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: regions in the Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: regions outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DdosRegionId")
    @Deprecated
    public String ddosRegionId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AttachDdosToAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDdosToAcceleratorRequest self = new AttachDdosToAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public AttachDdosToAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public AttachDdosToAcceleratorRequest setDdosConfigList(java.util.List<AttachDdosToAcceleratorRequestDdosConfigList> ddosConfigList) {
        this.ddosConfigList = ddosConfigList;
        return this;
    }
    public java.util.List<AttachDdosToAcceleratorRequestDdosConfigList> getDdosConfigList() {
        return this.ddosConfigList;
    }

    @Deprecated
    public AttachDdosToAcceleratorRequest setDdosId(String ddosId) {
        this.ddosId = ddosId;
        return this;
    }
    public String getDdosId() {
        return this.ddosId;
    }

    @Deprecated
    public AttachDdosToAcceleratorRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public AttachDdosToAcceleratorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachDdosToAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AttachDdosToAcceleratorRequestDdosConfigList extends TeaModel {
        @NameInMap("DdosId")
        public String ddosId;

        @NameInMap("DdosRegionId")
        public String ddosRegionId;

        public static AttachDdosToAcceleratorRequestDdosConfigList build(java.util.Map<String, ?> map) throws Exception {
            AttachDdosToAcceleratorRequestDdosConfigList self = new AttachDdosToAcceleratorRequestDdosConfigList();
            return TeaModel.build(map, self);
        }

        public AttachDdosToAcceleratorRequestDdosConfigList setDdosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }
        public String getDdosId() {
            return this.ddosId;
        }

        public AttachDdosToAcceleratorRequestDdosConfigList setDdosRegionId(String ddosRegionId) {
            this.ddosRegionId = ddosRegionId;
            return this;
        }
        public String getDdosRegionId() {
            return this.ddosRegionId;
        }

    }

}
