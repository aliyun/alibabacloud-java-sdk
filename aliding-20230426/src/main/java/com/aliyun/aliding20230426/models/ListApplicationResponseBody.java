// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListApplicationResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListApplicationResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static ListApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponseBody self = new ListApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponseBody setData(java.util.List<ListApplicationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListApplicationResponseBodyData> getData() {
        return this.data;
    }

    public ListApplicationResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListApplicationResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListApplicationResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListApplicationResponseBodyData extends TeaModel {
        @NameInMap("AppConfig")
        public String appConfig;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("ApplicationStatus")
        public String applicationStatus;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CreatorUserId")
        public String creatorUserId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Inexistence")
        public String inexistence;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubCorpId")
        public String subCorpId;

        public static ListApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyData self = new ListApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyData setAppConfig(String appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public String getAppConfig() {
            return this.appConfig;
        }

        public ListApplicationResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListApplicationResponseBodyData setApplicationStatus(String applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }
        public String getApplicationStatus() {
            return this.applicationStatus;
        }

        public ListApplicationResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListApplicationResponseBodyData setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public ListApplicationResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListApplicationResponseBodyData setInexistence(String inexistence) {
            this.inexistence = inexistence;
            return this;
        }
        public String getInexistence() {
            return this.inexistence;
        }

        public ListApplicationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationResponseBodyData setSubCorpId(String subCorpId) {
            this.subCorpId = subCorpId;
            return this;
        }
        public String getSubCorpId() {
            return this.subCorpId;
        }

    }

}
