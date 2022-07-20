// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetUrlUploadInfosRequest extends TeaModel {
    @NameInMap("JobIds")
    public String jobIds;

    @NameInMap("UploadURLs")
    public String uploadURLs;

    public static GetUrlUploadInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUrlUploadInfosRequest self = new GetUrlUploadInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetUrlUploadInfosRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public GetUrlUploadInfosRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

}
