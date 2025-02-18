// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaUsageRequest extends TeaModel {
    /**
     * <p>The aggregation algorithm. For a better page experience, up to 60 points can be displayed for each metric. If you select a time range longer than 1 hour, the chart uses the average value within the range (minutes of the selected time range/60) to aggregate data by default. You can change the aggregation algorithm based on your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>max</p>
     */
    @NameInMap("aggMethod")
    public String aggMethod;

    /**
     * <p>The time when the query starts. The value is the log time that is specified when log data is written.</p>
     * <ul>
     * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you set the <strong>from</strong> and <strong>to</strong> parameters to the same value, the time range is invalid and an error message is returned.</li>
     * <li>This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1669081045</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <p>The types of the charts.</p>
     */
    @NameInMap("plotTypes")
    public java.util.List<String> plotTypes;

    /**
     * <p>The quota type. Default value: ODPS.</p>
     * <ul>
     * <li>ODPS: computing quota</li>
     * <li>TUNNEL: Tunnel quota</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ODPS</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The alias of the level-2 quota.</p>
     * 
     * <strong>example:</strong>
     * <p>ot_tunnel_quota</p>
     */
    @NameInMap("subQuotaNickname")
    public String subQuotaNickname;

    /**
     * <p>The ID of the tenant. You can log on to the MaxCompute console, and choose Tenants &gt; Tenant Property from the left-side navigation pane to view the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>478403690625249</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The time when the query ends. The value is the log time that is specified when log data is written.</p>
     * <ul>
     * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you set the <strong>from</strong> and <strong>to</strong> parameters to the same value, the time range is invalid and an error message is returned.</li>
     * <li>This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1669360870</p>
     */
    @NameInMap("to")
    public Long to;

    /**
     * <p>The data metric fields.</p>
     */
    @NameInMap("yAxisTypes")
    public java.util.List<String> yAxisTypes;

    public static GetQuotaUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUsageRequest self = new GetQuotaUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaUsageRequest setAggMethod(String aggMethod) {
        this.aggMethod = aggMethod;
        return this;
    }
    public String getAggMethod() {
        return this.aggMethod;
    }

    public GetQuotaUsageRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetQuotaUsageRequest setPlotTypes(java.util.List<String> plotTypes) {
        this.plotTypes = plotTypes;
        return this;
    }
    public java.util.List<String> getPlotTypes() {
        return this.plotTypes;
    }

    public GetQuotaUsageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetQuotaUsageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQuotaUsageRequest setSubQuotaNickname(String subQuotaNickname) {
        this.subQuotaNickname = subQuotaNickname;
        return this;
    }
    public String getSubQuotaNickname() {
        return this.subQuotaNickname;
    }

    public GetQuotaUsageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetQuotaUsageRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public GetQuotaUsageRequest setYAxisTypes(java.util.List<String> yAxisTypes) {
        this.yAxisTypes = yAxisTypes;
        return this;
    }
    public java.util.List<String> getYAxisTypes() {
        return this.yAxisTypes;
    }

}
