// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectFindAllResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Content")
    public java.util.List<ProjectFindAllResponseBodyContent> content;

    @NameInMap("Empty")
    public Boolean empty;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    @NameInMap("Message")
    public String message;

    @NameInMap("Number")
    public Long number;

    @NameInMap("NumberOfElements")
    public Long numberOfElements;

    @NameInMap("Pageable")
    public ProjectFindAllResponseBodyPageable pageable;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public ProjectFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static ProjectFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectFindAllResponseBody self = new ProjectFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectFindAllResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectFindAllResponseBody setContent(java.util.List<ProjectFindAllResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ProjectFindAllResponseBodyContent> getContent() {
        return this.content;
    }

    public ProjectFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public ProjectFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public ProjectFindAllResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public ProjectFindAllResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProjectFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public ProjectFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public ProjectFindAllResponseBody setPageable(ProjectFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public ProjectFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public ProjectFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProjectFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ProjectFindAllResponseBody setSort(ProjectFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public ProjectFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public ProjectFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public ProjectFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class ProjectFindAllResponseBodyContentBuildStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectFindAllResponseBodyContentBuildStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContentBuildStatusInfo self = new ProjectFindAllResponseBodyContentBuildStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContentBuildStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectFindAllResponseBodyContentBuildStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectFindAllResponseBodyContentBuildStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectFindAllResponseBodyContentBuildStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectFindAllResponseBodyContentBuildStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectFindAllResponseBodyContentExtInfo extends TeaModel {
        @NameInMap("FLOORPLANAREA")
        public String FLOORPLANAREA;

        @NameInMap("ONLINEDNS")
        public String ONLINEDNS;

        @NameInMap("STATUS")
        public String STATUS;

        public static ProjectFindAllResponseBodyContentExtInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContentExtInfo self = new ProjectFindAllResponseBodyContentExtInfo();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContentExtInfo setFLOORPLANAREA(String FLOORPLANAREA) {
            this.FLOORPLANAREA = FLOORPLANAREA;
            return this;
        }
        public String getFLOORPLANAREA() {
            return this.FLOORPLANAREA;
        }

        public ProjectFindAllResponseBodyContentExtInfo setONLINEDNS(String ONLINEDNS) {
            this.ONLINEDNS = ONLINEDNS;
            return this;
        }
        public String getONLINEDNS() {
            return this.ONLINEDNS;
        }

        public ProjectFindAllResponseBodyContentExtInfo setSTATUS(String STATUS) {
            this.STATUS = STATUS;
            return this;
        }
        public String getSTATUS() {
            return this.STATUS;
        }

    }

    public static class ProjectFindAllResponseBodyContentFunctionStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectFindAllResponseBodyContentFunctionStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContentFunctionStatusInfo self = new ProjectFindAllResponseBodyContentFunctionStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContentFunctionStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectFindAllResponseBodyContentFunctionStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectFindAllResponseBodyContentFunctionStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectFindAllResponseBodyContentFunctionStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectFindAllResponseBodyContentFunctionStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectFindAllResponseBodyContentNote extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ProjectFindAllResponseBodyContentNote build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContentNote self = new ProjectFindAllResponseBodyContentNote();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContentNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ProjectFindAllResponseBodyContentNote setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ProjectFindAllResponseBodyContentNote setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ProjectFindAllResponseBodyContentNote setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ProjectFindAllResponseBodyContentNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ProjectFindAllResponseBodyContentPhotoContact extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("UserName")
        public String userName;

        public static ProjectFindAllResponseBodyContentPhotoContact build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContentPhotoContact self = new ProjectFindAllResponseBodyContentPhotoContact();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContentPhotoContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ProjectFindAllResponseBodyContentPhotoContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ProjectFindAllResponseBodyContentPhotoContact setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ProjectFindAllResponseBodyContentPublishStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectFindAllResponseBodyContentPublishStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContentPublishStatusInfo self = new ProjectFindAllResponseBodyContentPublishStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContentPublishStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectFindAllResponseBodyContentPublishStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectFindAllResponseBodyContentPublishStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectFindAllResponseBodyContentPublishStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectFindAllResponseBodyContentPublishStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectFindAllResponseBodyContentUploadStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectFindAllResponseBodyContentUploadStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContentUploadStatusInfo self = new ProjectFindAllResponseBodyContentUploadStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContentUploadStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectFindAllResponseBodyContentUploadStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectFindAllResponseBodyContentUploadStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectFindAllResponseBodyContentUploadStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectFindAllResponseBodyContentUploadStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectFindAllResponseBodyContent extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BuildStatusInfo")
        public ProjectFindAllResponseBodyContentBuildStatusInfo buildStatusInfo;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("ExtInfo")
        public ProjectFindAllResponseBodyContentExtInfo extInfo;

        @NameInMap("FunctionStatusInfo")
        public ProjectFindAllResponseBodyContentFunctionStatusInfo functionStatusInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HighmodelAssignedTime")
        public String highmodelAssignedTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsvAssignedTime")
        public String isvAssignedTime;

        @NameInMap("LatestPipelineUsageInstance")
        public java.util.Map<String, ?> latestPipelineUsageInstance;

        @NameInMap("ModelConfirmedTime")
        public String modelConfirmedTime;

        @NameInMap("Note")
        public ProjectFindAllResponseBodyContentNote note;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OrderName")
        public String orderName;

        @NameInMap("PhotoAddress")
        public String photoAddress;

        @NameInMap("PhotoContact")
        public java.util.List<ProjectFindAllResponseBodyContentPhotoContact> photoContact;

        @NameInMap("ProjectGroupId")
        public String projectGroupId;

        @NameInMap("ProjectSource")
        public String projectSource;

        @NameInMap("ProjectStatus")
        public String projectStatus;

        @NameInMap("PublishStatusInfo")
        public ProjectFindAllResponseBodyContentPublishStatusInfo publishStatusInfo;

        @NameInMap("RecentBuildTime")
        public String recentBuildTime;

        @NameInMap("UploadStatusInfo")
        public ProjectFindAllResponseBodyContentUploadStatusInfo uploadStatusInfo;

        public static ProjectFindAllResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyContent self = new ProjectFindAllResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyContent setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ProjectFindAllResponseBodyContent setBuildStatusInfo(ProjectFindAllResponseBodyContentBuildStatusInfo buildStatusInfo) {
            this.buildStatusInfo = buildStatusInfo;
            return this;
        }
        public ProjectFindAllResponseBodyContentBuildStatusInfo getBuildStatusInfo() {
            return this.buildStatusInfo;
        }

        public ProjectFindAllResponseBodyContent setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public ProjectFindAllResponseBodyContent setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ProjectFindAllResponseBodyContent setExtInfo(ProjectFindAllResponseBodyContentExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public ProjectFindAllResponseBodyContentExtInfo getExtInfo() {
            return this.extInfo;
        }

        public ProjectFindAllResponseBodyContent setFunctionStatusInfo(ProjectFindAllResponseBodyContentFunctionStatusInfo functionStatusInfo) {
            this.functionStatusInfo = functionStatusInfo;
            return this;
        }
        public ProjectFindAllResponseBodyContentFunctionStatusInfo getFunctionStatusInfo() {
            return this.functionStatusInfo;
        }

        public ProjectFindAllResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ProjectFindAllResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ProjectFindAllResponseBodyContent setHighmodelAssignedTime(String highmodelAssignedTime) {
            this.highmodelAssignedTime = highmodelAssignedTime;
            return this;
        }
        public String getHighmodelAssignedTime() {
            return this.highmodelAssignedTime;
        }

        public ProjectFindAllResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ProjectFindAllResponseBodyContent setIsvAssignedTime(String isvAssignedTime) {
            this.isvAssignedTime = isvAssignedTime;
            return this;
        }
        public String getIsvAssignedTime() {
            return this.isvAssignedTime;
        }

        public ProjectFindAllResponseBodyContent setLatestPipelineUsageInstance(java.util.Map<String, ?> latestPipelineUsageInstance) {
            this.latestPipelineUsageInstance = latestPipelineUsageInstance;
            return this;
        }
        public java.util.Map<String, ?> getLatestPipelineUsageInstance() {
            return this.latestPipelineUsageInstance;
        }

        public ProjectFindAllResponseBodyContent setModelConfirmedTime(String modelConfirmedTime) {
            this.modelConfirmedTime = modelConfirmedTime;
            return this;
        }
        public String getModelConfirmedTime() {
            return this.modelConfirmedTime;
        }

        public ProjectFindAllResponseBodyContent setNote(ProjectFindAllResponseBodyContentNote note) {
            this.note = note;
            return this;
        }
        public ProjectFindAllResponseBodyContentNote getNote() {
            return this.note;
        }

        public ProjectFindAllResponseBodyContent setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ProjectFindAllResponseBodyContent setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }
        public String getOrderName() {
            return this.orderName;
        }

        public ProjectFindAllResponseBodyContent setPhotoAddress(String photoAddress) {
            this.photoAddress = photoAddress;
            return this;
        }
        public String getPhotoAddress() {
            return this.photoAddress;
        }

        public ProjectFindAllResponseBodyContent setPhotoContact(java.util.List<ProjectFindAllResponseBodyContentPhotoContact> photoContact) {
            this.photoContact = photoContact;
            return this;
        }
        public java.util.List<ProjectFindAllResponseBodyContentPhotoContact> getPhotoContact() {
            return this.photoContact;
        }

        public ProjectFindAllResponseBodyContent setProjectGroupId(String projectGroupId) {
            this.projectGroupId = projectGroupId;
            return this;
        }
        public String getProjectGroupId() {
            return this.projectGroupId;
        }

        public ProjectFindAllResponseBodyContent setProjectSource(String projectSource) {
            this.projectSource = projectSource;
            return this;
        }
        public String getProjectSource() {
            return this.projectSource;
        }

        public ProjectFindAllResponseBodyContent setProjectStatus(String projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public String getProjectStatus() {
            return this.projectStatus;
        }

        public ProjectFindAllResponseBodyContent setPublishStatusInfo(ProjectFindAllResponseBodyContentPublishStatusInfo publishStatusInfo) {
            this.publishStatusInfo = publishStatusInfo;
            return this;
        }
        public ProjectFindAllResponseBodyContentPublishStatusInfo getPublishStatusInfo() {
            return this.publishStatusInfo;
        }

        public ProjectFindAllResponseBodyContent setRecentBuildTime(String recentBuildTime) {
            this.recentBuildTime = recentBuildTime;
            return this;
        }
        public String getRecentBuildTime() {
            return this.recentBuildTime;
        }

        public ProjectFindAllResponseBodyContent setUploadStatusInfo(ProjectFindAllResponseBodyContentUploadStatusInfo uploadStatusInfo) {
            this.uploadStatusInfo = uploadStatusInfo;
            return this;
        }
        public ProjectFindAllResponseBodyContentUploadStatusInfo getUploadStatusInfo() {
            return this.uploadStatusInfo;
        }

    }

    public static class ProjectFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static ProjectFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyPageableSort self = new ProjectFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public ProjectFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public ProjectFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class ProjectFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public ProjectFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static ProjectFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodyPageable self = new ProjectFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public ProjectFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ProjectFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ProjectFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public ProjectFindAllResponseBodyPageable setSort(ProjectFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public ProjectFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public ProjectFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class ProjectFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static ProjectFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindAllResponseBodySort self = new ProjectFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public ProjectFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public ProjectFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public ProjectFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
