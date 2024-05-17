// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingDataServiceRequest extends TeaModel {
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

    public static CreateStreamingDataServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingDataServiceRequest self = new CreateStreamingDataServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamingDataServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateStreamingDataServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStreamingDataServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public CreateStreamingDataServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateStreamingDataServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
