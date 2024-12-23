// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsDataSourceRequest extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("config")
    public java.util.Map<String, ?> config;

    @NameInMap("name")
    public String name;

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
