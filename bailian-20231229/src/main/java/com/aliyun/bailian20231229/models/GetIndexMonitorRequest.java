// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetIndexMonitorRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time can be a maximum of 30 days after the start time. This is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1767604500</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The unique ID of the target knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-123456xxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The start of the time range to query. This is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1767604500</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static GetIndexMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexMonitorRequest self = new GetIndexMonitorRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexMonitorRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public GetIndexMonitorRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public GetIndexMonitorRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
