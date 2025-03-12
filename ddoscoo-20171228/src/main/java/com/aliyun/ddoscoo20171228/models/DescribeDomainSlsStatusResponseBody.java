// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainSlsStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ddoscoo-logstore</p>
     */
    @NameInMap("SlsLogstore")
    public String slsLogstore;

    /**
     * <strong>example:</strong>
     * <p>ddoscoo-project-xxxx-cn-hangzhou</p>
     */
    @NameInMap("SlsProject")
    public String slsProject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
