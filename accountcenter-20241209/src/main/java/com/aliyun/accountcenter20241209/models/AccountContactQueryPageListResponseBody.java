// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactQueryPageListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AccountContactQueryPageListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>27A90A55-120A-59DC-812E-62448D440E95</p>
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
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static AccountContactQueryPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccountContactQueryPageListResponseBody self = new AccountContactQueryPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public AccountContactQueryPageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AccountContactQueryPageListResponseBody setData(java.util.List<AccountContactQueryPageListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AccountContactQueryPageListResponseBodyData> getData() {
        return this.data;
    }

    public AccountContactQueryPageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AccountContactQueryPageListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public AccountContactQueryPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public AccountContactQueryPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccountContactQueryPageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AccountContactQueryPageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public AccountContactQueryPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class AccountContactQueryPageListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@xxx.xx">xxx@xxx.xx</a></p>
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

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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
         * <p>xxx</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        public static AccountContactQueryPageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccountContactQueryPageListResponseBodyData self = new AccountContactQueryPageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccountContactQueryPageListResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public AccountContactQueryPageListResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public AccountContactQueryPageListResponseBodyData setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public AccountContactQueryPageListResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public AccountContactQueryPageListResponseBodyData setContactPosition(String contactPosition) {
            this.contactPosition = contactPosition;
            return this;
        }
        public String getContactPosition() {
            return this.contactPosition;
        }

        public AccountContactQueryPageListResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public AccountContactQueryPageListResponseBodyData setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public AccountContactQueryPageListResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public AccountContactQueryPageListResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public AccountContactQueryPageListResponseBodyData setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public AccountContactQueryPageListResponseBodyData setSharedContact(Boolean sharedContact) {
            this.sharedContact = sharedContact;
            return this;
        }
        public Boolean getSharedContact() {
            return this.sharedContact;
        }

        public AccountContactQueryPageListResponseBodyData setUpdateDate(Long updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public Long getUpdateDate() {
            return this.updateDate;
        }

        public AccountContactQueryPageListResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

}
