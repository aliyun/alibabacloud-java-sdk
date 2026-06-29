// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallsRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServiceApiCallsRequestListQuery listQuery;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the data service project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ListDataServiceApiCallsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiCallsRequest self = new ListDataServiceApiCallsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiCallsRequest setListQuery(ListDataServiceApiCallsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServiceApiCallsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServiceApiCallsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceApiCallsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ListDataServiceApiCallsRequestListQuery extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>20122</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The application key.</p>
         * <blockquote>
         * <p>Notice: This parameter is deprecated. Use AppKeyStr instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppKey")
        @Deprecated
        public Long appKey;

        /**
         * <p>The application key.</p>
         * 
         * <strong>example:</strong>
         * <p>app12345</p>
         */
        @NameInMap("AppKeyStr")
        public String appKeyStr;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The end time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 20:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The start time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether the call was successful.</p>
         */
        @NameInMap("Successful")
        public Boolean successful;

        public static ListDataServiceApiCallsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiCallsRequestListQuery self = new ListDataServiceApiCallsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiCallsRequestListQuery setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiCallsRequestListQuery setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        @Deprecated
        public ListDataServiceApiCallsRequestListQuery setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public ListDataServiceApiCallsRequestListQuery setAppKeyStr(String appKeyStr) {
            this.appKeyStr = appKeyStr;
            return this;
        }
        public String getAppKeyStr() {
            return this.appKeyStr;
        }

        public ListDataServiceApiCallsRequestListQuery setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListDataServiceApiCallsRequestListQuery setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDataServiceApiCallsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServiceApiCallsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApiCallsRequestListQuery setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDataServiceApiCallsRequestListQuery setSuccessful(Boolean successful) {
            this.successful = successful;
            return this;
        }
        public Boolean getSuccessful() {
            return this.successful;
        }

    }

}
