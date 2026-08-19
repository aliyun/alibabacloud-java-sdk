// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceWorkloadTrendRequest extends TeaModel {
    /**
     * <p>The endpoint device ID. You can obtain this value from the following operations:</p>
     * <ul>
     * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user endpoint device.</li>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Queries user endpoint devices in batches.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DeviceTag")
    public String deviceTag;

    /**
     * <p>The start time of the query time range. This value is a UNIX timestamp in seconds. The value must be greater than or equal to 0 and less than the value of To.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1769998785</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <p>The end time of the query time range. This value is a UNIX timestamp in seconds. The value must be greater than the value of From.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1771986521</p>
     */
    @NameInMap("To")
    public Long to;

    /**
     * <p>The workload type. Valid values:</p>
     * <ul>
     * <li><strong>cpu</strong>: CPU usage.</li>
     * <li><strong>mem</strong>: memory usage.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    public static GetUserDeviceWorkloadTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeviceWorkloadTrendRequest self = new GetUserDeviceWorkloadTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDeviceWorkloadTrendRequest setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }
    public String getDeviceTag() {
        return this.deviceTag;
    }

    public GetUserDeviceWorkloadTrendRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetUserDeviceWorkloadTrendRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public GetUserDeviceWorkloadTrendRequest setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

}
