// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSoftwaresResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Softwares")
    public ListSoftwaresResponseBodySoftwares softwares;

    public static ListSoftwaresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwaresResponseBody self = new ListSoftwaresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSoftwaresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSoftwaresResponseBody setSoftwares(ListSoftwaresResponseBodySoftwares softwares) {
        this.softwares = softwares;
        return this;
    }
    public ListSoftwaresResponseBodySoftwares getSoftwares() {
        return this.softwares;
    }

    public static class ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo extends TeaModel {
        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo self = new ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications extends TeaModel {
        @NameInMap("ApplicationInfo")
        public java.util.List<ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo> applicationInfo;

        public static ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications self = new ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications setApplicationInfo(java.util.List<ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo> applicationInfo) {
            this.applicationInfo = applicationInfo;
            return this;
        }
        public java.util.List<ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo> getApplicationInfo() {
            return this.applicationInfo;
        }

    }

    public static class ListSoftwaresResponseBodySoftwaresSoftwareInfo extends TeaModel {
        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("SchedulerVersion")
        public String schedulerVersion;

        @NameInMap("AccountVersion")
        public String accountVersion;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        @NameInMap("Applications")
        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications applications;

        public static ListSoftwaresResponseBodySoftwaresSoftwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwaresSoftwareInfo self = new ListSoftwaresResponseBodySoftwaresSoftwareInfo();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setSchedulerVersion(String schedulerVersion) {
            this.schedulerVersion = schedulerVersion;
            return this;
        }
        public String getSchedulerVersion() {
            return this.schedulerVersion;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setAccountVersion(String accountVersion) {
            this.accountVersion = accountVersion;
            return this;
        }
        public String getAccountVersion() {
            return this.accountVersion;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setApplications(ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications applications) {
            this.applications = applications;
            return this;
        }
        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications getApplications() {
            return this.applications;
        }

    }

    public static class ListSoftwaresResponseBodySoftwares extends TeaModel {
        @NameInMap("SoftwareInfo")
        public java.util.List<ListSoftwaresResponseBodySoftwaresSoftwareInfo> softwareInfo;

        public static ListSoftwaresResponseBodySoftwares build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwares self = new ListSoftwaresResponseBodySoftwares();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwares setSoftwareInfo(java.util.List<ListSoftwaresResponseBodySoftwaresSoftwareInfo> softwareInfo) {
            this.softwareInfo = softwareInfo;
            return this;
        }
        public java.util.List<ListSoftwaresResponseBodySoftwaresSoftwareInfo> getSoftwareInfo() {
            return this.softwareInfo;
        }

    }

}
