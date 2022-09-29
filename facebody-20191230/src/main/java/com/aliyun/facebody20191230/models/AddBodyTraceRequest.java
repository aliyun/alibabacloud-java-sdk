// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddBodyTraceRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("Images")
    public java.util.List<AddBodyTraceRequestImages> images;

    @NameInMap("PersonId")
    public Long personId;

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

    public AddBodyTraceRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public AddBodyTraceRequest setImages(java.util.List<AddBodyTraceRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<AddBodyTraceRequestImages> getImages() {
        return this.images;
    }

    public AddBodyTraceRequest setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
    public Long getPersonId() {
        return this.personId;
    }

    public static class AddBodyTraceRequestImages extends TeaModel {
        @NameInMap("ImageData")
        public byte[] imageData;

        @NameInMap("ImageURL")
        public String imageURL;

        public static AddBodyTraceRequestImages build(java.util.Map<String, ?> map) throws Exception {
            AddBodyTraceRequestImages self = new AddBodyTraceRequestImages();
            return TeaModel.build(map, self);
        }

        public AddBodyTraceRequestImages setImageData(byte[] imageData) {
            this.imageData = imageData;
            return this;
        }
        public byte[] getImageData() {
            return this.imageData;
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
