// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class PromVpcExporterManagerRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ExporterConfig")
    public String exporterConfig;

    @NameInMap("ExporterType")
    public String exporterType;

    @NameInMap("Method")
    public String method;

    @NameInMap("RegionId")
    public String regionId;

    public static PromVpcExporterManagerRequest build(java.util.Map<String, ?> map) throws Exception {
        PromVpcExporterManagerRequest self = new PromVpcExporterManagerRequest();
        return TeaModel.build(map, self);
    }

    public PromVpcExporterManagerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public PromVpcExporterManagerRequest setExporterConfig(String exporterConfig) {
        this.exporterConfig = exporterConfig;
        return this;
    }
    public String getExporterConfig() {
        return this.exporterConfig;
    }

    public PromVpcExporterManagerRequest setExporterType(String exporterType) {
        this.exporterType = exporterType;
        return this;
    }
    public String getExporterType() {
        return this.exporterType;
    }

    public PromVpcExporterManagerRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public PromVpcExporterManagerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
