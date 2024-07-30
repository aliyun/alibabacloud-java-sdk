// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHeadRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentHead/SegmentHead1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentHead/SegmentHead1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <strong>example:</strong>
     * <p>mask</p>
     */
    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentHeadRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHeadRequest self = new SegmentHeadRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHeadRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentHeadRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
