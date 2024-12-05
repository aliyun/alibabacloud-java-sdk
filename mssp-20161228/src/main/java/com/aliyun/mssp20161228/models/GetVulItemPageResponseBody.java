// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulItemPageResponseBody extends TeaModel {
    /**
     * <p>API response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetVulItemPageResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PageInfo")
    public GetVulItemPageResponseBodyPageInfo pageInfo;

    /**
     * <p>Request response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02F8BBF3-2D61-5982-8911-EEB387BE3AF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful.
     * true: Call succeeded. false: Call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetVulItemPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulItemPageResponseBody self = new GetVulItemPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulItemPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVulItemPageResponseBody setData(java.util.List<GetVulItemPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetVulItemPageResponseBodyData> getData() {
        return this.data;
    }

    public GetVulItemPageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVulItemPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVulItemPageResponseBody setPageInfo(GetVulItemPageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetVulItemPageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetVulItemPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulItemPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVulItemPageResponseBodyData extends TeaModel {
        /**
         * <p>Vulnerability alias.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2024:4620: libndp 安全更新</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>Number of high-priority vulnerabilities to be fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>74</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1940494487193744</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <p>Prefix for the CVE remediation advice URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://avd.aliyun.com/detail/">https://avd.aliyun.com/detail/</a></p>
         */
        @NameInMap("CveUrlPrefix")
        public String cveUrlPrefix;

        /**
         * <p>Processing status.</p>
         * 
         * <strong>example:</strong>
         * <p>y</p>
         */
        @NameInMap("Dealed")
        public String dealed;

        /**
         * <p>Timestamp of the last discovery of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23 14:47:34</p>
         */
        @NameInMap("FindTime")
        public String findTime;

        /**
         * <p>Number of processed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HandledCount")
        public Integer handledCount;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>353845</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Number of medium-priority vulnerabilities to be fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        /**
         * <p>Risk level</p>
         * 
         * <strong>example:</strong>
         * <p>later</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Vulnerability name.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20205002</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Number of low-priority vulnerabilities to be fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <p>CVE number.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2019-20907</p>
         */
        @NameInMap("Related")
        public String related;

        /**
         * <p>Number of related CVE numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RelatedCveCount")
        public Integer relatedCveCount;

        /**
         * <p>Vulnerability type.</p>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>Tags.</p>
         * 
         * <strong>example:</strong>
         * <p>Elevation of Privilege</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>Total number of fixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalFixCount")
        public Long totalFixCount;

        public static GetVulItemPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVulItemPageResponseBodyData self = new GetVulItemPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVulItemPageResponseBodyData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetVulItemPageResponseBodyData setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public GetVulItemPageResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetVulItemPageResponseBodyData setCveUrlPrefix(String cveUrlPrefix) {
            this.cveUrlPrefix = cveUrlPrefix;
            return this;
        }
        public String getCveUrlPrefix() {
            return this.cveUrlPrefix;
        }

        public GetVulItemPageResponseBodyData setDealed(String dealed) {
            this.dealed = dealed;
            return this;
        }
        public String getDealed() {
            return this.dealed;
        }

        public GetVulItemPageResponseBodyData setFindTime(String findTime) {
            this.findTime = findTime;
            return this;
        }
        public String getFindTime() {
            return this.findTime;
        }

        public GetVulItemPageResponseBodyData setHandledCount(Integer handledCount) {
            this.handledCount = handledCount;
            return this;
        }
        public Integer getHandledCount() {
            return this.handledCount;
        }

        public GetVulItemPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetVulItemPageResponseBodyData setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public GetVulItemPageResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetVulItemPageResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVulItemPageResponseBodyData setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public GetVulItemPageResponseBodyData setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public GetVulItemPageResponseBodyData setRelatedCveCount(Integer relatedCveCount) {
            this.relatedCveCount = relatedCveCount;
            return this;
        }
        public Integer getRelatedCveCount() {
            return this.relatedCveCount;
        }

        public GetVulItemPageResponseBodyData setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public GetVulItemPageResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetVulItemPageResponseBodyData setTotalFixCount(Long totalFixCount) {
            this.totalFixCount = totalFixCount;
            return this;
        }
        public Long getTotalFixCount() {
            return this.totalFixCount;
        }

    }

    public static class GetVulItemPageResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number for pagination queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Number of items to display per page in the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of records in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>163</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetVulItemPageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVulItemPageResponseBodyPageInfo self = new GetVulItemPageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetVulItemPageResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetVulItemPageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetVulItemPageResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
