// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementStatsRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartDate")
    public String startDate;

    public static DescribeOssIncrementStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementStatsRequest self = new DescribeOssIncrementStatsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementStatsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeOssIncrementStatsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssIncrementStatsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeOssIncrementStatsRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeOssIncrementStatsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOssIncrementStatsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
