// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePushRuleRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("ruleInfos")
    public java.util.List<UpdatePushRuleRequestRuleInfos> ruleInfos;

    @NameInMap("organizationId")
    public String organizationId;

    public static UpdatePushRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePushRuleRequest self = new UpdatePushRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePushRuleRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdatePushRuleRequest setRuleInfos(java.util.List<UpdatePushRuleRequestRuleInfos> ruleInfos) {
        this.ruleInfos = ruleInfos;
        return this;
    }
    public java.util.List<UpdatePushRuleRequestRuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    public UpdatePushRuleRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class UpdatePushRuleRequestRuleInfos extends TeaModel {
        @NameInMap("checkerName")
        public String checkerName;

        @NameInMap("checkerType")
        public String checkerType;

        @NameInMap("extraMessage")
        public String extraMessage;

        @NameInMap("fileRuleRegexes")
        public java.util.List<String> fileRuleRegexes;

        public static UpdatePushRuleRequestRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdatePushRuleRequestRuleInfos self = new UpdatePushRuleRequestRuleInfos();
            return TeaModel.build(map, self);
        }

        public UpdatePushRuleRequestRuleInfos setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public UpdatePushRuleRequestRuleInfos setCheckerType(String checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public String getCheckerType() {
            return this.checkerType;
        }

        public UpdatePushRuleRequestRuleInfos setExtraMessage(String extraMessage) {
            this.extraMessage = extraMessage;
            return this;
        }
        public String getExtraMessage() {
            return this.extraMessage;
        }

        public UpdatePushRuleRequestRuleInfos setFileRuleRegexes(java.util.List<String> fileRuleRegexes) {
            this.fileRuleRegexes = fileRuleRegexes;
            return this;
        }
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

    }

}
