// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CleanDistDataRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DataName")
    public String dataName;

    @NameInMap("DataVersion")
    public String dataVersion;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    public static CleanDistDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CleanDistDataRequest self = new CleanDistDataRequest();
        return TeaModel.build(map, self);
    }

    public CleanDistDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CleanDistDataRequest setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }
    public String getDataName() {
        return this.dataName;
    }

    public CleanDistDataRequest setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }
    public String getDataVersion() {
        return this.dataVersion;
    }

    public CleanDistDataRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

}
