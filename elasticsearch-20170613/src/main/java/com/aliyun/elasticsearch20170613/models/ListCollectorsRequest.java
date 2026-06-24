// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListCollectorsRequest extends TeaModel {
    /**
     * <p>The instance ID associated with the collector.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-nif1q8auz0003****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The collector name.</p>
     * 
     * <strong>example:</strong>
     * <p>collectorName1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number of the returned results. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The collector ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-cn-77uqof2s7rg5c****</p>
     */
    @NameInMap("resId")
    public String resId;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The type of machine on which the collector is deployed. If this parameter is not specified, all types are returned. Valid values:</p>
     * <ul>
     * <li><p>ECS: ECS instance</p>
     * </li>
     * <li><p>ACK: Container Kubernetes cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
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
