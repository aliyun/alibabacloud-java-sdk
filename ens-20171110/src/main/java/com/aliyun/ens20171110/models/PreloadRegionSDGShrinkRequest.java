// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreloadRegionSDGShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the destination nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationRegionIds")
    public String destinationRegionIdsShrink;

    /**
     * <p>An array that consists of queried namespaces.</p>
     */
    @NameInMap("Namespaces")
    public String namespacesShrink;

    /**
     * <p>The number of redundant replicas to support rapid deployment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RedundantNum")
    public Integer redundantNum;

    /**
     * <p>The ID of the SDG for which data is preloaded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static PreloadRegionSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadRegionSDGShrinkRequest self = new PreloadRegionSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PreloadRegionSDGShrinkRequest setDestinationRegionIdsShrink(String destinationRegionIdsShrink) {
        this.destinationRegionIdsShrink = destinationRegionIdsShrink;
        return this;
    }
    public String getDestinationRegionIdsShrink() {
        return this.destinationRegionIdsShrink;
    }

    public PreloadRegionSDGShrinkRequest setNamespacesShrink(String namespacesShrink) {
        this.namespacesShrink = namespacesShrink;
        return this;
    }
    public String getNamespacesShrink() {
        return this.namespacesShrink;
    }

    public PreloadRegionSDGShrinkRequest setRedundantNum(Integer redundantNum) {
        this.redundantNum = redundantNum;
        return this;
    }
    public Integer getRedundantNum() {
        return this.redundantNum;
    }

    public PreloadRegionSDGShrinkRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
