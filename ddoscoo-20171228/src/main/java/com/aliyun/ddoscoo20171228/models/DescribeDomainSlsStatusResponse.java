// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainSlsStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SlsStatus")
    @Validation(required = true)
    public Boolean slsStatus;

    @NameInMap("SlsLogstore")
    @Validation(required = true)
    public String slsLogstore;

    @NameInMap("SlsProject")
    @Validation(required = true)
    public String slsProject;

    public static DescribeDomainSlsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSlsStatusResponse self = new DescribeDomainSlsStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSlsStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSlsStatusResponse setSlsStatus(Boolean slsStatus) {
        this.slsStatus = slsStatus;
        return this;
    }
    public Boolean getSlsStatus() {
        return this.slsStatus;
    }

    public DescribeDomainSlsStatusResponse setSlsLogstore(String slsLogstore) {
        this.slsLogstore = slsLogstore;
        return this;
    }
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    public DescribeDomainSlsStatusResponse setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

}
