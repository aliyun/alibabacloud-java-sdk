// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchBodyTraceAdvanceRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("Images")
    public java.util.List<SearchBodyTraceAdvanceRequestImages> images;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("MinScore")
    public Float minScore;

    public static SearchBodyTraceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyTraceAdvanceRequest self = new SearchBodyTraceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SearchBodyTraceAdvanceRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public SearchBodyTraceAdvanceRequest setImages(java.util.List<SearchBodyTraceAdvanceRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<SearchBodyTraceAdvanceRequestImages> getImages() {
        return this.images;
    }

    public SearchBodyTraceAdvanceRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public SearchBodyTraceAdvanceRequest setMinScore(Float minScore) {
        this.minScore = minScore;
        return this;
    }
    public Float getMinScore() {
        return this.minScore;
    }

    public static class SearchBodyTraceAdvanceRequestImages extends TeaModel {
        @NameInMap("ImageData")
        public byte[] imageData;

        @NameInMap("ImageURL")
        public java.io.InputStream imageURLObject;

        public static SearchBodyTraceAdvanceRequestImages build(java.util.Map<String, ?> map) throws Exception {
            SearchBodyTraceAdvanceRequestImages self = new SearchBodyTraceAdvanceRequestImages();
            return TeaModel.build(map, self);
        }

        public SearchBodyTraceAdvanceRequestImages setImageData(byte[] imageData) {
            this.imageData = imageData;
            return this;
        }
        public byte[] getImageData() {
            return this.imageData;
        }

        public SearchBodyTraceAdvanceRequestImages setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
