// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky2.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky2.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky6.jpg</a></p>
     */
    @NameInMap("ReplaceImageURL")
    public String replaceImageURL;

    public static ChangeSkyRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyRequest self = new ChangeSkyRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSkyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public ChangeSkyRequest setReplaceImageURL(String replaceImageURL) {
        this.replaceImageURL = replaceImageURL;
        return this;
    }
    public String getReplaceImageURL() {
        return this.replaceImageURL;
    }

}
