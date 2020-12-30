// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListAdviceActionResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public ListAdviceActionResponseBodyItems items;

    public static ListAdviceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdviceActionResponseBody self = new ListAdviceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdviceActionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAdviceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdviceActionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAdviceActionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAdviceActionResponseBody setItems(ListAdviceActionResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListAdviceActionResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListAdviceActionResponseBodyItemsItem extends TeaModel {
        @NameInMap("HostgroupName")
        public String hostgroupName;

        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("Command")
        public String command;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Component")
        public String component;

        @NameInMap("ConfigItemKey")
        public String configItemKey;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListAdviceActionResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListAdviceActionResponseBodyItemsItem self = new ListAdviceActionResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListAdviceActionResponseBodyItemsItem setHostgroupName(String hostgroupName) {
            this.hostgroupName = hostgroupName;
            return this;
        }
        public String getHostgroupName() {
            return this.hostgroupName;
        }

        public ListAdviceActionResponseBodyItemsItem setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public ListAdviceActionResponseBodyItemsItem setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ListAdviceActionResponseBodyItemsItem setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListAdviceActionResponseBodyItemsItem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAdviceActionResponseBodyItemsItem setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public ListAdviceActionResponseBodyItemsItem setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public ListAdviceActionResponseBodyItemsItem setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListAdviceActionResponseBodyItemsItem setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAdviceActionResponseBodyItemsItem setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListAdviceActionResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListAdviceActionResponseBodyItemsItem> item;

        public static ListAdviceActionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAdviceActionResponseBodyItems self = new ListAdviceActionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAdviceActionResponseBodyItems setItem(java.util.List<ListAdviceActionResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListAdviceActionResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
