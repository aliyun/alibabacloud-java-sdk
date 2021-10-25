// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListPreferredEcsTypesResponseBody extends TeaModel {
    @NameInMap("SupportSpotInstance")
    public Boolean supportSpotInstance;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Series")
    public ListPreferredEcsTypesResponseBodySeries series;

    public static ListPreferredEcsTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPreferredEcsTypesResponseBody self = new ListPreferredEcsTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPreferredEcsTypesResponseBody setSupportSpotInstance(Boolean supportSpotInstance) {
        this.supportSpotInstance = supportSpotInstance;
        return this;
    }
    public Boolean getSupportSpotInstance() {
        return this.supportSpotInstance;
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

    public static class ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles extends TeaModel {
        @NameInMap("Manager")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager manager;

        @NameInMap("Compute")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesCompute compute;

        @NameInMap("Login")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesLogin login;

        public static ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles self = new ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles setManager(ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager manager) {
            this.manager = manager;
            return this;
        }
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRolesManager getManager() {
            return this.manager;
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

    }

    public static class ListPreferredEcsTypesResponseBodySeriesSeriesInfo extends TeaModel {
        @NameInMap("SeriesName")
        public String seriesName;

        @NameInMap("SeriesId")
        public String seriesId;

        @NameInMap("Roles")
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles roles;

        public static ListPreferredEcsTypesResponseBodySeriesSeriesInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesSeriesInfo self = new ListPreferredEcsTypesResponseBodySeriesSeriesInfo();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfo setSeriesName(String seriesName) {
            this.seriesName = seriesName;
            return this;
        }
        public String getSeriesName() {
            return this.seriesName;
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfo setSeriesId(String seriesId) {
            this.seriesId = seriesId;
            return this;
        }
        public String getSeriesId() {
            return this.seriesId;
        }

        public ListPreferredEcsTypesResponseBodySeriesSeriesInfo setRoles(ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles roles) {
            this.roles = roles;
            return this;
        }
        public ListPreferredEcsTypesResponseBodySeriesSeriesInfoRoles getRoles() {
            return this.roles;
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
