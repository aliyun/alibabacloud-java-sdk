// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class FindSimilarFacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Faces")
    public java.util.List<FindSimilarFacesResponseBodyFaces> faces;

    public static FindSimilarFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindSimilarFacesResponseBody self = new FindSimilarFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindSimilarFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindSimilarFacesResponseBody setFaces(java.util.List<FindSimilarFacesResponseBodyFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<FindSimilarFacesResponseBodyFaces> getFaces() {
        return this.faces;
    }

    public static class FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary self = new FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes extends TeaModel {
        @NameInMap("FaceBoundary")
        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary faceBoundary;

        public static FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes self = new FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes setFaceBoundary(FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

    }

    public static class FindSimilarFacesResponseBodyFacesSimilarFaces extends TeaModel {
        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Similarity")
        public Float similarity;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("ImageUri")
        public String imageUri;

        @NameInMap("FaceAttributes")
        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes faceAttributes;

        public static FindSimilarFacesResponseBodyFacesSimilarFaces build(java.util.Map<String, ?> map) throws Exception {
            FindSimilarFacesResponseBodyFacesSimilarFaces self = new FindSimilarFacesResponseBodyFacesSimilarFaces();
            return TeaModel.build(map, self);
        }

        public FindSimilarFacesResponseBodyFacesSimilarFaces setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public FindSimilarFacesResponseBodyFacesSimilarFaces setSimilarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }
        public Float getSimilarity() {
            return this.similarity;
        }

        public FindSimilarFacesResponseBodyFacesSimilarFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public FindSimilarFacesResponseBodyFacesSimilarFaces setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public FindSimilarFacesResponseBodyFacesSimilarFaces setFaceAttributes(FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public FindSimilarFacesResponseBodyFacesSimilarFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

    }

    public static class FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary self = new FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class FindSimilarFacesResponseBodyFacesFaceAttributes extends TeaModel {
        @NameInMap("FaceBoundary")
        public FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary faceBoundary;

        public static FindSimilarFacesResponseBodyFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            FindSimilarFacesResponseBodyFacesFaceAttributes self = new FindSimilarFacesResponseBodyFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public FindSimilarFacesResponseBodyFacesFaceAttributes setFaceBoundary(FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public FindSimilarFacesResponseBodyFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

    }

    public static class FindSimilarFacesResponseBodyFaces extends TeaModel {
        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Similarity")
        public Float similarity;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("ImageUri")
        public String imageUri;

        @NameInMap("SimilarFaces")
        public java.util.List<FindSimilarFacesResponseBodyFacesSimilarFaces> similarFaces;

        @NameInMap("FaceAttributes")
        public FindSimilarFacesResponseBodyFacesFaceAttributes faceAttributes;

        public static FindSimilarFacesResponseBodyFaces build(java.util.Map<String, ?> map) throws Exception {
            FindSimilarFacesResponseBodyFaces self = new FindSimilarFacesResponseBodyFaces();
            return TeaModel.build(map, self);
        }

        public FindSimilarFacesResponseBodyFaces setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public FindSimilarFacesResponseBodyFaces setSimilarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }
        public Float getSimilarity() {
            return this.similarity;
        }

        public FindSimilarFacesResponseBodyFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public FindSimilarFacesResponseBodyFaces setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public FindSimilarFacesResponseBodyFaces setSimilarFaces(java.util.List<FindSimilarFacesResponseBodyFacesSimilarFaces> similarFaces) {
            this.similarFaces = similarFaces;
            return this;
        }
        public java.util.List<FindSimilarFacesResponseBodyFacesSimilarFaces> getSimilarFaces() {
            return this.similarFaces;
        }

        public FindSimilarFacesResponseBodyFaces setFaceAttributes(FindSimilarFacesResponseBodyFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public FindSimilarFacesResponseBodyFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

    }

}
