// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusRequest extends TeaModel {
    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

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

}
