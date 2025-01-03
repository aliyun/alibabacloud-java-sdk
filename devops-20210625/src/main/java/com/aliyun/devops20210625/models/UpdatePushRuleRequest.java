// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePushRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("ruleInfos")
    public java.util.List<UpdatePushRuleRequestRuleInfos> ruleInfos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ebbc0228123212b59xxxxx</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>CommitAuthorChecker</p>
         */
        @NameInMap("checkerName")
        public String checkerName;

        /**
         * <strong>example:</strong>
         * <p>warn</p>
         */
        @NameInMap("checkerType")
        public String checkerType;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
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
