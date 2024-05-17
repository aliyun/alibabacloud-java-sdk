// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateExternalDataServiceRequest extends TeaModel {
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
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceSpec")
    public String serviceSpec;

    public static CreateExternalDataServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalDataServiceRequest self = new CreateExternalDataServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalDataServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateExternalDataServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExternalDataServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public CreateExternalDataServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateExternalDataServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
