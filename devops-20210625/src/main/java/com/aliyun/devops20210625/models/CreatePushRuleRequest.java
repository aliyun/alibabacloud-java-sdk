// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePushRuleRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("ruleInfos")
    public java.util.List<CreatePushRuleRequestRuleInfos> ruleInfos;

    @NameInMap("organizationId")
    public String organizationId;

    public static CreatePushRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePushRuleRequest self = new CreatePushRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreatePushRuleRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreatePushRuleRequest setRuleInfos(java.util.List<CreatePushRuleRequestRuleInfos> ruleInfos) {
        this.ruleInfos = ruleInfos;
        return this;
    }
    public java.util.List<CreatePushRuleRequestRuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    public CreatePushRuleRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class CreatePushRuleRequestRuleInfos extends TeaModel {
        @NameInMap("checkerName")
        public String checkerName;

        @NameInMap("checkerType")
        public String checkerType;

        @NameInMap("extraMessage")
        public String extraMessage;

        @NameInMap("fileRuleRegexes")
        public java.util.List<String> fileRuleRegexes;

        public static CreatePushRuleRequestRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            CreatePushRuleRequestRuleInfos self = new CreatePushRuleRequestRuleInfos();
            return TeaModel.build(map, self);
        }

        public CreatePushRuleRequestRuleInfos setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public CreatePushRuleRequestRuleInfos setCheckerType(String checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public String getCheckerType() {
            return this.checkerType;
        }

        public CreatePushRuleRequestRuleInfos setExtraMessage(String extraMessage) {
            this.extraMessage = extraMessage;
            return this;
        }
        public String getExtraMessage() {
            return this.extraMessage;
        }

        public CreatePushRuleRequestRuleInfos setFileRuleRegexes(java.util.List<String> fileRuleRegexes) {
            this.fileRuleRegexes = fileRuleRegexes;
            return this;
        }
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

    }

}
