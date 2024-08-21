// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListContactResponseBody extends TeaModel {
    /**
     * <p>The contacts.</p>
     */
    @NameInMap("ContactList")
    public java.util.List<ListContactResponseBodyContactList> contactList;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The keyword used in the fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>186</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of certificates per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactResponseBody self = new ListContactResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactResponseBody setContactList(java.util.List<ListContactResponseBodyContactList> contactList) {
        this.contactList = contactList;
        return this;
    }
    public java.util.List<ListContactResponseBodyContactList> getContactList() {
        return this.contactList;
    }

    public ListContactResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListContactResponseBody setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListContactResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListContactResponseBodyContactList extends TeaModel {
        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>519580</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The email address of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the email address passed the verification.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmailStatus")
        public Integer emailStatus;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>139****8888</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>Indicates whether the phone number was verified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MobileStatus")
        public Integer mobileStatus;

        /**
         * <p>The name of the contact.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The webhook URL of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/XXX%5C%5C%22,%5C%5C%22https://oapi.dingtalk.com/robot/send?access_token=XXX%5C%5C%22,%5C%5C%22https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=XXX%5C%5C%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/XXX\\&quot;,\\&quot;https://oapi.dingtalk.com/robot/send?access_token=XXX\\&quot;,\\&quot;https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=XXX\\&quot;]</a></p>
         */
        @NameInMap("Webhooks")
        public String webhooks;

        public static ListContactResponseBodyContactList build(java.util.Map<String, ?> map) throws Exception {
            ListContactResponseBodyContactList self = new ListContactResponseBodyContactList();
            return TeaModel.build(map, self);
        }

        public ListContactResponseBodyContactList setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ListContactResponseBodyContactList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListContactResponseBodyContactList setEmailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        public ListContactResponseBodyContactList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListContactResponseBodyContactList setMobileStatus(Integer mobileStatus) {
            this.mobileStatus = mobileStatus;
            return this;
        }
        public Integer getMobileStatus() {
            return this.mobileStatus;
        }

        public ListContactResponseBodyContactList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContactResponseBodyContactList setWebhooks(String webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public String getWebhooks() {
            return this.webhooks;
        }

    }

}
