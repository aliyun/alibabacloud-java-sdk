// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreloadRegionSDGShrinkRequest extends TeaModel {
    /**
     * <p>The list of destination edge zones.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationRegionIds")
    public String destinationRegionIdsShrink;

    /**
     * <p>The type of the shared cloud disk to be created. Valid values:</p>
     * <ul>
     * <li><p>standard: standard cloud disk.</p>
     * </li>
     * <li><p>rbd: rbd cloud disk.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you do not specify the shared cloud disk type, a standard cloud disk is created by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rbd</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The list of namespaces.</p>
     */
    @NameInMap("Namespaces")
    public String namespacesShrink;

    /**
     * <p>The redundancy count to support fast deployment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RedundantNum")
    public Integer redundantNum;

    /**
     * <p>The ID of the SDG that you want to preload.</p>
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

    public PreloadRegionSDGShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
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
