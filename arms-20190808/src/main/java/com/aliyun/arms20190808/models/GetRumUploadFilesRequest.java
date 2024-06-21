// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumUploadFilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>source-map</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>aoxxxxxly@741623b4e91****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetRumUploadFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumUploadFilesRequest self = new GetRumUploadFilesRequest();
        return TeaModel.build(map, self);
    }

    public GetRumUploadFilesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetRumUploadFilesRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRumUploadFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
