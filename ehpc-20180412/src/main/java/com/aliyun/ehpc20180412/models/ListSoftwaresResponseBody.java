// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSoftwaresResponseBody extends TeaModel {
    /**
     * <p>The list of the information about the software installed in the cluster.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the scheduler. Valid values:</p>
     * <br>
     * <p>*   pbs</p>
     * <p>*   pbs19</p>
     * <p>*   slurm</p>
     * <p>*   slurm19</p>
     * <p>*   slurm20</p>
     * <p>*   opengridscheduler</p>
     * <p>*   deadline</p>
     * <p>*   gridengine</p>
     * <p>*   cube</p>
     * <p>*   custom</p>
     */
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
        /**
         * <p>The version of the software.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag of the software.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The name of the software.</p>
         */
        @NameInMap("Tag")
        public String tag;

        @NameInMap("Version")
        public String version;

        public static ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo self = new ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplicationsApplicationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
        /**
         * <p>The version of the E-HPC client.</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The service type of the domain account. Valid values:</p>
         * <br>
         * <p>*   nis</p>
         * <p>*   ldap</p>
         */
        @NameInMap("AccountVersion")
        public String accountVersion;

        /**
         * <p>Indicates whether the software is required. Valid values:</p>
         * <br>
         * <p>*   false: optional</p>
         * <p>*   true: required</p>
         */
        @NameInMap("Applications")
        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications applications;

        /**
         * <p>The list of the software in the cluster.</p>
         */
        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        /**
         * <p>The version of the scheduler.</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The image tag of the cluster.</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The version of the domain account service.</p>
         */
        @NameInMap("SchedulerVersion")
        public String schedulerVersion;

        public static ListSoftwaresResponseBodySoftwaresSoftwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodySoftwaresSoftwareInfo self = new ListSoftwaresResponseBodySoftwaresSoftwareInfo();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setAccountVersion(String accountVersion) {
            this.accountVersion = accountVersion;
            return this;
        }
        public String getAccountVersion() {
            return this.accountVersion;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setApplications(ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications applications) {
            this.applications = applications;
            return this;
        }
        public ListSoftwaresResponseBodySoftwaresSoftwareInfoApplications getApplications() {
            return this.applications;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListSoftwaresResponseBodySoftwaresSoftwareInfo setSchedulerVersion(String schedulerVersion) {
            this.schedulerVersion = schedulerVersion;
            return this;
        }
        public String getSchedulerVersion() {
            return this.schedulerVersion;
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
