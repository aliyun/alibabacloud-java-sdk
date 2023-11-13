// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHDFSUGIRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>Set this parameter based on the value of Type.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The filter condition. Valid values:</p>
     * <br>
     * <p>*   user</p>
     * <p>*   group</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetDoctorHDFSUGIRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHDFSUGIRequest self = new GetDoctorHDFSUGIRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorHDFSUGIRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorHDFSUGIRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorHDFSUGIRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDoctorHDFSUGIRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDoctorHDFSUGIRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
