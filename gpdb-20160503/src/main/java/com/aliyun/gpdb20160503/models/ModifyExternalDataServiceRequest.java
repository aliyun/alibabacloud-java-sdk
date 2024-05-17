// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyExternalDataServiceRequest extends TeaModel {
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

    public static ModifyExternalDataServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExternalDataServiceRequest self = new ModifyExternalDataServiceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExternalDataServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyExternalDataServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyExternalDataServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public ModifyExternalDataServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ModifyExternalDataServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
