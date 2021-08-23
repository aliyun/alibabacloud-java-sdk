// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class IndexVideoRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("RemarksA")
    public String remarksA;

    @NameInMap("RemarksB")
    public String remarksB;

    @NameInMap("TgtUri")
    public String tgtUri;

    @NameInMap("RemarksC")
    public String remarksC;

    @NameInMap("RemarksD")
    public String remarksD;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    public static IndexVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexVideoRequest self = new IndexVideoRequest();
        return TeaModel.build(map, self);
    }

    public IndexVideoRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public IndexVideoRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public IndexVideoRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public IndexVideoRequest setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public IndexVideoRequest setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public IndexVideoRequest setTgtUri(String tgtUri) {
        this.tgtUri = tgtUri;
        return this;
    }
    public String getTgtUri() {
        return this.tgtUri;
    }

    public IndexVideoRequest setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public IndexVideoRequest setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public IndexVideoRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public IndexVideoRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public IndexVideoRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

}
