// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Logstore of the instance.</p>
     */
    @NameInMap("SlsLogstore")
    public String slsLogstore;

    /**
     * <p>The Log Service project of the instance.</p>
     */
    @NameInMap("SlsProject")
    public String slsProject;

    /**
     * <p>Indicates whether the Log Analysis feature is enabled for the website. Valid values:</p>
     * <br>
     * <p>*   **true**: enabled</p>
     * <p>*   **false**: disabled</p>
     */
    @NameInMap("SlsStatus")
    public Boolean slsStatus;

    public static DescribeWebAccessLogStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogStatusResponseBody self = new DescribeWebAccessLogStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebAccessLogStatusResponseBody setSlsLogstore(String slsLogstore) {
        this.slsLogstore = slsLogstore;
        return this;
    }
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    public DescribeWebAccessLogStatusResponseBody setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public DescribeWebAccessLogStatusResponseBody setSlsStatus(Boolean slsStatus) {
        this.slsStatus = slsStatus;
        return this;
    }
    public Boolean getSlsStatus() {
        return this.slsStatus;
    }

}
