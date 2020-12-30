// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadUnreachableContactsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static DownloadUnreachableContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadUnreachableContactsRequest self = new DownloadUnreachableContactsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadUnreachableContactsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadUnreachableContactsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
