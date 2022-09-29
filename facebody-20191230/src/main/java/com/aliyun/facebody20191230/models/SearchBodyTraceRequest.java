// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchBodyTraceRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("Images")
    public java.util.List<SearchBodyTraceRequestImages> images;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("MinScore")
    public Float minScore;

    public static SearchBodyTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyTraceRequest self = new SearchBodyTraceRequest();
        return TeaModel.build(map, self);
    }

    public SearchBodyTraceRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public SearchBodyTraceRequest setImages(java.util.List<SearchBodyTraceRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<SearchBodyTraceRequestImages> getImages() {
        return this.images;
    }

    public SearchBodyTraceRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public SearchBodyTraceRequest setMinScore(Float minScore) {
        this.minScore = minScore;
        return this;
    }
    public Float getMinScore() {
        return this.minScore;
    }

    public static class SearchBodyTraceRequestImages extends TeaModel {
        @NameInMap("ImageData")
        public byte[] imageData;

        @NameInMap("ImageURL")
        public String imageURL;

        public static SearchBodyTraceRequestImages build(java.util.Map<String, ?> map) throws Exception {
            SearchBodyTraceRequestImages self = new SearchBodyTraceRequestImages();
            return TeaModel.build(map, self);
        }

        public SearchBodyTraceRequestImages setImageData(byte[] imageData) {
            this.imageData = imageData;
            return this;
        }
        public byte[] getImageData() {
            return this.imageData;
        }

        public SearchBodyTraceRequestImages setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
