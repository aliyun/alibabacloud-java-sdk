// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoFacesResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Faces")
    public java.util.List<ListPhotoFacesResponseBodyFaces> faces;

    public static ListPhotoFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoFacesResponseBody self = new ListPhotoFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhotoFacesResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListPhotoFacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhotoFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPhotoFacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhotoFacesResponseBody setFaces(java.util.List<ListPhotoFacesResponseBodyFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<ListPhotoFacesResponseBodyFaces> getFaces() {
        return this.faces;
    }

    public static class ListPhotoFacesResponseBodyFaces extends TeaModel {
        @NameInMap("FaceIdStr")
        public String faceIdStr;

        @NameInMap("FaceName")
        public String faceName;

        @NameInMap("FaceId")
        public Long faceId;

        @NameInMap("Axis")
        public java.util.List<String> axis;

        public static ListPhotoFacesResponseBodyFaces build(java.util.Map<String, ?> map) throws Exception {
            ListPhotoFacesResponseBodyFaces self = new ListPhotoFacesResponseBodyFaces();
            return TeaModel.build(map, self);
        }

        public ListPhotoFacesResponseBodyFaces setFaceIdStr(String faceIdStr) {
            this.faceIdStr = faceIdStr;
            return this;
        }
        public String getFaceIdStr() {
            return this.faceIdStr;
        }

        public ListPhotoFacesResponseBodyFaces setFaceName(String faceName) {
            this.faceName = faceName;
            return this;
        }
        public String getFaceName() {
            return this.faceName;
        }

        public ListPhotoFacesResponseBodyFaces setFaceId(Long faceId) {
            this.faceId = faceId;
            return this;
        }
        public Long getFaceId() {
            return this.faceId;
        }

        public ListPhotoFacesResponseBodyFaces setAxis(java.util.List<String> axis) {
            this.axis = axis;
            return this;
        }
        public java.util.List<String> getAxis() {
            return this.axis;
        }

    }

}
