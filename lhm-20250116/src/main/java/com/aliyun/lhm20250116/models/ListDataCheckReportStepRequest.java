// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportStepRequest extends TeaModel {
    /**
     * <p>The verification result filter. Valid values:</p>
     * <ul>
     * <li>0: no record.</li>
     * <li>1: passed.</li>
     * <li>2: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("checkResult")
    public Integer checkResult;

    /**
     * <p>The job database ID (integer) that identifies a verification sub-job. This parameter differs in format from the UUID-format sub-job ID (string) used in the operation that queries step details by UUID. The two are not interchangeable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("jobId")
    public Long jobId;

    /**
     * <p>The step status filter. Valid values:</p>
     * <ul>
     * <li>0: INIT.</li>
     * <li>1: RUNNING.</li>
     * <li>2: FINISHED.</li>
     * <li>3: STOPPED.</li>
     * <li>4: FAIL.</li>
     * <li>6: READY.</li>
     * <li>7: SKIPPED.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("jobStatus")
    public Integer jobStatus;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListDataCheckReportStepRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportStepRequest self = new ListDataCheckReportStepRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportStepRequest setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public Integer getCheckResult() {
        return this.checkResult;
    }

    public ListDataCheckReportStepRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListDataCheckReportStepRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ListDataCheckReportStepRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckReportStepRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
