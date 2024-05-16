// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataRequest extends TeaModel {
    /**
     * <p>The date on which the access records were queried. Specify the value in the yyyyMMdd format.</p>
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
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return. Minimum value: 1.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Maximum value: 1000.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The method that you use to identify risks.</p>
     * <br>
     * <p>*   You can manually identify risks.</p>
     * <p>*   You can also use a risk rule to identify risks. You can go to the DataWorks console to obtain the name of the risk rule on the Custom Identification Rules page of Data Security Guard.</p>
     */
    @NameInMap("RiskType")
    public String riskType;

    public static GetOpRiskDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpRiskDataRequest self = new GetOpRiskDataRequest();
        return TeaModel.build(map, self);
    }

    public GetOpRiskDataRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetOpRiskDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetOpRiskDataRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetOpRiskDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOpRiskDataRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

}
