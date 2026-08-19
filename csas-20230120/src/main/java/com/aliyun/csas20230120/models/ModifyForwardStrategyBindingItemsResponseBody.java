// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyForwardStrategyBindingItemsResponseBody extends TeaModel {
    /**
     * <p>The binding items of the forwarding rule after this modification.</p>
     */
    @NameInMap("ForwardStrategyBindingItems")
    public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems forwardStrategyBindingItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5F79AE39-6622-5292-87EF-DE45631DE4D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyForwardStrategyBindingItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardStrategyBindingItemsResponseBody self = new ModifyForwardStrategyBindingItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyForwardStrategyBindingItemsResponseBody setForwardStrategyBindingItems(ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems forwardStrategyBindingItems) {
        this.forwardStrategyBindingItems = forwardStrategyBindingItems;
        return this;
    }
    public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems getForwardStrategyBindingItems() {
        return this.forwardStrategyBindingItems;
    }

    public ModifyForwardStrategyBindingItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems extends TeaModel {
        /**
         * <p>The private network access application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-104b6b97b7f0c5d9</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The private network access application name.</p>
         * 
         * <strong>example:</strong>
         * <p>OA System</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The private network access tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-4c8b988bb0ffdfb3</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Finance System</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-3f9a2c7e10b4d856</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems build(java.util.Map<String, ?> map) throws Exception {
            ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems self = new ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems();
            return TeaModel.build(map, self);
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems extends TeaModel {
        /**
         * <p>The forwarding rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-849ac29396d9ea98</p>
         */
        @NameInMap("ForwardId")
        public String forwardId;

        /**
         * <p>The binding content. This parameter is not returned when MatchMode is <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>.</p>
         */
        @NameInMap("Items")
        public java.util.List<ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems> items;

        /**
         * <p>The policy matching target type. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: associates with all users.</li>
         * <li><strong>UserGroupNormal</strong>: associates with specific user groups.</li>
         * <li><strong>ApplicationAll</strong>: all private network applications.</li>
         * <li><strong>Application</strong>: specific private network applications.</li>
         * <li><strong>Tag</strong>: private network application tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        public static ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems build(java.util.Map<String, ?> map) throws Exception {
            ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems self = new ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems();
            return TeaModel.build(map, self);
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems setForwardId(String forwardId) {
            this.forwardId = forwardId;
            return this;
        }
        public String getForwardId() {
            return this.forwardId;
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems setItems(java.util.List<ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsItems> getItems() {
            return this.items;
        }

        public ModifyForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItems setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

    }

}
