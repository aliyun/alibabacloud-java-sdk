// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDataDiagnoseSampleDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1682179200</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1665158400</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1665936000000</p>
     */
    @NameInMap("taskCreateTime")
    public Long taskCreateTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cycle</p>
     */
    @NameInMap("taskSource")
    public String taskSource;

    public static ListDataDiagnoseSampleDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnoseSampleDetailsRequest self = new ListDataDiagnoseSampleDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnoseSampleDetailsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDataDiagnoseSampleDetailsRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListDataDiagnoseSampleDetailsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDataDiagnoseSampleDetailsRequest setTaskCreateTime(Long taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
        return this;
    }
    public Long getTaskCreateTime() {
        return this.taskCreateTime;
    }

    public ListDataDiagnoseSampleDetailsRequest setTaskSource(String taskSource) {
        this.taskSource = taskSource;
        return this;
    }
    public String getTaskSource() {
        return this.taskSource;
    }

}
