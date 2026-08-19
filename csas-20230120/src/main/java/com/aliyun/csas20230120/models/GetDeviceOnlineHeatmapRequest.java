// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDeviceOnlineHeatmapRequest extends TeaModel {
    /**
     * <p>The date to query, in the format yyyyMMdd with a fixed length of 8 characters. Online data is retained for only 8 days. Dates beyond the retention period return an empty list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20260809</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>The terminal device ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2987b3e0-8108-2f99-4d18-3b4f1c1****</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The user ID. You can obtain this value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Lists user terminal devices.</li>
     * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user terminal device.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    public static GetDeviceOnlineHeatmapRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOnlineHeatmapRequest self = new GetDeviceOnlineHeatmapRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceOnlineHeatmapRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetDeviceOnlineHeatmapRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public GetDeviceOnlineHeatmapRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

}
