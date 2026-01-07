// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactQueryPageListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<EnterpriseContactQueryPageListResponseBodyData> data;

    /**
     * <p>msg</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>C0A6196F-52A0-5EC9-B8D3-263CEF806EC4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static EnterpriseContactQueryPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactQueryPageListResponseBody self = new EnterpriseContactQueryPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactQueryPageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseContactQueryPageListResponseBody setData(java.util.List<EnterpriseContactQueryPageListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EnterpriseContactQueryPageListResponseBodyData> getData() {
        return this.data;
    }

    public EnterpriseContactQueryPageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseContactQueryPageListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public EnterpriseContactQueryPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public EnterpriseContactQueryPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseContactQueryPageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnterpriseContactQueryPageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public EnterpriseContactQueryPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class EnterpriseContactQueryPageListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xx@xx.xx">xx@xx.xx</a></p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <strong>example:</strong>
         * <p>1xxxxxxxxxx</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        @NameInMap("ContactName")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContactPosition")
        public String contactPosition;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>leId/customerId</p>
         * 
         * <strong>example:</strong>
         * <p>customerId</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SharedContact")
        public Boolean sharedContact;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UpdateDate")
        public Long updateDate;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        public static EnterpriseContactQueryPageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseContactQueryPageListResponseBodyData self = new EnterpriseContactQueryPageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseContactQueryPageListResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public EnterpriseContactQueryPageListResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public EnterpriseContactQueryPageListResponseBodyData setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public EnterpriseContactQueryPageListResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public EnterpriseContactQueryPageListResponseBodyData setContactPosition(String contactPosition) {
            this.contactPosition = contactPosition;
            return this;
        }
        public String getContactPosition() {
            return this.contactPosition;
        }

        public EnterpriseContactQueryPageListResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public EnterpriseContactQueryPageListResponseBodyData setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public EnterpriseContactQueryPageListResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public EnterpriseContactQueryPageListResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public EnterpriseContactQueryPageListResponseBodyData setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public EnterpriseContactQueryPageListResponseBodyData setSharedContact(Boolean sharedContact) {
            this.sharedContact = sharedContact;
            return this;
        }
        public Boolean getSharedContact() {
            return this.sharedContact;
        }

        public EnterpriseContactQueryPageListResponseBodyData setUpdateDate(Long updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public Long getUpdateDate() {
            return this.updateDate;
        }

        public EnterpriseContactQueryPageListResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

}
