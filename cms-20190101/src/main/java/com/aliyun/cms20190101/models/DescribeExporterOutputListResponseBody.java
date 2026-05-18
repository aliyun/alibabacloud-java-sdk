// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterOutputListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Datapoints")
    public DescribeExporterOutputListResponseBodyDatapoints datapoints;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>sucess</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0E657631-CD6C-4C24-9637-98D000B9272C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeExporterOutputListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterOutputListResponseBody self = new DescribeExporterOutputListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExporterOutputListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExporterOutputListResponseBody setDatapoints(DescribeExporterOutputListResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public DescribeExporterOutputListResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public DescribeExporterOutputListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExporterOutputListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExporterOutputListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExporterOutputListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeExporterOutputListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson extends TeaModel {
        @NameInMap("ak")
        public String ak;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("logstore")
        public String logstore;

        @NameInMap("project")
        public String project;

        public static DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson self = new DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson();
            return TeaModel.build(map, self);
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DescribeExporterOutputListResponseBodyDatapointsDatapoint extends TeaModel {
        @NameInMap("ConfigJson")
        public DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson configJson;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DestName")
        public String destName;

        @NameInMap("DestType")
        public String destType;

        public static DescribeExporterOutputListResponseBodyDatapointsDatapoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterOutputListResponseBodyDatapointsDatapoint self = new DescribeExporterOutputListResponseBodyDatapointsDatapoint();
            return TeaModel.build(map, self);
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapoint setConfigJson(DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson configJson) {
            this.configJson = configJson;
            return this;
        }
        public DescribeExporterOutputListResponseBodyDatapointsDatapointConfigJson getConfigJson() {
            return this.configJson;
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapoint setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapoint setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public DescribeExporterOutputListResponseBodyDatapointsDatapoint setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

    }

    public static class DescribeExporterOutputListResponseBodyDatapoints extends TeaModel {
        @NameInMap("Datapoint")
        public java.util.List<DescribeExporterOutputListResponseBodyDatapointsDatapoint> datapoint;

        public static DescribeExporterOutputListResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterOutputListResponseBodyDatapoints self = new DescribeExporterOutputListResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public DescribeExporterOutputListResponseBodyDatapoints setDatapoint(java.util.List<DescribeExporterOutputListResponseBodyDatapointsDatapoint> datapoint) {
            this.datapoint = datapoint;
            return this;
        }
        public java.util.List<DescribeExporterOutputListResponseBodyDatapointsDatapoint> getDatapoint() {
            return this.datapoint;
        }

    }

}
