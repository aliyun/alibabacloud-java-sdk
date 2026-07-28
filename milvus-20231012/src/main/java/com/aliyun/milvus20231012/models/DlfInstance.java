// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DlfInstance extends TeaModel {
    /**
     * <p>The unique ID of the DLF instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf-cn-xxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The name of the DLF instance.</p>
     * 
     * <strong>example:</strong>
     * <p>my-dlf-instance</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The type of the DLF instance.</p>
     * 
     * <strong>example:</strong>
     * <p>DLF_2_0</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The ID of the region where the DLF instance is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The current status of the DLF instance.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static DlfInstance build(java.util.Map<String, ?> map) throws Exception {
        DlfInstance self = new DlfInstance();
        return TeaModel.build(map, self);
    }

    public DlfInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DlfInstance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DlfInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DlfInstance setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DlfInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
