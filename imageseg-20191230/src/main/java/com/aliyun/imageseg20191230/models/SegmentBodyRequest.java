// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentBodyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentBody/SegmentBody1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentBody/SegmentBody1.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <strong>example:</strong>
     * <p>mask</p>
     */
    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyRequest self = new SegmentBodyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentBodyRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
