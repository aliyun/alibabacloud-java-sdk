// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListAIServicesResponseBody extends TeaModel {
    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of AI services.</p>
     */
    @NameInMap("Services")
    public java.util.List<ListAIServicesResponseBodyServices> services;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static ListAIServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIServicesResponseBody self = new ListAIServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIServicesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAIServicesResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListAIServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAIServicesResponseBody setServices(java.util.List<ListAIServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListAIServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public ListAIServicesResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListAIServicesResponseBodyServices extends TeaModel {
        /**
         * <p>The time when the AI service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-01T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the AI service.</p>
         * 
         * <strong>example:</strong>
         * <p>dramatest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The private endpoint for API debugging.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/api-docs</p>
         */
        @NameInMap("PrivateApiDevUrl")
        public String privateApiDevUrl;

        /**
         * <p>The private endpoint of the Workbench.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("PrivateWorkbenchUrl")
        public String privateWorkbenchUrl;

        /**
         * <p>The public endpoint for API debugging.</p>
         * 
         * <strong>example:</strong>
         * <p>8.8.8.8/api-docs</p>
         */
        @NameInMap("PublicApiDevUrl")
        public String publicApiDevUrl;

        /**
         * <p>The public endpoint of the Workbench.</p>
         * 
         * <strong>example:</strong>
         * <p>8.8.8.8</p>
         */
        @NameInMap("PublicWorkbenchUrl")
        public String publicWorkbenchUrl;

        /**
         * <p>The list of IP addresses in the IP address whitelist group. Separate multiple IP addresses with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIpList")
        public String securityIpList;

        /**
         * <p>The service account.</p>
         * 
         * <strong>example:</strong>
         * <p>dramauser</p>
         */
        @NameInMap("ServiceAccount")
        public String serviceAccount;

        /**
         * <p>The ID of the AI service.</p>
         * 
         * <strong>example:</strong>
         * <p>drama-123456</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The status of the AI service. Valid values:</p>
         * <ul>
         * <li><p>deploying</p>
         * </li>
         * <li><p>active</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAIServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListAIServicesResponseBodyServices self = new ListAIServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListAIServicesResponseBodyServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAIServicesResponseBodyServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAIServicesResponseBodyServices setPrivateApiDevUrl(String privateApiDevUrl) {
            this.privateApiDevUrl = privateApiDevUrl;
            return this;
        }
        public String getPrivateApiDevUrl() {
            return this.privateApiDevUrl;
        }

        public ListAIServicesResponseBodyServices setPrivateWorkbenchUrl(String privateWorkbenchUrl) {
            this.privateWorkbenchUrl = privateWorkbenchUrl;
            return this;
        }
        public String getPrivateWorkbenchUrl() {
            return this.privateWorkbenchUrl;
        }

        public ListAIServicesResponseBodyServices setPublicApiDevUrl(String publicApiDevUrl) {
            this.publicApiDevUrl = publicApiDevUrl;
            return this;
        }
        public String getPublicApiDevUrl() {
            return this.publicApiDevUrl;
        }

        public ListAIServicesResponseBodyServices setPublicWorkbenchUrl(String publicWorkbenchUrl) {
            this.publicWorkbenchUrl = publicWorkbenchUrl;
            return this;
        }
        public String getPublicWorkbenchUrl() {
            return this.publicWorkbenchUrl;
        }

        public ListAIServicesResponseBodyServices setSecurityIpList(String securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }
        public String getSecurityIpList() {
            return this.securityIpList;
        }

        public ListAIServicesResponseBodyServices setServiceAccount(String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public String getServiceAccount() {
            return this.serviceAccount;
        }

        public ListAIServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListAIServicesResponseBodyServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
