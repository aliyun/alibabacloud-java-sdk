// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataRequest extends TeaModel {
    /**
     * <p>The date on which access records were generated. Specify the value in the yyyyMMdd format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20210221</p>
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
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;dbType&quot;:&quot;hologres&quot;,&quot;instanceName&quot;:&quot;ABC&quot;,&quot;databaseName&quot;:&quot;abc&quot;}, {&quot;dbType&quot;:&quot;ODPS.ODPS&quot;,&quot;projectName&quot;:&quot;adbc&quot;} ]</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages start from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Maximum value: 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The method that you use to identify risks.</p>
     * <ul>
     * <li>You can manually identify risks.</li>
     * <li>You can also use a sensitive data identification rule to identify risks. You can log on to the DataWorks console and go to the Risk Identification Rules page in Data Security Guard to obtain the name of the rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual identification</p>
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
