// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class IndexImageRequest extends TeaModel {
    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

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

    public static IndexImageRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexImageRequest self = new IndexImageRequest();
        return TeaModel.build(map, self);
    }

    public IndexImageRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public IndexImageRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public IndexImageRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public IndexImageRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public IndexImageRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public IndexImageRequest setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public IndexImageRequest setRemarksArrayA(String remarksArrayA) {
        this.remarksArrayA = remarksArrayA;
        return this;
    }
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    public IndexImageRequest setRemarksArrayB(String remarksArrayB) {
        this.remarksArrayB = remarksArrayB;
        return this;
    }
    public String getRemarksArrayB() {
        return this.remarksArrayB;
    }

    public IndexImageRequest setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public IndexImageRequest setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public IndexImageRequest setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public IndexImageRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public IndexImageRequest setSourcePosition(String sourcePosition) {
        this.sourcePosition = sourcePosition;
        return this;
    }
    public String getSourcePosition() {
        return this.sourcePosition;
    }

    public IndexImageRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public IndexImageRequest setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

}
