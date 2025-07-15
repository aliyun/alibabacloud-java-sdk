// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMixStreamRequest extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * <blockquote>
     * <p> Only domain names that reside in the China (Shanghai) and China (Beijing) regions are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The input streams, in a JSON array.</p>
     * <p>For more information, see <strong>InputStreamConfig</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InputStreamList&quot;:[{&quot;LayoutConfig&quot;:{&quot;fillSizeNormalized&quot;:[0.5,0.5],&quot;fillPositionNormalized&quot;:[0,0],&quot;positionRefer&quot;:&quot;topLeft&quot;,&quot;fillMode&quot;:&quot;fit&quot;},&quot;LayoutChildId&quot;:1,&quot;ResourceValue&quot;:&quot;rtmp://aliyundoc.com/caster/8564a8d1659b4dc69df5f66cf4c9****&quot;,&quot;ResourceType&quot;:&quot;live&quot;},{&quot;LayoutConfig&quot;:{&quot;fillSizeNormalized&quot;:[0.5,0.5],&quot;fillPositionNormalized&quot;:[0.5,0],&quot;positionRefer&quot;:&quot;topLeft&quot;,&quot;fillMode&quot;:&quot;fit&quot;},&quot;LayoutChildId&quot;:2,&quot;ResourceValue&quot;:&quot;<a href="http://developer.aliyundoc.com/3c3c25426cf744fdb90423e76b78a28a/69b1a16e2b1d423d9841bf27a96f134e-0b1cba51f58bb5ad3a854x96a2c735f****.mp4%22,%22ResourceType%22:%22url%22%7D,%7B%22LayoutConfig%22:%7B%22fillSizeNormalized%22:%5B1,0.5%5D,%22fillPositionNormalized%22:%5B0,0.5%5D,%22positionRefer%22:%22topLeft%22,%22fillMode%22:%22fit%22%7D,%22LayoutChildId%22:3,%22ResourceValue%22:%22http://aliyundoc.com/c0c6c5446b56432389e91535864938da/ed4adc5263b4474c954b95607a5350ae-fda757b3328438a8cf-4k57f373a0f0****.mp4%22,%22ResourceType%22:%22url%22%7D%5D%7D">http://developer.aliyundoc.com/3c3c25426cf744fdb90423e76b78a28a/69b1a16e2b1d423d9841bf27a96f134e-0b1cba51f58bb5ad3a854x96a2c735f****.mp4&quot;,&quot;ResourceType&quot;:&quot;url&quot;},{&quot;LayoutConfig&quot;:{&quot;fillSizeNormalized&quot;:[1,0.5],&quot;fillPositionNormalized&quot;:[0,0.5],&quot;positionRefer&quot;:&quot;topLeft&quot;,&quot;fillMode&quot;:&quot;fit&quot;},&quot;LayoutChildId&quot;:3,&quot;ResourceValue&quot;:&quot;http://aliyundoc.com/c0c6c5446b56432389e91535864938da/ed4adc5263b4474c954b95607a5350ae-fda757b3328438a8cf-4k57f373a0f0****.mp4&quot;,&quot;ResourceType&quot;:&quot;url&quot;}]}</a></p>
     */
    @NameInMap("InputStreamList")
    public String inputStreamList;

    /**
     * <p>The ID of the layout. Valid values:</p>
     * <ul>
     * <li><strong>MixStreamLayout-1-1</strong></li>
     * <li><strong>MixStreamLayout-2-1</strong></li>
     * <li><strong>MixStreamLayout-2-2</strong></li>
     * <li><strong>MixStreamLayout-2-3</strong></li>
     * <li><strong>MixStreamLayout-3-1</strong></li>
     * <li><strong>MixStreamLayout-3-2</strong></li>
     * <li><strong>MixStreamLayout-4-1</strong></li>
     * <li><strong>USERDEFINED</strong>: If you do not use a preset layout, set this parameter to <strong>USERDEFINED</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> For more information, see <a href="https://help.aliyun.com/document_detail/199361.html">Preset layouts for stream mixing</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MixStreamLayout-3-2</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>The ID of the stream mixing task. If the task was created by calling the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation, check the value of the response parameter MixStreamId to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b2a046e-74d7-385e-d2d7-8a5b87e4****</p>
     */
    @NameInMap("MixStreamId")
    public String mixStreamId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateMixStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMixStreamRequest self = new UpdateMixStreamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMixStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateMixStreamRequest setInputStreamList(String inputStreamList) {
        this.inputStreamList = inputStreamList;
        return this;
    }
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    public UpdateMixStreamRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public UpdateMixStreamRequest setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    public UpdateMixStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMixStreamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
