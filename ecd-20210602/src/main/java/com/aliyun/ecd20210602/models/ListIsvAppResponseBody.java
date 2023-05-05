// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListIsvAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListIsvAppResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIsvAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIsvAppResponseBody self = new ListIsvAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIsvAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIsvAppResponseBody setData(java.util.List<ListIsvAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIsvAppResponseBodyData> getData() {
        return this.data;
    }

    public ListIsvAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIsvAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListIsvAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListIsvAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIsvAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIsvAppResponseBodyData extends TeaModel {
        @NameInMap("AppRegInfo")
        public String appRegInfo;

        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("HasCert")
        public String hasCert;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ManageCateEnName")
        public String manageCateEnName;

        @NameInMap("ManageCateId")
        public String manageCateId;

        @NameInMap("ManageCateName")
        public String manageCateName;

        @NameInMap("Name")
        public String name;

        @NameInMap("OriginAppType")
        public String originAppType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Version")
        public String version;

        public static ListIsvAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIsvAppResponseBodyData self = new ListIsvAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIsvAppResponseBodyData setAppRegInfo(String appRegInfo) {
            this.appRegInfo = appRegInfo;
            return this;
        }
        public String getAppRegInfo() {
            return this.appRegInfo;
        }

        public ListIsvAppResponseBodyData setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public ListIsvAppResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListIsvAppResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListIsvAppResponseBodyData setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListIsvAppResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListIsvAppResponseBodyData setHasCert(String hasCert) {
            this.hasCert = hasCert;
            return this;
        }
        public String getHasCert() {
            return this.hasCert;
        }

        public ListIsvAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListIsvAppResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListIsvAppResponseBodyData setManageCateEnName(String manageCateEnName) {
            this.manageCateEnName = manageCateEnName;
            return this;
        }
        public String getManageCateEnName() {
            return this.manageCateEnName;
        }

        public ListIsvAppResponseBodyData setManageCateId(String manageCateId) {
            this.manageCateId = manageCateId;
            return this;
        }
        public String getManageCateId() {
            return this.manageCateId;
        }

        public ListIsvAppResponseBodyData setManageCateName(String manageCateName) {
            this.manageCateName = manageCateName;
            return this;
        }
        public String getManageCateName() {
            return this.manageCateName;
        }

        public ListIsvAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIsvAppResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public ListIsvAppResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListIsvAppResponseBodyData setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListIsvAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
