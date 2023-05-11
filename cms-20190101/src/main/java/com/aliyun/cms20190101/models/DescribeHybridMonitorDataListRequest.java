// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorDataListRequest extends TeaModel {
    /**
     * <p>The interval at which monitoring data is collected.</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeHybridMonitorDataList**.</p>
     */
    @NameInMap("PromSQL")
    public String promSQL;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The metric values that are collected at different timestamps.</p>
     */
    @NameInMap("Start")
    public Long start;

    public static DescribeHybridMonitorDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorDataListRequest self = new DescribeHybridMonitorDataListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorDataListRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public DescribeHybridMonitorDataListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeHybridMonitorDataListRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeHybridMonitorDataListRequest setPromSQL(String promSQL) {
        this.promSQL = promSQL;
        return this;
    }
    public String getPromSQL() {
        return this.promSQL;
    }

    public DescribeHybridMonitorDataListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridMonitorDataListRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
