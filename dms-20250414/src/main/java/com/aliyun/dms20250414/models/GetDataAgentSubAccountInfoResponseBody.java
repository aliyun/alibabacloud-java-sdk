// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentSubAccountInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDataAgentSubAccountInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DMS-DA-40114</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-***-695C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataAgentSubAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentSubAccountInfoResponseBody self = new GetDataAgentSubAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAgentSubAccountInfoResponseBody setData(GetDataAgentSubAccountInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataAgentSubAccountInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDataAgentSubAccountInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataAgentSubAccountInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAgentSubAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAgentSubAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataAgentSubAccountInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1765960516</p>
         */
        @NameInMap("CreateDate")
        public Long createDate;

        /**
         * <strong>example:</strong>
         * <p>167*****166</p>
         */
        @NameInMap("MainAccountId")
        public String mainAccountId;

        /**
         * <strong>example:</strong>
         * <p>1765962516</p>
         */
        @NameInMap("UpdateDate")
        public Long updateDate;

        /**
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>yunqitest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetDataAgentSubAccountInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataAgentSubAccountInfoResponseBodyData self = new GetDataAgentSubAccountInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataAgentSubAccountInfoResponseBodyData setCreateDate(Long createDate) {
            this.createDate = createDate;
            return this;
        }
        public Long getCreateDate() {
            return this.createDate;
        }

        public GetDataAgentSubAccountInfoResponseBodyData setMainAccountId(String mainAccountId) {
            this.mainAccountId = mainAccountId;
            return this;
        }
        public String getMainAccountId() {
            return this.mainAccountId;
        }

        public GetDataAgentSubAccountInfoResponseBodyData setUpdateDate(Long updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public Long getUpdateDate() {
            return this.updateDate;
        }

        public GetDataAgentSubAccountInfoResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDataAgentSubAccountInfoResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
