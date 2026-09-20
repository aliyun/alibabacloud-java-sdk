// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIAlarmRulesRequest extends TeaModel {
    /**
     * <p>The task ID. This is the task ID associated with the alert rule.</p>
     * <p>You can obtain this value from DIJobPaging.DIJobs[].DIJobId in the ListDIJobs response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11260</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListDIAlarmRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIAlarmRulesRequest self = new ListDIAlarmRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListDIAlarmRulesRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public ListDIAlarmRulesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDIAlarmRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
