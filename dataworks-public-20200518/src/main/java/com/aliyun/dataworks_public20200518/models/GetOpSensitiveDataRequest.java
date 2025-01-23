// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataRequest extends TeaModel {
    /**
     * <p>The date on which access records were generated. Specify the value in the yyyyMMdd format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20210116</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>The parameters that you can configure to query the access records. Valid values:</p>
     * <ul>
     * <li>dbType</li>
     * <li>instanceName</li>
     * <li>databaseName</li>
     * <li>projectName</li>
     * <li>clusterName</li>
     * </ul>
     * <p>The following example shows the parameters configured to query the access records of the sensitive data in the abc database of the Hologres instance ABC: [ {&quot;dbType&quot;:&quot;hologres&quot;,&quot;instanceName&quot;:&quot;ABC&quot;,&quot;databaseName&quot;:&quot;abc&quot;} ]</p>
     * <p>You must configure the parameters based on the compute engine that you use in your business.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[  {&quot;dbType&quot;:&quot;hologres&quot;,&quot;instanceName&quot;:&quot;ABC&quot;,&quot;databaseName&quot;:&quot;abc&quot;},  {&quot;dbType&quot;:&quot;ODPS.ODPS&quot;,&quot;projectName&quot;:&quot;adbc&quot;}  ]</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operation that is performed on the data. Valid values:</p>
     * <ul>
     * <li>SQL_SELECT: specifies the data access operation. For example, execute a SELECT statement to query data.</li>
     * <li>TUNNEL_DOWNLOAD: specifies the data download operation. For example, run a Tunnel command to download data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL_SELECT</p>
     */
    @NameInMap("OpType")
    public String opType;

    /**
     * <p>The page number. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Minimum value: 1. Maximum value: 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetOpSensitiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpSensitiveDataRequest self = new GetOpSensitiveDataRequest();
        return TeaModel.build(map, self);
    }

    public GetOpSensitiveDataRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetOpSensitiveDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetOpSensitiveDataRequest setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public GetOpSensitiveDataRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetOpSensitiveDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
