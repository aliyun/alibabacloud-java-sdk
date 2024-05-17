// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingDataServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceDescription")
    public String serviceDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceSpec")
    public String serviceSpec;

    public static ModifyStreamingDataServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingDataServiceRequest self = new ModifyStreamingDataServiceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingDataServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyStreamingDataServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyStreamingDataServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public ModifyStreamingDataServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ModifyStreamingDataServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
