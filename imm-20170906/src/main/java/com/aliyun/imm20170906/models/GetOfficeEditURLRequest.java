// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficeEditURLRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SrcUri")
    public String srcUri;

    @NameInMap("SrcType")
    public String srcType;

    @NameInMap("FileID")
    public String fileID;

    @NameInMap("TgtUri")
    public String tgtUri;

    @NameInMap("UserID")
    public String userID;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("FileName")
    public String fileName;

    public static GetOfficeEditURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeEditURLRequest self = new GetOfficeEditURLRequest();
        return TeaModel.build(map, self);
    }

    public GetOfficeEditURLRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetOfficeEditURLRequest setSrcUri(String srcUri) {
        this.srcUri = srcUri;
        return this;
    }
    public String getSrcUri() {
        return this.srcUri;
    }

    public GetOfficeEditURLRequest setSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }
    public String getSrcType() {
        return this.srcType;
    }

    public GetOfficeEditURLRequest setFileID(String fileID) {
        this.fileID = fileID;
        return this;
    }
    public String getFileID() {
        return this.fileID;
    }

    public GetOfficeEditURLRequest setTgtUri(String tgtUri) {
        this.tgtUri = tgtUri;
        return this;
    }
    public String getTgtUri() {
        return this.tgtUri;
    }

    public GetOfficeEditURLRequest setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public GetOfficeEditURLRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetOfficeEditURLRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GetOfficeEditURLRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetOfficeEditURLRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
