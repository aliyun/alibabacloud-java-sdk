// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageBodiesResponseBody extends TeaModel {
    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Bodies")
    public java.util.List<DetectImageBodiesResponseBodyBodies> bodies;

    public static DetectImageBodiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBodiesResponseBody self = new DetectImageBodiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageBodiesResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DetectImageBodiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageBodiesResponseBody setBodies(java.util.List<DetectImageBodiesResponseBodyBodies> bodies) {
        this.bodies = bodies;
        return this;
    }
    public java.util.List<DetectImageBodiesResponseBodyBodies> getBodies() {
        return this.bodies;
    }

    public static class DetectImageBodiesResponseBodyBodiesBodyBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static DetectImageBodiesResponseBodyBodiesBodyBoundary build(java.util.Map<String, ?> map) throws Exception {
            DetectImageBodiesResponseBodyBodiesBodyBoundary self = new DetectImageBodiesResponseBodyBodiesBodyBoundary();
            return TeaModel.build(map, self);
        }

        public DetectImageBodiesResponseBodyBodiesBodyBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public DetectImageBodiesResponseBodyBodiesBodyBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectImageBodiesResponseBodyBodiesBodyBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectImageBodiesResponseBodyBodiesBodyBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class DetectImageBodiesResponseBodyBodies extends TeaModel {
        @NameInMap("BodyConfidence")
        public Float bodyConfidence;

        @NameInMap("BodyBoundary")
        public DetectImageBodiesResponseBodyBodiesBodyBoundary bodyBoundary;

        public static DetectImageBodiesResponseBodyBodies build(java.util.Map<String, ?> map) throws Exception {
            DetectImageBodiesResponseBodyBodies self = new DetectImageBodiesResponseBodyBodies();
            return TeaModel.build(map, self);
        }

        public DetectImageBodiesResponseBodyBodies setBodyConfidence(Float bodyConfidence) {
            this.bodyConfidence = bodyConfidence;
            return this;
        }
        public Float getBodyConfidence() {
            return this.bodyConfidence;
        }

        public DetectImageBodiesResponseBodyBodies setBodyBoundary(DetectImageBodiesResponseBodyBodiesBodyBoundary bodyBoundary) {
            this.bodyBoundary = bodyBoundary;
            return this;
        }
        public DetectImageBodiesResponseBodyBodiesBodyBoundary getBodyBoundary() {
            return this.bodyBoundary;
        }

    }

}
