// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsDataSourceRequest extends TeaModel {
    /**
     * <p>The type of the update operation:</p>
     * <ol>
     * <li>UPDATE_CONFIG: updates the data source configuration.</li>
     * <li>START: starts the data source instance.</li>
     * <li>STOP: shuts down the data source instance.</li>
     * <li>RENAME: renames the data source.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>UPDATE_CONFIG</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The data source configuration. The configuration items vary based on the data source.</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The new name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>dept1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Tests the data source configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("test")
    public Boolean test;

    public static UpdateMmsDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsDataSourceRequest self = new UpdateMmsDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmsDataSourceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateMmsDataSourceRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public UpdateMmsDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMmsDataSourceRequest setTest(Boolean test) {
        this.test = test;
        return this;
    }
    public Boolean getTest() {
        return this.test;
    }

}
