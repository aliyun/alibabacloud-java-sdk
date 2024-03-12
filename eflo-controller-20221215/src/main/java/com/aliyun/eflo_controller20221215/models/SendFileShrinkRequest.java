// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class SendFileShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileGroup")
    public String fileGroup;

    @NameInMap("FileMode")
    public String fileMode;

    @NameInMap("FileOwner")
    public String fileOwner;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeIdList")
    public String nodeIdListShrink;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("TargetDir")
    public String targetDir;

    @NameInMap("Timeout")
    public Integer timeout;

    public static SendFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendFileShrinkRequest self = new SendFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendFileShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendFileShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SendFileShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendFileShrinkRequest setFileGroup(String fileGroup) {
        this.fileGroup = fileGroup;
        return this;
    }
    public String getFileGroup() {
        return this.fileGroup;
    }

    public SendFileShrinkRequest setFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }
    public String getFileMode() {
        return this.fileMode;
    }

    public SendFileShrinkRequest setFileOwner(String fileOwner) {
        this.fileOwner = fileOwner;
        return this;
    }
    public String getFileOwner() {
        return this.fileOwner;
    }

    public SendFileShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SendFileShrinkRequest setNodeIdListShrink(String nodeIdListShrink) {
        this.nodeIdListShrink = nodeIdListShrink;
        return this;
    }
    public String getNodeIdListShrink() {
        return this.nodeIdListShrink;
    }

    public SendFileShrinkRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public SendFileShrinkRequest setTargetDir(String targetDir) {
        this.targetDir = targetDir;
        return this;
    }
    public String getTargetDir() {
        return this.targetDir;
    }

    public SendFileShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
