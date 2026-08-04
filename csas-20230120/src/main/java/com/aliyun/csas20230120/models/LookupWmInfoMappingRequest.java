// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class LookupWmInfoMappingRequest extends TeaModel {
    /**
     * <p>Bit width of the watermark information. Default value: 32. This parameter must match the bit width used when embedding or generating a transparent image. Valid values: 32 to 64. Use the same value as when you created the mapping. Otherwise, the mapping cannot be found.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>Numeric-formatted watermark information. Value source:</p>
     * <ul>
     * <li><a href="~~CreateWmInfoMapping~~">CreateWmInfoMapping</a>: The <strong>WmInfoUint</strong> return value from the CreateWmInfoMapping API.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>Watermark type. Valid values:</p>
     * <ul>
     * <li><p><strong>PureWebappInvisible</strong>: Webpage watermark.</p>
     * </li>
     * <li><p><strong>PureAppInvisible</strong>: App watermark.</p>
     * </li>
     * <li><p><strong>PureScreenInvisible</strong>: Screen watermark.</p>
     * </li>
     * <li><p><strong>PureDocument</strong>: Document watermark.</p>
     * </li>
     * <li><p><strong>PureImage</strong>: Image watermark.</p>
     * </li>
     * <li><p><strong>PureAudio</strong>: Audio watermark.</p>
     * </li>
     * <li><p><strong>PureVideo</strong>: Video watermark.</p>
     * </li>
     * <li><p><strong>AigcWebappInvisible</strong>: AIGC webpage watermark.</p>
     * </li>
     * <li><p><strong>AigcAppInvisible</strong>: AIGC app watermark.</p>
     * </li>
     * <li><p><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</p>
     * </li>
     * <li><p><strong>AigcDocument</strong>: AIGC document watermark.</p>
     * </li>
     * <li><p><strong>AigcImage</strong>: AIGC image watermark.</p>
     * </li>
     * <li><p><strong>AigcAudio</strong>: AIGC audio watermark.</p>
     * </li>
     * <li><p><strong>AigcVideo</strong>: AIGC video watermark.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureDocument</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static LookupWmInfoMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupWmInfoMappingRequest self = new LookupWmInfoMappingRequest();
        return TeaModel.build(map, self);
    }

    public LookupWmInfoMappingRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public LookupWmInfoMappingRequest setWmInfoUint(String wmInfoUint) {
        this.wmInfoUint = wmInfoUint;
        return this;
    }
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    public LookupWmInfoMappingRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

}
