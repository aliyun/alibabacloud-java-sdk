// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateGenerateAICoachScriptTaskRequest extends TeaModel {
    @NameInMap("assessmentPoint")
    public Boolean assessmentPoint;

    @NameInMap("description")
    public String description;

    @NameInMap("dialogueKey")
    public String dialogueKey;

    @NameInMap("dialogueUrl")
    public String dialogueUrl;

    @NameInMap("docList")
    public java.util.List<CreateGenerateAICoachScriptTaskRequestDocList> docList;

    @NameInMap("docUrlList")
    public java.util.List<String> docUrlList;

    @NameInMap("scriptName")
    public String scriptName;

    public static CreateGenerateAICoachScriptTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGenerateAICoachScriptTaskRequest self = new CreateGenerateAICoachScriptTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateGenerateAICoachScriptTaskRequest setAssessmentPoint(Boolean assessmentPoint) {
        this.assessmentPoint = assessmentPoint;
        return this;
    }
    public Boolean getAssessmentPoint() {
        return this.assessmentPoint;
    }

    public CreateGenerateAICoachScriptTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGenerateAICoachScriptTaskRequest setDialogueKey(String dialogueKey) {
        this.dialogueKey = dialogueKey;
        return this;
    }
    public String getDialogueKey() {
        return this.dialogueKey;
    }

    public CreateGenerateAICoachScriptTaskRequest setDialogueUrl(String dialogueUrl) {
        this.dialogueUrl = dialogueUrl;
        return this;
    }
    public String getDialogueUrl() {
        return this.dialogueUrl;
    }

    public CreateGenerateAICoachScriptTaskRequest setDocList(java.util.List<CreateGenerateAICoachScriptTaskRequestDocList> docList) {
        this.docList = docList;
        return this;
    }
    public java.util.List<CreateGenerateAICoachScriptTaskRequestDocList> getDocList() {
        return this.docList;
    }

    public CreateGenerateAICoachScriptTaskRequest setDocUrlList(java.util.List<String> docUrlList) {
        this.docUrlList = docUrlList;
        return this;
    }
    public java.util.List<String> getDocUrlList() {
        return this.docUrlList;
    }

    public CreateGenerateAICoachScriptTaskRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public static class CreateGenerateAICoachScriptTaskRequestDocList extends TeaModel {
        @NameInMap("docId")
        public String docId;

        @NameInMap("docName")
        public String docName;

        @NameInMap("kbId")
        public String kbId;

        public static CreateGenerateAICoachScriptTaskRequestDocList build(java.util.Map<String, ?> map) throws Exception {
            CreateGenerateAICoachScriptTaskRequestDocList self = new CreateGenerateAICoachScriptTaskRequestDocList();
            return TeaModel.build(map, self);
        }

        public CreateGenerateAICoachScriptTaskRequestDocList setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public CreateGenerateAICoachScriptTaskRequestDocList setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public CreateGenerateAICoachScriptTaskRequestDocList setKbId(String kbId) {
            this.kbId = kbId;
            return this;
        }
        public String getKbId() {
            return this.kbId;
        }

    }

}
