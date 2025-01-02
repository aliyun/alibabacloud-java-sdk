// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class SendFileShrinkRequest extends TeaModel {
    /**
     * <p>The content of the file. After Base64 encoding, the size cannot exceed 32 KB.</p>
     * <ul>
     * <li>When the <code>ContentType</code> parameter is <code>PlainText</code>, this field is plain text.</li>
     * <li>When the <code>ContentType</code> parameter is <code>Base64</code>, this field is Base64 encoded text.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash echo &quot;Current User is :&quot; echo $(ps | grep &quot;$$&quot; | awk \&quot;{print $2}\&quot;) -------- oss://bucketName/objectName</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The content type of the file.</p>
     * <p>PlainText: Plain text.
     * Base64: Base64 encoded.
     * The default value is PlainText.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>Description information. Supports all character sets, and the length must not exceed 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test file.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The group of the file. Applies only to Linux instances, and the default is root. The length must not exceed 64 characters.</p>
     * <p>Note
     * When using other groups, ensure that the group exists in the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FileGroup")
    public String fileGroup;

    /**
     * <p>The permissions of the file. Applies only to Linux instances, and the setting method is the same as the chmod command.</p>
     * <p>The default value is 0644, which means the user has read and write permissions, while the group and other users have read-only permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>0644</p>
     */
    @NameInMap("FileMode")
    public String fileMode;

    /**
     * <p>The owner of the file. Applies only to Linux instances, and the default is root.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("FileOwner")
    public String fileOwner;

    /**
     * <p>The name of the file. Supports all character sets, and the length must not exceed 255 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file.txt</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>List of nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeIdList")
    public String nodeIdListShrink;

    /**
     * <p>Whether to overwrite the file if a file with the same name already exists in the target directory.</p>
     * <ul>
     * <li>true: Overwrite.</li>
     * <li>false: Do not overwrite.</li>
     * </ul>
     * <p>The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The directory in the target Lingjun node where the file will be sent. If it does not exist, it will be automatically created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("TargetDir")
    public String targetDir;

    /**
     * <p>The timeout for sending the file. Unit: seconds.</p>
     * <ul>
     * <li>A timeout may occur due to process reasons, missing modules, or missing Cloud Assistant Agent.</li>
     * <li>If the set timeout is less than 10 seconds, to ensure successful delivery, the system will automatically set the timeout to 10 seconds.</li>
     * </ul>
     * <p>The default value is 60.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
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
