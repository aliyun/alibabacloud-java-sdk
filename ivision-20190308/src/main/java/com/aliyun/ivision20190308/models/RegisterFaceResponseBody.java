// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class RegisterFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Faces")
    public java.util.List<RegisterFaceResponseBodyFaces> faces;

    public static RegisterFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterFaceResponseBody self = new RegisterFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterFaceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RegisterFaceResponseBody setFaces(java.util.List<RegisterFaceResponseBodyFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<RegisterFaceResponseBodyFaces> getFaces() {
        return this.faces;
    }

    public static class RegisterFaceResponseBodyFacesRect extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static RegisterFaceResponseBodyFacesRect build(java.util.Map<String, ?> map) throws Exception {
            RegisterFaceResponseBodyFacesRect self = new RegisterFaceResponseBodyFacesRect();
            return TeaModel.build(map, self);
        }

        public RegisterFaceResponseBodyFacesRect setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RegisterFaceResponseBodyFacesRect setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RegisterFaceResponseBodyFacesRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RegisterFaceResponseBodyFacesRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class RegisterFaceResponseBodyFaces extends TeaModel {
        @NameInMap("FaceToken")
        public String faceToken;

        @NameInMap("Rect")
        public RegisterFaceResponseBodyFacesRect rect;

        public static RegisterFaceResponseBodyFaces build(java.util.Map<String, ?> map) throws Exception {
            RegisterFaceResponseBodyFaces self = new RegisterFaceResponseBodyFaces();
            return TeaModel.build(map, self);
        }

        public RegisterFaceResponseBodyFaces setFaceToken(String faceToken) {
            this.faceToken = faceToken;
            return this;
        }
        public String getFaceToken() {
            return this.faceToken;
        }

        public RegisterFaceResponseBodyFaces setRect(RegisterFaceResponseBodyFacesRect rect) {
            this.rect = rect;
            return this;
        }
        public RegisterFaceResponseBodyFacesRect getRect() {
            return this.rect;
        }

    }

}
