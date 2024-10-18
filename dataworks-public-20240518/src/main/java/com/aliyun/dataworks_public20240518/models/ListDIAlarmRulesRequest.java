// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIAlarmRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>34988</p>
     */
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    /**
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDIAlarmRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIAlarmRulesRequest self = new ListDIAlarmRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListDIAlarmRulesRequest setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public ListDIAlarmRulesRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListDIAlarmRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDIAlarmRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
