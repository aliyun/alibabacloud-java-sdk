// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteIndexPageBaselineResponseBody extends TeaModel {
    @NameInMap("BaseLineStatus")
    public String baseLineStatus;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshot")
    public String snapshot;

    public static DescribeWebsiteIndexPageBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteIndexPageBaselineResponseBody self = new DescribeWebsiteIndexPageBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteIndexPageBaselineResponseBody setBaseLineStatus(String baseLineStatus) {
        this.baseLineStatus = baseLineStatus;
        return this;
    }
    public String getBaseLineStatus() {
        return this.baseLineStatus;
    }

    public DescribeWebsiteIndexPageBaselineResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeWebsiteIndexPageBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteIndexPageBaselineResponseBody setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public String getSnapshot() {
        return this.snapshot;
    }

}
