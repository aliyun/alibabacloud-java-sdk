// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListEmrMainVersionResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("EmrMainVersionList")
    public ListEmrMainVersionResponseBodyEmrMainVersionList emrMainVersionList;

    public static ListEmrMainVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmrMainVersionResponseBody self = new ListEmrMainVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmrMainVersionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListEmrMainVersionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEmrMainVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEmrMainVersionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEmrMainVersionResponseBody setEmrMainVersionList(ListEmrMainVersionResponseBodyEmrMainVersionList emrMainVersionList) {
        this.emrMainVersionList = emrMainVersionList;
        return this;
    }
    public ListEmrMainVersionResponseBodyEmrMainVersionList getEmrMainVersionList() {
        return this.emrMainVersionList;
    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo extends TeaModel {
        @NameInMap("ServiceDisplayName")
        public String serviceDisplayName;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("Display")
        public Boolean display;

        @NameInMap("ServiceDisplayVersion")
        public String serviceDisplayVersion;

        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("ServiceName")
        public String serviceName;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo setServiceDisplayName(String serviceDisplayName) {
            this.serviceDisplayName = serviceDisplayName;
            return this;
        }
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo setServiceDisplayVersion(String serviceDisplayVersion) {
            this.serviceDisplayVersion = serviceDisplayVersion;
            return this;
        }
        public String getServiceDisplayVersion() {
            return this.serviceDisplayVersion;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList extends TeaModel {
        @NameInMap("ServiceInfo")
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo> serviceInfo;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList setServiceInfo(java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo> serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoListServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo extends TeaModel {
        @NameInMap("ServiceInfoList")
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList serviceInfoList;

        @NameInMap("ClusterType")
        public String clusterType;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo setServiceInfoList(ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList serviceInfoList) {
            this.serviceInfoList = serviceInfoList;
            return this;
        }
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoServiceInfoList getServiceInfoList() {
            return this.serviceInfoList;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList extends TeaModel {
        @NameInMap("ClusterTypeInfo")
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo> clusterTypeInfo;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList setClusterTypeInfo(java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo> clusterTypeInfo) {
            this.clusterTypeInfo = clusterTypeInfo;
            return this;
        }
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo> getClusterTypeInfo() {
            return this.clusterTypeInfo;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList extends TeaModel {
        @NameInMap("WhiteUser")
        public java.util.List<String> whiteUser;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList setWhiteUser(java.util.List<String> whiteUser) {
            this.whiteUser = whiteUser;
            return this;
        }
        public java.util.List<String> getWhiteUser() {
            return this.whiteUser;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("UserId")
        public String userId;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList extends TeaModel {
        @NameInMap("ClusterTypeWhiteUser")
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser> clusterTypeWhiteUser;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList setClusterTypeWhiteUser(java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser> clusterTypeWhiteUser) {
            this.clusterTypeWhiteUser = clusterTypeWhiteUser;
            return this;
        }
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserListClusterTypeWhiteUser> getClusterTypeWhiteUser() {
            return this.clusterTypeWhiteUser;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion extends TeaModel {
        @NameInMap("ClusterTypeInfoList")
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList clusterTypeInfoList;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("StackVersion")
        public String stackVersion;

        @NameInMap("EmrVersion")
        public String emrVersion;

        @NameInMap("WhiteUserList")
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList whiteUserList;

        @NameInMap("Display")
        public Boolean display;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("EcmVersion")
        public Boolean ecmVersion;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ClusterTypeWhiteUserList")
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList clusterTypeWhiteUserList;

        public static ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion self = new ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setClusterTypeInfoList(ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList clusterTypeInfoList) {
            this.clusterTypeInfoList = clusterTypeInfoList;
            return this;
        }
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList getClusterTypeInfoList() {
            return this.clusterTypeInfoList;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setStackVersion(String stackVersion) {
            this.stackVersion = stackVersion;
            return this;
        }
        public String getStackVersion() {
            return this.stackVersion;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setEmrVersion(String emrVersion) {
            this.emrVersion = emrVersion;
            return this;
        }
        public String getEmrVersion() {
            return this.emrVersion;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setWhiteUserList(ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList whiteUserList) {
            this.whiteUserList = whiteUserList;
            return this;
        }
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionWhiteUserList getWhiteUserList() {
            return this.whiteUserList;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setEcmVersion(Boolean ecmVersion) {
            this.ecmVersion = ecmVersion;
            return this;
        }
        public Boolean getEcmVersion() {
            return this.ecmVersion;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion setClusterTypeWhiteUserList(ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList clusterTypeWhiteUserList) {
            this.clusterTypeWhiteUserList = clusterTypeWhiteUserList;
            return this;
        }
        public ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersionClusterTypeWhiteUserList getClusterTypeWhiteUserList() {
            return this.clusterTypeWhiteUserList;
        }

    }

    public static class ListEmrMainVersionResponseBodyEmrMainVersionList extends TeaModel {
        @NameInMap("EmrMainVersion")
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion> emrMainVersion;

        public static ListEmrMainVersionResponseBodyEmrMainVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrMainVersionResponseBodyEmrMainVersionList self = new ListEmrMainVersionResponseBodyEmrMainVersionList();
            return TeaModel.build(map, self);
        }

        public ListEmrMainVersionResponseBodyEmrMainVersionList setEmrMainVersion(java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion> emrMainVersion) {
            this.emrMainVersion = emrMainVersion;
            return this;
        }
        public java.util.List<ListEmrMainVersionResponseBodyEmrMainVersionListEmrMainVersion> getEmrMainVersion() {
            return this.emrMainVersion;
        }

    }

}
