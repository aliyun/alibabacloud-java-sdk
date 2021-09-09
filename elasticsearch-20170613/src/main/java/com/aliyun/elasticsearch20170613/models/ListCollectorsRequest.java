// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListCollectorsRequest extends TeaModel {
    @NameInMap("resId")
    public String resId;

    @NameInMap("name")
    public String name;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    @NameInMap("sourceType")
    public String sourceType;

    public static ListCollectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollectorsRequest self = new ListCollectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListCollectorsRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public ListCollectorsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCollectorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCollectorsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListCollectorsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListCollectorsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
