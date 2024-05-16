// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataRequest extends TeaModel {
    /**
     * <p>The date on which access records were generated. Specify the value in the yyyyMMdd format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>The parameters that you can specify to query the access records. Valid values:</p>
     * <br>
     * <p>*   dbType: the data type</p>
     * <p>*   instanceName: the name of the instance</p>
     * <p>*   databaseName: the name of the database</p>
     * <p>*   projectName: the name of the workspace</p>
     * <p>*   clusterName: the name of the cluster</p>
     * <br>
     * <p>The following example shows the parameters configured to query the access records of the sensitive data in the abc database of the ABC Hologres instance:</p>
     * <br>
     * <p>{"dbType":"hologres","instanceName":"ABC","databaseName":"abc"}</p>
     * <br>
     * <p>You must specify the parameters based on the compute engine that you use in your business.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operation that is performed on the data. Valid values:</p>
     * <br>
     * <p>*   SQL_SELECT: indicates that the data is accessed. For example, the SELECT statement is executed to query the data.</p>
     * <p>*   TUNNEL_DOWNLOAD: indicates that the data is downloaded. For example, a Tunnel command is run to download the data.</p>
     */
    @NameInMap("OpType")
    public String opType;

    /**
     * <p>The number of the page to return. Minimum value:1. Maximum value: 1000.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Minimum value: 1. Maximum value: 1000.</p>
     * <br>
     * <p>This parameter is required.</p>
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
