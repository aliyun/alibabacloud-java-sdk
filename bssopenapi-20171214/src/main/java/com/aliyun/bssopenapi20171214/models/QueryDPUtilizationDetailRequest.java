// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryDPUtilizationDetailRequest extends TeaModel {
    /**
     * <p>The code of the resource, such as ecsRi and scu_bag. If this parameter is specified, the ProdCode parameter does not take effect for the request.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the deducted instance. If this parameter is not specified, the details of all instances are returned.</p>
     */
    @NameInMap("DeductedInstanceId")
    public String deductedInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to query the resource plan usage of linked accounts. Valid values:</p>
     * <br>
     * <p>*   true: queries the resource plan usage of linked accounts.</p>
     * <p>*   false: does not query the resource plan usage of linked accounts.</p>
     */
    @NameInMap("IncludeShare")
    public Boolean includeShare;

    /**
     * <p>The ID of the instance to query. If this parameter is not specified, the details of all used instances are returned.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type of the instance.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The token that is used to retrieve the next page of results. For the first query, set the value to null. For subsequent queries, set the value to the token that is obtained from the NextToken parameter.</p>
     */
    @NameInMap("LastToken")
    public String lastToken;

    /**
     * <p>The number of entries to return on each page. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The code of the service. Example: ecs.</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
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
