// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemTimeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("actualTime")
        public Float actualTime;

        /**
         * <strong>example:</strong>
         * <p>开发代码等</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1653235200000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1653235200000</p>
         */
        @NameInMap("gmtEnd")
        public Long gmtEnd;

        /**
         * <strong>example:</strong>
         * <p>1653235200000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1653235200000</p>
         */
        @NameInMap("gmtStart")
        public Long gmtStart;

        /**
         * <strong>example:</strong>
         * <p>a4ac3a81e90217db32b7......</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>1967043931......</p>
         */
        @NameInMap("recordUser")
        public String recordUser;

        /**
         * <strong>example:</strong>
         * <p>研发</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>5daa9a15c7fd55523996......</p>
         */
        @NameInMap("workitemIdentifier")
        public String workitemIdentifier;

        public static ListWorkitemTimeResponseBodyWorkitemTime build(java.util.Map<String, ?> map) throws Exception {
            ListWorkitemTimeResponseBodyWorkitemTime self = new ListWorkitemTimeResponseBodyWorkitemTime();
            return TeaModel.build(map, self);
        }

        public ListWorkitemTimeResponseBodyWorkitemTime setActualTime(Float actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Float getActualTime() {
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
