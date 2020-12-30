// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceQuickLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QuickLinkList")
    public ListClusterServiceQuickLinkResponseBodyQuickLinkList quickLinkList;

    public static ListClusterServiceQuickLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceQuickLinkResponseBody self = new ListClusterServiceQuickLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceQuickLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterServiceQuickLinkResponseBody setQuickLinkList(ListClusterServiceQuickLinkResponseBodyQuickLinkList quickLinkList) {
        this.quickLinkList = quickLinkList;
        return this;
    }
    public ListClusterServiceQuickLinkResponseBodyQuickLinkList getQuickLinkList() {
        return this.quickLinkList;
    }

    public static class ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink extends TeaModel {
        @NameInMap("ServiceDisplayName")
        public String serviceDisplayName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("QuickLinkAddress")
        public String quickLinkAddress;

        @NameInMap("Port")
        public String port;

        public static ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink self = new ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink setServiceDisplayName(String serviceDisplayName) {
            this.serviceDisplayName = serviceDisplayName;
            return this;
        }
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        public ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink setQuickLinkAddress(String quickLinkAddress) {
            this.quickLinkAddress = quickLinkAddress;
            return this;
        }
        public String getQuickLinkAddress() {
            return this.quickLinkAddress;
        }

        public ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ListClusterServiceQuickLinkResponseBodyQuickLinkList extends TeaModel {
        @NameInMap("QuickLink")
        public java.util.List<ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink> quickLink;

        public static ListClusterServiceQuickLinkResponseBodyQuickLinkList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceQuickLinkResponseBodyQuickLinkList self = new ListClusterServiceQuickLinkResponseBodyQuickLinkList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceQuickLinkResponseBodyQuickLinkList setQuickLink(java.util.List<ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink> quickLink) {
            this.quickLink = quickLink;
            return this;
        }
        public java.util.List<ListClusterServiceQuickLinkResponseBodyQuickLinkListQuickLink> getQuickLink() {
            return this.quickLink;
        }

    }

}
