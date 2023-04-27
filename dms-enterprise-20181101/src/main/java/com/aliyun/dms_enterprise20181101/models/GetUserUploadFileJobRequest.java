// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserUploadFileJobRequest extends TeaModel {
    /**
     * <p>The method used to upload the file. Valid values:</p>
     * <br>
     * <p>*   **URL**</p>
     * <p>*   **OSS**</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetUserUploadFileJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserUploadFileJobRequest self = new GetUserUploadFileJobRequest();
        return TeaModel.build(map, self);
    }

    public GetUserUploadFileJobRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public GetUserUploadFileJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
