// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatItem extends TeaModel {
    @NameInMap("answer")
    public String answer;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("folderId")
    public String folderId;

    @NameInMap("folderName")
    public String folderName;

    @NameInMap("question")
    public String question;

    @NameInMap("refDocList")
    public java.util.List<ChatRefDocItem> refDocList;

    public static ChatItem build(java.util.Map<String, ?> map) throws Exception {
        ChatItem self = new ChatItem();
        return TeaModel.build(map, self);
    }

    public ChatItem setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public ChatItem setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ChatItem setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public ChatItem setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public ChatItem setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public ChatItem setRefDocList(java.util.List<ChatRefDocItem> refDocList) {
        this.refDocList = refDocList;
        return this;
    }
    public java.util.List<ChatRefDocItem> getRefDocList() {
        return this.refDocList;
    }

}
