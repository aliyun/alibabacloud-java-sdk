// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorDataListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1653805225</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The name of the namespace.</p>
     * <p>For more information about how to query the names of namespaces, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-aliyun</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The metric name.</p>
     * <blockquote>
     * <p> PromQL statements are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunEcs_cpu_total</p>
     */
    @NameInMap("PromSQL")
    public String promSQL;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start of the time range to query.</p>
     * <p>Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1653804865</p>
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
