// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListBusinessResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListBusinessResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
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
         * <strong>example:</strong>
         * <p>3000001</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        @NameInMap("BusinessName")
        public String businessName;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>34824327****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
        @NameInMap("Business")
        public java.util.List<ListBusinessResponseBodyDataBusiness> business;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>13</p>
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
