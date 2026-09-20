// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable automatic backup.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoBackup")
    public Boolean autoBackup;

    @NameInMap("autoPay")
    public Boolean autoPay;

    /**
     * <p>The component information.</p>
     */
    @NameInMap("components")
    public java.util.List<UpdateInstanceRequestComponents> components;

    /**
     * <p>The configuration information.</p>
     * 
     * <strong>example:</strong>
     * <p>rootCoord:\n  maxDatabaseNum: 64</p>
     */
    @NameInMap("configuration")
    public String configuration;

    /**
     * <p>Specifies whether to enable high availability (HA).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ha")
    public Boolean ha;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-xxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>milvus-test</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstanceRequest setAutoBackup(Boolean autoBackup) {
        this.autoBackup = autoBackup;
        return this;
    }
    public Boolean getAutoBackup() {
        return this.autoBackup;
    }

    public UpdateInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpdateInstanceRequest setComponents(java.util.List<UpdateInstanceRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<UpdateInstanceRequestComponents> getComponents() {
        return this.components;
    }

    public UpdateInstanceRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public UpdateInstanceRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public UpdateInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateInstanceRequestComponentsDataDisk extends TeaModel {
        /**
         * <p>Specifies whether to enable the QueryNode data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The ESSD performance level (PL). Valid values: PL0, PL1, PL2, and PL3. If StorageClass is not specified, this field is used for parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performanceLevel")
        public String performanceLevel;

        /**
         * <p>The data cloud disk capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <p>The StorageClass of the data cloud disk. Valid values: alicloud-disk-essd-pl0, alicloud-disk-essd-pl1, alicloud-disk-essd-pl2, and alicloud-disk-essd-pl3.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud-disk-essd-pl1</p>
         */
        @NameInMap("storageClass")
        public String storageClass;

        public static UpdateInstanceRequestComponentsDataDisk build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestComponentsDataDisk self = new UpdateInstanceRequestComponentsDataDisk();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestComponentsDataDisk setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateInstanceRequestComponentsDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public UpdateInstanceRequestComponentsDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public UpdateInstanceRequestComponentsDataDisk setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class UpdateInstanceRequestComponents extends TeaModel {
        /**
         * <p>The number of compute units (CUs).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cuNum")
        public Integer cuNum;

        /**
         * <p>The CU type. general indicates a 1:4 ratio, and ram indicates a 1:8 ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("cuType")
        public String cuType;

        /**
         * <p>The QueryNode data cloud disk configuration. This parameter is supported only when type is set to query.</p>
         */
        @NameInMap("dataDisk")
        public UpdateInstanceRequestComponentsDataDisk dataDisk;

        @NameInMap("payType")
        public String payType;

        /**
         * <p>The number of replicas.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The component type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>standalone</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateInstanceRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestComponents self = new UpdateInstanceRequestComponents();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestComponents setCuNum(Integer cuNum) {
            this.cuNum = cuNum;
            return this;
        }
        public Integer getCuNum() {
            return this.cuNum;
        }

        public UpdateInstanceRequestComponents setCuType(String cuType) {
            this.cuType = cuType;
            return this;
        }
        public String getCuType() {
            return this.cuType;
        }

        public UpdateInstanceRequestComponents setDataDisk(UpdateInstanceRequestComponentsDataDisk dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public UpdateInstanceRequestComponentsDataDisk getDataDisk() {
            return this.dataDisk;
        }

        public UpdateInstanceRequestComponents setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public UpdateInstanceRequestComponents setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public UpdateInstanceRequestComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
