// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobSubmitRequest extends TeaModel {
    /**
     * <p>The detail config of task.</p>
     * 
     * <strong>example:</strong>
     * <p>{{&quot;autoSubmit&quot;:false,&quot;configName&quot;:&quot;test_builder&quot;,&quot;folderConfig&quot;:{&quot;folderId&quot;:&quot;rd-EUx7Qp&quot;,&quot;prodConfig&quot;:[{&quot;allLogs&quot;:false,&quot;allRegions&quot;:false,&quot;logConfig&quot;:[{&quot;logCode&quot;:&quot;cloud_siem_rds_audit_log&quot;,&quot;logStorePattern&quot;:&quot;vpc-test&quot;,&quot;projectPattern&quot;:&quot;vpc-test&quot;}],&quot;prodCode&quot;:&quot;rds&quot;,&quot;regions&quot;:[&quot;cn-shanghai&quot;]},{&quot;allLogs&quot;:true,&quot;allRegions&quot;:true,&quot;prodCode&quot;:&quot;sas&quot;}],&quot;type&quot;:&quot;folder&quot;},&quot;listenRdChange&quot;:false,&quot;logConfigs&quot;:{&quot;cloud_siem_rds_audit_log&quot;:{&quot;logCode&quot;:&quot;cloud_siem_rds_audit_log&quot;,&quot;logStorePattern&quot;:&quot;vpc-test&quot;,&quot;projectPattern&quot;:&quot;vpc-test&quot;}}}}</p>
     */
    @NameInMap("JsonConfig")
    public String jsonConfig;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static BatchJobSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchJobSubmitRequest self = new BatchJobSubmitRequest();
        return TeaModel.build(map, self);
    }

    public BatchJobSubmitRequest setJsonConfig(String jsonConfig) {
        this.jsonConfig = jsonConfig;
        return this;
    }
    public String getJsonConfig() {
        return this.jsonConfig;
    }

    public BatchJobSubmitRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
