// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListPackagesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListPackagesResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b4aa16677927210252786e4cb6</p>
     */
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
        /**
         * <p>The time when the package was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-02T02:30:34Z</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The name of the package.</p>
         * 
         * <strong>example:</strong>
         * <p>packageA</p>
         */
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
        /**
         * <p>The time when the package was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-02T02:30:34Z</p>
         */
        @NameInMap("installTime")
        public Long installTime;

        /**
         * <p>The name of the package.</p>
         * 
         * <strong>example:</strong>
         * <p>packageB</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The project to which the package belongs. This parameter is required if the package is installed in the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>projectB</p>
         */
        @NameInMap("sourceProject")
        public String sourceProject;

        /**
         * <p>The status of the package.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
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
        /**
         * <p>The packages that were created.</p>
         */
        @NameInMap("createdPackages")
        public java.util.List<ListPackagesResponseBodyDataCreatedPackages> createdPackages;

        /**
         * <p>The packages that were installed.</p>
         */
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
