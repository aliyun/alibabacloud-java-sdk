// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListOrganizationSecurityScoresResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListOrganizationSecurityScoresResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static ListOrganizationSecurityScoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationSecurityScoresResponseBody self = new ListOrganizationSecurityScoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationSecurityScoresResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListOrganizationSecurityScoresResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOrganizationSecurityScoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationSecurityScoresResponseBody setResult(java.util.List<ListOrganizationSecurityScoresResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOrganizationSecurityScoresResponseBodyResult> getResult() {
        return this.result;
    }

    public ListOrganizationSecurityScoresResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore extends TeaModel {
        @NameInMap("AuthorityControlScore")
        public Integer authorityControlScore;

        @NameInMap("CodeContentScore")
        public Integer codeContentScore;

        @NameInMap("Level")
        public String level;

        @NameInMap("MemberBehaviorScore")
        public Integer memberBehaviorScore;

        public static ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore self = new ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore();
            return TeaModel.build(map, self);
        }

        public ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore setAuthorityControlScore(Integer authorityControlScore) {
            this.authorityControlScore = authorityControlScore;
            return this;
        }
        public Integer getAuthorityControlScore() {
            return this.authorityControlScore;
        }

        public ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore setCodeContentScore(Integer codeContentScore) {
            this.codeContentScore = codeContentScore;
            return this;
        }
        public Integer getCodeContentScore() {
            return this.codeContentScore;
        }

        public ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore setMemberBehaviorScore(Integer memberBehaviorScore) {
            this.memberBehaviorScore = memberBehaviorScore;
            return this;
        }
        public Integer getMemberBehaviorScore() {
            return this.memberBehaviorScore;
        }

    }

    public static class ListOrganizationSecurityScoresResponseBodyResult extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OrganizationSecurityScore")
        public ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore organizationSecurityScore;

        public static ListOrganizationSecurityScoresResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationSecurityScoresResponseBodyResult self = new ListOrganizationSecurityScoresResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOrganizationSecurityScoresResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListOrganizationSecurityScoresResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOrganizationSecurityScoresResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListOrganizationSecurityScoresResponseBodyResult setOrganizationSecurityScore(ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore organizationSecurityScore) {
            this.organizationSecurityScore = organizationSecurityScore;
            return this;
        }
        public ListOrganizationSecurityScoresResponseBodyResultOrganizationSecurityScore getOrganizationSecurityScore() {
            return this.organizationSecurityScore;
        }

    }

}
