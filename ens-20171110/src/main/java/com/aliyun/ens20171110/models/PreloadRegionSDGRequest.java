// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreloadRegionSDGRequest extends TeaModel {
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
     * <p>2</p>
     */
    @NameInMap("RedundantNum")
    public Integer redundantNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static PreloadRegionSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadRegionSDGRequest self = new PreloadRegionSDGRequest();
        return TeaModel.build(map, self);
    }

    public PreloadRegionSDGRequest setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
        this.destinationRegionIds = destinationRegionIds;
        return this;
    }
    public java.util.List<String> getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    public PreloadRegionSDGRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public PreloadRegionSDGRequest setRedundantNum(Integer redundantNum) {
        this.redundantNum = redundantNum;
        return this;
    }
    public Integer getRedundantNum() {
        return this.redundantNum;
    }

    public PreloadRegionSDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
