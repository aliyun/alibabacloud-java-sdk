// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ListContactsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListContactsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactsResponseBody self = new ListContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContactsResponseBody setData(java.util.List<ListContactsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListContactsResponseBodyData> getData() {
        return this.data;
    }

    public ListContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListContactsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx @alibaba-inc.com</p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("ContactName")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>19211111111</p>
         */
        @NameInMap("ContactPhone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MailStatus")
        public Integer mailStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Main")
        public Integer main;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenStatusWarning")
        public Boolean openStatusWarning;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpentAttributionWarning")
        public Boolean opentAttributionWarning;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PhoneStatus")
        public Integer phoneStatus;

        public static ListContactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContactsResponseBodyData self = new ListContactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContactsResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ListContactsResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ListContactsResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListContactsResponseBodyData setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public ListContactsResponseBodyData setMailStatus(Integer mailStatus) {
            this.mailStatus = mailStatus;
            return this;
        }
        public Integer getMailStatus() {
            return this.mailStatus;
        }

        public ListContactsResponseBodyData setMain(Integer main) {
            this.main = main;
            return this;
        }
        public Integer getMain() {
            return this.main;
        }

        public ListContactsResponseBodyData setOpenStatusWarning(Boolean openStatusWarning) {
            this.openStatusWarning = openStatusWarning;
            return this;
        }
        public Boolean getOpenStatusWarning() {
            return this.openStatusWarning;
        }

        public ListContactsResponseBodyData setOpentAttributionWarning(Boolean opentAttributionWarning) {
            this.opentAttributionWarning = opentAttributionWarning;
            return this;
        }
        public Boolean getOpentAttributionWarning() {
            return this.opentAttributionWarning;
        }

        public ListContactsResponseBodyData setPhoneStatus(Integer phoneStatus) {
            this.phoneStatus = phoneStatus;
            return this;
        }
        public Integer getPhoneStatus() {
            return this.phoneStatus;
        }

    }

}
