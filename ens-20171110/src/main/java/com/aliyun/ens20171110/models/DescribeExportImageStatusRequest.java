// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Version")
    public String version;

    public static DescribeExportImageStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageStatusRequest self = new DescribeExportImageStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageStatusRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeExportImageStatusRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
