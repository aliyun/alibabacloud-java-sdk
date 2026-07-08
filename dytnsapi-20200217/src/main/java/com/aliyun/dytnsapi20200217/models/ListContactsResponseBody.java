// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ListContactsResponseBody extends TeaModel {
    /**
     * <p>The status code. <code>OK</code> indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>An array of contact information objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListContactsResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The contact email.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx @alibaba-inc.com</p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>黄勇</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The contact mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>19211111111</p>
         */
        @NameInMap("ContactPhone")
        public String contactPhone;

        /**
         * <p>The email status.</p>
         * <ul>
         * <li><p>1: Normal</p>
         * </li>
         * <li><p>0: Abnormal</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MailStatus")
        public Integer mailStatus;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Main")
        public Integer main;

        /**
         * <p>Specifies whether the number status warning is enabled.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenStatusWarning")
        public Boolean openStatusWarning;

        /**
         * <p>Specifies whether the number attribution query warning is enabled.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpentAttributionWarning")
        public Boolean opentAttributionWarning;

        /**
         * <p>The number status.</p>
         * <ul>
         * <li><p>1: Normal</p>
         * </li>
         * <li><p>0: Abnormal</p>
         * </li>
         * </ul>
         * 
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
