// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHDFSDirectoryRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DateTime")
    public String dateTime;

    @NameInMap("DirPath")
    public String dirPath;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDoctorHDFSDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHDFSDirectoryRequest self = new GetDoctorHDFSDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorHDFSDirectoryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorHDFSDirectoryRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorHDFSDirectoryRequest setDirPath(String dirPath) {
        this.dirPath = dirPath;
        return this;
    }
    public String getDirPath() {
        return this.dirPath;
    }

    public GetDoctorHDFSDirectoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
