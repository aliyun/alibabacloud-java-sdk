// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PageBean")
    public SearchAlertContactResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactResponseBody self = new SearchAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactResponseBody setPageBean(SearchAlertContactResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchAlertContactResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchAlertContactResponseBodyPageBeanContacts extends TeaModel {
        /**
         * <p>The ID of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The contact group to which the contact belongs. If your contacts are added to multiple contact groups, the contact groups are separated by vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>Default Group | SRE Group</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The timestamp generated when the alert contact was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1572349025000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=91f2f6">https://oapi.dingtalk.com/robot/send?access_token=91f2f6</a>****</p>
         */
        @NameInMap("DingRobot")
        public String dingRobot;

        /**
         * <p>The email address of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The mobile number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111*****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the alert contact receives system notifications. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The alert contact receives system notifications.</li>
         * <li><code>false</code>: The alert contact does not receive system notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemNoc")
        public Boolean systemNoc;

        /**
         * <p>The timestamp generated when the alert contact was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1580258717000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>113197164949****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The information about the webhook.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;body\&quot;:\&quot;{   \\\&quot;msg_type\\\&quot;: \\\&quot;text\\\&quot;,   \\\&quot;content\\\&quot;: {     \\\&quot;text\\\&quot;: \\\&quot;$content\\\&quot;   } }\&quot;,\&quot;header\&quot;:{\&quot;Arms-Content-Type\&quot;:\&quot;json\&quot;},\&quot;method\&quot;:\&quot;post\&quot;,\&quot;params\&quot;:{},\&quot;url\&quot;:\&quot;https://<em><strong>&quot;,\&quot;userId\&quot;:\&quot;1131971649</strong></em>\&quot;}&quot;,</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static SearchAlertContactResponseBodyPageBeanContacts build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactResponseBodyPageBeanContacts self = new SearchAlertContactResponseBodyPageBeanContacts();
            return TeaModel.build(map, self);
        }

        public SearchAlertContactResponseBodyPageBeanContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setDingRobot(String dingRobot) {
            this.dingRobot = dingRobot;
            return this;
        }
        public String getDingRobot() {
            return this.dingRobot;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setSystemNoc(Boolean systemNoc) {
            this.systemNoc = systemNoc;
            return this;
        }
        public Boolean getSystemNoc() {
            return this.systemNoc;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class SearchAlertContactResponseBodyPageBean extends TeaModel {
        /**
         * <p>The information about the alert contacts.</p>
         */
        @NameInMap("Contacts")
        public java.util.List<SearchAlertContactResponseBodyPageBeanContacts> contacts;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchAlertContactResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactResponseBodyPageBean self = new SearchAlertContactResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchAlertContactResponseBodyPageBean setContacts(java.util.List<SearchAlertContactResponseBodyPageBeanContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<SearchAlertContactResponseBodyPageBeanContacts> getContacts() {
            return this.contacts;
        }

        public SearchAlertContactResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchAlertContactResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAlertContactResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
