// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfLatestDataRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceId")
    public String sourceId;

    public static ListPtsPerfLatestDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfLatestDataRequest self = new ListPtsPerfLatestDataRequest();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfLatestDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPtsPerfLatestDataRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListPtsPerfLatestDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListPtsPerfLatestDataRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
