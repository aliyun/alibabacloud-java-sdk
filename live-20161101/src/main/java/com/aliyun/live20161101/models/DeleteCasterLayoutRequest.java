// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterLayoutRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio, obtain the CasterId from the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to the <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The ID of the production studio is its name in the list on the Cloud Production Studio page.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The layout ID. If you call the <a href="https://help.aliyun.com/document_detail/2848025.html">AddCasterLayout</a> operation to add a layout to the production studio, obtain the LayoutId from the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCasterLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterLayoutRequest self = new DeleteCasterLayoutRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterLayoutRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public DeleteCasterLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCasterLayoutRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
