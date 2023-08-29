// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailRequest extends TeaModel {
    /**
     * <p>The ID of the instance whose fees are deducted by using the RI. If this parameter is left empty, the usage details of all instances are queried.</p>
     */
    @NameInMap("DeductedInstanceId")
    public String deductedInstanceId;

    /**
     * <p>The time when the RI expires. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance type of the RI.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the service to which the RI is applied. Default value: ecsRi. Valid values:</p>
     * <br>
     * <p>*   ecsRi: ECS RI.</p>
     * <p>*   scu_bag: storage capacity unit (SCU).</p>
     */
    @NameInMap("RICommodityCode")
    public String RICommodityCode;

    /**
     * <p>The ID of the RI. If this parameter is left empty, the usage details of all RIs are queried.</p>
     */
    @NameInMap("RIInstanceId")
    public String RIInstanceId;

    /**
     * <p>The time when the RI was created. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryRIUtilizationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRIUtilizationDetailRequest self = new QueryRIUtilizationDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRIUtilizationDetailRequest setDeductedInstanceId(String deductedInstanceId) {
        this.deductedInstanceId = deductedInstanceId;
        return this;
    }
    public String getDeductedInstanceId() {
        return this.deductedInstanceId;
    }

    public QueryRIUtilizationDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryRIUtilizationDetailRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public QueryRIUtilizationDetailRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRIUtilizationDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRIUtilizationDetailRequest setRICommodityCode(String RICommodityCode) {
        this.RICommodityCode = RICommodityCode;
        return this;
    }
    public String getRICommodityCode() {
        return this.RICommodityCode;
    }

    public QueryRIUtilizationDetailRequest setRIInstanceId(String RIInstanceId) {
        this.RIInstanceId = RIInstanceId;
        return this;
    }
    public String getRIInstanceId() {
        return this.RIInstanceId;
    }

    public QueryRIUtilizationDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
