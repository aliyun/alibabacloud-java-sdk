// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppLogRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612475.html">ListSparkApps</a> operation to query the ID of the Spark application.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202206061441hz22a35ab000****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all clusters in the target region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-2ze6fl8ud7t***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The number of log lines. Valid values: 1 to 500. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("LogLength")
    public Long logLength;

    /**
     * <p>The page number for reading logs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of data rows per page.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetSparkAppLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppLogRequest self = new GetSparkAppLogRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppLogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetSparkAppLogRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetSparkAppLogRequest setLogLength(Long logLength) {
        this.logLength = logLength;
        return this;
    }
    public Long getLogLength() {
        return this.logLength;
    }

    public GetSparkAppLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSparkAppLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
