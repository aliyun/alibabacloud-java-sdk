// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle1.jpg</a></p>
     */
    @NameInMap("MajorUrl")
    public String majorUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle6.jpg</a></p>
     */
    @NameInMap("StyleUrl")
    public String styleUrl;

    public static ExtendImageStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleRequest self = new ExtendImageStyleRequest();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleRequest setMajorUrl(String majorUrl) {
        this.majorUrl = majorUrl;
        return this;
    }
    public String getMajorUrl() {
        return this.majorUrl;
    }

    public ExtendImageStyleRequest setStyleUrl(String styleUrl) {
        this.styleUrl = styleUrl;
        return this;
    }
    public String getStyleUrl() {
        return this.styleUrl;
    }

}
