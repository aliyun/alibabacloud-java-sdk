// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryDPUtilizationDetailRequest extends TeaModel {
    /**
     * <p>The commodity code, such as ecsRi and scu_bag. If this parameter is specified, the ProdCode parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>ecsRi</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the deducted instance. If this parameter is left empty, the details of all instances are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-123123</p>
     */
    @NameInMap("DeductedInstanceId")
    public String deductedInstanceId;

    /**
     * <p>The end time. Format: YYYY-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-23 12:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to include the resource plan usage of member accounts in finance trusteeship. Valid values:</p>
     * <ul>
     * <li>true: Included.</li>
     * <li>false: Not included.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeShare")
    public Boolean includeShare;

    /**
     * <p>The instance ID for the filtered query. If this parameter is left empty, the details of all used instances are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-123123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>Instancetyp</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The token that specifies the start position of the query. Set this parameter to null for the first query. For subsequent queries, use the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESF***zNTAw</p>
     */
    @NameInMap("LastToken")
    public String lastToken;

    /**
     * <p>The number of entries to return per query. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The product code, such as ecs.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The start time. Format: YYYY-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-23 12:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryDPUtilizationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDPUtilizationDetailRequest self = new QueryDPUtilizationDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDPUtilizationDetailRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QueryDPUtilizationDetailRequest setDeductedInstanceId(String deductedInstanceId) {
        this.deductedInstanceId = deductedInstanceId;
        return this;
    }
    public String getDeductedInstanceId() {
        return this.deductedInstanceId;
    }

    public QueryDPUtilizationDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryDPUtilizationDetailRequest setIncludeShare(Boolean includeShare) {
        this.includeShare = includeShare;
        return this;
    }
    public Boolean getIncludeShare() {
        return this.includeShare;
    }

    public QueryDPUtilizationDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDPUtilizationDetailRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public QueryDPUtilizationDetailRequest setLastToken(String lastToken) {
        this.lastToken = lastToken;
        return this;
    }
    public String getLastToken() {
        return this.lastToken;
    }

    public QueryDPUtilizationDetailRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryDPUtilizationDetailRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryDPUtilizationDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
