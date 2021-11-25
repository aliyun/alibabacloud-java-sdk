// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateImageShrinkRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("Faces")
    public String facesShrink;

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

    public static UpdateImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageShrinkRequest self = new UpdateImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageShrinkRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateImageShrinkRequest setFacesShrink(String facesShrink) {
        this.facesShrink = facesShrink;
        return this;
    }
    public String getFacesShrink() {
        return this.facesShrink;
    }

    public UpdateImageShrinkRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public UpdateImageShrinkRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public UpdateImageShrinkRequest setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public UpdateImageShrinkRequest setRemarksArrayA(String remarksArrayA) {
        this.remarksArrayA = remarksArrayA;
        return this;
    }
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    public UpdateImageShrinkRequest setRemarksArrayB(String remarksArrayB) {
        this.remarksArrayB = remarksArrayB;
        return this;
    }
    public String getRemarksArrayB() {
        return this.remarksArrayB;
    }

    public UpdateImageShrinkRequest setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public UpdateImageShrinkRequest setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public UpdateImageShrinkRequest setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public UpdateImageShrinkRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public UpdateImageShrinkRequest setSourcePosition(String sourcePosition) {
        this.sourcePosition = sourcePosition;
        return this;
    }
    public String getSourcePosition() {
        return this.sourcePosition;
    }

    public UpdateImageShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateImageShrinkRequest setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

}
