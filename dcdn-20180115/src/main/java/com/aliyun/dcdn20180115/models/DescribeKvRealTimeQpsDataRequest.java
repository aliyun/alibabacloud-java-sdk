// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeKvRealTimeQpsDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>get</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <strong>example:</strong>
     * <p>2022-08-10T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <strong>example:</strong>
     * <p>534167033424646***</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <strong>example:</strong>
     * <p>2022-08-10T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeKvRealTimeQpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvRealTimeQpsDataRequest self = new DescribeKvRealTimeQpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKvRealTimeQpsDataRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public DescribeKvRealTimeQpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeKvRealTimeQpsDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeKvRealTimeQpsDataRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeKvRealTimeQpsDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeKvRealTimeQpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
