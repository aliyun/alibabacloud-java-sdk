// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSensitiveDataRequest extends TeaModel {
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
     * <p>The number of the page to return. Minimum value:1.</p>
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

    public static GetSensitiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDataRequest self = new GetSensitiveDataRequest();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSensitiveDataRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetSensitiveDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
