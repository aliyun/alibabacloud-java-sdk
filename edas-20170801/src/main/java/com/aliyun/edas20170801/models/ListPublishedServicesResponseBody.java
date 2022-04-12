// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListPublishedServicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PublishedServicesList")
    public ListPublishedServicesResponseBodyPublishedServicesList publishedServicesList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPublishedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesResponseBody self = new ListPublishedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPublishedServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPublishedServicesResponseBody setPublishedServicesList(ListPublishedServicesResponseBodyPublishedServicesList publishedServicesList) {
        this.publishedServicesList = publishedServicesList;
        return this;
    }
    public ListPublishedServicesResponseBodyPublishedServicesList getPublishedServicesList() {
        return this.publishedServicesList;
    }

    public ListPublishedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups extends TeaModel {
        @NameInMap("group")
        public java.util.List<String> group;

        public static ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups self = new ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups();
            return TeaModel.build(map, self);
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

    }

    public static class ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps extends TeaModel {
        @NameInMap("ip")
        public java.util.List<String> ip;

        public static ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps self = new ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps();
            return TeaModel.build(map, self);
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("DockerApplication")
        public Boolean dockerApplication;

        @NameInMap("Group2Ip")
        public String group2Ip;

        @NameInMap("Groups")
        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups groups;

        @NameInMap("Ips")
        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps ips;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices self = new ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices();
            return TeaModel.build(map, self);
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setDockerApplication(Boolean dockerApplication) {
            this.dockerApplication = dockerApplication;
            return this;
        }
        public Boolean getDockerApplication() {
            return this.dockerApplication;
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setGroup2Ip(String group2Ip) {
            this.group2Ip = group2Ip;
            return this;
        }
        public String getGroup2Ip() {
            return this.group2Ip;
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setGroups(ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups groups) {
            this.groups = groups;
            return this;
        }
        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesGroups getGroups() {
            return this.groups;
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setIps(ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps ips) {
            this.ips = ips;
            return this;
        }
        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServicesIps getIps() {
            return this.ips;
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListPublishedServicesResponseBodyPublishedServicesList extends TeaModel {
        @NameInMap("ListPublishedServices")
        public java.util.List<ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices> listPublishedServices;

        public static ListPublishedServicesResponseBodyPublishedServicesList build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedServicesResponseBodyPublishedServicesList self = new ListPublishedServicesResponseBodyPublishedServicesList();
            return TeaModel.build(map, self);
        }

        public ListPublishedServicesResponseBodyPublishedServicesList setListPublishedServices(java.util.List<ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices> listPublishedServices) {
            this.listPublishedServices = listPublishedServices;
            return this;
        }
        public java.util.List<ListPublishedServicesResponseBodyPublishedServicesListListPublishedServices> getListPublishedServices() {
            return this.listPublishedServices;
        }

    }

}
