// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobResp extends TeaModel {
    /**
     * <p>The queried tasks.</p>
     */
    @NameInMap("ImportJob")
    public java.util.List<GetJobResp> importJob;

    /**
     * <p>The position from which the next list operation starts.</p>
     * 
     * <strong>example:</strong>
     * <p>test_nex_marker</p>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <p>Indicates whether the queried results are truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Truncated")
    public Boolean truncated;

    public static ListJobResp build(java.util.Map<String, ?> map) throws Exception {
        ListJobResp self = new ListJobResp();
        return TeaModel.build(map, self);
    }

    public ListJobResp setImportJob(java.util.List<GetJobResp> importJob) {
        this.importJob = importJob;
        return this;
    }
    public java.util.List<GetJobResp> getImportJob() {
        return this.importJob;
    }

    public ListJobResp setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListJobResp setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

}
