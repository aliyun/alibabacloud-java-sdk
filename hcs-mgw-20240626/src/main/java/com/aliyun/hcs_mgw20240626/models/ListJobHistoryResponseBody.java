// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobHistoryResponseBody extends TeaModel {
    /**
     * <p>The running history of the migration task.</p>
     */
    @NameInMap("JobHistoryList")
    public ListJobHistoryResp jobHistoryList;

    public static ListJobHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobHistoryResponseBody self = new ListJobHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobHistoryResponseBody setJobHistoryList(ListJobHistoryResp jobHistoryList) {
        this.jobHistoryList = jobHistoryList;
        return this;
    }
    public ListJobHistoryResp getJobHistoryList() {
        return this.jobHistoryList;
    }

}
