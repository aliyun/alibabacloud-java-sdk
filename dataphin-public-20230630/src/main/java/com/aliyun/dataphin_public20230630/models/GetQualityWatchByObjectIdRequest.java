// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchByObjectIdRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The object ID, such as a table ID, datasource ID, or metric ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc</p>
     */
    @NameInMap("WatchObjectId")
    public String watchObjectId;

    /**
     * <p>The monitored object type. Valid values:</p>
     * <ul>
     * <li>TABLE: Dataphin table.</li>
     * <li>DATASOURCE_TABLE: global table.</li>
     * <li>DATASOURCE: datasource.</li>
     * <li>INDEX: metric.</li>
     * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("WatchType")
    public String watchType;

    public static GetQualityWatchByObjectIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchByObjectIdRequest self = new GetQualityWatchByObjectIdRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchByObjectIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQualityWatchByObjectIdRequest setWatchObjectId(String watchObjectId) {
        this.watchObjectId = watchObjectId;
        return this;
    }
    public String getWatchObjectId() {
        return this.watchObjectId;
    }

    public GetQualityWatchByObjectIdRequest setWatchType(String watchType) {
        this.watchType = watchType;
        return this;
    }
    public String getWatchType() {
        return this.watchType;
    }

}
