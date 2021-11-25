// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("Faces")
    public java.util.List<UpdateImageRequestFaces> faces;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Project")
    public String project;

    @NameInMap("RemarksA")
    public String remarksA;

    @NameInMap("RemarksArrayA")
    public String remarksArrayA;

    @NameInMap("RemarksArrayB")
    public String remarksArrayB;

    @NameInMap("RemarksB")
    public String remarksB;

    @NameInMap("RemarksC")
    public String remarksC;

    @NameInMap("RemarksD")
    public String remarksD;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("SourcePosition")
    public String sourcePosition;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SourceUri")
    public String sourceUri;

    public static UpdateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageRequest self = new UpdateImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateImageRequest setFaces(java.util.List<UpdateImageRequestFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<UpdateImageRequestFaces> getFaces() {
        return this.faces;
    }

    public UpdateImageRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public UpdateImageRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public UpdateImageRequest setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public UpdateImageRequest setRemarksArrayA(String remarksArrayA) {
        this.remarksArrayA = remarksArrayA;
        return this;
    }
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    public UpdateImageRequest setRemarksArrayB(String remarksArrayB) {
        this.remarksArrayB = remarksArrayB;
        return this;
    }
    public String getRemarksArrayB() {
        return this.remarksArrayB;
    }

    public UpdateImageRequest setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public UpdateImageRequest setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public UpdateImageRequest setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public UpdateImageRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public UpdateImageRequest setSourcePosition(String sourcePosition) {
        this.sourcePosition = sourcePosition;
        return this;
    }
    public String getSourcePosition() {
        return this.sourcePosition;
    }

    public UpdateImageRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateImageRequest setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

    public static class UpdateImageRequestFaces extends TeaModel {
        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("GroupId")
        public String groupId;

        public static UpdateImageRequestFaces build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageRequestFaces self = new UpdateImageRequestFaces();
            return TeaModel.build(map, self);
        }

        public UpdateImageRequestFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public UpdateImageRequestFaces setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
