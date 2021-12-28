// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetAccountRelationResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public GetAccountRelationResponseBodyData data;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
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
        @NameInMap("ChildUserId")
        public Long childUserId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GmtModified")
        public Long gmtModified;

        // id
        @NameInMap("Id")
        public Long id;

        // parentUserId
        @NameInMap("ParentUserId")
        public Long parentUserId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        // type
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
