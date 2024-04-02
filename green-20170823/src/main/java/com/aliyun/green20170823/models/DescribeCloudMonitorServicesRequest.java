// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeCloudMonitorServicesRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCloudMonitorServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMonitorServicesRequest self = new DescribeCloudMonitorServicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMonitorServicesRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public DescribeCloudMonitorServicesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudMonitorServicesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
