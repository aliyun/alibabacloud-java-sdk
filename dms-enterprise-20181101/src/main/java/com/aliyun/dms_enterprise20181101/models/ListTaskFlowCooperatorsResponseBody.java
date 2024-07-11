// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowCooperatorsResponseBody extends TeaModel {
    /**
     * <p>The users that are involved in the task flow.</p>
     */
    @NameInMap("CooperatorList")
    public ListTaskFlowCooperatorsResponseBodyCooperatorList cooperatorList;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>54C99C70-2DFF-5A8C-A252-EBAA1EB668EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTaskFlowCooperatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowCooperatorsResponseBody self = new ListTaskFlowCooperatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowCooperatorsResponseBody setCooperatorList(ListTaskFlowCooperatorsResponseBodyCooperatorList cooperatorList) {
        this.cooperatorList = cooperatorList;
        return this;
    }
    public ListTaskFlowCooperatorsResponseBodyCooperatorList getCooperatorList() {
        return this.cooperatorList;
    }

    public ListTaskFlowCooperatorsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowCooperatorsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowCooperatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowCooperatorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator extends TeaModel {
        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@XX.com">test@XX.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The alias of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>userId.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator self = new ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListTaskFlowCooperatorsResponseBodyCooperatorList extends TeaModel {
        @NameInMap("Cooperator")
        public java.util.List<ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator> cooperator;

        public static ListTaskFlowCooperatorsResponseBodyCooperatorList build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowCooperatorsResponseBodyCooperatorList self = new ListTaskFlowCooperatorsResponseBodyCooperatorList();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowCooperatorsResponseBodyCooperatorList setCooperator(java.util.List<ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator> cooperator) {
            this.cooperator = cooperator;
            return this;
        }
        public java.util.List<ListTaskFlowCooperatorsResponseBodyCooperatorListCooperator> getCooperator() {
            return this.cooperator;
        }

    }

}
