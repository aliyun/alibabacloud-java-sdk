// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceUsagesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceUsages")
    public java.util.List<ListServiceUsagesResponseBodyServiceUsages> serviceUsages;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceUsagesResponseBody self = new ListServiceUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceUsagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceUsagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceUsagesResponseBody setServiceUsages(java.util.List<ListServiceUsagesResponseBodyServiceUsages> serviceUsages) {
        this.serviceUsages = serviceUsages;
        return this;
    }
    public java.util.List<ListServiceUsagesResponseBodyServiceUsages> getServiceUsages() {
        return this.serviceUsages;
    }

    public ListServiceUsagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceUsagesResponseBodyServiceUsages extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserAliUid")
        public Long userAliUid;

        @NameInMap("UserInformation")
        public java.util.Map<String, String> userInformation;

        public static ListServiceUsagesResponseBodyServiceUsages build(java.util.Map<String, ?> map) throws Exception {
            ListServiceUsagesResponseBodyServiceUsages self = new ListServiceUsagesResponseBodyServiceUsages();
            return TeaModel.build(map, self);
        }

        public ListServiceUsagesResponseBodyServiceUsages setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListServiceUsagesResponseBodyServiceUsages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceUsagesResponseBodyServiceUsages setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceUsagesResponseBodyServiceUsages setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServiceUsagesResponseBodyServiceUsages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceUsagesResponseBodyServiceUsages setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListServiceUsagesResponseBodyServiceUsages setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServiceUsagesResponseBodyServiceUsages setUserAliUid(Long userAliUid) {
            this.userAliUid = userAliUid;
            return this;
        }
        public Long getUserAliUid() {
            return this.userAliUid;
        }

        public ListServiceUsagesResponseBodyServiceUsages setUserInformation(java.util.Map<String, String> userInformation) {
            this.userInformation = userInformation;
            return this;
        }
        public java.util.Map<String, String> getUserInformation() {
            return this.userInformation;
        }

    }

}
