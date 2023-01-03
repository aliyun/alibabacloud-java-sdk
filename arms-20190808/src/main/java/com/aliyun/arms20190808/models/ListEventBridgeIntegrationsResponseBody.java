// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEventBridgeIntegrationsResponseBody extends TeaModel {
    // The information about EventBridge integrations on each page.
    @NameInMap("PageBean")
    public ListEventBridgeIntegrationsResponseBodyPageBean pageBean;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListEventBridgeIntegrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventBridgeIntegrationsResponseBody self = new ListEventBridgeIntegrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventBridgeIntegrationsResponseBody setPageBean(ListEventBridgeIntegrationsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListEventBridgeIntegrationsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListEventBridgeIntegrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations extends TeaModel {
        // The description of the EventBridge integration.
        @NameInMap("Description")
        public String description;

        // The ID of the EventBridge integration.
        @NameInMap("Id")
        public Long id;

        // The name of the EventBridge integration.
        @NameInMap("Name")
        public String name;

        public static ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations build(java.util.Map<String, ?> map) throws Exception {
            ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations self = new ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations();
            return TeaModel.build(map, self);
        }

        public ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEventBridgeIntegrationsResponseBodyPageBean extends TeaModel {
        // The EventBridge integrations.
        @NameInMap("EventBridgeIntegrations")
        public java.util.List<ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations> eventBridgeIntegrations;

        // The number of the page returned.
        @NameInMap("Page")
        public Long page;

        // The number of entries that are returned on each page.
        @NameInMap("Size")
        public Long size;

        // The total number of EventBridge integrations that are returned.
        @NameInMap("Total")
        public Long total;

        public static ListEventBridgeIntegrationsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListEventBridgeIntegrationsResponseBodyPageBean self = new ListEventBridgeIntegrationsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListEventBridgeIntegrationsResponseBodyPageBean setEventBridgeIntegrations(java.util.List<ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations> eventBridgeIntegrations) {
            this.eventBridgeIntegrations = eventBridgeIntegrations;
            return this;
        }
        public java.util.List<ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations> getEventBridgeIntegrations() {
            return this.eventBridgeIntegrations;
        }

        public ListEventBridgeIntegrationsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListEventBridgeIntegrationsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListEventBridgeIntegrationsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
