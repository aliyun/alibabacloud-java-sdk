// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEventBridgeIntegrationsResponseBody extends TeaModel {
    /**
     * <p>The information about EventBridge integrations on each page.</p>
     */
    @NameInMap("PageBean")
    public ListEventBridgeIntegrationsResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the EventBridge integration.</p>
     */
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
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

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
        @NameInMap("EventBridgeIntegrations")
        public java.util.List<ListEventBridgeIntegrationsResponseBodyPageBeanEventBridgeIntegrations> eventBridgeIntegrations;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Page")
        public Long page;

        @NameInMap("Size")
        public Long size;

        /**
         * <p>The description of the EventBridge integration.</p>
         */
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
