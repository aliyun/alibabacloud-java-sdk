// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeStudioLayoutsRequest extends TeaModel {
    /**
     * <p>The ID of the production studio instance.</p>
     * <ul>
     * <li>If you call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio instance, you can obtain the instance ID from the CasterId parameter in the response.</li>
     * <li>If you create a production studio instance in the ApsaraVideo Live console, perform the following operations to obtain the instance ID: Log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane. Then, view the instance ID on the <strong>Production Studio Management</strong> page.</li>
     * </ul>
     * <blockquote>
     * <p> The value displayed in the Name column for an instance on the Production Studio Management page is the ID of the instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the layout.</p>
     * <p>You can specify multiple layout IDs and separate them with commas (,). If you leave this parameter empty, all layouts of the production studio are returned.</p>
     * <p>If you call the <a href="https://help.aliyun.com/document_detail/215388.html">AddStudioLayout</a> operation to configure a layout for a virtual studio, you can obtain the ID of the layout from the LayoutId parameter in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeStudioLayoutsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStudioLayoutsRequest self = new DescribeStudioLayoutsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStudioLayoutsRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeStudioLayoutsRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public DescribeStudioLayoutsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStudioLayoutsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
