// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHDFSDirectoryRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The directory name. The depth of the directory is not greater than five.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DirPath")
    public String dirPath;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
