// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeTemplateByModelRequest extends TeaModel {
    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("EslSize")
    public String eslSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static DescribeTemplateByModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateByModelRequest self = new DescribeTemplateByModelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateByModelRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public DescribeTemplateByModelRequest setEslSize(String eslSize) {
        this.eslSize = eslSize;
        return this;
    }
    public String getEslSize() {
        return this.eslSize;
    }

    public DescribeTemplateByModelRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTemplateByModelRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplateByModelRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
