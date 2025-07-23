// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudAccessResponseBody extends TeaModel {
    /**
     * <p>The query results.</p>
     */
    @NameInMap("CloudAccessList")
    public java.util.List<ListCloudAccessResponseBodyCloudAccessList> cloudAccessList;

    /**
     * <p>The default value is the current page. If CurrentPage is not specified, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D3F1FA43-1C26-50A2-8F0F-7A03851DBB46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries per page. If ShowSize is not specified, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
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
        /**
         * <p>The ID of the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>888</p>
         */
        @NameInMap("AccessId")
        public Long accessId;

        /**
         * <p>The cloud service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        @NameInMap("CloudName")
        public String cloudName;

        /**
         * <p>The AccessKey ID that is used to access cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAqdwPBA****</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>The service status. The value normal indicates that the service runs as expected.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
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
