// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemRelationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidGroup.IdNotFound</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("relationList")
    public java.util.List<GetWorkitemRelationsResponseBodyRelationList> relationList;

    /**
     * <p>Id of the request</p>
     * 
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

    public static GetWorkitemRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemRelationsResponseBody self = new GetWorkitemRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkitemRelationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkitemRelationsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetWorkitemRelationsResponseBody setRelationList(java.util.List<GetWorkitemRelationsResponseBodyRelationList> relationList) {
        this.relationList = relationList;
        return this;
    }
    public java.util.List<GetWorkitemRelationsResponseBodyRelationList> getRelationList() {
        return this.relationList;
    }

    public GetWorkitemRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkitemRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkitemRelationsResponseBodyRelationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aliyun_1384605</p>
         */
        @NameInMap("assignedTo")
        public String assignedTo;

        /**
         * <strong>example:</strong>
         * <p>Req</p>
         */
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        /**
         * <strong>example:</strong>
         * <p>1667205617061</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1667205617089</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>deafe5f33xxxxx6a259d8dafd</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>2b856dxxxxxxb61d93676255ba</p>
         */
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        @NameInMap("subject")
        public String subject;

        /**
         * <strong>example:</strong>
         * <p>9uy29901re573f561d69jn40</p>
         */
        @NameInMap("workitemTypeIdentifier")
        public String workitemTypeIdentifier;

        public static GetWorkitemRelationsResponseBodyRelationList build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemRelationsResponseBodyRelationList self = new GetWorkitemRelationsResponseBodyRelationList();
            return TeaModel.build(map, self);
        }

        public GetWorkitemRelationsResponseBodyRelationList setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public GetWorkitemRelationsResponseBodyRelationList setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public GetWorkitemRelationsResponseBodyRelationList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetWorkitemRelationsResponseBodyRelationList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetWorkitemRelationsResponseBodyRelationList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkitemRelationsResponseBodyRelationList setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public GetWorkitemRelationsResponseBodyRelationList setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetWorkitemRelationsResponseBodyRelationList setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

    }

}
