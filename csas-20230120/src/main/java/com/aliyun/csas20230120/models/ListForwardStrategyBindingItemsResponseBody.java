// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListForwardStrategyBindingItemsResponseBody extends TeaModel {
    @NameInMap("ForwardStrategyBindingItemsList")
    public java.util.List<ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList> forwardStrategyBindingItemsList;

    /**
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ItemType")
    public String itemType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5F79AE39-6622-5292-87EF-DE45631DE4D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListForwardStrategyBindingItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListForwardStrategyBindingItemsResponseBody self = new ListForwardStrategyBindingItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListForwardStrategyBindingItemsResponseBody setForwardStrategyBindingItemsList(java.util.List<ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList> forwardStrategyBindingItemsList) {
        this.forwardStrategyBindingItemsList = forwardStrategyBindingItemsList;
        return this;
    }
    public java.util.List<ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList> getForwardStrategyBindingItemsList() {
        return this.forwardStrategyBindingItemsList;
    }

    public ListForwardStrategyBindingItemsResponseBody setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public ListForwardStrategyBindingItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pa-application-104b6b97b7f0c5d9</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>437008</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <strong>example:</strong>
         * <p>tag-4c8b988bb0ffdfb3</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>nieshirui.nsr</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <strong>example:</strong>
         * <p>ug-xxxxxx</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <strong>example:</strong>
         * <p>aaaaa</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems build(java.util.Map<String, ?> map) throws Exception {
            ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems self = new ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems();
            return TeaModel.build(map, self);
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fs-41a7891ff6568421</p>
         */
        @NameInMap("ForwardId")
        public String forwardId;

        @NameInMap("Items")
        public java.util.List<ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems> items;

        /**
         * <strong>example:</strong>
         * <p>UserGroupAll</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        public static ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList build(java.util.Map<String, ?> map) throws Exception {
            ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList self = new ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList();
            return TeaModel.build(map, self);
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList setForwardId(String forwardId) {
            this.forwardId = forwardId;
            return this;
        }
        public String getForwardId() {
            return this.forwardId;
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList setItems(java.util.List<ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsListItems> getItems() {
            return this.items;
        }

        public ListForwardStrategyBindingItemsResponseBodyForwardStrategyBindingItemsList setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

    }

}
