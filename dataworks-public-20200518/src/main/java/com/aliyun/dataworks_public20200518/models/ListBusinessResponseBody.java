// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBusinessResponseBody extends TeaModel {
    /**
     * <p>The information about the workflows returned.</p>
     */
    @NameInMap("Data")
    public ListBusinessResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListBusinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessResponseBody self = new ListBusinessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusinessResponseBody setData(ListBusinessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBusinessResponseBodyData getData() {
        return this.data;
    }

    public ListBusinessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListBusinessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBusinessResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBusinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBusinessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBusinessResponseBodyDataBusiness extends TeaModel {
        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The name of the workflow.</p>
         */
        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <p>The description of the workflow.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The owner of the workflow.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace to which the workflow belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The module to which the workflow belongs. Valid values: NORMAL and MANUAL_BIZ. The value NORMAL indicates that the workflow belongs to auto triggered workflows. The value MANUAL_BIZ indicates that the workflow belongs to manually triggered workflows.</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static ListBusinessResponseBodyDataBusiness build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseBodyDataBusiness self = new ListBusinessResponseBodyDataBusiness();
            return TeaModel.build(map, self);
        }

        public ListBusinessResponseBodyDataBusiness setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListBusinessResponseBodyDataBusiness setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public ListBusinessResponseBodyDataBusiness setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBusinessResponseBodyDataBusiness setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBusinessResponseBodyDataBusiness setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBusinessResponseBodyDataBusiness setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListBusinessResponseBodyData extends TeaModel {
        /**
         * <p>The details of the workflow.</p>
         */
        @NameInMap("Business")
        public java.util.List<ListBusinessResponseBodyDataBusiness> business;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBusinessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseBodyData self = new ListBusinessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBusinessResponseBodyData setBusiness(java.util.List<ListBusinessResponseBodyDataBusiness> business) {
            this.business = business;
            return this;
        }
        public java.util.List<ListBusinessResponseBodyDataBusiness> getBusiness() {
            return this.business;
        }

        public ListBusinessResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBusinessResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBusinessResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
