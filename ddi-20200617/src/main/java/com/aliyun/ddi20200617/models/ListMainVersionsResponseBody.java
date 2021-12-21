// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListMainVersionsResponseBody extends TeaModel {
    @NameInMap("MainVersionList")
    public java.util.List<ListMainVersionsResponseBodyMainVersionList> mainVersionList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListMainVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMainVersionsResponseBody self = new ListMainVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMainVersionsResponseBody setMainVersionList(java.util.List<ListMainVersionsResponseBodyMainVersionList> mainVersionList) {
        this.mainVersionList = mainVersionList;
        return this;
    }
    public java.util.List<ListMainVersionsResponseBodyMainVersionList> getMainVersionList() {
        return this.mainVersionList;
    }

    public ListMainVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        public static ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList self = new ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

    }

    public static class ListMainVersionsResponseBodyMainVersionList extends TeaModel {
        @NameInMap("ClusterTypeInfoList")
        public java.util.List<ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList> clusterTypeInfoList;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("MainVersionName")
        public String mainVersionName;

        @NameInMap("RegionId")
        public String regionId;

        public static ListMainVersionsResponseBodyMainVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListMainVersionsResponseBodyMainVersionList self = new ListMainVersionsResponseBodyMainVersionList();
            return TeaModel.build(map, self);
        }

        public ListMainVersionsResponseBodyMainVersionList setClusterTypeInfoList(java.util.List<ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList> clusterTypeInfoList) {
            this.clusterTypeInfoList = clusterTypeInfoList;
            return this;
        }
        public java.util.List<ListMainVersionsResponseBodyMainVersionListClusterTypeInfoList> getClusterTypeInfoList() {
            return this.clusterTypeInfoList;
        }

        public ListMainVersionsResponseBodyMainVersionList setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public ListMainVersionsResponseBodyMainVersionList setMainVersionName(String mainVersionName) {
            this.mainVersionName = mainVersionName;
            return this;
        }
        public String getMainVersionName() {
            return this.mainVersionName;
        }

        public ListMainVersionsResponseBodyMainVersionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
