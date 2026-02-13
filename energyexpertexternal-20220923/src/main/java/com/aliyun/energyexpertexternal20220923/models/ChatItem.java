// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatItem extends TeaModel {
    /**
     * <p>The content of the answer to the question.</p>
     * 
     * <strong>example:</strong>
     * <p>No related content found.</p>
     */
    @NameInMap("answer")
    public String answer;

    /**
     * <p>Q&amp;A time, in milliseconds timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1747280158000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>Folder selected for the Q&amp;A.</p>
     * 
     * <strong>example:</strong>
     * <p>7708fddb-21dc-4403-a4ea-5b94eccce4c3</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>Name of the folder selected for the Q&amp;A.</p>
     * 
     * <strong>example:</strong>
     * <p>deafult folder</p>
     */
    @NameInMap("folderName")
    public String folderName;

    /**
     * <p>Question content.</p>
     * 
     * <strong>example:</strong>
     * <p>How to use the knowledge base.</p>
     */
    @NameInMap("question")
    public String question;

    /**
     * <ul>
     * <li>List of files related to the Q&amp;A.</li>
     * <li>If streaming question answering is used, only the first shard contains data.</li>
     * </ul>
     */
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
