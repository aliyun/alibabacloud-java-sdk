// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterOutputRequest extends TeaModel {
    /**
     * <p>The configuration set for exporting monitoring data. It is a JSON object string. The string must include the following fields:</p>
     * <br>
     * <p>*   endpoint: the endpoint of Log Service.</p>
     * <p>*   project: the Log Service project to which monitoring data is exported.</p>
     * <p>*   logstore: the Log Service Logstore to which the monitoring data is exported.</p>
     * <p>*   ak: the AccessKey ID.</p>
     * <p>*   as: the AccessKey secret.</p>
     */
    @NameInMap("ConfigJson")
    public String configJson;

    /**
     * <p>The description of the configuration set.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The name of the configuration set.</p>
     */
    @NameInMap("DestName")
    public String destName;

    /**
     * <p>The service to which the monitoring data is exported.</p>
     */
    @NameInMap("DestType")
    public String destType;

    @NameInMap("RegionId")
    public String regionId;

    public static PutExporterOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        PutExporterOutputRequest self = new PutExporterOutputRequest();
        return TeaModel.build(map, self);
    }

    public PutExporterOutputRequest setConfigJson(String configJson) {
        this.configJson = configJson;
        return this;
    }
    public String getConfigJson() {
        return this.configJson;
    }

    public PutExporterOutputRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PutExporterOutputRequest setDestName(String destName) {
        this.destName = destName;
        return this;
    }
    public String getDestName() {
        return this.destName;
    }

    public PutExporterOutputRequest setDestType(String destType) {
        this.destType = destType;
        return this;
    }
    public String getDestType() {
        return this.destType;
    }

    public PutExporterOutputRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
