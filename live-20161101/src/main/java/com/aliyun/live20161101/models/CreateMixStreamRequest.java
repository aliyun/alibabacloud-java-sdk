// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMixStreamRequest extends TeaModel {
    /**
     * <p>The callback URL. The value is a JSON array. If a callback event is triggered, ApsaraVideo Live sends an HTTP POST request to the URL. The content is included in the HTTP request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CallbackUrl&quot;:&quot;<a href="http://aliyundoc.com%22%7D">http://aliyundoc.com&quot;}</a></p>
     */
    @NameInMap("CallbackConfig")
    public String callbackConfig;

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
     * <p>The input streams. The value is a JSON array.</p>
     * <p>For more information, see <strong>InputStreamConfig</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;LayoutChildId&quot;:1,&quot;ResourceType&quot;:&quot;live&quot;,&quot;ResourceValue&quot;:&quot;rtmp://example.net/live/f2139ec2b8d6a191068cd<strong><strong>ea9064d?auth_key=1600947017-0-0-0b5645fe35d21a65ab92b394bd4d</strong></strong>&quot;,&quot;LayoutConfig&quot;:{&quot;FillMode&quot;:&quot;fit&quot;,&quot;PositionRefer&quot;:&quot;topLeft&quot;,&quot;FillPositionNormalized&quot;:[0,0],&quot;FillSizeNormalized&quot;:[1,1]}}]</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MixStreamLayout-1-1</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>The configuration of the output stream. The value is a JSON string.</p>
     * <p>For more information, see <strong>OutputConfig</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AppName&quot;:&quot;liveApp****&quot;,&quot;StreamName&quot;:&quot;9a78fb3f5c508be0122746f677a3****&quot;,&quot;MixStreamTemplate&quot;:&quot;lp_hd_v&quot;,&quot;ExpireDuration&quot;:&quot;86400&quot;}</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMixStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMixStreamRequest self = new CreateMixStreamRequest();
        return TeaModel.build(map, self);
    }

    public CreateMixStreamRequest setCallbackConfig(String callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }
    public String getCallbackConfig() {
        return this.callbackConfig;
    }

    public CreateMixStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateMixStreamRequest setInputStreamList(String inputStreamList) {
        this.inputStreamList = inputStreamList;
        return this;
    }
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    public CreateMixStreamRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public CreateMixStreamRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public CreateMixStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMixStreamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
