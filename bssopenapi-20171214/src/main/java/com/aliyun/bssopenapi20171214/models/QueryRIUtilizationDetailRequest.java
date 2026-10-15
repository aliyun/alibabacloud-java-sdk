// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailRequest extends TeaModel {
    /**
     * <p>The ID of the deducted instance. If this parameter is left empty, the details of all instances are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>jsdgfsdhgsdjh</p>
     */
    @NameInMap("DeductedInstanceId")
    public String deductedInstanceId;

    /**
     * <p>The end time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-23 12:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance type corresponding to the reserved instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Instancetyp</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Valid values:</p>
     * <ul>
     * <li>ecsRi: ECS reserved instances. This is the default value.</li>
     * <li>scu_bag: Storage capacity unit (SCU) plans.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecsRi</p>
     */
    @NameInMap("RICommodityCode")
    public String RICommodityCode;

    /**
     * <p>The instance ID of the reserved instance for the filtered query. If this parameter is left empty, the details of all used reserved instances are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>dsudfgdsjh</p>
     */
    @NameInMap("RIInstanceId")
    public String RIInstanceId;

    /**
     * <p>The start time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-23 12:00:00</p>
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
