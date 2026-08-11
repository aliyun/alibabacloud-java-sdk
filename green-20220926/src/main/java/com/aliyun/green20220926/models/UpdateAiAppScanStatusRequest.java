// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateAiAppScanStatusRequest extends TeaModel {
    /**
     * <p>The application IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10d74f5b-6edf-4826-a989-de03463e479d</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>enable: enabled.</li>
     * <li>disable: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateAiAppScanStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiAppScanStatusRequest self = new UpdateAiAppScanStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiAppScanStatusRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public UpdateAiAppScanStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAiAppScanStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
