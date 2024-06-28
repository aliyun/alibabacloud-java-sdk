// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetAccountRelationResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
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
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Message returned</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
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
         * <p>The ID of the Alibaba Cloud account that is used as a member.</p>
         * 
         * <strong>example:</strong>
         * <p>ID of the Alibaba Cloud account that is used as a member</p>
         */
        @NameInMap("ChildUserId")
        public Long childUserId;

        /**
         * <p>The time when the financial relationship between the management account and the member was terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-01</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The time when the financial relationship between the management account and the member was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-01</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the financial relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>ID of the financial relationship</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the Alibaba Cloud account that is used as the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>ID of the Alibaba Cloud account that is used as the management account</p>
         */
        @NameInMap("ParentUserId")
        public Long parentUserId;

        /**
         * <p>The time when the financial relationship between the management account and the member was established.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the financial relationship between the management account and the member.</p>
         * 
         * <strong>example:</strong>
         * <p>RELATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the financial relationship.</p>
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
