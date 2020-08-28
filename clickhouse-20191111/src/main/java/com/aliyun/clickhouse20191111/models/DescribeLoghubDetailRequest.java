// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLoghubDetailRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ExportName")
    public String exportName;

    public static DescribeLoghubDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoghubDetailRequest self = new DescribeLoghubDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoghubDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLoghubDetailRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeLoghubDetailRequest setExportName(String exportName) {
        this.exportName = exportName;
        return this;
    }
    public String getExportName() {
        return this.exportName;
    }

}
