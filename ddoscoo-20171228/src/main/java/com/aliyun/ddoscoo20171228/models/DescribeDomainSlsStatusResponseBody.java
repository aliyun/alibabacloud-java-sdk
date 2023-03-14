// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainSlsStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsLogstore")
    public String slsLogstore;

    @NameInMap("SlsProject")
    public String slsProject;

    @NameInMap("SlsStatus")
    public Boolean slsStatus;

    public static DescribeDomainSlsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSlsStatusResponseBody self = new DescribeDomainSlsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSlsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSlsStatusResponseBody setSlsLogstore(String slsLogstore) {
        this.slsLogstore = slsLogstore;
        return this;
    }
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    public DescribeDomainSlsStatusResponseBody setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public DescribeDomainSlsStatusResponseBody setSlsStatus(Boolean slsStatus) {
        this.slsStatus = slsStatus;
        return this;
    }
    public Boolean getSlsStatus() {
        return this.slsStatus;
    }

}
