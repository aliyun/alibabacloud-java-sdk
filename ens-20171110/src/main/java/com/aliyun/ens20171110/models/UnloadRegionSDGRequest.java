// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnloadRegionSDGRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationRegionIds")
    public java.util.List<String> destinationRegionIds;

    @NameInMap("Namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static UnloadRegionSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        UnloadRegionSDGRequest self = new UnloadRegionSDGRequest();
        return TeaModel.build(map, self);
    }

    public UnloadRegionSDGRequest setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
        this.destinationRegionIds = destinationRegionIds;
        return this;
    }
    public java.util.List<String> getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    public UnloadRegionSDGRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public UnloadRegionSDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
