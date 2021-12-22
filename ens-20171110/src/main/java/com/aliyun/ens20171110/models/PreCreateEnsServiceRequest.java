// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreCreateEnsServiceRequest extends TeaModel {
    @NameInMap("BandwidthType")
    public String bandwidthType;

    @NameInMap("BuyResourcesDetail")
    public String buyResourcesDetail;

    @NameInMap("DataDiskSize")
    public String dataDiskSize;

    @NameInMap("EnsServiceName")
    public String ensServiceName;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceBandwithdLimit")
    public String instanceBandwithdLimit;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("NetLevel")
    public String netLevel;

    @NameInMap("Password")
    public String password;

    @NameInMap("SchedulingPriceStrategy")
    public String schedulingPriceStrategy;

    @NameInMap("SchedulingStrategy")
    public String schedulingStrategy;

    @NameInMap("SystemDiskSize")
    public String systemDiskSize;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Version")
    public String version;

    public static PreCreateEnsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCreateEnsServiceRequest self = new PreCreateEnsServiceRequest();
        return TeaModel.build(map, self);
    }

    public PreCreateEnsServiceRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public PreCreateEnsServiceRequest setBuyResourcesDetail(String buyResourcesDetail) {
        this.buyResourcesDetail = buyResourcesDetail;
        return this;
    }
    public String getBuyResourcesDetail() {
        return this.buyResourcesDetail;
    }

    public PreCreateEnsServiceRequest setDataDiskSize(String dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public String getDataDiskSize() {
        return this.dataDiskSize;
    }

    public PreCreateEnsServiceRequest setEnsServiceName(String ensServiceName) {
        this.ensServiceName = ensServiceName;
        return this;
    }
    public String getEnsServiceName() {
        return this.ensServiceName;
    }

    public PreCreateEnsServiceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public PreCreateEnsServiceRequest setInstanceBandwithdLimit(String instanceBandwithdLimit) {
        this.instanceBandwithdLimit = instanceBandwithdLimit;
        return this;
    }
    public String getInstanceBandwithdLimit() {
        return this.instanceBandwithdLimit;
    }

    public PreCreateEnsServiceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public PreCreateEnsServiceRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public PreCreateEnsServiceRequest setNetLevel(String netLevel) {
        this.netLevel = netLevel;
        return this;
    }
    public String getNetLevel() {
        return this.netLevel;
    }

    public PreCreateEnsServiceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public PreCreateEnsServiceRequest setSchedulingPriceStrategy(String schedulingPriceStrategy) {
        this.schedulingPriceStrategy = schedulingPriceStrategy;
        return this;
    }
    public String getSchedulingPriceStrategy() {
        return this.schedulingPriceStrategy;
    }

    public PreCreateEnsServiceRequest setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    public PreCreateEnsServiceRequest setSystemDiskSize(String systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public String getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public PreCreateEnsServiceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public PreCreateEnsServiceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
