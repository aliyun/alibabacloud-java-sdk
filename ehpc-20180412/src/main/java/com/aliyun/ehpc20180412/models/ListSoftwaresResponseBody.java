// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSoftwaresResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Softwares")
    public java.util.List<ListSoftwaresResponseBodySoftwares> softwares;

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

    public ListSoftwaresResponseBody setSoftwares(java.util.List<ListSoftwaresResponseBodySoftwares> softwares) {
        this.softwares = softwares;
        return this;
    }
    public java.util.List<ListSoftwaresResponseBodySoftwares> getSoftwares() {
        return this.softwares;
    }

    public static class ListSoftwaresResponseBodySoftwaresApplications extends TeaModel {
        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Version")
        public String version;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Name")
        public String name;

        public static ListSoftwaresResponseBodySoftwaresApplications build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwaresApplications self = new ListSoftwaresResponseBodySoftwaresApplications();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwaresApplications setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListSoftwaresResponseBodySoftwaresApplications setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListSoftwaresResponseBodySoftwaresApplications setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListSoftwaresResponseBodySoftwaresApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListSoftwaresResponseBodySoftwares extends TeaModel {
        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("SchedulerVersion")
        public String schedulerVersion;

        @NameInMap("AccountVersion")
        public String accountVersion;

        @NameInMap("Applications")
        public java.util.List<ListSoftwaresResponseBodySoftwaresApplications> applications;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        public static ListSoftwaresResponseBodySoftwares build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwares self = new ListSoftwaresResponseBodySoftwares();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwares setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListSoftwaresResponseBodySoftwares setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListSoftwaresResponseBodySoftwares setSchedulerVersion(String schedulerVersion) {
            this.schedulerVersion = schedulerVersion;
            return this;
        }
        public String getSchedulerVersion() {
            return this.schedulerVersion;
        }

        public ListSoftwaresResponseBodySoftwares setAccountVersion(String accountVersion) {
            this.accountVersion = accountVersion;
            return this;
        }
        public String getAccountVersion() {
            return this.accountVersion;
        }

        public ListSoftwaresResponseBodySoftwares setApplications(java.util.List<ListSoftwaresResponseBodySoftwaresApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListSoftwaresResponseBodySoftwaresApplications> getApplications() {
            return this.applications;
        }

        public ListSoftwaresResponseBodySoftwares setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListSoftwaresResponseBodySoftwares setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

    }

}
