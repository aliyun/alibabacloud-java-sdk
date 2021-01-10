// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceIdByOuterInfoRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("QueryValue")
    public String queryValue;

    public static DescribeDeviceIdByOuterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceIdByOuterInfoRequest self = new DescribeDeviceIdByOuterInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceIdByOuterInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeDeviceIdByOuterInfoRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeDeviceIdByOuterInfoRequest setQueryValue(String queryValue) {
        this.queryValue = queryValue;
        return this;
    }
    public String getQueryValue() {
        return this.queryValue;
    }

}
