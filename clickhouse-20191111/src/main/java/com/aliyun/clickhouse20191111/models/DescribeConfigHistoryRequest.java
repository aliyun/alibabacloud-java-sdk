// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigHistoryRequest extends TeaModel {
    /**
     * <p>The cluster ID. Call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query the information about all clusters in a specific region, including cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1p816075e21****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Use the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-22T10:06:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start of the time range to query. Use the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-11T06:27:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeConfigHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigHistoryRequest self = new DescribeConfigHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigHistoryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeConfigHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeConfigHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
