// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListCollectorsRequest extends TeaModel {
    /**
     * <p>The ID of the resource with which the shipper is associated.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The name of the shipper.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of the page to return. Valid values: 1 to 200. Default value: 1.</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The ID of the shipper.</p>
     */
    @NameInMap("resId")
    public String resId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 500. Default value: 20.</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The type of the machine on which the shipper is deployed. If you leave this parameter empty, shippers deployed on all types of machines are returned. Valid values:</p>
     * <br>
     * <p>*   ECS</p>
     * <p>*   ACK</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static ListCollectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollectorsRequest self = new ListCollectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListCollectorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCollectorsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCollectorsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListCollectorsRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
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
