// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachDdosToAcceleratorRequest extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator (GA) instance with which you want to associate the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The list of Anti-DDoS Pro or Anti-DDoS Premium instances to associate with the Global Accelerator (GA) instance.</p>
     */
    @NameInMap("DdosConfigList")
    public java.util.List<AttachDdosToAcceleratorRequestDdosConfigList> ddosConfigList;

    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to associate with the Global Accelerator (GA) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-zz11vq7j****</p>
     */
    @NameInMap("DdosId")
    @Deprecated
    public String ddosId;

    /**
     * <p>The region of the Anti-DDoS Pro or Anti-DDoS Premium instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DdosRegionId")
    @Deprecated
    public String ddosRegionId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without actually associating the instances. The system checks the required parameters, request syntax, and business limits. If the check fails, the corresponding error is returned. If the check passes, an HTTP 2xx status code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. After the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
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
        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to associate with the Global Accelerator (GA) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zz11vq7j****</p>
         */
        @NameInMap("DdosId")
        public String ddosId;

        /**
         * <p>The region of the Anti-DDoS Pro or Anti-DDoS Premium instance. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
