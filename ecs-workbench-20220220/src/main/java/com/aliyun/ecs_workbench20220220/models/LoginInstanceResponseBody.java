// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class LoginInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public LoginInstanceResponseBodyRoot root;

    @NameInMap("Success")
    public String success;

    public static LoginInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginInstanceResponseBody self = new LoginInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LoginInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LoginInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoginInstanceResponseBody setRoot(LoginInstanceResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public LoginInstanceResponseBodyRoot getRoot() {
        return this.root;
    }

    public LoginInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class LoginInstanceResponseBodyRootDisposableAccount extends TeaModel {
        @NameInMap("LoginFormActionUrl")
        public String loginFormActionUrl;

        @NameInMap("LoginUrl")
        public String loginUrl;

        public static LoginInstanceResponseBodyRootDisposableAccount build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceResponseBodyRootDisposableAccount self = new LoginInstanceResponseBodyRootDisposableAccount();
            return TeaModel.build(map, self);
        }

        public LoginInstanceResponseBodyRootDisposableAccount setLoginFormActionUrl(String loginFormActionUrl) {
            this.loginFormActionUrl = loginFormActionUrl;
            return this;
        }
        public String getLoginFormActionUrl() {
            return this.loginFormActionUrl;
        }

        public LoginInstanceResponseBodyRootDisposableAccount setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

    }

    public static class LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView extends TeaModel {
        @NameInMap("DefaultViewUrl")
        public String defaultViewUrl;

        public static LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView self = new LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView();
            return TeaModel.build(map, self);
        }

        public LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView setDefaultViewUrl(String defaultViewUrl) {
            this.defaultViewUrl = defaultViewUrl;
            return this;
        }
        public String getDefaultViewUrl() {
            return this.defaultViewUrl;
        }

    }

    public static class LoginInstanceResponseBodyRootInstanceLoginInfoList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceLoginToken")
        public String instanceLoginToken;

        @NameInMap("InstanceLoginView")
        public LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView instanceLoginView;

        @NameInMap("LoginSuccess")
        public Boolean loginSuccess;

        public static LoginInstanceResponseBodyRootInstanceLoginInfoList build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceResponseBodyRootInstanceLoginInfoList self = new LoginInstanceResponseBodyRootInstanceLoginInfoList();
            return TeaModel.build(map, self);
        }

        public LoginInstanceResponseBodyRootInstanceLoginInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public LoginInstanceResponseBodyRootInstanceLoginInfoList setInstanceLoginToken(String instanceLoginToken) {
            this.instanceLoginToken = instanceLoginToken;
            return this;
        }
        public String getInstanceLoginToken() {
            return this.instanceLoginToken;
        }

        public LoginInstanceResponseBodyRootInstanceLoginInfoList setInstanceLoginView(LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView instanceLoginView) {
            this.instanceLoginView = instanceLoginView;
            return this;
        }
        public LoginInstanceResponseBodyRootInstanceLoginInfoListInstanceLoginView getInstanceLoginView() {
            return this.instanceLoginView;
        }

        public LoginInstanceResponseBodyRootInstanceLoginInfoList setLoginSuccess(Boolean loginSuccess) {
            this.loginSuccess = loginSuccess;
            return this;
        }
        public Boolean getLoginSuccess() {
            return this.loginSuccess;
        }

    }

    public static class LoginInstanceResponseBodyRootSessionControl extends TeaModel {
        @NameInMap("BaseUrl")
        public String baseUrl;

        public static LoginInstanceResponseBodyRootSessionControl build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceResponseBodyRootSessionControl self = new LoginInstanceResponseBodyRootSessionControl();
            return TeaModel.build(map, self);
        }

        public LoginInstanceResponseBodyRootSessionControl setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

    }

    public static class LoginInstanceResponseBodyRoot extends TeaModel {
        @NameInMap("DisposableAccount")
        public LoginInstanceResponseBodyRootDisposableAccount disposableAccount;

        @NameInMap("InstanceLoginInfoList")
        public java.util.List<LoginInstanceResponseBodyRootInstanceLoginInfoList> instanceLoginInfoList;

        @NameInMap("SessionControl")
        public LoginInstanceResponseBodyRootSessionControl sessionControl;

        public static LoginInstanceResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceResponseBodyRoot self = new LoginInstanceResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public LoginInstanceResponseBodyRoot setDisposableAccount(LoginInstanceResponseBodyRootDisposableAccount disposableAccount) {
            this.disposableAccount = disposableAccount;
            return this;
        }
        public LoginInstanceResponseBodyRootDisposableAccount getDisposableAccount() {
            return this.disposableAccount;
        }

        public LoginInstanceResponseBodyRoot setInstanceLoginInfoList(java.util.List<LoginInstanceResponseBodyRootInstanceLoginInfoList> instanceLoginInfoList) {
            this.instanceLoginInfoList = instanceLoginInfoList;
            return this;
        }
        public java.util.List<LoginInstanceResponseBodyRootInstanceLoginInfoList> getInstanceLoginInfoList() {
            return this.instanceLoginInfoList;
        }

        public LoginInstanceResponseBodyRoot setSessionControl(LoginInstanceResponseBodyRootSessionControl sessionControl) {
            this.sessionControl = sessionControl;
            return this;
        }
        public LoginInstanceResponseBodyRootSessionControl getSessionControl() {
            return this.sessionControl;
        }

    }

}
