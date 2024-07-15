// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceUsagesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAYChudnQUoBH+mGWFpb6oP0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18AD0960-A9FE-1AC8-ADF8-22131Fxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service applications.</p>
     */
    @NameInMap("ServiceUsages")
    public java.util.List<ListServiceUsagesResponseBodyServiceUsages> serviceUsages;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The comment on the approval.</p>
         * 
         * <strong>example:</strong>
         * <p>Reject</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-25T02:02:02Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-c9f36ec6d19b4exxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceTest</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The status of the service application. Valid values:</p>
         * <ul>
         * <li>Submitted: The application is submitted or is to be approved.</li>
         * <li>Approved: The application is approved.</li>
         * <li>Rejected: The application is rejected.</li>
         * <li>Canceled: The application is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Submitted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>SupplierAAA</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The time when the application was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-25T02:02:02Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>127383705958xxxx</p>
         */
        @NameInMap("UserAliUid")
        public Long userAliUid;

        /**
         * <p>The user information.</p>
         */
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
