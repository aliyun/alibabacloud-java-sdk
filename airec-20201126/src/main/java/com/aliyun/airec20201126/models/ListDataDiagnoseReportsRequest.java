// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDataDiagnoseReportsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1566489600</p>
     */
    @NameInMap("taskCreateTime")
    public Long taskCreateTime;

    public static ListDataDiagnoseReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnoseReportsRequest self = new ListDataDiagnoseReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnoseReportsRequest setTaskCreateTime(Long taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
        return this;
    }
    public Long getTaskCreateTime() {
        return this.taskCreateTime;
    }

}
