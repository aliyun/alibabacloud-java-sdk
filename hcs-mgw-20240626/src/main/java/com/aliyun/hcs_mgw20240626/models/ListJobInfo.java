// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobInfo extends TeaModel {
    @NameInMap("ImportJob")
    public java.util.List<CreateJobInfo> importJob;

    /**
     * <strong>example:</strong>
     * <your-next-job-name>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Truncated")
    public Boolean truncated;

    public static ListJobInfo build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfo self = new ListJobInfo();
        return TeaModel.build(map, self);
    }

    public ListJobInfo setImportJob(java.util.List<CreateJobInfo> importJob) {
        this.importJob = importJob;
        return this;
    }
    public java.util.List<CreateJobInfo> getImportJob() {
        return this.importJob;
    }

    public ListJobInfo setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListJobInfo setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

}
