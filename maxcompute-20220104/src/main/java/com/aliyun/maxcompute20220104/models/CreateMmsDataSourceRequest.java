// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsDataSourceRequest extends TeaModel {
    /**
     * <p>The configurations of the data source.</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the MaxCompute network connectivity.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6pc2vordian33gobzfr:cn-shanghai</p>
     */
    @NameInMap("networklink")
    public String networklink;

    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>BIGQUERY</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateMmsDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsDataSourceRequest self = new CreateMmsDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMmsDataSourceRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public CreateMmsDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMmsDataSourceRequest setNetworklink(String networklink) {
        this.networklink = networklink;
        return this;
    }
    public String getNetworklink() {
        return this.networklink;
    }

    public CreateMmsDataSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
