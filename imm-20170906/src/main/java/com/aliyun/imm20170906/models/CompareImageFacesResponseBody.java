// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CompareImageFacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Similarity")
    public Float similarity;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("FaceA")
    public CompareImageFacesResponseBodyFaceA faceA;

    @NameInMap("FaceB")
    public CompareImageFacesResponseBodyFaceB faceB;

    public static CompareImageFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareImageFacesResponseBody self = new CompareImageFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareImageFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareImageFacesResponseBody setSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }
    public Float getSimilarity() {
        return this.similarity;
    }

    public CompareImageFacesResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public CompareImageFacesResponseBody setFaceA(CompareImageFacesResponseBodyFaceA faceA) {
        this.faceA = faceA;
        return this;
    }
    public CompareImageFacesResponseBodyFaceA getFaceA() {
        return this.faceA;
    }

    public CompareImageFacesResponseBody setFaceB(CompareImageFacesResponseBodyFaceB faceB) {
        this.faceB = faceB;
        return this;
    }
    public CompareImageFacesResponseBodyFaceB getFaceB() {
        return this.faceB;
    }

    public static class CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary self = new CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class CompareImageFacesResponseBodyFaceAFaceAttributes extends TeaModel {
        @NameInMap("FaceBoundary")
        public CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary faceBoundary;

        public static CompareImageFacesResponseBodyFaceAFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            CompareImageFacesResponseBodyFaceAFaceAttributes self = new CompareImageFacesResponseBodyFaceAFaceAttributes();
            return TeaModel.build(map, self);
        }

        public CompareImageFacesResponseBodyFaceAFaceAttributes setFaceBoundary(CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public CompareImageFacesResponseBodyFaceAFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

    }

    public static class CompareImageFacesResponseBodyFaceA extends TeaModel {
        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("FaceAttributes")
        public CompareImageFacesResponseBodyFaceAFaceAttributes faceAttributes;

        public static CompareImageFacesResponseBodyFaceA build(java.util.Map<String, ?> map) throws Exception {
            CompareImageFacesResponseBodyFaceA self = new CompareImageFacesResponseBodyFaceA();
            return TeaModel.build(map, self);
        }

        public CompareImageFacesResponseBodyFaceA setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public CompareImageFacesResponseBodyFaceA setFaceAttributes(CompareImageFacesResponseBodyFaceAFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public CompareImageFacesResponseBodyFaceAFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

    }

    public static class CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary self = new CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class CompareImageFacesResponseBodyFaceBFaceAttributes extends TeaModel {
        @NameInMap("FaceBoundary")
        public CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary faceBoundary;

        public static CompareImageFacesResponseBodyFaceBFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            CompareImageFacesResponseBodyFaceBFaceAttributes self = new CompareImageFacesResponseBodyFaceBFaceAttributes();
            return TeaModel.build(map, self);
        }

        public CompareImageFacesResponseBodyFaceBFaceAttributes setFaceBoundary(CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public CompareImageFacesResponseBodyFaceBFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

    }

    public static class CompareImageFacesResponseBodyFaceB extends TeaModel {
        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("FaceAttributes")
        public CompareImageFacesResponseBodyFaceBFaceAttributes faceAttributes;

        public static CompareImageFacesResponseBodyFaceB build(java.util.Map<String, ?> map) throws Exception {
            CompareImageFacesResponseBodyFaceB self = new CompareImageFacesResponseBodyFaceB();
            return TeaModel.build(map, self);
        }

        public CompareImageFacesResponseBodyFaceB setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public CompareImageFacesResponseBodyFaceB setFaceAttributes(CompareImageFacesResponseBodyFaceBFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public CompareImageFacesResponseBodyFaceBFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

    }

}
