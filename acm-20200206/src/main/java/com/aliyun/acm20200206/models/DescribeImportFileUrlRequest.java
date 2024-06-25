// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeImportFileUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    public static DescribeImportFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportFileUrlRequest self = new DescribeImportFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImportFileUrlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

}
