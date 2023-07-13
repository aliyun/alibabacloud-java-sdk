// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListPreferredEcsTypesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of recommended ECS instances. Each series contains the recommended ECS instance types for various nodes of the E-HPC cluster.</p>
     */
    @NameInMap("Series")
    public ListPreferredEcsTypesResponseBodySeries series;

    /**
     * <p>Indicates whether preemptible instances are supported.</p>
     */
    @NameInMap("SupportSpotInstance")
    public Boolean supportSpotInstance;

    public static ListPreferredEcsTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPreferredEcsTypesResponseBody self = new ListPreferredEcsTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPreferredEcsTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPreferredEcsTypesResponseBody setSeries(ListPreferredEcsTypesResponseBodySeries series) {
        this.series = series;
        return this;
    }
    public ListPreferredEcsTypesResponseBodySeries getSeries() {
        return this.series;
    }

    public ListPreferredEcsTypesResponseBody setSupportSpotInstance(Boolean supportSpotInstance) {
        this.supportSpotInstance = supportSpotInstance;
        return this;
    }
    public Boolean getSupportSpotInstance() {
        return this.supportSpotInstance;
    }

    public static class ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute extends TeaModel {
        @NameInMap("InstanceTypeId")
        public java.util.List<String> instanceTypeId;

        public static ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute self = new ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute setInstanceTypeId(java.util.List<String> instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public java.util.List<String> getInstanceTypeId() {
            return this.instanceTypeId;
        }

    }

    public static class ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin extends TeaModel {
        @NameInMap("InstanceTypeId")
        public java.util.List<String> instanceTypeId;

        public static ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin self = new ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin setInstanceTypeId(java.util.List<String> instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public java.util.List<String> getInstanceTypeId() {
            return this.instanceTypeId;
        }

    }

    public static class ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager extends TeaModel {
        @NameInMap("InstanceTypeId")
        public java.util.List<String> instanceTypeId;

        public static ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager self = new ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager setInstanceTypeId(java.util.List<String> instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public java.util.List<String> getInstanceTypeId() {
            return this.instanceTypeId;
        }

    }

    public static class ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles extends TeaModel {
        /**
         * <p>The list of recommended ECS instance types for compute nodes.</p>
         */
        @NameInMap("Compute")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute compute;

        /**
         * <p>The list of recommended ECS instance types for logon nodes.</p>
         */
        @NameInMap("Login")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin login;

        /**
         * <p>The list of recommended ECS instance types for management nodes.</p>
         */
        @NameInMap("Manager")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager manager;

        public static ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles self = new ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles setCompute(ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute compute) {
            this.compute = compute;
            return this;
        }
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute getCompute() {
            return this.compute;
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles setLogin(ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin login) {
            this.login = login;
            return this;
        }
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin getLogin() {
            return this.login;
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles setManager(ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager manager) {
            this.manager = manager;
            return this;
        }
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager getManager() {
            return this.manager;
        }

    }

    public static class ListPreferredEcsTypesResponseBodySeriesSeriesInfo extends TeaModel {
        /**
         * <p>Recommended instance types for nodes in an E-HPC cluser.</p>
         */
        @NameInMap("Roles")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles roles;

        /**
         * <p>The ECS instance series ID. Valid values:</p>
         * <br>
         * <p>*   HighCompute: compute-optimized instance families</p>
         * <p>*   HighMem: memory-optimized instance families</p>
         * <p>*   GPU: GPU-accelerated instance families</p>
         * <p>*   All: all instance families</p>
         */
        @NameInMap("SeriesId")
        public String seriesId;

        /**
         * <p>The instance series name. Valid values:</p>
         * <br>
         * <p>*   SeriesHighCompute</p>
         * <p>*   SeriesHighMem</p>
         * <p>*   SeriesGPU</p>
         * <p>*   SeriesAll</p>
         */
        @NameInMap("SeriesName")
        public String seriesName;

        public static ListPreferredEcsTypesResponseBodySeriesSeriesInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesSeriesInfo self = new ListPreferredEcsTypesResponseBodySeriesSeriesInfo();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfo setRoles(ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles roles) {
            this.roles = roles;
            return this;
        }
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles getRoles() {
            return this.roles;
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfo setSeriesId(String seriesId) {
            this.seriesId = seriesId;
            return this;
        }
        public String getSeriesId() {
            return this.seriesId;
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfo setSeriesName(String seriesName) {
            this.seriesName = seriesName;
            return this;
        }
        public String getSeriesName() {
            return this.seriesName;
        }

    }

    public static class ListPreferredEcsTypesResponseBodySeries extends TeaModel {
        @NameInMap("SeriesInfo")
        public java.util.List<ListPreferredEcsTypesResponseBodySeriesSeriesInfo> seriesInfo;

        public static ListPreferredEcsTypesResponseBodySeries build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeries self = new ListPreferredEcsTypesResponseBodySeries();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeries setSeriesInfo(java.util.List<ListPreferredEcsTypesResponseBodySeriesSeriesInfo> seriesInfo) {
            this.seriesInfo = seriesInfo;
            return this;
        }
        public java.util.List<ListPreferredEcsTypesResponseBodySeriesSeriesInfo> getSeriesInfo() {
            return this.seriesInfo;
        }

    }

}
