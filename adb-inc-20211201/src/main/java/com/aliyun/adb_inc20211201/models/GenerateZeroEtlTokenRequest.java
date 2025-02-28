// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GenerateZeroEtlTokenRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("PolarDBInstanceId")
    public String polarDBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UID")
    public String UID;

    public static GenerateZeroEtlTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateZeroEtlTokenRequest self = new GenerateZeroEtlTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateZeroEtlTokenRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GenerateZeroEtlTokenRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GenerateZeroEtlTokenRequest setPolarDBInstanceId(String polarDBInstanceId) {
        this.polarDBInstanceId = polarDBInstanceId;
        return this;
    }
    public String getPolarDBInstanceId() {
        return this.polarDBInstanceId;
    }

    public GenerateZeroEtlTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateZeroEtlTokenRequest setUID(String UID) {
        this.UID = UID;
        return this;
    }
    public String getUID() {
        return this.UID;
    }

}
