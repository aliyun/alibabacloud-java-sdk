// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemTimeResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("workitemTime")
    public java.util.List<ListWorkitemTimeResponseBodyWorkitemTime> workitemTime;

    public static ListWorkitemTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemTimeResponseBody self = new ListWorkitemTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkitemTimeResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListWorkitemTimeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkitemTimeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListWorkitemTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkitemTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkitemTimeResponseBody setWorkitemTime(java.util.List<ListWorkitemTimeResponseBodyWorkitemTime> workitemTime) {
        this.workitemTime = workitemTime;
        return this;
    }
    public java.util.List<ListWorkitemTimeResponseBodyWorkitemTime> getWorkitemTime() {
        return this.workitemTime;
    }

    public static class ListWorkitemTimeResponseBodyWorkitemTime extends TeaModel {
        @NameInMap("actualTime")
        public Long actualTime;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtEnd")
        public Long gmtEnd;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("gmtStart")
        public Long gmtStart;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("recordUser")
        public String recordUser;

        @NameInMap("type")
        public String type;

        @NameInMap("workitemIdentifier")
        public String workitemIdentifier;

        public static ListWorkitemTimeResponseBodyWorkitemTime build(java.util.Map<String, ?> map) throws Exception {
            ListWorkitemTimeResponseBodyWorkitemTime self = new ListWorkitemTimeResponseBodyWorkitemTime();
            return TeaModel.build(map, self);
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setRecordUser(String recordUser) {
            this.recordUser = recordUser;
            return this;
        }
        public String getRecordUser() {
            return this.recordUser;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setWorkitemIdentifier(String workitemIdentifier) {
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

    }

}
