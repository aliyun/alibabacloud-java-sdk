// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class ProductBindBsnRequest extends TeaModel {
    /**
     * <p>456*******163</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("aliuid")
    public Long aliuid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("num")
    public Integer num;

    /**
     * <p>41****34</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resourceType")
    public Integer resourceType;

    public static ProductBindBsnRequest build(java.util.Map<String, ?> map) throws Exception {
        ProductBindBsnRequest self = new ProductBindBsnRequest();
        return TeaModel.build(map, self);
    }

    public ProductBindBsnRequest setAliuid(Long aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public Long getAliuid() {
        return this.aliuid;
    }

    public ProductBindBsnRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ProductBindBsnRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ProductBindBsnRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
