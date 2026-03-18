// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListPackagesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListPackagesResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static ListPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackagesResponseBody self = new ListPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackagesResponseBody setData(ListPackagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPackagesResponseBodyData getData() {
        return this.data;
    }

    public ListPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPackagesResponseBodyDataCreatedPackages extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("name")
        public String name;

        public static ListPackagesResponseBodyDataCreatedPackages build(java.util.Map<String, ?> map) throws Exception {
            ListPackagesResponseBodyDataCreatedPackages self = new ListPackagesResponseBodyDataCreatedPackages();
            return TeaModel.build(map, self);
        }

        public ListPackagesResponseBodyDataCreatedPackages setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPackagesResponseBodyDataCreatedPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListPackagesResponseBodyDataInstalledPackages extends TeaModel {
        @NameInMap("installTime")
        public Long installTime;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceProject")
        public String sourceProject;

        @NameInMap("status")
        public String status;

        public static ListPackagesResponseBodyDataInstalledPackages build(java.util.Map<String, ?> map) throws Exception {
            ListPackagesResponseBodyDataInstalledPackages self = new ListPackagesResponseBodyDataInstalledPackages();
            return TeaModel.build(map, self);
        }

        public ListPackagesResponseBodyDataInstalledPackages setInstallTime(Long installTime) {
            this.installTime = installTime;
            return this;
        }
        public Long getInstallTime() {
            return this.installTime;
        }

        public ListPackagesResponseBodyDataInstalledPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPackagesResponseBodyDataInstalledPackages setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public ListPackagesResponseBodyDataInstalledPackages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListPackagesResponseBodyData extends TeaModel {
        @NameInMap("createdPackages")
        public java.util.List<ListPackagesResponseBodyDataCreatedPackages> createdPackages;

        @NameInMap("installedPackages")
        public java.util.List<ListPackagesResponseBodyDataInstalledPackages> installedPackages;

        public static ListPackagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPackagesResponseBodyData self = new ListPackagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPackagesResponseBodyData setCreatedPackages(java.util.List<ListPackagesResponseBodyDataCreatedPackages> createdPackages) {
            this.createdPackages = createdPackages;
            return this;
        }
        public java.util.List<ListPackagesResponseBodyDataCreatedPackages> getCreatedPackages() {
            return this.createdPackages;
        }

        public ListPackagesResponseBodyData setInstalledPackages(java.util.List<ListPackagesResponseBodyDataInstalledPackages> installedPackages) {
            this.installedPackages = installedPackages;
            return this;
        }
        public java.util.List<ListPackagesResponseBodyDataInstalledPackages> getInstalledPackages() {
            return this.installedPackages;
        }

    }

}
