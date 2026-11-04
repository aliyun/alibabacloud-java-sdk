// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResultResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryPictureSearchJobResultResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceId is mandatory for this action.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>a06c4750-7cce-11eb-8010-557d50136505</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResultResponseBody self = new QueryPictureSearchJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchJobResultResponseBody setData(QueryPictureSearchJobResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchJobResultResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureSearchJobResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchJobResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchJobResultResponseBodyDataPageData extends TeaModel {
        /**
         * <p>The alias of the device.</p>
         * <blockquote>
         * <p>If no alias is set for the device, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>camera1</p>
         */
        @NameInMap("DeviceNickName")
        public String deviceNickName;

        /**
         * <p>The time when the event was created. The value is a 13-digit timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614333155075</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>The IoT ID of the V-series edge all-in-one device.</p>
         * 
         * <strong>example:</strong>
         * <p>pZJUqijOyfpFOOGNPF7S00****</p>
         */
        @NameInMap("GatewayIotId")
        public String gatewayIotId;

        /**
         * <p>The IoT ID of the queried device.</p>
         * 
         * <strong>example:</strong>
         * <p>5RUngwC1RknD4lPiHgH300****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The URL of the image to be searched.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.xxx.xxx.com/xxx">https://xxx.xxx.xxx.com/xxx</a></p>
         */
        @NameInMap("PicUrl")
        public String picUrl;

        /**
         * <p>The face similarity.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>The ID of the image feature.</p>
         * 
         * <strong>example:</strong>
         * <p>vectorId86d9a5c32b9947278e526c2eef8a****</p>
         */
        @NameInMap("VectorId")
        public String vectorId;

        public static QueryPictureSearchJobResultResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResultResponseBodyDataPageData self = new QueryPictureSearchJobResultResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setDeviceNickName(String deviceNickName) {
            this.deviceNickName = deviceNickName;
            return this;
        }
        public String getDeviceNickName() {
            return this.deviceNickName;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setGatewayIotId(String gatewayIotId) {
            this.gatewayIotId = gatewayIotId;
            return this;
        }
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setVectorId(String vectorId) {
            this.vectorId = vectorId;
            return this;
        }
        public String getVectorId() {
            return this.vectorId;
        }

    }

    public static class QueryPictureSearchJobResultResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

        /**
         * <p>The query results.</p>
         */
        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchJobResultResponseBodyDataPageData> pageData;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryPictureSearchJobResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResultResponseBodyData self = new QueryPictureSearchJobResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResultResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchJobResultResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchJobResultResponseBodyData setPageData(java.util.List<QueryPictureSearchJobResultResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchJobResultResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryPictureSearchJobResultResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchJobResultResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
