// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConsumedServicesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about consumed services.</p>
     */
    @NameInMap("ConsumedServicesList")
    public ListConsumedServicesResponseBodyConsumedServicesList consumedServicesList;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConsumedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesResponseBody self = new ListConsumedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListConsumedServicesResponseBody setConsumedServicesList(ListConsumedServicesResponseBodyConsumedServicesList consumedServicesList) {
        this.consumedServicesList = consumedServicesList;
        return this;
    }
    public ListConsumedServicesResponseBodyConsumedServicesList getConsumedServicesList() {
        return this.consumedServicesList;
    }

    public ListConsumedServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups extends TeaModel {
        @NameInMap("group")
        public java.util.List<String> group;

        public static ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups build(java.util.Map<String, ?> map) throws Exception {
            ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups self = new ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups();
            return TeaModel.build(map, self);
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

    }

    public static class ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps extends TeaModel {
        @NameInMap("ip")
        public java.util.List<String> ip;

        public static ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps build(java.util.Map<String, ?> map) throws Exception {
            ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps self = new ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps();
            return TeaModel.build(map, self);
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether the application runs in a Docker container. Valid values:</p>
         * <br>
         * <p>*   true: The application runs in a Docker container.</p>
         * <p>*   false: The application does not run in a Docker container.</p>
         */
        @NameInMap("DockerApplication")
        public Boolean dockerApplication;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("Group2Ip")
        public String group2Ip;

        @NameInMap("Groups")
        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups groups;

        @NameInMap("Ips")
        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps ips;

        /**
         * <p>The name of the consumed service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the consumed service.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the consumed service.</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices build(java.util.Map<String, ?> map) throws Exception {
            ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices self = new ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices();
            return TeaModel.build(map, self);
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setDockerApplication(Boolean dockerApplication) {
            this.dockerApplication = dockerApplication;
            return this;
        }
        public Boolean getDockerApplication() {
            return this.dockerApplication;
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setGroup2Ip(String group2Ip) {
            this.group2Ip = group2Ip;
            return this;
        }
        public String getGroup2Ip() {
            return this.group2Ip;
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setGroups(ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups groups) {
            this.groups = groups;
            return this;
        }
        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesGroups getGroups() {
            return this.groups;
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setIps(ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps ips) {
            this.ips = ips;
            return this;
        }
        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServicesIps getIps() {
            return this.ips;
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListConsumedServicesResponseBodyConsumedServicesList extends TeaModel {
        @NameInMap("ListConsumedServices")
        public java.util.List<ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices> listConsumedServices;

        public static ListConsumedServicesResponseBodyConsumedServicesList build(java.util.Map<String, ?> map) throws Exception {
            ListConsumedServicesResponseBodyConsumedServicesList self = new ListConsumedServicesResponseBodyConsumedServicesList();
            return TeaModel.build(map, self);
        }

        public ListConsumedServicesResponseBodyConsumedServicesList setListConsumedServices(java.util.List<ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices> listConsumedServices) {
            this.listConsumedServices = listConsumedServices;
            return this;
        }
        public java.util.List<ListConsumedServicesResponseBodyConsumedServicesListListConsumedServices> getListConsumedServices() {
            return this.listConsumedServices;
        }

    }

}
