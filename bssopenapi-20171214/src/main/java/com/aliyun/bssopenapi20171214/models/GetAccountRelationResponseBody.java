// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetAccountRelationResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("Data")
    public GetAccountRelationResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAccountRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountRelationResponseBody self = new GetAccountRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountRelationResponseBody setData(GetAccountRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccountRelationResponseBodyData getData() {
        return this.data;
    }

    public GetAccountRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountRelationResponseBodyData extends TeaModel {
        /**
         * <p>The UID of the child account.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud account UID of the child account</p>
         */
        @NameInMap("ChildUserId")
        public Long childUserId;

        /**
         * <p>The end time of the account linking, in the YYYY-MM-DD format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-01</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The update time of the account linking.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-01</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The account linking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Account linking ID</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The UID of the parent account.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud UID of the main account</p>
         */
        @NameInMap("ParentUserId")
        public Long parentUserId;

        /**
         * <p>The start time of the account linking, in the YYYY-MM-DD format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The account linking status. Valid values:</p>
         * <ul>
         * <li>RELATED: linked.</li>
         * <li>CONFIRMING: pending confirmation from the other party.</li>
         * <li>REJECTED: rejected by the other party.</li>
         * <li>CONNECTION_CANCELED: application canceled by the child account.</li>
         * <li>CONNECTION_MASTER_CANCEL: invitation canceled by the main account.</li>
         * <li>CHANGE_CONFIRMING: pending confirmation for relationship change.</li>
         * <li>INITIAL: initial status of a newly created linking.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELATED: linked</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The account linking type.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise_group</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAccountRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountRelationResponseBodyData self = new GetAccountRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccountRelationResponseBodyData setChildUserId(Long childUserId) {
            this.childUserId = childUserId;
            return this;
        }
        public Long getChildUserId() {
            return this.childUserId;
        }

        public GetAccountRelationResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetAccountRelationResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetAccountRelationResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAccountRelationResponseBodyData setParentUserId(Long parentUserId) {
            this.parentUserId = parentUserId;
            return this;
        }
        public Long getParentUserId() {
            return this.parentUserId;
        }

        public GetAccountRelationResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetAccountRelationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAccountRelationResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
