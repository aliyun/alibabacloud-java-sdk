// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListPreferredEcsTypesResponseBody extends TeaModel {
    @NameInMap("Series")
    public java.util.List<ListPreferredEcsTypesResponseBodySeries> series;

    @NameInMap("SupportSpotInstance")
    public Boolean supportSpotInstance;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPreferredEcsTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPreferredEcsTypesResponseBody self = new ListPreferredEcsTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPreferredEcsTypesResponseBody setSeries(java.util.List<ListPreferredEcsTypesResponseBodySeries> series) {
        this.series = series;
        return this;
    }
    public java.util.List<ListPreferredEcsTypesResponseBodySeries> getSeries() {
        return this.series;
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

    public static class ListPreferredEcsTypesResponseBodySeriesRoles extends TeaModel {
        @NameInMap("Manager")
        public java.util.List<String> manager;

        @NameInMap("Compute")
        public java.util.List<String> compute;

        @NameInMap("Login")
        public java.util.List<String> login;

        public static ListPreferredEcsTypesResponseBodySeriesRoles build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeriesRoles self = new ListPreferredEcsTypesResponseBodySeriesRoles();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeriesRoles setManager(java.util.List<String> manager) {
            this.manager = manager;
            return this;
        }
        public java.util.List<String> getManager() {
            return this.manager;
        }

        public ListPreferredEcsTypesResponseBodySeriesRoles setCompute(java.util.List<String> compute) {
            this.compute = compute;
            return this;
        }
        public java.util.List<String> getCompute() {
            return this.compute;
        }

        public ListPreferredEcsTypesResponseBodySeriesRoles setLogin(java.util.List<String> login) {
            this.login = login;
            return this;
        }
        public java.util.List<String> getLogin() {
            return this.login;
        }

    }

    public static class ListPreferredEcsTypesResponseBodySeries extends TeaModel {
        @NameInMap("SeriesId")
        public String seriesId;

        @NameInMap("SeriesName")
        public String seriesName;

        @NameInMap("Roles")
        public ListPreferredEcsTypesResponseBodySeriesRoles roles;

        public static ListPreferredEcsTypesResponseBodySeries build(java.util.Map<String, ?> map) throws Exception {
            ListPreferredEcsTypesResponseBodySeries self = new ListPreferredEcsTypesResponseBodySeries();
            return TeaModel.build(map, self);
        }

        public ListPreferredEcsTypesResponseBodySeries setSeriesId(String seriesId) {
            this.seriesId = seriesId;
            return this;
        }
        public String getSeriesId() {
            return this.seriesId;
        }

        public ListPreferredEcsTypesResponseBodySeries setSeriesName(String seriesName) {
            this.seriesName = seriesName;
            return this;
        }
        public String getSeriesName() {
            return this.seriesName;
        }

        public ListPreferredEcsTypesResponseBodySeries setRoles(ListPreferredEcsTypesResponseBodySeriesRoles roles) {
            this.roles = roles;
            return this;
        }
        public ListPreferredEcsTypesResponseBodySeriesRoles getRoles() {
            return this.roles;
        }

    }

}
