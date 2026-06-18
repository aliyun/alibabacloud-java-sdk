// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class AddOrganizationMemberResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public AddOrganizationMemberResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>385C2BC3-52FC-564F-9312-97E5DFE1DFC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddOrganizationMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddOrganizationMemberResponseBody self = new AddOrganizationMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddOrganizationMemberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddOrganizationMemberResponseBody setData(AddOrganizationMemberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddOrganizationMemberResponseBodyData getData() {
        return this.data;
    }

    public AddOrganizationMemberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddOrganizationMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddOrganizationMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddOrganizationMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddOrganizationMemberResponseBodyData extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Indicates whether the seat was successfully assigned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SeatAssigned")
        public Boolean seatAssigned;

        public static AddOrganizationMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddOrganizationMemberResponseBodyData self = new AddOrganizationMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddOrganizationMemberResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public AddOrganizationMemberResponseBodyData setSeatAssigned(Boolean seatAssigned) {
            this.seatAssigned = seatAssigned;
            return this;
        }
        public Boolean getSeatAssigned() {
            return this.seatAssigned;
        }

    }

}
