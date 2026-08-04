// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmInfoMappingRequest extends TeaModel {
    /**
     * <p>The Base64-encoded string-format watermark information. Length: 1 to 300 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <p>The capacity bit width of the watermark information. Default is 32. This parameter must be consistent with the capacity bit width used during actual embedding or transparent image generation. Valid range: 32 to 64.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>Watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureWebappInvisible</strong>: Webpage watermark.</li>
     * <li><strong>PureAppInvisible</strong>: App watermark.</li>
     * <li><strong>PureScreenInvisible</strong>: Screen watermark.</li>
     * <li><strong>PureDocument</strong>: Document watermark.</li>
     * <li><strong>PureImage</strong>: Image watermark.</li>
     * <li><strong>PureAudio</strong>: Audio watermark.</li>
     * <li><strong>PureVideo</strong>: Video watermark.</li>
     * <li><strong>AigcWebappInvisible</strong>: AIGC webpage watermark.</li>
     * <li><strong>AigcAppInvisible</strong>: AIGC App watermark.</li>
     * <li><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</li>
     * <li><strong>AigcDocument</strong>: AIGC document watermark.</li>
     * <li><strong>AigcImage</strong>: AIGC image watermark.</li>
     * <li><strong>AigcAudio</strong>: AIGC audio watermark.</li>
     * <li><strong>AigcVideo</strong>: AIGC video watermark.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureDocument</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static CreateWmInfoMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmInfoMappingRequest self = new CreateWmInfoMappingRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmInfoMappingRequest setWmInfoBytesB64(String wmInfoBytesB64) {
        this.wmInfoBytesB64 = wmInfoBytesB64;
        return this;
    }
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    public CreateWmInfoMappingRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmInfoMappingRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

}
