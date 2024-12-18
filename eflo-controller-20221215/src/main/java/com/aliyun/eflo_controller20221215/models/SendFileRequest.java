// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class SendFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash echo &quot;Current User is :&quot; echo $(ps | grep &quot;$$&quot; | awk \&quot;{print $2}\&quot;) -------- oss://bucketName/objectName</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>This is a test file.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FileGroup")
    public String fileGroup;

    /**
     * <strong>example:</strong>
     * <p>0644</p>
     */
    @NameInMap("FileMode")
    public String fileMode;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("FileOwner")
    public String fileOwner;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file.txt</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeIdList")
    public java.util.List<String> nodeIdList;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("TargetDir")
    public String targetDir;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static SendFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SendFileRequest self = new SendFileRequest();
        return TeaModel.build(map, self);
    }

    public SendFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendFileRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SendFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendFileRequest setFileGroup(String fileGroup) {
        this.fileGroup = fileGroup;
        return this;
    }
    public String getFileGroup() {
        return this.fileGroup;
    }

    public SendFileRequest setFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }
    public String getFileMode() {
        return this.fileMode;
    }

    public SendFileRequest setFileOwner(String fileOwner) {
        this.fileOwner = fileOwner;
        return this;
    }
    public String getFileOwner() {
        return this.fileOwner;
    }

    public SendFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SendFileRequest setNodeIdList(java.util.List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

    public SendFileRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public SendFileRequest setTargetDir(String targetDir) {
        this.targetDir = targetDir;
        return this;
    }
    public String getTargetDir() {
        return this.targetDir;
    }

    public SendFileRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
