// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListProductAuthorizationsResponseBody extends TeaModel {
    // 角色列表
    @NameInMap("AuthorizationDetails")
    public java.util.List<ListProductAuthorizationsResponseBodyAuthorizationDetails> authorizationDetails;

    // 授权链接
    @NameInMap("AuthorizationUrl")
    public String authorizationUrl;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListProductAuthorizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductAuthorizationsResponseBody self = new ListProductAuthorizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductAuthorizationsResponseBody setAuthorizationDetails(java.util.List<ListProductAuthorizationsResponseBodyAuthorizationDetails> authorizationDetails) {
        this.authorizationDetails = authorizationDetails;
        return this;
    }
    public java.util.List<ListProductAuthorizationsResponseBodyAuthorizationDetails> getAuthorizationDetails() {
        return this.authorizationDetails;
    }

    public ListProductAuthorizationsResponseBody setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public ListProductAuthorizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductAuthorizationsResponseBodyAuthorizationDetails extends TeaModel {
        // 快捷授权的url， 假如IsAuthorized为false时有效
        @NameInMap("AuthorizationUrl")
        public String authorizationUrl;

        // 角色是否被授权
        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        // RoleArn
        @NameInMap("RamRoleARN")
        public String ramRoleARN;

        // Role的名字
        @NameInMap("RamRoleName")
        public String ramRoleName;

        // Role的类型
        @NameInMap("RamRoleType")
        public String ramRoleType;

        public static ListProductAuthorizationsResponseBodyAuthorizationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListProductAuthorizationsResponseBodyAuthorizationDetails self = new ListProductAuthorizationsResponseBodyAuthorizationDetails();
            return TeaModel.build(map, self);
        }

        public ListProductAuthorizationsResponseBodyAuthorizationDetails setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public ListProductAuthorizationsResponseBodyAuthorizationDetails setIsAuthorized(Boolean isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }
        public Boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        public ListProductAuthorizationsResponseBodyAuthorizationDetails setRamRoleARN(String ramRoleARN) {
            this.ramRoleARN = ramRoleARN;
            return this;
        }
        public String getRamRoleARN() {
            return this.ramRoleARN;
        }

        public ListProductAuthorizationsResponseBodyAuthorizationDetails setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public ListProductAuthorizationsResponseBodyAuthorizationDetails setRamRoleType(String ramRoleType) {
            this.ramRoleType = ramRoleType;
            return this;
        }
        public String getRamRoleType() {
            return this.ramRoleType;
        }

    }

}
