// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorDataListRequest extends TeaModel {
    /**
     * <p>The timestamp that specifies the end of the time range to query.</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The name of the namespace.</p>
     * <br>
     * <p>For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The interval at which monitoring data is collected.</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The name of the metric.</p>
     * <br>
     * <p>>  PromQL statements are supported.</p>
     */
    @NameInMap("PromSQL")
    public String promSQL;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timestamp that specifies the beginning of the time range to query.</p>
     * <br>
     * <p>Unit: seconds.</p>
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
