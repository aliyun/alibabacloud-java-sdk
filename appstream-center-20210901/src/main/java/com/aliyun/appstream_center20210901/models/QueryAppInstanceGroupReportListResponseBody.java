// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryAppInstanceGroupReportListResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of <code>200</code> indicates that the request is processed. Other values indicate that the processing failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of app instance group report data.</p>
     */
    @NameInMap("IndexData")
    public java.util.List<QueryAppInstanceGroupReportListResponseBodyIndexData> indexData;

    /**
     * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number corresponding to the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page used in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the current request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAppInstanceGroupReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInstanceGroupReportListResponseBody self = new QueryAppInstanceGroupReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppInstanceGroupReportListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppInstanceGroupReportListResponseBody setIndexData(java.util.List<QueryAppInstanceGroupReportListResponseBodyIndexData> indexData) {
        this.indexData = indexData;
        return this;
    }
    public java.util.List<QueryAppInstanceGroupReportListResponseBodyIndexData> getIndexData() {
        return this.indexData;
    }

    public QueryAppInstanceGroupReportListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppInstanceGroupReportListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryAppInstanceGroupReportListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAppInstanceGroupReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAppInstanceGroupReportListResponseBodyIndexData extends TeaModel {
        /**
         * <p>The ID of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The name of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D workstation group</p>
         */
        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        /**
         * <p>The current status of the app instance group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>DEPLOYING</code>: Deploying.</li>
         * <li><code>DEPLOYED</code>: Deployed but not published.</li>
         * <li><code>PUBLISHED</code>: Published and available to provide services based on the current configurations.</li>
         * <li><code>STOPPING</code>: Stopping.</li>
         * <li><code>STOPPED</code>: Stopped.</li>
         * <li><code>MAINTAINING</code>: Maintaining.</li>
         * <li><code>FAILED</code>: Deployment or running failed.</li>
         * <li><code>MAINTAIN_FAILED</code>: Maintenance failed.</li>
         * <li><code>DELETING</code>: Deleting.</li>
         * <li><code>DELETED</code>: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryAppInstanceGroupReportListResponseBodyIndexData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppInstanceGroupReportListResponseBodyIndexData self = new QueryAppInstanceGroupReportListResponseBodyIndexData();
            return TeaModel.build(map, self);
        }

        public QueryAppInstanceGroupReportListResponseBodyIndexData setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public QueryAppInstanceGroupReportListResponseBodyIndexData setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public QueryAppInstanceGroupReportListResponseBodyIndexData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
