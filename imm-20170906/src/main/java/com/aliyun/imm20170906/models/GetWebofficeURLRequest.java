// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetWebofficeURLRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SrcType")
    public String srcType;

    @NameInMap("FileID")
    public String fileID;

    @NameInMap("User")
    public String user;

    @NameInMap("Permission")
    public String permission;

    @NameInMap("File")
    public String file;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    public static GetWebofficeURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLRequest self = new GetWebofficeURLRequest();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetWebofficeURLRequest setSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }
    public String getSrcType() {
        return this.srcType;
    }

    public GetWebofficeURLRequest setFileID(String fileID) {
        this.fileID = fileID;
        return this;
    }
    public String getFileID() {
        return this.fileID;
    }

    public GetWebofficeURLRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public GetWebofficeURLRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public GetWebofficeURLRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public GetWebofficeURLRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GetWebofficeURLRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

}
