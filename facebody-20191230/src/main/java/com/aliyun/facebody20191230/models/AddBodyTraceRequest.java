// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddBodyTraceRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DbId")
    public Long dbId;

    // 实体ID，可以包含数字、字母和下划线，相同db下不可以重复，长度1-64。
    @NameInMap("PersonId")
    public Long personId;

    // Trace图片信息列表
    @NameInMap("Images")
    public java.util.List<AddBodyTraceRequestImages> images;

    // 自定义信息。支持字母、数字、标点符号和汉字。不超过4096个字符。
    @NameInMap("ExtraData")
    public String extraData;

    public static AddBodyTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBodyTraceRequest self = new AddBodyTraceRequest();
        return TeaModel.build(map, self);
    }

    public AddBodyTraceRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public AddBodyTraceRequest setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
    public Long getPersonId() {
        return this.personId;
    }

    public AddBodyTraceRequest setImages(java.util.List<AddBodyTraceRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<AddBodyTraceRequestImages> getImages() {
        return this.images;
    }

    public AddBodyTraceRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public static class AddBodyTraceRequestImages extends TeaModel {
        // Trace图片URL
        @NameInMap("ImageURL")
        public String imageURL;

        public static AddBodyTraceRequestImages build(java.util.Map<String, ?> map) throws Exception {
            AddBodyTraceRequestImages self = new AddBodyTraceRequestImages();
            return TeaModel.build(map, self);
        }

        public AddBodyTraceRequestImages setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
