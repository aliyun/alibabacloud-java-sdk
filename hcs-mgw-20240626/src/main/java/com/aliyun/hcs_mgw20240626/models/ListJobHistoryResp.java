// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobHistoryResp extends TeaModel {
    @NameInMap("JobHistory")
    public java.util.List<JobHistory> jobHistory;

    /**
     * <strong>example:</strong>
     * <p>1#3</p>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Truncated")
    public String truncated;

    public static ListJobHistoryResp build(java.util.Map<String, ?> map) throws Exception {
        ListJobHistoryResp self = new ListJobHistoryResp();
        return TeaModel.build(map, self);
    }

    public ListJobHistoryResp setJobHistory(java.util.List<JobHistory> jobHistory) {
        this.jobHistory = jobHistory;
        return this;
    }
    public java.util.List<JobHistory> getJobHistory() {
        return this.jobHistory;
    }

    public ListJobHistoryResp setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListJobHistoryResp setTruncated(String truncated) {
        this.truncated = truncated;
        return this;
    }
    public String getTruncated() {
        return this.truncated;
    }

}
