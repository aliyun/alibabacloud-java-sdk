// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudAccessResponseBody extends TeaModel {
    @NameInMap("CloudAccessList")
    public java.util.List<ListCloudAccessResponseBodyCloudAccessList> cloudAccessList;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Integer showSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCloudAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccessResponseBody self = new ListCloudAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAccessResponseBody setCloudAccessList(java.util.List<ListCloudAccessResponseBodyCloudAccessList> cloudAccessList) {
        this.cloudAccessList = cloudAccessList;
        return this;
    }
    public java.util.List<ListCloudAccessResponseBodyCloudAccessList> getCloudAccessList() {
        return this.cloudAccessList;
    }

    public ListCloudAccessResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAccessResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListCloudAccessResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAccessResponseBodyCloudAccessList extends TeaModel {
        @NameInMap("AccessId")
        public Long accessId;

        @NameInMap("CloudName")
        public String cloudName;

        @NameInMap("SecretId")
        public String secretId;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        public static ListCloudAccessResponseBodyCloudAccessList build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccessResponseBodyCloudAccessList self = new ListCloudAccessResponseBodyCloudAccessList();
            return TeaModel.build(map, self);
        }

        public ListCloudAccessResponseBodyCloudAccessList setAccessId(Long accessId) {
            this.accessId = accessId;
            return this;
        }
        public Long getAccessId() {
            return this.accessId;
        }

        public ListCloudAccessResponseBodyCloudAccessList setCloudName(String cloudName) {
            this.cloudName = cloudName;
            return this;
        }
        public String getCloudName() {
            return this.cloudName;
        }

        public ListCloudAccessResponseBodyCloudAccessList setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public ListCloudAccessResponseBodyCloudAccessList setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

    }

}
