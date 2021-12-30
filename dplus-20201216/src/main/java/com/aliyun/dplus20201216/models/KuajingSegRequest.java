// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class KuajingSegRequest extends TeaModel {
    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("ReturnPicFormat")
    public String returnPicFormat;

    @NameInMap("ReturnPicType")
    public String returnPicType;

    public static KuajingSegRequest build(java.util.Map<String, ?> map) throws Exception {
        KuajingSegRequest self = new KuajingSegRequest();
        return TeaModel.build(map, self);
    }

    public KuajingSegRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public KuajingSegRequest setReturnPicFormat(String returnPicFormat) {
        this.returnPicFormat = returnPicFormat;
        return this;
    }
    public String getReturnPicFormat() {
        return this.returnPicFormat;
    }

    public KuajingSegRequest setReturnPicType(String returnPicType) {
        this.returnPicType = returnPicType;
        return this;
    }
    public String getReturnPicType() {
        return this.returnPicType;
    }

}
