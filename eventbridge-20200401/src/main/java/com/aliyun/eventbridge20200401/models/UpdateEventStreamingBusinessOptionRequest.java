// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventStreamingBusinessOptionRequest extends TeaModel {
    /**
     * <p>The billing mode. Valid values are CapacityUnitMode for the CU mode and EventNumMode for the pay-by-event mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CapacityUnitMode</p>
     */
    @NameInMap("BusinessMode")
    public String businessMode;

    /**
     * <p>The name of the event stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rocketmq-sync</p>
     */
    @NameInMap("EventStreamingName")
    public String eventStreamingName;

    /**
     * <p>The maximum number of CUs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxCapacityUnitCount")
    public Long maxCapacityUnitCount;

    /**
     * <p>The minimum number of CUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinCapacityUnitCount")
    public Long minCapacityUnitCount;

    public static UpdateEventStreamingBusinessOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStreamingBusinessOptionRequest self = new UpdateEventStreamingBusinessOptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventStreamingBusinessOptionRequest setBusinessMode(String businessMode) {
        this.businessMode = businessMode;
        return this;
    }
    public String getBusinessMode() {
        return this.businessMode;
    }

    public UpdateEventStreamingBusinessOptionRequest setEventStreamingName(String eventStreamingName) {
        this.eventStreamingName = eventStreamingName;
        return this;
    }
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    public UpdateEventStreamingBusinessOptionRequest setMaxCapacityUnitCount(Long maxCapacityUnitCount) {
        this.maxCapacityUnitCount = maxCapacityUnitCount;
        return this;
    }
    public Long getMaxCapacityUnitCount() {
        return this.maxCapacityUnitCount;
    }

    public UpdateEventStreamingBusinessOptionRequest setMinCapacityUnitCount(Long minCapacityUnitCount) {
        this.minCapacityUnitCount = minCapacityUnitCount;
        return this;
    }
    public Long getMinCapacityUnitCount() {
        return this.minCapacityUnitCount;
    }

}
