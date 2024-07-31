// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupQueryUserListResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public java.util.List<DsgUserGroupQueryUserListResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1029030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DsgUserGroupQueryUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupQueryUserListResponseBody self = new DsgUserGroupQueryUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupQueryUserListResponseBody setData(java.util.List<DsgUserGroupQueryUserListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DsgUserGroupQueryUserListResponseBodyData> getData() {
        return this.data;
    }

    public DsgUserGroupQueryUserListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgUserGroupQueryUserListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgUserGroupQueryUserListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgUserGroupQueryUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgUserGroupQueryUserListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgUserGroupQueryUserListResponseBodyData extends TeaModel {
        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The type of the user. Valid values:</p>
         * <ul>
         * <li>1 to 5: Alibaba Cloud account</li>
         * <li>6: RAM role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AccountType")
        public Integer accountType;

        /**
         * <p>The user ID or role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("BaseId")
        public String baseId;

        /**
         * <p>The parent user ID. This parameter is required if a RAM user is used.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ParentAccountId")
        public String parentAccountId;

        /**
         * <p>The name of the Alibaba Cloud account or RAM role. The return value of this parameter must be used if the user group is created by using an Alibaba Cloud account or a RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>user:user1</p>
         */
        @NameInMap("YunAccount")
        public String yunAccount;

        public static DsgUserGroupQueryUserListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DsgUserGroupQueryUserListResponseBodyData self = new DsgUserGroupQueryUserListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DsgUserGroupQueryUserListResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DsgUserGroupQueryUserListResponseBodyData setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public DsgUserGroupQueryUserListResponseBodyData setBaseId(String baseId) {
            this.baseId = baseId;
            return this;
        }
        public String getBaseId() {
            return this.baseId;
        }

        public DsgUserGroupQueryUserListResponseBodyData setParentAccountId(String parentAccountId) {
            this.parentAccountId = parentAccountId;
            return this;
        }
        public String getParentAccountId() {
            return this.parentAccountId;
        }

        public DsgUserGroupQueryUserListResponseBodyData setYunAccount(String yunAccount) {
            this.yunAccount = yunAccount;
            return this;
        }
        public String getYunAccount() {
            return this.yunAccount;
        }

    }

}
